<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body style="width:100%; height:100%;background: url(../images/ShoppingCartSubmitOrders.jpg) no-repeat;">
  <!-- 顶部开始 -->
  <%@include file="../staticPub/aotu_head.jsp" %>
   <!-- 支付步骤开始 -->
   <div id="pay-step">
         <div class="b_line"></div>
         <div></div>
         <div class="auto_notice_content pay-step-icon">
              <ol>
                <li class="step-all">
                    <div class="step-done">
                         <div class="step-yes"></div>
                         <div class="step-name">购物车<br/>SHOPPING CART</div>
                    </div>
                </li>
                <li class="step-all">
                    <div class="step-done">
                         <div class="step-y-n">2</div>
                         <div class="step-name-l">提交订单<br/>SUBMIT ORDERS</div>
                    </div>
                </li>
                <li>
                    <div class="step-done">
                         <div class="step-no">3</div>
                         <div class="step-name">付款<br/>PAYMENT</div>
                    </div>
                </li>
                <li>
                    <div class="step-done">
                         <div class="step-no">4</div>
                         <div class="step-name">购买结果<br/>RESULT</div>
                    </div>
                </li>
              </ol>
         </div>
   </div>
   <!-- 支付步骤结束 -->
   <!-- 核对信息开始 -->
   <div id="check-information">
        <div class="auto_notice_content">
             <div class="check-information-title">
                  <span style="float:left;">
                      请填写并核对以下信息
                  </span>
                  <a href="" class="shop-return">
                      返回购物车
                  </a>
             </div>
             <div class="consignee-information">
                   <div class="receiving-i">
                        <p>选择收货地址：<a href="" class="revise">[管理收货地址]</a></p>
                        <c:forEach items="${delivers }" var="item">
                        	<p class="all-receiving <c:choose><c:when test="${item.spIsdefault==1}">defalut-address</c:when></c:choose>">
	                            <span class="receiving-name">${item.spReceiver}</span>
                        		<c:choose><c:when test="${item.provinceName.spDistrict!=null}">${item.provinceName.spDistrict}，</c:when></c:choose>
                                <c:choose><c:when test="${item.cityName.spDistrict!=null}">${item.cityName.spDistrict}，</c:when></c:choose>
                                <c:choose><c:when test="${item.districtName.spDistrict!=null}">${item.districtName.spDistrict}，</c:when></c:choose>
                                <c:choose><c:when test="${item.townName.spDistrict!=null}">${item.townName.spDistrict}，</c:when></c:choose>
                                ${item.spAddress}，
	                            <c:choose><c:when test="${item.spPostcode!=null&&item.spPostcode!=''}">${item.spPostcode}，</c:when></c:choose>
	                            ${item.spMobie }
	                            <c:choose><c:when test="${item.spIsdefault==1}"><span class="defalut-address-span">默认地址</span></c:when></c:choose>
	                        </p>
                        </c:forEach>
                   </div>
                   <div class="receiving-i">
                        <p>支付：</p>
                        <p class="all-receiving">付款方式：在线支付</p>
                   </div>
                   <div class="receiving-i" style="border-bottom-width: 0px;">
                        <p>选择快递：</p>
                        <p class="all-receiving">
                           <input type="radio" checked="checked" name="Express" id="GENERALPOST" value="GENERALPOST"/>
                           <label for="GENERALPOST">普通快递：运费￥10.00</label>
                           <br/><br/>
                           <input type="radio" name="Express" id="SF" value="SF"/>
                           <label for="SF">顺丰快递：运费￥15.00</label>
                        </p>
                        <p class="all-receiving express-remarks" >注：配送会由于天气，交通等不可抗拒的客观因素造成您收货时间延迟，请您知悉</p>
                   </div>
             </div>
         </div>
   </div>
   <!-- 核对信息结束 -->

   <!-- 购物车商品信息开始 -->
   <div id="shopping-cart" style="margin-top: 30px;">
        <div class="auto_notice_content">
             <div class="s-c-table">
                  <table>
                        <tbody>
                            <tr class="s-c-title">
                              <th class="goods-i">商品信息</th>
                              <th>单价（元）</th>
                              <th>数量</th>
                              <th>小计（元）</th>
                            </tr>
	                            <!-- 商品详情开始 -->
	                            <tr class="product-information">
	                                <td class="p-i-1">
	                                    <div class="p-i-list">
	                                         <a href="" class="p-i-list-img"><img src="/pic/${spFastBuy.product.spTreasureTaskC.spAotuerpTreasureInfoCustom.treasurePrimaryImg.spImg}_100x100.jpg"></a>
	                                         <div class="p-i-1-right">
	                                             <div class="p-i-1-right_a">
	                                                  <span>代言主播 童可可</span>
	                                             </div>
	                                             <div class="p-i-1-right_b">
	                                                  <a href=""><span style="color:#468fa2;">${spFastBuy.product.spTreasureTaskC.spAotuerpTreasureInfoCustom.spTreasuretitle }</span></a>
	                                             </div>
	                                             <div class="p-i-1-right_c">
	                                             <c:forEach items="${spFastBuy.product.spTreasureTaskC.spAotuerpTreasureInfoCustom.spAotuerpTreasureProductSkuCustoms }" var="item">
	                                             		<span style="color:#aaa;">
		                                             		<c:forEach items="${item.spProductBproCSkus }" var="item1">
		                                             			${item1.spProductPname.spPropertyname }：${item1.spProductPvalue.spPropertyvalue }
		                                             		</c:forEach>
	                                             		</span>
	                                             </c:forEach>  
	                                             </div>
	                                         </div>
	                                    </div>
	                                </td>
	                                <td class="p-i-2">
	                                    <p style="text-align: center;">
	                                    <c:forEach items="${spFastBuy.product.spTreasureTaskC.spAotuerpTreasureInfoCustom.spAotuerpTreasureProductSkuCustoms }" var="item">
	                                    	￥${item.spSalesprice }
	                                    </c:forEach>
	                                    </p>
	                                </td>
	                                <td class="p-i-3" align="center">
	                                    <div style="padding: 0px 45px;">
	                                          <span>${spFastBuy.product.count }</span>
	                                    </div>
	                                </td>
	                                <td class="p-i-2">
	                                    <p style="text-align: center;">￥${spFastBuy.subTotalPrice }</p>
	                                </td>
	                            </tr>
	                            <!-- 商品详情结束 -->
                            
                            <tr class="table-footer">
                               <td colspan="5" style="border:1px solid #ddd;background:#fff;padding: 10px 0;">
                                   <div class="table-footer-r">
                                        <p>
                                                                                                                                                          商品总价（不含运费）：
                                            <span>+￥100.00</span>
                                        </p>
                                        <p style="color:red;margin-left: 96px;">
                                                                                                                                                             运费：
                                            <span>+￥100.00</span>                
                                        </p>
                                   </div>
                               </td>
                            </tr>
                        </tbody>
                  </table>
             </div>
             <!-- <div class="remark">
                  <p><span style="color:red;">注：</span>请在30分钟内提交订单，并在下单后30分钟内完成支付</p>
             </div> -->
             
        </div>
   </div>
   <!-- 购物车商品信息结束 -->
   <!-- 备注开始 -->
   <div id="remark-information">
        <div class="auto_notice_content">
             <div class="remark">
                  <p style="font-size:14px;">您需要实际支付金额:<span style="font-size:22px;color:#ee0014;font-weight:bold;">￥100.00</span>元</p>
             </div>
        </div>
   </div>
   <!-- 备注结束 -->
   <!-- 按钮开始 -->
   <div id="s-c-button">
        <div class="auto_notice_content " style="margin-bottom:102px;">
             <div class="settlement">
                 <a href="ShoppingCartPayment.jsp" class="settlement-a" style="background:red;">
                                                                      去付款
                    <span class="a"></span>
                 </a>
             </div>
        </div>
   </div>
   <!-- 按钮结束 -->
   <div class="auto_notice_content" style="height: 1px;background-color: #eaeceb;"></div>
   <!-- 底部开始 -->
   <%@include file="../staticPub/aotu_foot.jsp" %>
</body>
</html>