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
		//全部商品显示的价格
		for (SpAotuerpTreasureTaskCustom spAotuerpTreasureTaskCustom : spAotuerpTreasureTaskCustoms) {
			
			SpAotuerpTreasureInfoCustom spAotuerpTreasureInfoCustom = spAotuerpTreasureTaskCustom
					.getSpAotuerpTreasureInfoCustom();
			
			//调用goodShowPriceHandler
			/*spAotuerpTreasureInfoCustom.setGoodsShowPrice(goodsShowPriceHandler(spAotuerpTreasureInfoCustom
					.getSpAotuerpTreasureProductSkuCustoms()));*/
			//调用goodsShowBrandHandler
			//spAotuerpTreasureInfoCustom.setSpProductBrands(goodsShowBrandHandler(spAotuerpTreasureInfoCustom.getSpAotuerpTreasureProductSkuCustoms()));
		}
		return spAotuerpTreasureTaskCustoms;
	}

	/**
	 * 处理显示价格
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
	 * 处理显示品牌
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
		//校验参数
		return spTreaTaskC;
	}

	@Override
	public SpAotuerpTreasureTask findTreasureTaskBySpId(Integer spId) throws Exception {
		return spAotuerpTreasureTaskMapper.selectByPrimaryKey(spId);
	}

	@Override
	public boolean updateTreasureTaskForBegin(SpAotuerpTreasureTask treasureTask) throws Exception {
		//关键参数进行校验
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
			//商品sku
			Set<Integer> spTreasureSkuIdSet=new HashSet<Integer>();
			//1.这个宝贝任务有多少个sku(集合)
			for (SpAotuerpTreasureProductSkuCustom spTreasureProSkuC : spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms()) {
				spTreasureSkuIdSet.add(spTreasureProSkuC.getSpSkuid());	
			}
			//转化数组
			Integer[] skuids=new Integer[spTreasureSkuIdSet.size()];
			spTreasureSkuIdSet.toArray(skuids);
			//2.查询key
			List<SpProductBpropertiesCustom> spProductBproCNames=spProductBpropertiesMapperCustom.findSpProductBproCNameBySpSkuId(skuids);
			
			//2.1排序
			//====================================================
			System.out.println(spProductBproCNames);//解决懒加载
			//====================================================
			List<OrderRule> orderRules = new ArrayList<OrderRule>();
			//设置排序规则
			//属性，是否升序，比较类型
			OrderRule orderRule = new OrderRule("spProductPname.spSort", true, OrderRule._Integer);
			orderRules.add(orderRule);
			//调用接口传入规则
			ISortObject iSortObject = new SortObjectImp(orderRules);
			ObjectComparator objectComparator = new ObjectComparator(iSortObject);
			Collections.sort(spProductBproCNames,objectComparator);
			
			/*for (SpProductBpropertiesCustom p : spProductBproCNames) {
				System.out.println("aaa"+p.getSpId());
				System.out.println(p.getSpProductPname().getSpPropertyname());
			}*/
			
			//3.遍历根据key和sku集合去查询value
			//map['nameId'] nameid
			//map['skuIds'] skuids
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("skuIds", skuids);
			for (SpProductBpropertiesCustom spProductBproCName : spProductBproCNames) {
				map.put("nameId", spProductBproCName.getSpProductPname().getSpId());//nameId
				List<SpProductBpropertiesCustom> spProductBproCValue=spProductBpropertiesMapperCustom.findSpProductBproCValueBySpSkuIdAndNameId(map);
				//设置宝贝sku信息
				SpProductPropertyNameCustom spTreasureProName=new SpProductPropertyNameCustom();
				spTreasureProName.setSpProductPropertyValues(spProductBproCValue);
				BeanUtils.copyProperties(spProductBproCName.getSpProductPname(),spTreasureProName);
				spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpTreasureProNames().add(spTreasureProName);
			}
		}
		//校验参数
		return spTreaTaskC;
	}

	@Override
	public Map<String, Map<String, Long>> findTreasureDetailSkuJsonByAnIdAndSpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)
			throws Exception {		
		SpAotuerpTreasureTaskCustom spTreaTaskC=spAotuerpTreasureTaskMapperCustom.findSpAotuerpTreasureTaskSkuJsonByAnIdAndSpStatusId(spTreaTaskV);
		if(spTreaTaskC!=null){
			Map<String, Map<String, Long>> skuMap=new HashMap<String, Map<String,Long>>();
			for (SpAotuerpTreasureProductSkuCustom treasureProSkuC : spTreaTaskC.getSpAotuerpTreasureProductSkuCustoms()) {//宝贝sku
				//sku详细信息
				//价格和销售数量
				Map<String, Long> priceQuantityMap=new HashMap<String, Long>();
				priceQuantityMap.put("count", (long)treasureProSkuC.getSpSalesorderquantity());
				priceQuantityMap.put("price", (long)treasureProSkuC.getSpSalesprice());
				String skuStr="";
				//排序
				//====================================================
				System.out.println(treasureProSkuC.getSpProductBproCSkus());//解决懒加载
				//====================================================
				List<OrderRule> orderRules = new ArrayList<OrderRule>();
				//设置排序规则
				//属性，是否升序，比较类型
				OrderRule orderRule = new OrderRule("spProductPname.spSort", true, OrderRule._Integer);
				orderRules.add(orderRule);
				//调用接口传入规则
				ISortObject iSortObject = new SortObjectImp(orderRules);
				ObjectComparator objectComparator = new ObjectComparator(iSortObject);
				Collections.sort(treasureProSkuC.getSpProductBproCSkus(),objectComparator);
				
				for (SpProductBpropertiesCustom spProBproC : treasureProSkuC.getSpProductBproCSkus()) {
					
					//组装json
					skuStr+=spProBproC.getSpProductPvalue().getSpPropertynameid()+":"+spProBproC.getSpProductPvalue().getSpId()+"#";
				}
				//去除最后一个“#”
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
				//排序
				//====================================================
				System.out.println(treasureProSkuC.getSpProductBproCSkus());
				//====================================================
				List<OrderRule> orderRules = new ArrayList<OrderRule>();
				//设置排序规则
				//属性，是否升序，比较类型
				OrderRule orderRule = new OrderRule("spProductPname.spSort", true, OrderRule._Integer);
				orderRules.add(orderRule);
				//调用接口传入规则
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
