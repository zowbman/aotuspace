<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
   <!-- 顶部开始 -->
   <%@include file="../staticPub/aotu_head.jsp" %>
   <%@include file="../staticPub/aotu_nav.jsp" %>
   <!-- 我要代言开始 -->
   <!-- 面包屑开始 -->
   <div id="crumbs">
        <div class="auto_notice_content">
             <ul class="crumbs_info">
                 <li><i></i></li>
                 <li><a href="../index.html">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;〉</li>
                 <li>代言申请</li>        
             </ul>
        </div>
   </div>
   <!-- 面包屑结束 -->
   <!-- 代言填写表格开始 -->
   <div id="endorsement_appli">
        <div id="tabs2" class="auto_notice_content endorsement_main">
             <div class="endorsement_left">
             
                  <ul>
                      <li class="en_title"><h3>代言申请</h3></li>
                      <li><a href="javascript:void(0)" onclick="appForm(1,this)" class="e_nav_bg">主播代言申请</a></li>
                      <li><a href="javascript:void(0)" onclick="appForm(2,this)" >当红艺人申请</a></li>
                      <li><a href="javascript:void(0)" onclick="appForm(3,this)" >供应商申请</a></li>
                  </ul>
                  
             </div>
             <div class="endorsement_right">
                               
                  <div id="other_anchor" class="endorsement_right_main" style="display:none;">
                       
                  </div>
                  
                  <div id="supplier_applica" class="endorsement_right_main" style="display:none;">
                       
                  </div>
                  
             </div>
        </div>
   </div>
   <!-- 代言填写表格结束 -->
   <!-- 我要代言结束 -->
   <!-- 底部开始 -->
   <%@include file="../staticPub/aotu_foot.jsp" %>
</body>
</html>