<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body style="width:100%; height:100%;background: url(../images/ShoppingCartShoppingResult1.jpg) no-repeat;">
   <!-- 顶部开始 -->
   <%@include file="../../staticPub/aotu_head.jsp" %>
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
                         <div class="step-yes"></div>
                         <div class="step-name">提交订单<br/>SUBMIT ORDERS</div>
                    </div>
                </li>
                <li class="step-all">
                    <div class="step-done">
                         <div class="step-yes"></div>
                         <div class="step-name">付款<br/>PAYMENT</div>
                    </div>
                </li>
                <li class="step-all">
                    <div class="step-done">
                         <div class="step-yes"></div>
                         <div class="step-name">购买结果<br/>RESULT</div>
                    </div>
                </li>
              </ol>
         </div>
   </div>
   <!-- 支付步骤结束 -->
   <!--ShoppingCartShoppingResult开始 -->
   <div id="shoppingResult">
         <div class="auto_notice_content">
              <div class="shoppingResultBox">
                  <p><span class="sr-name">支付成功</span>我们会尽快为您发货</p>
                  <p class="OrderNumber">订单号：123123123123123 您的订单已经在处理中...</p>
                  <div class="sr-button">
                      <a href="../Details-Page/Order_details_page.jsp" class="ViewOrderDetails">查看订单详情</a>
                      <a href="../index.jsp" class="ContinueShopping">继续购物</a>
                  </div>
              </div>
         </div>
   </div>
   <div id="recommendCommodity">
        <div class="auto_notice_content rc-box">
             <div class="related-items">
                  <span class="rc_title">
                                                                                    推荐商品
                  </span>
                  <span class="page_num">
                                                                                  第1页，共4页
                  </span>
             </div>
             <div class="viewed-items-slide">
                  <ul>
                      <li>
                        <div class="item-list">
                             <div class="item-img">
                                  <a href="">
                                    <img src="../images/ShoppingCartShoppingResult1_03.jpg">
                                  </a>
                             </div>
                             <div class="item-inf">
                                  <a href="">
                                                                                                                                   秋季男装中国风长袖T恤个性圆领霸气纹身潮男士纯棉修身
                                  </a> 
                             </div>
                        </div>
                      </li>
                      <li>
                        <div class="item-list">
                             <div class="item-img">
                                  <a href="">
                                    <img src="../images/ShoppingCartShoppingResult1_03.jpg">
                                  </a>
                             </div>
                             <div class="item-inf">
                                  <a href="">
                                                                                                                                  秋季男装中国风长袖T恤个性圆领霸气纹身潮男士纯棉修身
                                  </a> 
                             </div>
                        </div>
                      </li>
                      <li>
                        <div class="item-list">
                             <div class="item-img">
                                  <a href="">
                                    <img src="../images/ShoppingCartShoppingResult1_03.jpg">
                                  </a>
                             </div>
                             <div class="item-inf">
                                  <a href="">
                                                                                                                                  秋季男装中国风长袖T恤个性圆领霸气纹身潮男士纯棉修身
                                  </a> 
                             </div>
                        </div>
                      </li>
                      <li>
                        <div class="item-list">
                             <div class="item-img">
                                  <a href="">
                                    <img src="../images/ShoppingCartShoppingResult1_03.jpg">
                                  </a>
                             </div>
                             <div class="item-inf">
                                  <a href="">
                                                                                                                                  秋季男装中国风长袖T恤个性圆领霸气纹身潮男士纯棉修身
                                  </a> 
                             </div>
                        </div>
                      </li>
                      <li>
                        <div class="item-list">
                             <div class="item-img">
                                  <a href="">
                                    <img src="../images/ShoppingCartShoppingResult1_03.jpg">
                                  </a>
                             </div>
                             <div class="item-inf">
                                  <a href="">
                                                                                                                                   秋季男装中国风长袖T恤个性圆领霸气纹身潮男士纯棉修身
                                  </a> 
                             </div>
                        </div>
                      </li>
                  </ul>
             </div>
             <div class="screen">
                  <div class="prev"></div>
                  <div class="next"></div>
             </div>
        </div>
   </div>
   <!--ShoppingCartShoppingResult结束-->
   <div class="auto_notice_content" style="height: 1px;background-color: #eaeceb;"></div>
   <!-- 底部开始 -->
   <%@include file="../../staticPub/aotu_foot.jsp" %>
</body>
</html>