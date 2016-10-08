package com.aotuspace.web.spgoods.controller;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aotuspace.web.global.jsonmsg.model.JsonMsg;
import com.aotuspace.web.listener.SpSiteSesstionListener;
import com.aotuspace.web.spgoods.model.po.shopping.SpBuyCar;
import com.aotuspace.web.spgoods.model.po.shopping.SpBuyProduct;
import com.aotuspace.web.spgoods.model.po.shopping.SpFastBuy;
import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureProductSkuCustom;
import com.aotuspace.web.spgoods.model.vo.task.SpAotuerpTreasureTaskQueryVo;
import com.aotuspace.web.spgoods.service.ISpGoodsImgService;
import com.aotuspace.web.spgoods.service.ISpGoodsService;
import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfo;
import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.service.ISpDeliverService;
import com.aotuspace.web.util.WebUtil;
import com.aotuspace.web.util.thumbnailator.ImgSpec;
import com.aotuspace.web.util.thumbnailator.ThumbnailatorUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * Title:AotuSpaceController
 * Description:��͹�ռ乺����Ʒcontroller
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-16 ����3:18:21
 *
 */

@Controller
@RequestMapping("/shopping")
public class SpShoppingController {

	@Autowired
	ISpGoodsService iSpGoodsService;
	
	@Autowired
	ISpGoodsImgService iSpGoodsImgService;
	
	@Autowired
	ISpDeliverService iSpDeliverService;

	// =============jackson josnת����===========
	protected ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * �������򡢼��빺�ﳵ(������װ)
	 * ʹ��session��װ����
	 * @param taskId
	 * @return
	 * @throws JsonProcessingException 
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public @ResponseBody
	JsonMsg goodsBuyInfo(@PathVariable("id") Integer taskId, @RequestBody SpAotuerpTreasureTaskQueryVo spTreasureTaskV,
			HttpServletResponse resp) throws Exception {

		Map<String, Object> buyInfo = new HashMap<String, Object>();
		buyInfo.put("id", taskId);
		buyInfo.put("skuProId", spTreasureTaskV.getSkuProId());
		buyInfo.put("buyCount", spTreasureTaskV.getBuyCount());

		//תjson����cookie
		String buyInfoJson = objectMapper.writeValueAsString(buyInfo);

		Cookie cookie = new Cookie("buyinfo", URLEncoder.encode(buyInfoJson, "utf-8"));

		resp.addCookie(cookie);

		return new JsonMsg(100000, "����ɹ�", null, null);
	}
	
