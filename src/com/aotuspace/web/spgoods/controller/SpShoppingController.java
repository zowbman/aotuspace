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
 * Description:凹凸空间购买商品controller
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-16 下午3:18:21
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

	// =============jackson josn转换器===========
	protected ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * 立即购买、加入购物车(参数封装)
	 * 使用session封装参数
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

		//转json加码cookie
		String buyInfoJson = objectMapper.writeValueAsString(buyInfo);

		Cookie cookie = new Cookie("buyinfo", URLEncoder.encode(buyInfoJson, "utf-8"));

		resp.addCookie(cookie);

		return new JsonMsg(100000, "请求成功", null, null);
	}
	
	/**
	 * 检查更新数量
	 * @param httpSession
	 * @param taskId 任务id
	 * @param skuProp skuProp(样式属性sku表)
	 * @param count 数量
	 * @param pdId 产品id
	 * @param treasureId 宝贝id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{id}!checkCount")
	public @ResponseBody JsonMsg goodsCheckCount(HttpSession httpSession, @PathVariable("id") Integer taskId,
			String skuProp,Integer pdId,Integer treasureId,Integer count) throws Exception {
			//根据任务id和skuid查询原对象
			Integer spStatusId = 2;
			SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
			spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//任务id
			spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//任务状态
			//取得任务原对象
			SpAotuerpTreasureTaskCustom spTreaTaskC = iSpGoodsService
					.findBuyTreasureDetailBySpIdAndSpStatus(spTreaTaskV);
			if(spTreaTaskC!=null){
				if(skuProp!=null&&skuProp.trim()!=""){//如果skuid非空非空字符串就用sku数量验证
					//sku表查询（单表查询）返回skuid
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
							//返回 spData:库存最大值
							return new JsonMsg(100000, "请求成功", null, skuStock);//成功
						}
					}
				}else{
					Integer sumStock=spTreaTaskC.getSpAotuerpTreasureInfoCustom().findSumStock();
					if(count>sumStock){
						//返回 spData:库存最大值
						return new JsonMsg(100000, "请求成功", null, sumStock);//成功
					}
				}
				return new JsonMsg(100000, "请求成功", null,null);
			}
			//无法获取原对象
		return JsonMsg.errorJsonMsg();
	}
	

	/**
	 * 立即购买
	 * @param anchorId 代言主播id
	 * @param taskId 任务id
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
				Integer buyInfoBuyCount = (Integer) buyInfo.get("buyCount");//购买数量
				//创建购物车
				SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");
				if (spBuyCar == null) {//购物车为空
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
				
				//创建购物车
				if (spBuyCar == null) {
					spBuyCar = new SpBuyCar();
					httpSession.setAttribute("spBuyCar", spBuyCar);
					WebUtil.addCookie(resp, "spBuyCarID", sessionId, httpSession.getMaxInactiveInterval());
				}

				if (buyInfoId != null && buyInfoId.equals(taskId)) {
					Integer spStatusId = 2;
					SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
					spTreaTaskV.getSpTreaTaskC().setSpId((Integer) buyInfo.get("id"));//任务id
					spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//任务状态

					//取得任务原对象
					SpAotuerpTreasureTaskCustom spTreaTaskC = iSpGoodsService
							.findBuyTreasureDetailBySpIdAndSpStatus(spTreaTaskV);
					if (spTreaTaskC != null) {
						SpAotuerpTreasureProductSkuCustom currentTreasureProSkuC = null;//当前sku
						for (SpAotuerpTreasureProductSkuCustom skuProIds : spTreaTaskC.getSpAotuerpTreasureInfoCustom()
								.getSpAotuerpTreasureProductSkuCustoms()) {
							//比较购买sku以及查询出来的sku是否相同，相同就加入当前sku变量
							if (buyInfoSkuProdId.equals(skuProIds.skuProIds(skuProIds.getSpProductBproCSkus()))) {
								currentTreasureProSkuC = skuProIds;//把匹配的sku赋值到当前sku中
								break;
							}
						}
						spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().clear();//清除原对象所有sku
						if (currentTreasureProSkuC != null)
							spTreaTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(currentTreasureProSkuC);//放入被选sku
						spBuyCar.addProduct(new SpBuyProduct(spTreaTaskC, buyInfoBuyCount));//把任务商品放进购物车
						//快速购买
						SpFastBuy spFastBuy = new SpFastBuy();
						spFastBuy.setProduct(new SpBuyProduct(spTreaTaskC, buyInfoBuyCount));
						model.addAttribute("spFastBuy", spFastBuy);
						//cookie参数清除
						Cookie cookie = new Cookie("buyinfo", "");
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
						//收货地址
						SpUsersBinfoCustom spUsersBinfoCustom=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//获取当前用户
						if(spUsersBinfoCustom!=null){
							//根据aotuid查询收获地址
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
		return "ShoppingCart/ShoppingCartSubmitOrders";//错误页
	}
	
	/**
	 * 保存配送方式
	 * @param httpSession
	 * @param req
	 * @param sessionId
	 * @param resp
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/paymentWay!save")
	public String savePaymentWay(HttpSession httpSession,HttpServletRequest req,@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId,HttpServletResponse resp)throws Exception{
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//获取购物车
		if(spBuyCar==null){//如果购物车为空，获取以前的购物车
			// 可以不要
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
			//可以不要结束
			
		}
		return null;
	}
	

	/**
	 * 添加购物车
	 * @param anchorId 主播id
	 * @param taskId 任务id
	 * @param httpSession 
	 * @param buyinfo 购买信息
	 * @param sessionId sessionid保存在cookie
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
				Integer buyInfoBuyCount = (Integer) buyInfo.get("buyCount");//购买数量
				//创建购物车
				SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");
				if (spBuyCar == null) {//购物车为空
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

				//创建购物车
				if (spBuyCar == null) {
					spBuyCar = new SpBuyCar();
					httpSession.setAttribute("spBuyCar", spBuyCar);
					WebUtil.addCookie(resp, "spBuyCarID", sessionId, httpSession.getMaxInactiveInterval());
				}

				if (buyInfoId != null && buyInfoId.equals(taskId)) {
					Integer spStatusId = 2;
					SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
					spTreaTaskV.getSpTreaTaskC().setSpId((Integer) buyInfo.get("id"));//任务id
					spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//任务状态

					//取得任务原对象
					SpAotuerpTreasureTaskCustom spTreaTaskC = iSpGoodsService
							.findBuyTreasureDetailBySpIdAndSpStatus(spTreaTaskV);
					if (spTreaTaskC != null) {
						SpAotuerpTreasureProductSkuCustom currentTreasureProSkuC = null;//当前sku
						for (SpAotuerpTreasureProductSkuCustom skuProIds : spTreaTaskC.getSpAotuerpTreasureInfoCustom()
								.getSpAotuerpTreasureProductSkuCustoms()) {
							//比较购买sku以及查询出来的sku是否相同，相同就加入当前sku变量
							if (buyInfoSkuProdId.equals(skuProIds.skuProIds(skuProIds.getSpProductBproCSkus()))) {
								currentTreasureProSkuC = skuProIds;//把匹配的sku赋值到当前sku中
								break;
							}
						}
						spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().clear();//清除原对象所有sku
						if (currentTreasureProSkuC != null)
							spTreaTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(currentTreasureProSkuC);//放入被选sku
						spBuyCar.addProduct(new SpBuyProduct(spTreaTaskC, buyInfoBuyCount));//把任务商品放进购物车
						//cookie参数清除
						Cookie cookie = new Cookie("buyinfo", "");
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
						return new JsonMsg(100000, "请求成功", null, null);
					}
				}
			}

		}
		return JsonMsg.errorJsonMsg();
	}

	/**
	 * 查看购物车
	 * 制作缩略图(100x100图片)
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
		String goodsPicPath = "E:\\TOMCAT虚拟目录\\";//全部商品目录物理地址
		//String goodsPicPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		ImgSpec imgSpec=new ImgSpec(100,100);
		//创建购物车
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");
		if (spBuyCar == null) {//session购物车为空
			String sid = WebUtil.getCookieByName(req, "spBuyCarID");//获取以前是否有session
			if (sid != null) {
				HttpSession session = SpSiteSesstionListener.getSession(sid);//有救获取以前session
				if (session != null){
					spBuyCar = (SpBuyCar) session.getAttribute("spBuyCar");//获取以前session是否有spBuyCar对象
					if(spBuyCar != null){//有
						SpSiteSesstionListener.removeSession(sid);//删除以前session的id
						httpSession.setAttribute("spBuyCar", spBuyCar);//重新放置当前会话
						WebUtil.addCookie(resp, "spBuyCarID",sessionId, httpSession.getMaxInactiveInterval());//重新放置当前会话cookie
					}
				}
			}
		}
		
		//如到这一步spBuyCar为空，即以前没有session会话
		if (spBuyCar == null) {
			spBuyCar = new SpBuyCar();
			httpSession.setAttribute("spBuyCar", spBuyCar);//创建会话
			WebUtil.addCookie(resp, "spBuyCarID", sessionId, httpSession.getMaxInactiveInterval());//保存当前session会话id进cookie
		}

		if (spBuyCar.getProducts() != null && spBuyCar.getProducts().size() > 0) {
			//制作缩略图
			for (SpBuyProduct p : spBuyCar.getProducts()) {
				if(p.getSpTreasureTaskC()!=null&&p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom()!=null){
					
					ImgSpec thumnailImgSpec=ThumbnailatorUtil.createThumbnailImg(imgSpec, goodsPicPath, p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpImg(), "jpg");
					//返回规格保存
					if(thumnailImgSpec!=null){//非空就是创建了缩略图
						//保存数据库
						SpAotuerpTreasureImg thumbnailImg=new SpAotuerpTreasureImg();
						thumbnailImg.setSpImg(thumnailImgSpec.getImgPath());//路径
						thumbnailImg.setSpImgwidth(thumnailImgSpec.getImgWidth());//宽
						thumbnailImg.setSpImgheight(thumnailImgSpec.getImgHeight());//高
						thumbnailImg.setSpImgsize(thumnailImgSpec.getImgSize().intValue());//大小
						thumbnailImg.setSpOrginalimgid(p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpId());
						iSpGoodsImgService.saveGoodsThumbnail(thumbnailImg);
					}
				}
			}
			
			model.addAttribute("spBuyCar", spBuyCar);
			return "ShoppingCart/ShoppingCart";
		}
		return "ShoppingCart/ShoppingCart";//空购物车页面
	}
	

	
	/**
	 * 删除购物项
	 * @param httpSession
	 * @param taskId 任务id
	 * @param skuId skuid（样式id）
	 * @return
	 */
	@RequestMapping("/buyCar/{id}/{skuId}!delete")
	public @ResponseBody JsonMsg goodsBuyCarDelete(HttpSession httpSession,@PathVariable("id") Integer taskId,@PathVariable("skuId") Integer skuId){
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//当前会话获取购物车
		if(spBuyCar!=null){
			SpAotuerpTreasureTaskCustom spTreasureTaskC=new SpAotuerpTreasureTaskCustom();
			spTreasureTaskC.setSpId(taskId);
			SpAotuerpTreasureProductSkuCustom spTreasureProductSkuC=new SpAotuerpTreasureProductSkuCustom();
			spTreasureProductSkuC.setSpId(skuId);
			spTreasureTaskC.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(spTreasureProductSkuC);
			
			if(spBuyCar.removeBuyProduct(new SpBuyProduct(spTreasureTaskC)))
				return new JsonMsg(100000, "请求成功", null, null);//成功删除购物项
		}
		return JsonMsg.errorJsonMsg();//删除购物项失败
	}
	
	/**
	 * 清空购物车
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buyCar/all!delete")
	public @ResponseBody JsonMsg goodsBuyCarDeleteAll(HttpSession httpSession)throws Exception{
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//当前会话获取购物车
		if(spBuyCar!=null){
			spBuyCar.removeAll();
			return new JsonMsg(100000, "请求成功", null, null);//清空购物车成功
		}
		return JsonMsg.errorJsonMsg();//清空购物车失败
	}
	
	/**
	 * 更新购物车数量
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buyCar/{id}/{skuId}!updateCount")
	public @ResponseBody JsonMsg goodsBuyCarUpdateCount(HttpSession httpSession, @PathVariable("id") Integer taskId,
			@PathVariable("skuId") Integer skuId,Integer count) throws Exception {
		SpBuyCar spBuyCar = (SpBuyCar) httpSession.getAttribute("spBuyCar");//当前会话获取购物车
		if (spBuyCar != null) {
			//根据任务id和skuid查询原对象
			Integer spStatusId = 2;
			SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
			spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//任务id
			spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//任务状态
			//取得任务原对象
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
					//返回 spData:库存最大值
					spBuyCar.updateCount(new SpBuyProduct(spTreasureTaskC, skuStock));
					return new JsonMsg(100000, "请求成功", null, skuStock);//成功
				}else{
					spBuyCar.updateCount(new SpBuyProduct(spTreasureTaskC, count));
					return new JsonMsg(100000, "请求成功", null,null);
				}
			}
			//无法获取原对象
		}
		//无购物车
		return JsonMsg.errorJsonMsg();
	}

}
