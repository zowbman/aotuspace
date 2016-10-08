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
                          <a href="">首页</a>&nbsp;
                          〉
                          <a href="">个人中心</a>&nbsp;
                          〉
                          &nbsp;<span>基本资料</span>
                      </div>
                      <div class="basic-content">
                           <div class="b_name">
                                <img class="b_name_img" src="../../images/img/Personaldata_10.png">
                                <span class="b_n">hi ,vivian</span>
                                <span>上次登录时间：2013-14-12</span>
                           </div>
                           <div class="b_a_info">
                                <h3>账号信息</h3>
                                <dl class="infoItem">
                                    <dt>账号：</dt>
                                    <dd>446546544655455</dd>
                                </dl>
                                <dl class="infoItem">
                                    <dt>注册时间：</dt>
                                    <dd>2013-14-12</dd>
                                </dl>
                                <dl class="infoItem">
                                    <dt>绑定邮箱：</dt>
                                    <dd>53454545@qq.com</dd>
                                </dl>
                                <dl class="infoItem">
                                    <dt>账号：</dt>
                                    <dd>446546544655455</dd>
                                </dl>
                           </div>
                           <div class="b_p_data">
                                <h3>个人资料</h3>
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