	/**
	 * ����������
	 * @param httpSession
	 * @param taskId ����id
	 * @param skuProp skuProp(��ʽ����sku��)
	 * @param count ����
	 * @param pdId ��Ʒid
	 * @param treasureId ����id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{id}!checkCount")
	public @ResponseBody JsonMsg goodsCheckCount(HttpSession httpSession, @PathVariable("id") Integer taskId,
			String skuProp,Integer pdId,Integer treasureId,Integer count) throws Exception {
			//��������id��skuid��ѯԭ����
			Integer spStatusId = 2;
			SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
			spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//����id
			spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//����״̬
			//ȡ������ԭ����
			SpAotuerpTreasureTaskCustom spTreaTaskC = iSpGoodsService
					.findBuyTreasureDetailBySpIdAndSpStatus(spTreaTaskV);
			if(spTreaTaskC!=null){
				if(skuProp!=null&&skuProp.trim()!=""){//���skuid�ǿշǿ��ַ�������sku������֤
					//sku���ѯ�������ѯ������skuid
					Integer skuId=iSpGoodsService.findSkuIdBySkuPropAndPdId(skuProp,pdId);
					if(skuId!=null){
						System.out.println(skuId);
						SpAotuerpTreasureTaskCustom spTreasureTaskC=new SpAotuerpTreasureTaskCustom();
						spTreasureTaskC.setSpId(taskId);
						
						SpAotuerpTreasureProductSkuCustom spTreasureProductSkuC=new SpAotuerpTreasureProductSkuCustom();
						spTreasureProductSkuC.setSpId(iSpGoodsService.findTreasureSkuIdBySkuIdAndTreasureId(skuId, treasureId));
						
						spTreasureTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(spTreasureProductSkuC);
						
						Integer skuStock=spTreaTaskC.getSpAotuerpTreasureInfoCustom().findStockBySku(spTreasureProductSkuC);
						
						if(count>skuStock){
							//���� spData:������ֵ
							return new JsonMsg(100000, "����ɹ�", null, skuStock);//�ɹ�
						}
					}
				}else{
					Integer sumStock=spTreaTaskC.getSpAotuerpTreasureInfoCustom().findSumStock();
					if(count>sumStock){
						//���� spData:������ֵ
						return new JsonMsg(100000, "����ɹ�", null, sumStock);//�ɹ�
					}
				}
				return new JsonMsg(100000, "����ɹ�", null,null);
			}
			//�޷���ȡԭ����
		return JsonMsg.errorJsonMsg();
	}
	

	/**
	 * ��������
	 * @param anchorId ��������id
	 * @param taskId ����id
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{aId}/{id}!fastBuy")
	public String goodsBuy(@PathVariable("aId") Integer anchorId, @PathVariable("id") Integer taskId,
			HttpSession httpSession, @CookieValue(value = "buyinfo", defaultValue = "") String buyinfo,
			@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId, Model model,
			HttpServletResponse resp, HttpServletRequest req) throws Exception {

		if (buyinfo != null && buyinfo.trim() != "") {
			Map<String, Object> buyInfo = objectMapper.readValue(buyinfo, Map.class);
			if (buyInfo != null) {
				Integer buyInfoId = (Integer) buyInfo.get("id");//taskid
				List<String> buyInfoSkuProdId = (List<String>) buyInfo.get("skuProId");//skuProId
				Integer buyInfoBuyCount = (Integer) buyInfo.get("buyCount");//��������
				//�������ﳵ
				SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");
				if (spBuyCar == null) {//���ﳵΪ��
					String sid = WebUtil.getCookieByName(req, "spBuyCarID");
					if (sid != null) {
						HttpSession session = SpSiteSesstionListener.getSession(sid);
						if (session != null){
							spBuyCar = (SpBuyCar) session.getAttribute("spBuyCar");
							if(spBuyCar != null){
								SpSiteSesstionListener.removeSession(sid);
								httpSession.setAttribute("spBuyCar", spBuyCar);
								WebUtil.addCookie(resp, "spBuyCarID",sessionId, httpSession.getMaxInactiveInterval());
							}
						}
					}
				}
				
				//�������ﳵ
				if (spBuyCar == null) {
					spBuyCar = new SpBuyCar();
					httpSession.setAttribute("spBuyCar", spBuyCar);
					WebUtil.addCookie(resp, "spBuyCarID", sessionId, httpSession.getMaxInactiveInterval());
				}

				if (buyInfoId != null && buyInfoId.equals(taskId)) {
					Integer spStatusId = 2;
					SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
					spTreaTaskV.getSpTreaTaskC().setSpId((Integer) buyInfo.get("id"));//����id
					spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//����״̬

					//ȡ������ԭ����
					SpAotuerpTreasureTaskCustom spTreaTaskC = iSpGoodsService
							.findBuyTreasureDetailBySpIdAndSpStatus(spTreaTaskV);
					if (spTreaTaskC != null) {
						SpAotuerpTreasureProductSkuCustom currentTreasureProSkuC = null;//��ǰsku
						for (SpAotuerpTreasureProductSkuCustom skuProIds : spTreaTaskC.getSpAotuerpTreasureInfoCustom()
								.getSpAotuerpTreasureProductSkuCustoms()) {
							//�ȽϹ���sku�Լ���ѯ������sku�Ƿ���ͬ����ͬ�ͼ��뵱ǰsku����
							if (buyInfoSkuProdId.equals(skuProIds.skuProIds(skuProIds.getSpProductBproCSkus()))) {
								currentTreasureProSkuC = skuProIds;//��ƥ���sku��ֵ����ǰsku��
								break;
							}
						}
						spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().clear();//���ԭ��������sku
						if (currentTreasureProSkuC != null)
							spTreaTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(currentTreasureProSkuC);//���뱻ѡsku
						spBuyCar.addProduct(new SpBuyProduct(spTreaTaskC, buyInfoBuyCount));//��������Ʒ�Ž����ﳵ
						//���ٹ���
						SpFastBuy spFastBuy = new SpFastBuy();
						spFastBuy.setProduct(new SpBuyProduct(spTreaTaskC, buyInfoBuyCount));
						model.addAttribute("spFastBuy", spFastBuy);
						//cookie�������
						Cookie cookie = new Cookie("buyinfo", "");
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
						//�ջ���ַ
						SpUsersBinfoCustom spUsersBinfoCustom=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//��ȡ��ǰ�û�
						if(spUsersBinfoCustom!=null){
							//����aotuid��ѯ�ջ��ַ
							List<SpDeliverInfoCustom> spDeliverInfoCustoms=new ArrayList<SpDeliverInfoCustom>();
							List<SpDeliverInfo> spDeliverInfos=iSpDeliverService.findDeliverInfoByAutoId(spUsersBinfoCustom.getSpAtuid());
							if(spDeliverInfos!=null){
								for (SpDeliverInfo spDeliverInfo : spDeliverInfos) {
									SpDeliverInfoCustom spDeliverInfoCustom=new SpDeliverInfoCustom();
									BeanUtils.copyProperties(spDeliverInfo, spDeliverInfoCustom);
									spDeliverInfoCustoms.add(spDeliverInfoCustom);
								}
							}
							model.addAttribute("delivers", spDeliverInfoCustoms);
						}
						return "ShoppingCart/ShoppingCartSubmitOrders";
					}
				}
			}

		}
		return "ShoppingCart/ShoppingCartSubmitOrders";//����ҳ
	}
	
	/**
	 * �������ͷ�ʽ
	 * @param httpSession
	 * @param req
	 * @param sessionId
	 * @param resp
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/paymentWay!save")
	public String savePaymentWay(HttpSession httpSession,HttpServletRequest req,@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId,HttpServletResponse resp)throws Exception{
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//��ȡ���ﳵ
		if(spBuyCar==null){//������ﳵΪ�գ���ȡ��ǰ�Ĺ��ﳵ
			// ���Բ�Ҫ
			String sid = WebUtil.getCookieByName(req, "spBuyCarID");
			if (sid != null) {
				HttpSession session = SpSiteSesstionListener.getSession(sid);
				if (session != null){
					spBuyCar = (SpBuyCar) session.getAttribute("spBuyCar");
					if(spBuyCar != null){
						SpSiteSesstionListener.removeSession(sid);
						httpSession.setAttribute("spBuyCar", spBuyCar);
						WebUtil.addCookie(resp, "spBuyCarID",sessionId, httpSession.getMaxInactiveInterval());
					}
				}
			}
			//���Բ�Ҫ����
			
		}
		return null;
	}
	

	/**
	 * ��ӹ��ﳵ
	 * @param anchorId ����id
	 * @param taskId ����id
	 * @param httpSession 
	 * @param buyinfo ������Ϣ
	 * @param sessionId sessionid������cookie
	 * @param resp
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{aId}/{id}!buyCar")
	public @ResponseBody
	JsonMsg goodsBuyCarAdd(@PathVariable("aId") Integer anchorId, @PathVariable("id") Integer taskId,
			HttpSession httpSession, @CookieValue(value = "buyinfo", defaultValue = "") String buyinfo,
			@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId, HttpServletResponse resp,
			HttpServletRequest req) throws Exception {

		if (buyinfo != null && buyinfo.trim() != "") {
			Map<String, Object> buyInfo = objectMapper.readValue(buyinfo, Map.class);
			if (buyInfo != null) {
				Integer buyInfoId = (Integer) buyInfo.get("id");//taskid
				List<String> buyInfoSkuProdId = (List<String>) buyInfo.get("skuProId");//skuProId
				Integer buyInfoBuyCount = (Integer) buyInfo.get("buyCount");//��������
				//�������ﳵ
				SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");
				if (spBuyCar == null) {//���ﳵΪ��
					String sid = WebUtil.getCookieByName(req, "spBuyCarID");
					if (sid != null) {
						HttpSession session = SpSiteSesstionListener.getSession(sid);
						if (session != null) {
							spBuyCar = (SpBuyCar) session.getAttribute("spBuyCar");
							if (spBuyCar != null) {
								SpSiteSesstionListener.removeSession(sid);
								httpSession.setAttribute("spBuyCar", spBuyCar);
								WebUtil.addCookie(resp, "spBuyCarID", sessionId, httpSession.getMaxInactiveInterval());
							}
						}
					}
				}

				//�������ﳵ
				if (spBuyCar == null) {
					spBuyCar = new SpBuyCar();
					httpSession.setAttribute("spBuyCar", spBuyCar);
					WebUtil.addCookie(resp, "spBuyCarID", sessionId, httpSession.getMaxInactiveInterval());
				}

				if (buyInfoId != null && buyInfoId.equals(taskId)) {
					Integer spStatusId = 2;
					SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
					spTreaTaskV.getSpTreaTaskC().setSpId((Integer) buyInfo.get("id"));//����id
					spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//����״̬

					//ȡ������ԭ����
					SpAotuerpTreasureTaskCustom spTreaTaskC = iSpGoodsService
							.findBuyTreasureDetailBySpIdAndSpStatus(spTreaTaskV);
					if (spTreaTaskC != null) {
						SpAotuerpTreasureProductSkuCustom currentTreasureProSkuC = null;//��ǰsku
						for (SpAotuerpTreasureProductSkuCustom skuProIds : spTreaTaskC.getSpAotuerpTreasureInfoCustom()
								.getSpAotuerpTreasureProductSkuCustoms()) {
							//�ȽϹ���sku�Լ���ѯ������sku�Ƿ���ͬ����ͬ�ͼ��뵱ǰsku����
							if (buyInfoSkuProdId.equals(skuProIds.skuProIds(skuProIds.getSpProductBproCSkus()))) {
								currentTreasureProSkuC = skuProIds;//��ƥ���sku��ֵ����ǰsku��
								break;
							}
						}
						spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().clear();//���ԭ��������sku
						if (currentTreasureProSkuC != null)
							spTreaTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(currentTreasureProSkuC);//���뱻ѡsku
						spBuyCar.addProduct(new SpBuyProduct(spTreaTaskC, buyInfoBuyCount));//��������Ʒ�Ž����ﳵ
						//cookie�������
						Cookie cookie = new Cookie("buyinfo", "");
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
						return new JsonMsg(100000, "����ɹ�", null, null);
					}
				}
			}

		}
		return JsonMsg.errorJsonMsg();
	}

	/**
	 * �鿴���ﳵ
	 * ��������ͼ(100x100ͼƬ)
	 * @param httpSession
	 * @param model
	 * @param req
	 * @param resp
	 * @param sessionId
	 * @return
	 */
	@RequestMapping("/buyCar")
	public String goodsBuyCar(HttpSession httpSession, Model model, HttpServletRequest req, HttpServletResponse resp,
			@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId) throws Exception{
		String goodsPicPath = "E:\\TOMCAT����Ŀ¼\\";//ȫ����ƷĿ¼�����ַ
		//String goodsPicPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		ImgSpec imgSpec=new ImgSpec(100,100);
		//�������ﳵ
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");
		if (spBuyCar == null) {//session���ﳵΪ��
			String sid = WebUtil.getCookieByName(req, "spBuyCarID");//��ȡ��ǰ�Ƿ���session
			if (sid != null) {
				HttpSession session = SpSiteSesstionListener.getSession(sid);//�оȻ�ȡ��ǰsession
				if (session != null){
					spBuyCar = (SpBuyCar) session.getAttribute("spBuyCar");//��ȡ��ǰsession�Ƿ���spBuyCar����
					if(spBuyCar != null){//��
						SpSiteSesstionListener.removeSession(sid);//ɾ����ǰsession��id
						httpSession.setAttribute("spBuyCar", spBuyCar);//���·��õ�ǰ�Ự
						WebUtil.addCookie(resp, "spBuyCarID",sessionId, httpSession.getMaxInactiveInterval());//���·��õ�ǰ�Ựcookie
					}
				}
			}
		}
		
		//�絽��һ��spBuyCarΪ�գ�����ǰû��session�Ự
		if (spBuyCar == null) {
			spBuyCar = new SpBuyCar();
			httpSession.setAttribute("spBuyCar", spBuyCar);//�����Ự
			WebUtil.addCookie(resp, "spBuyCarID", sessionId, httpSession.getMaxInactiveInterval());//���浱ǰsession�Ựid��cookie
		}

		if (spBuyCar.getProducts() != null && spBuyCar.getProducts().size() > 0) {
			//��������ͼ
			for (SpBuyProduct p : spBuyCar.getProducts()) {
				if(p.getSpTreasureTaskC()!=null&&p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom()!=null){
					
					ImgSpec thumnailImgSpec=ThumbnailatorUtil.createThumbnailImg(imgSpec, goodsPicPath, p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpImg(), "jpg");
					//���ع�񱣴�
					if(thumnailImgSpec!=null){//�ǿվ��Ǵ���������ͼ
						//�������ݿ�
						SpAotuerpTreasureImg thumbnailImg=new SpAotuerpTreasureImg();
						thumbnailImg.setSpImg(thumnailImgSpec.getImgPath());//·��
						thumbnailImg.setSpImgwidth(thumnailImgSpec.getImgWidth());//��
						thumbnailImg.setSpImgheight(thumnailImgSpec.getImgHeight());//��
						thumbnailImg.setSpImgsize(thumnailImgSpec.getImgSize().intValue());//��С
						thumbnailImg.setSpOrginalimgid(p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpId());
						iSpGoodsImgService.saveGoodsThumbnail(thumbnailImg);
					}
				}
			}
			
			model.addAttribute("spBuyCar", spBuyCar);
			return "ShoppingCart/ShoppingCart";
		}
		return "ShoppingCart/ShoppingCart";//�չ��ﳵҳ��
	}
	

	
	/**
	 * ɾ��������
	 * @param httpSession
	 * @param taskId ����id
	 * @param skuId skuid����ʽid��
	 * @return
	 */
	@RequestMapping("/buyCar/{id}/{skuId}!delete")
	public @ResponseBody JsonMsg goodsBuyCarDelete(HttpSession httpSession,@PathVariable("id") Integer taskId,@PathVariable("skuId") Integer skuId){
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//��ǰ�Ự��ȡ���ﳵ
		if(spBuyCar!=null){
			SpAotuerpTreasureTaskCustom spTreasureTaskC=new SpAotuerpTreasureTaskCustom();
			spTreasureTaskC.setSpId(taskId);
			SpAotuerpTreasureProductSkuCustom spTreasureProductSkuC=new SpAotuerpTreasureProductSkuCustom();
			spTreasureProductSkuC.setSpId(skuId);
			spTreasureTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(spTreasureProductSkuC);
			
			if(spBuyCar.removeBuyProduct(new SpBuyProduct(spTreasureTaskC)))
				return new JsonMsg(100000, "����ɹ�", null, null);//�ɹ�ɾ��������
		}
		return JsonMsg.errorJsonMsg();//ɾ��������ʧ��
	}
	
