<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
  <!-- logo-开始 -->
  <div id="at_ls">
       <div class="at_ls_frame at_ls_top">
            <div class="at_logo">
                 <a href="../index.jsp"></a>
            </div>
       </div>
  </div>
   <!-- logo-结束 -->
   <!-- 找回密码开始 -->
   <div id="retrieve_password">
        <div class="auto_notice_content">
             <div class="rp_box">
                  <h1>找回登录密码</h1>
                  <div class="rp_list_box">
                       <div class="rp_list">
                            <div class="rp_line"></div>
                            <ul>
                                <li>
                                    <div class="rp_list_all">
                                         <div class="rp_list_img_v"></div>
                                         <div class="rp_list_grey">填写账号信息</div>
                                    </div>
                                </li>
                                <li>
                                    <div class="rp_list_all">
                                         <div class="rp_list_img"></div>
                                         <div class="">验证身份</div>
                                    </div>
                                </li>
                                <li>
                                    <div class="rp_list_all">
                                         <div class="rp_list_img_grey">3</div>
                                         <div class="rp_list_grey">重置密码</div>
                                    </div>
                                </li>
                                <li class="success">
                                    <div class="rp_list_all">
                                         <div class="rp_list_img_grey">4</div>
                                         <div class="rp_list_grey">修改成功</div>
                                    </div>
                                </li>
                            </ul>
                       </div>
                       <!-- 表单填写开始 -->
                       <div class="rp_form">
                            <form>
                                  <span>凹凸空间已向您的手机<i>&nbsp;15******5312&nbsp;</i>发送验证码短信，请注意查收</span>
                                  <div class="nc_scale_b">
                                      <input type="text" placeholder="验证码" class="rp_verify"/>
                                      <a href="" class="re-acquisi">重新获取</a>
                                  </div>
                                  <span style="text-align: left;"><i>28秒</i>后将重新发送！</span>
                            </form>
                            <a href="Retrievepassword-rp.jsp" class="next-step">下一步</a>
                       </div>
                       <!-- 表单填写结束 -->
                  </div>
             </div> 
        </div> 
   </div>
   <!-- 找回密码结束 -->
   <!-- 底部开始 -->
   <div id="footer" style="margin-top:190px;">
        <div class="footercontent">
             <div class="footer_edition" style="text-align:center;">
                  <span>COPYRIGHT &copy; 2015 aotuspace.com , ALL RIGHT RESERVED <a href="">版权所有</a> 凹凸空间</span>
             </div>
        </div>
   </div>
   <!-- 底部结束 -->
</body>
</html>