<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../staticPub/common/verification_style.jspf" %>
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
	<!-- 注册框开始 -->
	<div id="regi">
		<div class="auto_notice_content">
			<div class="regibox">
				<div class="regitop">
					<span class="fl">欢迎注册</span> <span class="fr login"> 已有账号 <a
						href="Landinginterface.jsp">直接登录</a> </span>
				</div>
				<form id="thisForm" class="regi_form" method="post" action="">
					<div class="r_account">
						<input class="stext rg-input ipt-phone fl" type='text'
							name="userName" id="userName" value="" placeholder="填写账号">
						<div class="tipinfo"></div>
					</div>
					<!-- <div class="regi_sex">
                            <span class="fl">性别：</span>
                            <input class="fl sex_man" type="radio" name="sex" value="" /> 
                            <span class="fl" style="margin-right:20px;margin-top: 1px;">男</span>
                            <input class="fl sex_girl" type="radio" name="sex" value="" /> 
                            <span class="fl" style="margin-top: 1px;">女</span>
                       </div> -->
					<div class="r_pasw regi_form">
						<div class="r_pasw1">
							<input type="password" class="stext rg-input ipt-phone fl"
								name="passWord" id="passWord" value="" placeholder="密码"
								onKeyUp="CheckIntensity(this.value)" />
							<div class="tipinfo"></div>
							<div class="pure-control-group">
								<div class="strength-indicator">
									<span id="pwd_Weak" class="pwd pwd_c">&nbsp;</span> <span
										id="pwd_Medium" class="pwd pwd_c pwd_f">&nbsp;</span> <span
										id="pwd_Strong" class="pwd pwd_c pwd_c_r">&nbsp;</span> <span
										id="pwd" class="pwd indicator-text"></span>
								</div>
							</div>
						</div>
						<div class="r_pasw2 regi_form">
							<input type="password" class="stext rg-input ipt-phone fl"
								name="passWordAgain" id="passWordAgain" value=""
								placeholder="再次确认密码">
							<div class="tipinfo"></div>
						</div>
					</div>
					<!--  <div class="verification">
                            <input id="captcha" type="text" class="rg-input verification-code regi_form"  placeholder="验证码">
                            <a href="" class="rg-input regi_form free_code">
                               <span>免费获取验证码</span>
                            </a>
                       </div> -->
					<button name="Submit" type="submit"
						class="immediate_regi regi_form">立即注册</button>
				</form>
				<div class="clause regi_form">
					<input type="checkbox" checked="checked" class="clause_ipt fl" /> 
					<span class="read_clause fl"> 我已阅读并接受 
					      <a href="../clause/clause.jsp" target="_blank" class="server_clause">凹凸网服务条款</a> 
					</span>
				</div>
			</div>
		</div>
	</div>
	<!-- 注册框结束 -->
	<!-- 底部开始 -->
    <%@include file="../staticPub/aotu_foot.jsp" %>
</body>
</html>