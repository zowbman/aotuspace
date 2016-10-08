<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
   <!-- 顶部开始 -->
   <%@include file="../../staticPub/aotu_head.jsp" %>
   <%@include file="../../staticPub/aotu_nav.jsp" %>
   <!-- 订单详细页开始 -->
   <!-- 面包屑开始 -->
   <div id="crumbs">
        <div class="auto_notice_content">
             <ul class="crumbs_info">
                 <li><i></i></li>
                 <li><a href="../index.jsp">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;〉</li>
                 <li><a href="../PersonalC/ContentsPage/MyGoods.jsp">我的订单</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;〉</li>
                 <li>订单详情</li>        
             </ul>
        </div>
   </div>
   <!-- 面包屑结束 -->
   <div id="order_details">
        <div class="auto_notice_content">
             <div class="o_d_box">
                  <div class="o_d_content">
                       <div class="o_d_top">
                            <span class="o_d_name fl">订单详情</span>
                            <a href="../PersonalC/PersonalC-Mycollection.html" class="return_my_order fr">返回我的订单</a>
                       </div>
                       <div class="tradingTips">
                            <div class="orderStatus">
                                 <img src="../images/icon/order02_03.jpg">
                                 <h3>订单状态：交易关闭</h3>
                            </div>
                            <div class="prompt">
                                 <dl>
                                     <dt>嗷兔网提醒您</dt>
                                     <dd>1、交易已成功，如果你还未收到货物，或者收到的货物无法正常使用，请及时联系卖家协商处理。</dd>
                                     <dd class="prompt_2">2、如果卖家没有解决你的上述问题，你可以在交易成功后的15天内发起售后维权。</dd>
                                 </dl>
                            </div>
                       </div>
                       <div class="order_info">
                            <div class="o_i_top"> 
                                 <span>订单信息</span>
                            </div>
                            <div class="seller_info">
                                 <dl>
                                     <dt>卖家:</dt>
                                     <dd>广州++++++公司</dd>
                                     <dt>联系方式:</dt>
                                     <dd>15211321122222</dd>
                                 </dl>
                            </div>
                            <div class="order_timeinfo">
                                <span>订单信息</span>
                                <dl>
                                     <dt>订单编号：</dt>
                                     <dd>45645454545454544</dd>
                                     <dt>支付宝交易号：</dt>
                                     <dd>121113213131121231</dd>
                                </dl>
                                <dl>
                                     <dt>成交时间：</dt>
                                     <dd>2015-10-10  22：21：12</dd>
                                     <dt>付款时间：</dt>
                                     <dd>2015-10-10  22：21：12</dd>
                                     <dt>确认时间：</dt>
                                     <dd>2015-10-10  22：21：12</dd>
                                </dl>
                            </div>
                            <div class="commodity_info">
                                 <table>
                                        <tbody>
                                               <tr class="order_top">
                                                   <th class="o_commodity">商品信息</th>
                                                   <th class="o_price">单价（元）</th>
                                                   <th class="o_number">数量</th>
                                                   <th class="o_subtotal">运费</th>
                                                   <th class="o_operation">商品总价</th>
                                               </tr>
                                               <tr class="order_content" style="border-bottom:1px solid #eee;">
                                                   <td class="o_commodity commodity_1">
                                                       <div class="o_c_allInfo">
                                                            <a href="../Details-Page/Representdetail.html" class="o_c_img">
                                                                <img src="../images/img/order_03.jpg">
                                                            </a>
                                                            <div class="o_c_Info">
                                                                 <div class="">
                                                                      <span>代言主播 童可可</span>
                                                                 </div>
                                                                 <div class="">
                                                                      <a href="../Details-Page/Representdetail.html">
                                                                         <span style="color:#468fa2;">JVR 2015韩版男装夏季新款青春男士短...</span>
                                                                      </a>
                                                                 </div>
                                                                 <div class="">
                                                                      <span style="color:#aaa;">颜色：白色 尺码：S</span>
                                                                 </div>
                                                            </div>
                                                       </div>
                                                   </td>
                                                   <td class="o_price">
                                                       <span>￥100.00</span> 
                                                   </td>
                                                   <td class="o_number">
                                                       <span>1000</span>
                                                   </td>
                                                   <td class="o_subtotal">
                                                       <span>15.00</span>
                                                   </td>
                                                   <td class="o_operation" style="border-right:0px;">
                                                       <span>￥100.00</span>
                                                   </td>
                                               </tr>
                                               <tr class="order_content" style="border-bottom:1px solid #eee;">
                                                   <td class="o_commodity commodity_1">
                                                       <div class="o_c_allInfo">
                                                            <a href="" class="o_c_img">
                                                                <img src="../images/img/order_03.jpg">
                                                            </a>
                                                            <div class="o_c_Info">
                                                                 <div class="">
                                                                      <span>代言主播 童可可</span>
                                                                 </div>
                                                                 <div class="">
                                                                      <a href="">
                                                                         <span style="color:#468fa2;">JVR 2015韩版男装夏季新款青春男士短...</span>
                                                                      </a>
                                                                 </div>
                                                                 <div class="">
                                                                      <span style="color:#aaa;">颜色：白色 尺码：S</span>
                                                                 </div>
                                                            </div>
                                                       </div>
                                                   </td>
                                                   <td class="o_price">
                                                       <span>￥100.00</span> 
                                                   </td>
                                                   <td class="o_number">
                                                       <span>1000</span>
                                                   </td>
                                                   <td class="o_subtotal">
                                                       <span>15.00</span>
                                                   </td>
                                                   <td class="o_operation" style="border-right:0px;">
                                                       <span>￥100.00</span>
                                                   </td>
                                               </tr>
                                               <tr class="order_Info_bottom">
                                                   <td colspan="5" style="border-top:1px solid #eee;border-bottom:1px solid #eee;">
                                                       <span>实付款：<b>￥100.00</b>元</span>
                                                   </td>
                                               </tr> 
                                        </tbody>      
                                 </table>
                            </div>
                            <div class="logistics_info">
                                <h3>物流信息</h3>
                                <dl>
                                    <dt>收货地址：</dt>
                                    <dd>广州市天河区黄埔大道中315号羊城晚报创意产业园内自   编号1-18</dd>
                                </dl>
                                <dl>
                                    <dt>收货人：</dt>
                                    <dd>周会计</dd>
                                </dl>
                                <dl>
                                    <dt>联系方式：</dt>
                                    <dd>121222121512</dd>
                                </dl>
                                <dl>
                                    <dt>邮编：</dt>
                                    <dd>510000</dd>
                                </dl>
                                <dl>
                                    <dt>运送方式：</dt>
                                    <dd>快递</dd>
                                </dl>
                                <dl>
                                    <dt>运送公司：</dt>
                                    <dd>中通快递</dd>
                                </dl>
                                <dl>
                                    <dt>运单号：</dt>
                                    <dd>454654654564564564</dd>
                                </dl>
                                <dl>
                                    <dt>买家留言：</dt>
                                    <dd></dd>
                                </dl>
                            </div>
                       </div>
                  </div>
             </div>
        </div>
   </div>
   <!-- 订单详细页结束 -->
   <!-- 底部开始 -->
   <%@include file="../../staticPub/aotu_foot.jsp" %>
</body>
</html>