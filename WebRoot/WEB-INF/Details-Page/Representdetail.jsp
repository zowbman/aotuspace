<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
  <!--[if lte IE 7]>
        <script src="js/json2.js"></script>
  <![endif]-->
</head>
<body>
   <!-- 顶部开始 -->
   <%@include file="../staticPub/aotu_head.jsp" %>
   <%@include file="../staticPub/aotu_nav.jsp" %>
   <script>
   		var g_config={
   				represent:{
   					id:${rgoods.spId },
   					anId:${rgoods.spAnid},
   					tId:${rgoods.spAotuerpTreasureInfoCustom.spId},
   					pId:${rgoods.spAotuerpTreasureInfoCustom.spProductid},
   				}
   		}
   </script>
   <!-- Representdetail开始 -->
   <!-- 主播信息开始 -->
   <div id="rep_artist_info">
        <div class="auto_notice_content artist_info_bg">
             <div class="artist_box fl">
                   <img src="../images/OrderDetails_0223.jpg">
             </div>
             <div class="artist_info fl">
                  <h4>上野树里</h4>
                  <span class="a_saying">一串真挚的祝福，一个不平凡的心意，乘着爱的路车，送进你心里献上我无限的祝福之意，不论何时何地，我都愿意让你知道，我深深地为你祝福，圣诞快乐！</span>
             </div>
        </div>
   </div>
   <!-- 主播信息结束 -->
   <!-- 商品信息开始 -->
   <div id="rep_commodity_info">
   		<input id="commodityId"  value="${rgoods.spId }" type="hidden"/>
   		<input id="anId" value="${rgoods.spAnid }" type="hidden"/>
        <div class="auto_notice_content rep_c_info_content">
             <div class="commodity_info_l fl">
                  <div class="c_info_tile">
                       <h1>JVR 2015韩版男装夏季新款青春男士短袖T恤圆领体恤打底衫修身潮</h1>
                       <p>班尼路T-shirt</p>
                  </div>
                  <div class="at_gallery">
                       <div class="at_booth fl">
                            <div class="at_booth_img">
                                <a href="">
                                   <img src="/pic/${rgoods.spAotuerpTreasureInfoCustom.treasurePrimaryImg.spImg }">
                                </a>
                            </div>
                            <p class="at_booth_share">
                               <a href="" class="iShare">
                                  <i class="share_img"></i>
                                                                                                                                  分享
                               </a>
                               <a href="" class="favorite">
                                  <i class="Collection_img"></i>
                                                                                                                                 收藏商品
                               </a>
                            </p>
                       </div>
                       <div class="at_wrap fl" ng-app="skuApp" ng-cloak>
                            <div ng-controller="skuController" class="m-detail">
                                 <div class="at-fcs-panel">
	                                 <dl class="goods_numb">
	                                     <dt class="at-metatit">商品货物号:</dt>
	                                     <dd>
	                                        <span class="nub">HD200152</span>
	                                      </dd>
	                                 </dl>
	                                 <dl class="market_value">
	                                     <dt class="at-metatit" style="line-height: 48px;">市场价:</dt>
	                                     <dd>
	                                        <em class="at-yen">¥</em> 
	                                        <span class="at-price">{{price||${rgoods.spAotuerpTreasureInfoCustom.goodsShowPrice}}}</span>
	                                     </dd>
	                                 </dl>
	                            </div>
	                            <div class="remain_time">
	                                  <p>代理剩余时间：</p>
	                                  <div>
	                                      <img src="../../images/Representdetail_04_07.jpg">
	                                  </div>
	                            </div>
                                 <div class="m-detail">
                                    <div ui-sku split-str="#" init-sku="" sku-data="skuInfo" on-ok="callback($event)" class="ui-sku-check">
									<c:forEach items="${rgoods.spAotuerpTreasureInfoCustom.spTreasureProNames}" var="name">
											<div class="row f-cb">
                                             <div class="l-col">${name.spPropertyname }</div>
                                               <div class="r-col">
                                                  <ul class="m-sku f-cb">
                                                    <c:forEach items="${name.spProductPropertyValues}" var="value">
                                                    	<li sp-value="${value.spProductPvalue.spPropertynameid }:${value.spProductPvalue.spId }"><span ng-class="{'js-seleted': keyMap['${value.spProductPvalue.spPropertynameid }:${value.spProductPvalue.spId }'].selected, 'js-disabled': keyMap['${value.spProductPvalue.spPropertynameid }:${value.spProductPvalue.spId }'].disabled}" ng-click="onSelect('${value.spProductPvalue.spPropertynameid }:${value.spProductPvalue.spId }')">${value.spProductPvalue.spPropertyvalue }</span></li>
                                                    </c:forEach>
                                                  </ul>
                                              </div>
                                            </div>
									</c:forEach>   
                                 </div>
                                 <div class="row f-cb">
                                     <div class="l-col">数量</div>
                                     <div class="ui-porduct">
                                          <span class="ui-porductDd__amount ext-error"> 
                                               <a class="btn-amountReduce">-</a> 
                                               <a class="btn-amountAdd">+</a> 
                                               <input class="text" id="ui-porductDd__amountNum" value="1"> 
                                           </span>  
                                              
                                     </div>
                                     <div class="r-col account" style="width:50px;">{{count||${rgoods.spAotuerpTreasureInfoCustom.rgoodsSum }}}件</div>
                                     <span class="ui-porductDd__error">sdfsdfsdf</span>
                                 </div>
                            </div>
                            
                            <div class="at_r-button">
                                 <div class="purchase fl">
                                       <a href="javascript:;" class="sp_linkBuy">
                                                                                                                                                             立即购买
                                       </a>
                                 </div>
                                 <div class="shopping_cart fl">
                                        <a href="javascript:;" class="sp_linkBuyCar">
                                            <i class="shop_icon">&#xe623;</i>
                                                                                                                                                          加入购物车 
                                        </a>
                                 </div>
                            </div>
                       </div>
                  </div>      
			   </div>
          </div> 
           <div class="commodity_info_r fr">
                  <div class="other-title">
                        <span>其它代言商品</span>
                  </div>
                  <div></div>
                  <div class="other-line"></div>
                  <div class="other-goods">
                        <ul>
                            <li>
                               <div>
                                   <a href=""><img src="../../images/OrderDetails_10.jpg"></a>
                               </div>
                               <p><a href="">太空杯</a></p>
                               <p class="salesvolume">销量&nbsp;&nbsp;<span>646548798789</span></p>
                            </li>
                            <li>
                               <div>
                                   <a href=""><img src="../../images/OrderDetails_13.jpg"></a>
                               </div>
                               <p><a href="">太空杯</a></p>
                               <p class="salesvolume">销量&nbsp;&nbsp;<span>646548798789</span></p>
                            </li>
                        </ul>
                  </div>
             </div>			            
        </div>
   </div>
   <!-- 商品信息结束 -->
    <!-- 商品评论开始 -->
   <div id="cd-main">
        <div class="auto_notice_content at-main">
             <div id="tabmenu" class="at-box">
                  <ul>
                      <li class="purchase-comment">商品信息 DESCRIPTION</li>
                      <li>购买评论 COMMENT</li>
                  </ul>
             </div>
             <div class="at-box-line"></div>
             <div id="a-detail-mainTab">
                 <div id="description" class="description">
                      <div class="product-parameter">
                       <p class="attr-list-hd">
                           <em>产品参数：</em>
                       </p>
                       <ul> 
                          <c:forEach items="${rgoods.spAotuerpTreasureInfoCustom.spProductBinfoCustom.spProductBpropertiesCustoms }" var="item">
                             	<c:if test="${item.spIssku ==0}">
                             		<li title="&nbsp;适中">${item.spProductPname.spPropertyname }:&nbsp;${item.spProductPvalue.spPropertyvalue }</li> 
                             	</c:if>
                          </c:forEach>  
                          <!-- 健字号相关--> 
                       </ul>
                      </div>
                      <div class="at-details">
                            <div class="c-details">
                                <span>商品详情 DETAILS </span>
                            </div>
                            <div class="at-details-line"></div>
                            <div class="picture-display">
                                 <div class="pd-main">
                                    ${rgoods.spAotuerpTreasureInfoCustom.spTreasuredescription }
                                 </div>
                                 <dl class="special">
                                      <dt>重要说明：</dt>
                                      <dd>1、以上详情页面展示信息仅供参考，商品以实物为准；<br>2、如快递无法配送至获奖者提供的送货地址，将默认配送到距离最近的送货地，由获奖者本人自提。</dd>
                                  </dl>
                            </div>
                      </div>
                 </div>
                 <div id="review" class="review" style="display:none;">
                      <div class="review-main">
                           <div class="a-detail-shareList-author fl">
                                <a href="" class="portrait">
                                  <img src="../images/OrderDetails_0223.jpg">
                                </a>
                                <a href="" class="nickname" title="122512222dsfsdfsdfsdfsdfsd222">
                                   <nobr>122512222dsfsdfsdfsdfsdfsd222</nobr>
                                </a>
                           </div>
                           <div class="a-detail-shareList-detail fl">
                                <div class="titleWrap">
                                     <ul class="fl">
                                        <li>颜色：</li>
                                        <li>青色</li>
                                        <li>尺码：</li>
                                        <li>xl</li>
                                     </ul>
                                     <span class="date fr">2015-10-22 01:20:59</span>
                                </div>
                                <div class="contentWrap">
                                     <span>
                                                                                                                                                    质量非常好，与卖家描述的完全一致，非常满意,真的很喜欢，比想象的好，发货速度非常快，包装非常仔细、严实，物流公司服务态度很好，很满意的一次购物，下次还来
                                     </span>
                                </div>
                           </div>
                      </div>
                      <div class="review-main">
                           <div class="a-detail-shareList-author fl">
                                <a href="" class="portrait">
                                  <img src="../images/Representdetail_19.jpg">
                                </a>
                                <a href="" class="nickname" title="122512222dsfsdfsdfsdfsdfsd222">
                                   <nobr>122512222dsfsdfsdfsdfsdfsd222</nobr>
                                </a>
                           </div>
                           <div class="a-detail-shareList-detail fl">
                                <div class="titleWrap">
                                     <ul class="fl">
                                        <li>颜色：</li>
                                        <li>青色</li>
                                        <li>尺码：</li>
                                        <li>xl</li>
                                     </ul>
                                     <span class="date fr">2015-10-22 01:20:59</span>
                                </div>
                                <div class="contentWrap">
                                     <span>
                                                                                                                                                 质量非常好，与卖家描述的完全一致，非常满意,真的很喜欢，比想象的好，发货速度非常快，包装非常仔细、严实，物流公司服务态度很好，很满意的一次购物，下次还来
                                     </span>
                                </div>
                           </div>
                      </div>
                      <div class="review-main">
                           <div class="a-detail-shareList-author fl">
                                <a href="" class="portrait">
                                  <img src="../images/Representdetail_19.jpg">
                                </a>
                                <a href="" class="nickname" title="122512222dsfsdfsdfsdfsdfsd222">
                                   <nobr>122512222dsfsdfsdfsdfsdfsd222</nobr>
                                </a>
                           </div>
                           <div class="a-detail-shareList-detail fl">
                                <div class="titleWrap">
                                     <ul class="fl">
                                        <li>颜色：</li>
                                        <li>青色</li>
                                        <li>尺码：</li>
                                        <li>xl</li>
                                     </ul>
                                     <span class="date fr">2015-10-22 01:20:59</span>
                                </div>
                                <div class="contentWrap">
                                     <span>
                                                                                                                                                  质量非常好，与卖家描述的完全一致，非常满意,真的很喜欢，比想象的好，发货速度非常快，包装非常仔细、严实，物流公司服务态度很好，很满意的一次购物，下次还来
                                     </span>
                                </div>
                           </div>
                      </div>
                      <div class="review-main">
                           <div class="a-detail-shareList-author fl">
                                <a href="" class="portrait">
                                  <img src="../images/Representdetail_19.jpg">
                                </a>
                                <a href="" class="nickname" title="122512222dsfsdfsdfsdfsdfsd222">
                                   <nobr>122512222dsfsdfsdfsdfsdfsd222</nobr>
                                </a>
                           </div>
                           <div class="a-detail-shareList-detail fl">
                                <div class="titleWrap">
                                     <ul class="fl">
                                        <li>颜色：</li>
                                        <li>青色</li>
                                        <li>尺码：</li>
                                        <li>xl</li>
                                     </ul>
                                     <span class="date fr">2015-10-22 01:20:59</span>
                                </div>
                                <div class="contentWrap">
                                     <span>
                                                                                                                                                    质量非常好，与卖家描述的完全一致，非常满意,真的很喜欢，比想象的好，发货速度非常快，包装非常仔细、严实，物流公司服务态度很好，很满意的一次购物，下次还来
                                     </span>
                                </div>
                           </div>
                      </div>
                 </div>
             </div>
        </div>
   </div>
   <!-- 商品评论结束 -->
   <!-- OrderDetails结束 -->
   <!-- Representdetail结束 -->
   <!-- 底部开始 -->
   <%@include file="../staticPub/aotu_foot.jsp" %>
</body>
</html>