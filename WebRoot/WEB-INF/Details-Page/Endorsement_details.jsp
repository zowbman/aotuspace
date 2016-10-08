<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
   <!-- 顶部开始 -->
   <%@include file="../staticPub/aotu_head.jsp" %>
   <%@include file="../staticPub/aotu_nav.jsp" %>
   <!-- goods_Endorsement_details开始 -->
   <!-- 面包屑开始 -->
   <div id="a_crumbs">
         <div class="all_crumbs">
            <a href="../index.html" class="home">首页</a>&nbsp;
            〉
            <a href="../Represent.html">我要代</a>&nbsp;
            〉
            &nbsp;<span>我要代详细页</span>
        </div>
   </div>
   <!-- 面包屑结束 -->
   <!-- goods_e开始 -->
   <div id="e_goods_details">
        <div class="auto_notice_content">
             <div class="e-detail_l fl">
                  <div class="detail_l_box fl">
                       <div class="tab-pane">
                            <div class="vertical-img">
                                 <a href="" class="box-img">
                                    <img src="/pic/${rgoods.spAotuerpTreasureInfoCustom.treasurePrimaryImg.spImg }">
                                 </a>
                            </div>
                            <i class="icon-mag" title="图片可放大" style="display: inline;"></i>
                       </div>
                       <div class="tab-content">
                            <div class="tab-content-container">
                                 <ul class="nav-tabs">
                                 <c:forEach items="${rgoods.spAotuerpTreasureInfoCustom.spAotuerpTreasureImgs }" var="item">
                                 	<li class="tab-trigger">
                                         <div class="vertical-img">
                                              <a href="" class="box-img">
                                                  <img src="/pic/${item.spImg }_100x100.jpg">
                                              </a>
                                         </div>
                                     </li>
                                 </c:forEach>
                                 </ul>
                            </div>
                       </div>
                       <div class="obj-fav">
                            <p class="at_booth_share">
                               <a href="" class="iShare">
                                  <i class="share_img"></i>
                                                                                                                       分享
                               </a>
                               <a href="" class="favorite">
                                  <i class="Collection_img"></i>
                                                                                                                       收藏商品
                               </a>
                               <a href="" class="Report">举报</a>
                            </p>
                       </div>  
                  </div>
                  <div class="detail_r_box fl">
                       <div class="e_intro">
                           <p class="e_tile">${rgoods.spAotuerpTreasureInfoCustom.spTreasuretitle }</p>
                           <p>${rgoods.spAotuerpTreasureInfoCustom.spTreasuresellingpoints }</p>
                           <p>代言产品件数:<span>${rgoods.spAotuerpTreasureInfoCustom.rgoodsSum }件</span></p>
                       </div>
                       <div class="profit">
                            <p>代言收益</p>
                            <div class="pro_chart">
                                <div class="p_num fl">
                                     <ul>
                                         <li><span>1-10件</span></li>
                                         <li><span>1-10件</span></li>
                                         <li><span>1-10件</span></li>
                                         <li><span>1-10件</span></li>
                                     </ul>
                                </div>
                                <div class="proportion_chart fl">
                                     <div class="oI_prg">
                                         <div class="oI_progress-bar" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width:80%;">
                                                 80%
                                         </div>
                                     </div>
                                     <div class="oI_prg">
                                         <div class="oI_progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:70%;">
                                                 70%
                                         </div>
                                     </div>
                                     <div class="oI_prg">
                                         <div class="oI_progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width:60%;">
                                                 60%
                                         </div>
                                     </div>
                                     <div class="oI_prg">
                                         <div class="oI_progress-bar" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:50%;">
                                                 50%
                                         </div>
                                     </div>
                                </div>
                            </div>
                       </div> 
                       <div class="price_apply">
                            <div class="price_l fl">
                                 <p>价格：<span>￥60.00</span>/件</p>
                            </div>
                            <div class="apply_r fr">
                                 <a href="/aotuspace/goods/r/${rgoods.spId}!buy">申请代言</a>
                            </div>
                       </div>
                       <div class="security">
                            <span>保障</span>
                            <a href="">
                                <i class="s_img"></i>
                                                                                                                正品保障
                            </a>
                            <a href="">
                                <i class="s_img"></i>
                                                                                                                 假一赔三
                            </a>
                       </div>
                  </div>
             </div>
             <div class="e-detail_r fr">
                  <div class="other-title">
                        <span>该公司还有</span>
                  </div>
                  <div></div>
                  <div class="other-line"></div>
                  <div class="other-goods">
                        <ul>
                            <li>
                               <div class="e_c">
                                   <a href=""><img src="../images/OrderDetails_10.jpg"></a>
                               </div>
                               <p><a href="">太空杯</a></p>
                               <p class="salesvolume">销量&nbsp;&nbsp;<span>646548798789</span></p>
                            </li>
                            <li>
                               <div class="e_c">
                                   <a href=""><img src="../images/OrderDetails_13.jpg"></a>
                               </div>
                               <p><a href="">太空杯</a></p>
                               <p class="salesvolume">销量&nbsp;&nbsp;<span>646548798789</span></p>
                            </li>
                            <li>
                               <div class="e_c">
                                   <a href=""><img src="../images/OrderDetails_13.jpg"></a>
                               </div>
                               <p><a href="">太空杯</a></p>
                               <p class="salesvolume">销量&nbsp;&nbsp;<span>646548798789</span></p>
                            </li>
                        </ul>
                  </div>
             </div>
        </div>
   </div>
   <!-- goods_e结束 -->
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
   <!-- goods_Endorsement_details结束 -->
   <!-- 底部开始 -->
   <%@include file="../staticPub/aotu_foot.jsp" %>
</body>
</html>