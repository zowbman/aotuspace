package com.aotuspace.web.spgoods.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spgoods.mapper.product.SpProductSkuMapper;
import com.aotuspace.web.spgoods.mapper.product.custom.SpProductBpropertiesMapperCustom;
import com.aotuspace.web.spgoods.mapper.task.SpAotuerpTreasureTaskMapper;
import com.aotuspace.web.spgoods.mapper.task.custom.SpAotuerpTreasureTaskMapperCustom;
import com.aotuspace.web.spgoods.mapper.treasure.SpAotuerpTreasureProductSkuMapper;
import com.aotuspace.web.spgoods.model.po.product.SpProductSku;
import com.aotuspace.web.spgoods.model.po.product.SpProductSkuExample;
import com.aotuspace.web.spgoods.model.po.product.custom.SpProductBpropertiesCustom;
import com.aotuspace.web.spgoods.model.po.product.custom.SpProductPropertyNameCustom;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTask;
import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureProductSku;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureProductSkuExample;
import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureInfoCustom;
import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureProductSkuCustom;
import com.aotuspace.web.spgoods.model.vo.task.SpAotuerpTreasureTaskQueryVo;
import com.aotuspace.web.spgoods.service.ISpGoodsService;
import com.aotuspace.web.util.sort.ISortObject;
import com.aotuspace.web.util.sort.complarator.ObjectComparator;
import com.aotuspace.web.util.sort.complarator.SortObjectImp;
import com.aotuspace.web.util.sort.rule.OrderRule;

public class SpGoodsServiceImpl implements ISpGoodsService {

	@Autowired
	private SpAotuerpTreasureTaskMapperCustom spAotuerpTreasureTaskMapperCustom;

	@Autowired
	private SpAotuerpTreasureTaskMapper spAotuerpTreasureTaskMapper;

	@Autowired
	private SpProductBpropertiesMapperCustom spProductBpropertiesMapperCustom;
	
	@Autowired
	private SpProductSkuMapper spProductSkuMapper;
	
	@Autowired
	private SpAotuerpTreasureProductSkuMapper spAotuerpTreasureProductSkuMapper;

	@Override
	public List<SpAotuerpTreasureTaskCustom> findTreasureTaskListByspStatusId(Integer spStatusId) throws Exception {
		List<SpAotuerpTreasureTaskCustom> spAotuerpTreasureTaskCustoms = spAotuerpTreasureTaskMapperCustom
				.findSpAotuerpTreasureTaskBySpStatusId(spStatusId);
		//ȫ����Ʒ��ʾ�ļ۸�
		for (SpAotuerpTreasureTaskCustom spAotuerpTreasureTaskCustom : spAotuerpTreasureTaskCustoms) {
			
			SpAotuerpTreasureInfoCustom spAotuerpTreasureInfoCustom = spAotuerpTreasureTaskCustom
					.getSpAotuerpTreasureInfoCustom();
			
			//����goodShowPriceHandler
			/*spAotuerpTreasureInfoCustom.setGoodsShowPrice(goodsShowPriceHandler(spAotuerpTreasureInfoCustom
					.getSpAotuerpTreasureProductSkuCustoms()));*/
			//����goodsShowBrandHandler
			//spAotuerpTreasureInfoCustom.setSpProductBrands(goodsShowBrandHandler(spAotuerpTreasureInfoCustom.getSpAotuerpTreasureProductSkuCustoms()));
		}
		return spAotuerpTreasureTaskCustoms;
	}

	/**
	 * ������ʾ�۸�
	 * @param spAotuerpTreasureProductSkuCustoms
	 * @return
	 */
	private Long goodsShowPriceHandler(Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureProductSkuCustoms) {
		long minPrice = 0;
		boolean flag = true;
		for (SpAotuerpTreasureProductSkuCustom spAotuerpTreasureProductSkuCustom : spAotuerpTreasureProductSkuCustoms) {
			if (flag) {
				minPrice = spAotuerpTreasureProductSkuCustom.getSpSalesprice();
				flag = false;
				continue;
			}
			minPrice = (minPrice < spAotuerpTreasureProductSkuCustom.getSpSalesprice()) ? spAotuerpTreasureProductSkuCustom
					.getSpSalesprice() : minPrice;
		}

		return minPrice;
	}

	/**
	 * ������ʾƷ��
	 * @param spAotuerpTreasureInfoCustoms
	 * @return
	 */
	/*private SpProductBrands goodsShowBrandHandler(Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureInfoCustoms){
		SpProductBrands spProductBrands=null;
		for (SpAotuerpTreasureProductSkuCustom spAotuerpTreasureProductSkuCustom : spAotuerpTreasureInfoCustoms) {
			spProductBrands=spAotuerpTreasureProductSkuCustom.getSpProductSkuCustom().getSpProductBinfoCustom().getSpProductBrands();
			break;
		}
		return spProductBrands;
	}*/