	/**
	 * ��չ��ﳵ
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buyCar/all!delete")
	public @ResponseBody JsonMsg goodsBuyCarDeleteAll(HttpSession httpSession)throws Exception{
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//��ǰ�Ự��ȡ���ﳵ
		if(spBuyCar!=null){
			spBuyCar.removeAll();
			return new JsonMsg(100000, "����ɹ�", null, null);//��չ��ﳵ�ɹ�
		}
		return JsonMsg.errorJsonMsg();//��չ��ﳵʧ��
	}
	
	/**
	 * ���¹��ﳵ����
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buyCar/{id}/{skuId}!updateCount")
	public @ResponseBody JsonMsg goodsBuyCarUpdateCount(HttpSession httpSession, @PathVariable("id") Integer taskId,
			@PathVariable("skuId") Integer skuId,Integer count) throws Exception {
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//��ǰ�Ự��ȡ���ﳵ
		if (spBuyCar != null) {
			//��������id��skuid��ѯԭ����
			Integer spStatusId = 2;
			SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
			spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//����id
			spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//����״̬
			//ȡ������ԭ����
			SpAotuerpTreasureTaskCustom spTreaTaskC = iSpGoodsService
					.findBuyTreasureDetailBySpIdAndSpStatus(spTreaTaskV);
			if(spTreaTaskC!=null){
				SpAotuerpTreasureTaskCustom spTreasureTaskC=new SpAotuerpTreasureTaskCustom();
				spTreasureTaskC.setSpId(taskId);
				SpAotuerpTreasureProductSkuCustom spTreasureProductSkuC=new SpAotuerpTreasureProductSkuCustom();
				spTreasureProductSkuC.setSpId(skuId);
				spTreasureTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(spTreasureProductSkuC);
				
				Integer skuStock=spTreaTaskC.getSpAotuerpTreasureInfoCustom().findStockBySku(spTreasureProductSkuC);
				
				if(count>skuStock){
					//���� spData:������ֵ
					spBuyCar.updateCount(new SpBuyProduct(spTreasureTaskC, skuStock));
					return new JsonMsg(100000, "����ɹ�", null, skuStock);//�ɹ�
				}else{
					spBuyCar.updateCount(new SpBuyProduct(spTreasureTaskC, count));
					return new JsonMsg(100000, "����ɹ�", null,null);
				}
			}
			//�޷���ȡԭ����
		}
		//�޹��ﳵ
		return JsonMsg.errorJsonMsg();
	}

}
