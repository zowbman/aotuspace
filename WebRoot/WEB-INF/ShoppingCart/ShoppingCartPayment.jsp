<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body style="width:100%; height:100%;background: url(../images/ShoppingCartPayment.jpg) no-repeat;">
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
                         <div class="step-y-n">3</div>
                         <div class="step-name-l">付款<br/>PAYMENT</div>
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
   <!-- 付款开始 -->
   <div id="payment">
        <div class="auto_notice_content">
            <div class="payment-title">
                 <span>付款</span>
            </div>
            <div class="prompt">
                 <p>
                                                                     充值前请不要关闭此页面，完成充值后请根据您的情况点击下面的按钮
                 </p>
                 <div class="prompt-button">
                      <a href="ShoppingCartShoppingResult.jsp">付款已完成</a>
                      <a href="" class="prompt-button-problem">付款遇到问题</a>
                 </div>
            </div>
        </div>
   </div>
   <!-- 付款结束 -->
   <div class="auto_notice_content" style="height: 1px;background-color: #eaeceb;"></div>
   <!-- 底部开始 -->
   <%@include file="../../staticPub/aotu_foot.jsp" %>
</body>
</html>