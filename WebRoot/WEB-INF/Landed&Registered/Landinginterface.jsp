<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../staticPub/common/verification_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
	<!-- logo-开始 -->
	<div id="at_ls" style="margin-top:180px;">
		<div class="at_ls_frame at_ls_top">
			<div class="at_logo">
				<a href="../index.jsp"></a>
			</div>
		</div>
	</div>
	<!-- logo-结束 -->
	<!-- 登陆框开始 -->
	<div id="land">
		<div class="auto_notice_content">
			<div class="landbox">
				<form id="thisForm" class="land_top regi_form" method="post">
					<ul>
						<!-- <li>请登录</li> -->
						<li class="regi_form">
						    <input class="stext rg-input ipt-phone fl" type='text' name="userName" id="userName" value="" placeholder="填写账号">
							<div class="tipinfo"></div>
						</li>
						<li class="regi_form">
						    <input type="password" class="stext rg-input ipt-phone fl" name="passWord" id="passWord" value="" placeholder="密码" />
							<div class="tipinfo"></div>
						</li>
						<!-- <li>
                               <div class="v_c_box"> 
                                    <input tpye="text" class="ver_code" value="验证码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '验证码';}"/>
                                    <img class="vc_img" src="images/vc_03.jpg">
                                    <a href="" class="vc_change_one">换一张</a>
                               </div>
                           </li> -->
					</ul>
					<div class="land_sub">
						<button type="button" onclick="login()" value="登陆" class="at_submit regi_form">登陆</button>
					</div>
				</form>
				<div class="land_center">
					<div class="land_c_l fl">
						<input type="checkbox" class="l_remember" /> <span>记住用户名</span>
					</div>
					<div class="land_c_r fr">
						<a href="${pageContext.request.contextPath }/u/findPW">忘记密码?</a>&nbsp;&nbsp;|&nbsp;&nbsp;
						<a href="Registered.jsp" class="free_regi">免费注册</a>
					</div>
				</div>
				<!-- <div class="ThirdParty-login">
                     <p>第三方账号登陆：</p>
                     <ul class="auto-nav-container">
                         <li class="auto-nav-selected">
                             <a href="">
                                <s class="auto-nav-icon" style="color:#b8d3ef;">&#xe606;</s>
                             </a>
                         </li>
                         <li class="auto-nav-selected">
                             <a href="">
                                <s class="auto-nav-icon" style="color:#f9c49c;">&#xe63c;</s>
                             </a>
                         </li>
                         <li class="auto-nav-selected">
                             <a href="">
                                <s class="auto-nav-icon" style="color:#fdb0af;">&#xe748;</s>
                             </a>
                         </li>
                         <li class="auto-nav-selected">
                            <a href="">
                                <s class="auto-nav-icon" style="color:#8cdd90;">&#xe627;</s>
                             </a>
                         </li>
                     </ul>
                 </div> -->
			</div>
		</div>
	</div>
	<!-- 登陆框结束 -->
	<!-- 底部开始 -->
	<div id="footer" style="margin-top:190px;">
		<div class="footercontent">
			<div class="footer_edition" style="text-align:center;">
				<span>COPYRIGHT &copy; 2015 aotuspace.com , ALL RIGHT
					RESERVED <a href="">版权所有</a> 嗷兔网络</span>
			</div>
		</div>
	</div>
	<!-- 底部结束 -->
</body>
</html>