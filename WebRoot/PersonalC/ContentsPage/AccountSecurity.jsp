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
  <!-- 个人中心开始 -->
  <div id="personal-c">
       <div class="auto_notice_content">
            <%@include file="../common/left_nav.jsp" %>
            <div class="fr p_right">
                 <div class="p_r_content">
                      <div class="crumbs">
                          <a href="../index.html">首页</a>&nbsp;
                          〉
                          <a href="">个人中心</a>&nbsp;
                          〉
                          &nbsp;<span>账号安全</span>
                      </div>
                      <div class="basic-content">
                           <div class="accont_info">
                                <h3>您的基本信息</h3>
                                <dl style="padding:16px;">
                                    <dt class="fl">登陆邮箱：</dt>
                                    <dd class="fl">511767977@qq.com</dd>
                                    <dd style="margin-left: 300px;">
                                      <a href="" style="color:red;">修改邮箱</a>
                                    </dd>
                                </dl>
                                <dl style="padding:16px;">
                                    <dt class="fl">手机号码：</dt>
                                    <dd class="fl">155332323232</dd>
                                    <dd style="margin-left: 300px;">
                                      <a href="" style="color:red;">修改手机</a>
                                      <a href="" style="margin-left:10px;color:red;">解绑手机</a>
                                    </dd>
                                </dl>
                           </div>
                           <div class="security_center">
                                <h3>您的安全信息</h3>
                                <dl>
                                    <dd style="margin-top: 1px;">
                                        <img src="../../images/icon/Personaldata_14.jpg">
                                    </dd>
                                    <dd style="width:50px;">手机号</dd>
                                    <dd>
                                        <a href="" style="color:red;">未设置</a>
                                    </dd>
                                    <dd style="width: 300px;margin-right: 40px;margin-left: 30px;color:#ccc;">您还没有绑定手机哦！</dd>
                                    <dd>
                                       <a href="" style="color:red;">立即绑定</a>
                                    </dd>
                                </dl>
                                <dl>
                                    <dd style="margin-top: 1px;">
                                        <img src="../../images/icon/Personaldata_14.jpg">
                                    </dd>
                                    <dd style="width:50px;">邮箱</dd>
                                    <dd>
                                       <a href="" style="color:red;">未设置</a>
                                    </dd>
                                    <dd style="width: 300px;margin-right: 40px;margin-left: 30px;color:#ccc;">您还没有绑定邮箱哦！</dd>
                                    <dd>
                                       <a href="" style="color:red;">立即绑定</a>
                                    </dd>
                                </dl>
                                <dl>
                                    <dd style="margin-top: 1px;">
                                        <img src="../../images/icon/Personaldata_14.jpg">
                                    </dd>
                                    <dd style="width:50px;">QQ</dd>
                                    <dd>
                                       <a href="" style="color:red;">未设置</a>
                                    </dd>
                                    <dd style="width: 300px;margin-right: 40px;margin-left: 30px;color:#ccc;">您还没有绑定QQ哦！</dd>
                                    <dd>
                                      <a href="" style="color:red;">立即绑定</a>
                                    </dd>
                                </dl>
                           </div>
                      </div>
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