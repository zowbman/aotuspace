<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/ShoppingCo.js"></script>
</head>
<body style="width:100%; height:100%;background: url(../images/Shopping-Cart-bg.jpg) no-repeat;">
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
	                      <div class="step-no">1</div>
	                      <div class="step-name">购物车<br/>SHOPPING CART</div>
	                 </div>
	             </li>
	             <li>
	                 <div class="step-done">
	                      <div class="step-no">2</div>
	                      <div class="step-name">提交订单<br/>SUBMIT ORDERS</div>
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
	                      <div class="step-name">完成购买<br/>SUCCESS</div>
	                 </div>
	             </li>
	           </ol>
	      </div>
	</div>
	<!-- 支付步骤结束 -->
   <!-- 购物车商品信息开始 -->
   <div id="shopping-cart">
        <div class="auto_notice_content">
             <div class="s-c-table">
                  <table id="cartTable">
                        <thead>
                             <tr>
                                 <th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
                                 <th>商品信息</th>
                                 <th>单价（元）</th>
                                 <th>数量</th>
                                 <th>小计（元）</th>
                                 <th>操作</th>
                             </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${ spBuyCar.products}" var="item">
	                            <tr>
	                                <td class="checkbox">
	                                    <input class="check-one check" type="checkbox"/>
	                                </td>
	                                <td class="goods">
	                                    <a href="#" class="p-i-list-img">
	                                       <img src="/pic/${item.spTreasureTaskC.spAotuerpTreasureInfoCustom.treasurePrimaryImg.spImg }_100x100.jpg" alt=""/>
	                                    </a>
	                                    <div class="p-i-1-right">
	                                         <div class="p-i-1-right_a">
	                                              <span>代言主播 ${item.spTreasureTaskC.spAnchorBinfoCustom.spUsersBinfoCustom.spUsersDinfoCustom.spNickname }</span>
	                                         </div>
	                                         <div class="p-i-1-right_b">
	                                              <a href="#">
	                                                 ${item.spTreasureTaskC.spAotuerpTreasureInfoCustom.spTreasuretitle }
	                                              </a>
	                                         </div>
	                                         <div class="p-i-1-right_c">
	                                         	 <c:forEach items="${item.spTreasureTaskC.spAotuerpTreasureInfoCustom.spAotuerpTreasureProductSkuCustoms }" var="item1">
	                                              	<i>
		                                              	<c:forEach items="${item1.spProductBproCSkus }" var="item2">
		                                              		${item2.spProductPname.spPropertyname }：${item2.spProductPvalue.spPropertyvalue }
		                                              	</c:forEach>
	                                              	</i>
	                                             </c:forEach>
	                                             
	                                         </div>
	                                    </div>
	                                </td>
	                                <td class="price">
	                                	<c:forEach items="${item.spTreasureTaskC.spAotuerpTreasureInfoCustom.spAotuerpTreasureProductSkuCustoms }" var="item1">
	                                              	${item1.spSalesprice }
	                                    </c:forEach>
	                                </td>
	                                <td class="count">
	                                   <span class="reduce"></span>
	                                   <input class="count-input" type="text" value="${item.count }"/>
	                                   <span class="add">+</span>
	                                </td>
	                                <td class="subtotal"></td>
	                                <td class="operation">
	                                   <span class="delete">删除</span>
	                                   <input type="hidden" value="${item.spTreasureTaskC.spId }.<c:forEach items="${item.spTreasureTaskC.spAotuerpTreasureInfoCustom.spAotuerpTreasureProductSkuCustoms }" var="item1">${item1.spId }</c:forEach>"/>
	                                </td>
	                            </tr>
                            </c:forEach>
                        </tbody>
                  </table>
                  <div class="foot" id="foot">
                      <label class="fl select-all">
                            <input type="checkbox" class="check-all check"/>&nbsp;全选
                      </label>
                      <a class="fl delete" id="deleteAll" href="javascript:;">删除</a>
                      <!-- <div class="fr closing">结 算</div> -->
                      <div class="fr total">
                        合计：￥<span id="priceTotal">${spBuyCar.tolTalPrice }</span>
                      </div>
                      <div class="fr selected" id="selected">
                            已选商品<span id="selectedTotal">0</span>件<span class="arrow up">︽</span><span class="arrow down">︾</span>
                      </div>
                      <div class="selected-view">
                              <div id="selectedViewList" class="clearfix">
                                   <div>
                                       <img src="">
                                       <span>取消选择</span>
                                   </div>
                              </div>
                              <span class="arrow">◆<span>◆</span></span>
                      </div>
                  </div>
             </div>
            
        </div>
   </div>
   <!-- 购物车商品信息结束 -->
   <!-- 备注开始 -->
   <div id="remark-information">
        <div class="auto_notice_content">
             <div class="remark">
                  <p><span style="color:red;">注：</span>请在30分钟内提交订单，并在下单后30分钟内完成支付</p>
             </div>
        </div>
   </div>
   <!-- 备注结束 -->
   <!-- 按钮开始 -->
   <div id="s-c-button">
        <div class="auto_notice_content " style="margin-bottom:102px;">
             <!-- <div class="go-shopping">
                  <a href="index1.html" class="go-shopping-a">
                      <span></span>
                                                                            再逛逛
                  </a> 
             </div> -->
             <div class="settlement">
                 <a href="ShoppingCartSubmitOrders.jsp" class="settlement-a">
                                                                      去结算
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