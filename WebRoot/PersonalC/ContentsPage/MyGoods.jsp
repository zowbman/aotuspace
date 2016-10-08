<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
  <!-- 遮照层开始 -->
  <div id="goods_bg"></div>
  <!-- 遮照层结束 -->
  <!-- 顶部开始 -->
  <%@include file="../../staticPub/aotu_head.jsp" %>
  <%@include file="../../staticPub/aotu_nav.jsp" %>
  <!-- 个人中心开始 -->
   <div id="personal-c">
       <div class="auto_notice_content">
            <%@include file="../common/left_nav.jsp" %>
            <div class="fr p_right">
                 <div class="p_r_content">
                      <div class="crumbs">
                          <a href="">首页</a>&nbsp;
                          〉
                          <a href="">个人中心</a>&nbsp;
                          〉
                          &nbsp;<span>基本资料</span>
                      </div>
                      <div class="basic-content">
                           <div class="orders-filter">
                                <select class="select-small">
                                       <option>全部状态</option>
                                       <option>未付款</option>
                                       <option>已付款</option>
                                </select>
                                <div class="g_prompt">
                                     <span>提示：您有<a href="">未付款（1）</a></span>
                                </div>
                           </div>
                           <div class="goods_list">
                                <div class="g_l_top">
                                    <table class="goods_table">
                                          <tbody>
                                                <tr>
                                                    <th class="g_w">商品信息</th>
                                                    <th class="price_w">单价（元）</th>
                                                    <th class="number_w">数量</th>
                                                    <th class="subtotal_w">小计（元）</th>
                                                    <th class="state_w">交易状态</th>
                                                    <th class="operat_w">交易操作</th>
                                                </tr>
                                          </tbody>
                                    </table>
                                </div>
                                <!-- 订单信息开始 -->
                                <div style="height:29px;overflow:hidden;"></div>
                                <div class="g_l_Content">
                                     <table class="goods_table">
                                          <tbody>
                                                 <tr class="g_top">
                                                     <td colspan="6">
                                                          <div class="top_c">
                                                               <input type="checkbox" />
                                                               <span>2015-10-22</span>
                                                               <span>订单编号：</span>
                                                               <span>23232323232323</span>
                                                          </div>
                                                          <div class="garbage">
                                                              <a href="javascript:void(0);" class="g_del"></a> 
                                                          </div>
                                                     </td>
                                                 </tr>
                                                 <tr class="g_content">
                                                     <td class="g_w_content">
                                                        <div class="goods_info">
                                                             <a href="" class="fl">
                                                                  <img src="../../images/img/Personaldata_10.jpg">
                                                             </a>
                                                             <div class="goods_type">
                                                                 <div>
                                                                      <span>代言主播 童可可</span>
                                                                 </div>
                                                                 <div class="clothe_info">
                                                                      <a href="">
                                                                         <span style="color:#468fa2;">
                                                                          <nobr>JVR 2015韩版男装夏季新款青春男士短...
                                                                          </nobr>
                                                                          </span>
                                                                      </a>
                                                                 </div>
                                                                 <div>
                                                                      <span style="color:#aaa;">颜色：白色 尺码：S</span>
                                                                 </div>
                                                             </div>
                                                        </div>
                                                     </td>
                                                     <td class="price_w_c">￥100.00</td>
                                                     <td class="number_w_c">1</td>
                                                     <td class="subtotal_w_c">￥100.00</td>
                                                     <td class="state_w_c">
                                                         <a href="" style="margin-top:0px;">交易状态</a>
                                                         <a href="../../Details-Page/Order_details_page.jsp">订单详情</a>
                                                     </td>
                                                     <td class="operat_w_c">
                                                         <a href="javascript:void(0);" class="operat_w_c_e">追加评论</a>
                                                     </td>
                                                 </tr>
                                          </tbody>
                                     </table>
                                </div>
                                <!-- 订单信息结束 -->
                                  <!-- 订单信息开始 -->
                                <div style="height:29px;overflow:hidden;"></div>
                                <div class="g_l_Content">
                                     <table class="goods_table">
                                          <tbody>
                                                 <tr class="g_top">
                                                     <td colspan="6">
                                                          <div class="top_c">
                                                               <input type="checkbox" />
                                                               <span>2015-10-22</span>
                                                               <span>订单编号：</span>
                                                               <span>23232323232323</span>
                                                          </div>
                                                          <div class="garbage">
                                                              <a href=""></a> 
                                                          </div>
                                                     </td>
                                                 </tr>
                                                 <tr class="g_content">
                                                     <td class="g_w_content">
                                                        <div class="goods_info">
                                                             <a href="" class="fl">
                                                                  <img src="../../images/img/Personaldata_10.jpg">
                                                             </a>
                                                             <div class="goods_type">
                                                                 <div>
                                                                      <span>代言主播 童可可</span>
                                                                 </div>
                                                                 <div class="clothe_info">
                                                                      <a href="">
                                                                         <span style="color:#468fa2;">
                                                                          <nobr>
                                                                               JVR 2015韩版男装夏季新款青春男士短...
                                                                          </nobr>
                                                                          </span>
                                                                      </a>
                                                                 </div>
                                                                 <div>
                                                                      <span style="color:#aaa;">颜色：白色 尺码：S</span>
                                                                 </div>
                                                             </div>
                                                        </div>
                                                     </td>
                                                     <td class="price_w_c">￥100.00</td>
                                                     <td class="number_w_c">1</td>
                                                     <td class="subtotal_w_c">￥100.00</td>
                                                     <td class="state_w_c">
                                                         <a href="" style="margin-top:0px;">交易状态</a>
                                                         <a href="">订单详情</a>
                                                     </td>
                                                     <td class="operat_w_c" style="display:none;">
                                                         <a href="javascript:void(0);" class="operat_w_c_e">追加评论</a>
                                                     </td>
                                                     <td class="operat_w_c">
                                                         <a href="../../ShoppingCart/ShoppingCartSubmitOrders.jsp" class="unpaid">未付款</a>
                                                    </td>
                                                 </tr>
                                          </tbody>
                                     </table>
                                </div>
                                <!-- 订单信息结束 -->
                                <!-- 订单信息开始 -->
                                <div style="height:29px;overflow:hidden;"></div>
                                <div class="g_l_Content">
                                     <table class="goods_table">
                                          <tbody>
                                                 <tr class="g_top">
                                                     <td colspan="6">
                                                          <div class="top_c">
                                                               <input type="checkbox" />
                                                               <span>2015-10-22</span>
                                                               <span>订单编号：</span>
                                                               <span>23232323232323</span>
                                                          </div>
                                                          <div class="garbage">
                                                              <a href=""></a> 
                                                          </div>
                                                     </td>
                                                 </tr>
                                                 <tr class="g_content">
                                                     <td class="g_w_content">
                                                        <div class="goods_info">
                                                             <a href="" class="fl">
                                                                  <img src="../../images/img/Personaldata_10.jpg">
                                                             </a>
                                                             <div class="goods_type">
                                                                 <div>
                                                                      <span>代言主播 童可可</span>
                                                                 </div>
                                                                 <div class="clothe_info">
                                                                      <a href="">
                                                                         <span style="color:#468fa2;">
                                                                          <nobr>JVR 2015韩版男装夏季新款青春男士短...
                                                                          </nobr>
                                                                          </span>
                                                                      </a>
                                                                 </div>
                                                                 <div>
                                                                      <span style="color:#aaa;">颜色：白色 尺码：S</span>
                                                                 </div>
                                                             </div>
                                                        </div>
                                                     </td>
                                                     <td class="price_w_c">￥100.00</td>
                                                     <td class="number_w_c">1</td>
                                                     <td class="subtotal_w_c">￥100.00</td>
                                                     <td class="state_w_c">
                                                         <a href="" style="margin-top:0px;">交易状态</a>
                                                         <a href="">订单详情</a>
                                                     </td>
                                                     <td class="operat_w_c">
                                                          <a href="javascript:void(0);" class="operat_w_c_e">追加评论</a>
                                                     </td>
                                                 </tr>
                                          </tbody>
                                     </table>
                                </div>
                                <!-- 订单信息结束 -->
                                  <!-- 订单信息开始 -->
                                <div style="height:29px;overflow:hidden;"></div>
                                <div class="g_l_Content">
                                     <table class="goods_table">
                                          <tbody>
                                                 <tr class="g_top">
                                                     <td colspan="6">
                                                          <div class="top_c">
                                                               <input type="checkbox" />
                                                               <span>2015-10-22</span>
                                                               <span>订单编号：</span>
                                                               <span>23232323232323</span>
                                                          </div>
                                                          <div class="garbage">
                                                              <a href=""></a> 
                                                          </div>
                                                     </td>
                                                 </tr>
                                                 <tr class="g_content">
                                                     <td class="g_w_content">
                                                        <div class="goods_info">
                                                             <a href="" class="fl">
                                                                  <img src="../../images/img/Personaldata_10.jpg">
                                                             </a>
                                                             <div class="goods_type">
                                                                 <div>
                                                                      <span>代言主播 童可可</span>
                                                                 </div>
                                                                 <div class="clothe_info">
                                                                      <a href="">
                                                                         <span style="color:#468fa2;">
                                                                          <nobr>JVR 2015韩版男装夏季新款青春男士短...
                                                                          </nobr>
                                                                          </span>
                                                                      </a>
                                                                 </div>
                                                                 <div>
                                                                      <span style="color:#aaa;">颜色：白色 尺码：S</span>
                                                                 </div>
                                                             </div>
                                                        </div>
                                                     </td>
                                                     <td class="price_w_c">￥100.00</td>
                                                     <td class="number_w_c">1</td>
                                                     <td class="subtotal_w_c">￥100.00</td>
                                                     <td class="state_w_c">
                                                         <a href="" style="margin-top:0px;">交易状态</a>
                                                         <a href="">订单详情</a>
                                                     </td>
                                                     <td class="operat_w_c">
                                                          <a href="javascript:void(0);" class="operat_w_c_e">追加评论</a>
                                                     </td>
                                                 </tr>
                                          </tbody>
                                     </table>
                                </div>
                                <!-- 订单信息结束 -->
                                <!-- 订单-分页符开始 -->
                                 <div id="pagingbox">
                                      <div class="all-paging">
                                           <div class="page-number">
                                                <ul class="items">
                                                    <li class="item pre-age">
                                                        <a class="num" href=""><&nbsp;上一页</a>
                                                    </li>
                                                    <li class="item active"><a class="num one" href="" class="num">1</a></li>
                                                    <li class="item"><a class="num" href="">2</a></li>
                                                    <li class="item"><a class="num" href="">3</a></li>
                                                    <li class="item"><a class="num" href="">4</a></li>
                                                    <li class="item"><a class="num" href="">5</a></li>
                                                    <li class="item"><a class="num" href="">6</a></li>
                                                    <li class="item dot">...</li>
                                                    <li class="item"><a class="num" href="">100</a></li>
                                                    <li class="item next-page"><a class="num" href="">下一页&nbsp;></a></li>
                                                </ul>
                                           </div>
                                      </div>
                                 </div>
                                 <!-- 订单-分页符结束 -->
                           </div>
                      </div>
                 </div>
            </div>
            <!-- 评论开始 -->
            <div class="comment" style="display:none;">
                 <div class="commentbox">
                      <div class="c_close_img">
                           <a class="c_close" href="javascript:void(0);">关闭</a>
                      </div>
                      <div class="c_main">
                           <div class="commodity_box fl">
                                <div class="c_img">
                                     <a href=""><img src="../../images/allOrder1_03.jpg"></a>
                                </div>
                                <div class="c_tile1">
                                     <a href="">                                               
                                           2015秋冬季新款纯棉男士干地方梵蒂冈地方T恤薄款修身V领长袖t恤打底衫男式t恤印 
                                     </a>
                                </div>
                                <div class="c_tile2">
                                     <span>颜色分类：粉红色，尺码：L码</span>
                                </div>
                           </div>
                           <div class="comment_sd fl">
                                <div class="sd-box">
                                     <span class="fl">满意度：</span>
                                     <div class="c_stars fl">
                                          <ul>
                                              <li class="a">
                                                  <input type="radio" name="evaluation" class="fl"/>
                                                  <img class="c_happy fl" src="../../images/icon/e_photo_11.png">
                                              </li>
                                              <li>
                                                  <input type="radio" name="evaluation" class="fl"/>
                                                  <img class="c_general fl" src="../../images/icon/e_photo_03.png">
                                              </li>
                                              <li>
                                                  <input type="radio" name="evaluation" class="fl"/>
                                                  <img class="c_melancholy fl" src="../../images/icon/e_photo_06.png">
                                              </li>
                                          </ul>
                                     </div>
                                </div>
                                <div class="review">
                                     <span class="fl">评价：</span>
                                     <textarea name="evaluation" class="text fl" placeholder="亲，请输入你评价！！" maxlength="250"></textarea>
                                </div>
                                <div class="c_button">
                                    <button type="submit" title="发表评论">发表评论</button>
                                </div>
                           </div>
                      </div>
                 </div>
                 <div class="comment_bg"></div>
            </div>
            <!-- 评论结束 -->
       </div>
   </div>
   <!-- 个人中心结束 -->
   <div class="auto_notice_content" style="height: 1px;background-color: #eaeceb;"></div>
   <!-- 底部开始 -->
   <%@include file="../../staticPub/aotu_foot.jsp" %>
</body>
</html>