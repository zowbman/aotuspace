<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../../staticPub/common/verification_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
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
                          &nbsp;<span>收货地址</span>
                      </div>
                      <div class="main_info">
                            <span class="keep">已保存了7条地址，还能保存13条地址</span>
                            <!-- 收货信息开始 -->
                            <div class="tbl-deliver-address">
                                <table  cellspacing="0" class="tbl-main">
                                       <tbody>
                                            <tr class="thead-tbl-grade">
                                                <td class="td_ipt">
                                                    <input class="adr_radio" type="radio" checked="checked" name="address" value="">
                                                </td>
                                                <td class="td_name">张伟宝</td>
                                                <td class="td_address"> 
                                                                                                                                                                                      广东省佛山市禅城区祖庙街道西平里18号528000,13632435479
                                                </td>
                                                <td class="td_md"><a href="">[修改]</a></td>
                                                <td class="td_md"><a href="">[删除]</a></td>
                                            </tr>
                                            <tr>
                                                <td class="td_ipt">
                                                    <input class="adr_radio" type="radio" name="address" value="">
                                                </td>
                                                <td class="td_name">张伟宝</td>
                                                <td class="td_address">
                                                                                                                                                                                        广东省佛山市禅城区祖庙街道西平里18号528000,13632435479
                                                </td>
                                                <td class="td_md"><a href="">[修改]</a></td>
                                                <td class="td_md"><a href="">[删除]</a></td>
                                            </tr>
                                            <tr>
                                                <td class="td_ipt">
                                                    <input class="adr_radio" type="radio" name="address" value="">
                                                </td>
                                                <td class="td_name">张伟宝</td>
                                                <td class="td_address">
                                                                                                                                                                                      广东省佛山市禅城区祖庙街道西平里18号528000,13632435479
                                                </td>
                                                <td class="td_md"><a href="">[修改]</a></td>
                                                <td class="td_md"><a href="">[删除]</a></td>
                                            </tr>
                                            <tr>
                                                <td class="td_ipt">
                                                    <input class="adr_radio" type="radio" name="address" value="">
                                                </td>
                                                <td class="td_name">张伟宝</td>
                                                <td class="td_address">
                                                                                                                                                                                      广东省佛山市禅城区祖庙街道西平里18号528000,13632435479
                                                </td>
                                                <td class="td_md"><a href="">[修改]</a></td>
                                                <td class="td_md"><a href="">[删除]</a></td>
                                            </tr>
                                       </tbody>
                                </table>
                                <div class="new_address">
                                    <span class="td_ipt fl">
                                        <input id="c" class="new_radio" type="radio" name="address" value="">
                                    </span>
                                    <span class="td_name fl">使用新地址</span>
                                </div>
                            </div>
                      </div>
                      <!-- 收货信息结束 -->
                      <!-- 填写收货地址信息开始 -->
                      <div class="form-box" style="display:none;">
                           <form class="formDeliver" id="thisForm" method="post" action="">
                                 <h3 style="margin-bottom:20px;border-top: 1px solid #e1e1e1;padding-top: 28px;">        收货人信息：
                                 </h3>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">收货人姓名&nbsp;<i class="impot_icon">*</i></span>
                                      <input type="text" name="consName" id="consName" value=""/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="consignee">
                                      <span class="c_name fl">收货地址&nbsp;<i class="impot_icon">*</i></span>
                                      <div class="c_ipt fl">
                                           <div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">省/直辖市</div>
                                                <i class="down"></i>
                                           </div>
                                      </div>
                                       <div class="c_ipt fl">
                                           <div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">市</div>
                                                <i class="down"></i>
                                           </div>
                                       </div>
                                       <div class="c_ipt fl">
                                           <div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">区/县</div>
                                                <i class="down"></i>
                                           </div>
                                       </div>
                                       <div class="c_ipt ">
                                           <div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">乡道/街道</div>
                                                <i class="down"></i>
                                           </div>
                                       </div>
                                       <div class="msg-box">
                                           <i class=" msg_icon"></i>
                                           <div>请补充乡镇街道地址信息</div>
                                       </div>
                                       <div class="address-info">
                                            <input type="text" placeholder="收货地址信息" />
                                       </div>
                                 </div>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">手机号码&nbsp;<i class="impot_icon">*</i></span>
                                      <input type="text" name="phone" id="phone" value=""/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">固定电话&nbsp;<i class="impot_icon">*</i></span>
                                      <input type="text" name="Tel" id="Tel" value=""/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">邮政编码&nbsp;<i class="impot_icon">*</i></span>
                                      <input type="text" name="post" id="post" value=""/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="save-address">
                                      <button name="Submit" type="submit" class="s_a_button">保存地址</button>
                                 </div>
                           </form>
                      </div>
                      <!-- 填写收货地址信息结束 -->
                 </div>
            </div>
       </div>
  </div>
   <!-- 个人中心结束 -->
   <div class="auto_notice_content" style="height: 1px;background-color: #eaeceb;"></div>
   <!-- 底部开始 -->
   <%@include file="../../staticPub/aotu_foot.jsp" %>
</body>
</html>