	@Override
	public SpAotuerpTreasureTaskCustom findTreasureTaskDetailBySpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)
			throws Exception {
		SpAotuerpTreasureTaskCustom spTreaTaskC = spAotuerpTreasureTaskMapperCustom
				.findSpAotuerpTreasureTaskBySpIdAndSpStatusId(spTreaTaskV);
		//У�����
		return spTreaTaskC;
	}

	@Override
	public SpAotuerpTreasureTask findTreasureTaskBySpId(Integer spId) throws Exception {
		return spAotuerpTreasureTaskMapper.selectByPrimaryKey(spId);
	}

	@Override
	public boolean updateTreasureTaskForBegin(SpAotuerpTreasureTask treasureTask) throws Exception {
		//�ؼ���������У��
		if (treasureTask != null && treasureTask.getSpAnid() != null && treasureTask.getSpStatusid().equals(2)) {
			int updateRowN = spAotuerpTreasureTaskMapper.updateByPrimaryKeySelective(treasureTask);
			if (updateRowN != 0)
				return true;
		}
		return false;
	}

	@Override
	public SpAotuerpTreasureTaskCustom findTreasureDetailByAnIdAndSpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)
			throws Exception {
		SpAotuerpTreasureTaskCustom spTreaTaskC=spAotuerpTreasureTaskMapperCustom.findSpAotuerpTreasureTaskByAnIdAndSpStatusId(spTreaTaskV);
		if(spTreaTaskC!=null){
			//��Ʒsku
			Set<Integer> spTreasureSkuIdSet=new HashSet<Integer>();
			//1.������������ж��ٸ�sku(����)
			for (SpAotuerpTreasureProductSkuCustom spTreasureProSkuC : spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms()) {
				spTreasureSkuIdSet.add(spTreasureProSkuC.getSpSkuid());	
			}
			//ת������
			Integer[] skuids=new Integer[spTreasureSkuIdSet.size()];
			spTreasureSkuIdSet.toArray(skuids);
			//2.��ѯkey
			List<SpProductBpropertiesCustom> spProductBproCNames=spProductBpropertiesMapperCustom.findSpProductBproCNameBySpSkuId(skuids);
			
			//2.1����
			//====================================================
			System.out.println(spProductBproCNames);//���������
			//====================================================
			List<OrderRule> orderRules = new ArrayList<OrderRule>();
			//�����������
			//���ԣ��Ƿ����򣬱Ƚ�����
			OrderRule orderRule = new OrderRule("spProductPname.spSort", true, OrderRule._Integer);
			orderRules.add(orderRule);
			//���ýӿڴ������
			ISortObject iSortObject = new SortObjectImp(orderRules);
			ObjectComparator objectComparator = new ObjectComparator(iSortObject);
			Collections.sort(spProductBproCNames,objectComparator);
			
			/*for (SpProductBpropertiesCustom p : spProductBproCNames) {
				System.out.println("aaa"+p.getSpId());
				System.out.println(p.getSpProductPname().getSpPropertyname());
			}*/
			
			//3.��������key��sku����ȥ��ѯvalue
			//map['nameId'] nameid
			//map['skuIds'] skuids
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("skuIds", skuids);
			for (SpProductBpropertiesCustom spProductBproCName : spProductBproCNames) {
				map.put("nameId", spProductBproCName.getSpProductPname().getSpId());//nameId
				List<SpProductBpropertiesCustom> spProductBproCValue=spProductBpropertiesMapperCustom.findSpProductBproCValueBySpSkuIdAndNameId(map);
				//���ñ���sku��Ϣ
				SpProductPropertyNameCustom spTreasureProName=new SpProductPropertyNameCustom();
				spTreasureProName.setSpProductPropertyValues(spProductBproCValue);
				BeanUtils.copyProperties(spProductBproCName.getSpProductPname(),spTreasureProName);
				spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpTreasureProNames().add(spTreasureProName);
			}
		}
		//У�����
		return spTreaTaskC;
	}

	@Override
	public Map<String, Map<String, Long>> findTreasureDetailSkuJsonByAnIdAndSpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)
			throws Exception {		
		SpAotuerpTreasureTaskCustom spTreaTaskC=spAotuerpTreasureTaskMapperCustom.findSpAotuerpTreasureTaskSkuJsonByAnIdAndSpStatusId(spTreaTaskV);
		if(spTreaTaskC!=null){
			Map<String, Map<String, Long>> skuMap=new HashMap<String, Map<String,Long>>();
			for (SpAotuerpTreasureProductSkuCustom treasureProSkuC : spTreaTaskC.getSpAotuerpTreasureProductSkuCustoms()) {//����sku
				//sku��ϸ��Ϣ
				//�۸����������
				Map<String, Long> priceQuantityMap=new HashMap<String, Long>();
				priceQuantityMap.put("count", (long)treasureProSkuC.getSpSalesorderquantity());
				priceQuantityMap.put("price", (long)treasureProSkuC.getSpSalesprice());
				String skuStr="";
				//����
				//====================================================
				System.out.println(treasureProSkuC.getSpProductBproCSkus());//���������
				//====================================================
				List<OrderRule> orderRules = new ArrayList<OrderRule>();
				//�����������
				//���ԣ��Ƿ����򣬱Ƚ�����
				OrderRule orderRule = new OrderRule("spProductPname.spSort", true, OrderRule._Integer);
				orderRules.add(orderRule);
				//���ýӿڴ������
				ISortObject iSortObject = new SortObjectImp(orderRules);
				ObjectComparator objectComparator = new ObjectComparator(iSortObject);
				Collections.sort(treasureProSkuC.getSpProductBproCSkus(),objectComparator);
				
				for (SpProductBpropertiesCustom spProBproC : treasureProSkuC.getSpProductBproCSkus()) {
					
					//��װjson
					skuStr+=spProBproC.getSpProductPvalue().getSpPropertynameid()+":"+spProBproC.getSpProductPvalue().getSpId()+"#";
				}
				//ȥ�����һ����#��
				skuStr=skuStr.substring(0, skuStr.length()-1);
				skuMap.put(skuStr,priceQuantityMap);
			}
			return skuMap;
		}
		return null;
	}

	@Override
	public SpAotuerpTreasureTaskCustom findBuyTreasureDetailBySpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)
			throws Exception {
		SpAotuerpTreasureTaskCustom spTreaTaskC=spAotuerpTreasureTaskMapperCustom.findSpAotuerpTreasureTaskByAnIdAndSpStatusId(spTreaTaskV);
		if(spTreaTaskC!=null){
			for (SpAotuerpTreasureProductSkuCustom treasureProSkuC : spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms()) {
				//����
				//====================================================
				System.out.println(treasureProSkuC.getSpProductBproCSkus());
				//====================================================
				List<OrderRule> orderRules = new ArrayList<OrderRule>();
				//�����������
				//���ԣ��Ƿ����򣬱Ƚ�����
				OrderRule orderRule = new OrderRule("spProductPname.spSort", true, OrderRule._Integer);
				orderRules.add(orderRule);
				//���ýӿڴ������
				ISortObject iSortObject = new SortObjectImp(orderRules);
				ObjectComparator objectComparator = new ObjectComparator(iSortObject);
				Collections.sort(treasureProSkuC.getSpProductBproCSkus(),objectComparator);
			}
		}
		return spTreaTaskC;
	}

	@Override
	public Integer findSkuIdBySkuPropAndPdId(String skuProp,Integer pdId) throws Exception {
		SpProductSkuExample spProductSkuExample=new SpProductSkuExample();
		SpProductSkuExample.Criteria criteria=spProductSkuExample.createCriteria();
		criteria.andSpSkupropertiesEqualTo(skuProp);
		criteria.andSpPdidEqualTo(pdId);
		List<SpProductSku> spProductSkus=(List<SpProductSku>) spProductSkuMapper.selectByExample(spProductSkuExample);
		if(spProductSkus!=null)
			return spProductSkus.iterator().next().getSpSkuid();
		return null;
	}

	@Override
	public Integer findTreasureSkuIdBySkuIdAndTreasureId(Integer skuId, Integer treasureId) throws Exception {
		SpAotuerpTreasureProductSkuExample spAotuerpTreasureProductSkuExample=new SpAotuerpTreasureProductSkuExample();
		SpAotuerpTreasureProductSkuExample.Criteria criteria=spAotuerpTreasureProductSkuExample.createCriteria();
		criteria.andSpSkuidEqualTo(skuId);
		criteria.andSpTreasureidEqualTo(treasureId);
		List<SpAotuerpTreasureProductSku> spAotuerpTreasureProductSkus=spAotuerpTreasureProductSkuMapper.selectByExample(spAotuerpTreasureProductSkuExample);
		if(spAotuerpTreasureProductSkus!=null)
			return spAotuerpTreasureProductSkus.iterator().next().getSpId();
		return null;
	}
	
	

}
