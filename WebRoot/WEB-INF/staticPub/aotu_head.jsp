<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  <!-- 顶部开始 -->
  <div id="top">
       <div class="frame">
             <div class="auto-home">
                  <s class="home-ico">&#xe66c;</s>
                  <a href="${pageContext.request.contextPath }/index">凹凸首页</a>
             </div>
             <div class="site-top-nav">
                 <div class="top_share at_top_login">
                  	<c:choose>
   						<c:when test="${spUser!=null}">
   							欢迎！<a href="${pageContext.request.contextPath }/u/myProfile">${spUser.spAccount}</a>
    						<a href="${pageContext.request.contextPath }/u/logout" class="logout-name">退出</a>
   						</c:when>   
   						<c:otherwise>
   							<a href="${pageContext.request.contextPath }/u/login" class="land-name">请登陆</a>
                     		<a href="${pageContext.request.contextPath }/u/register" class="registeredr-name">免费注册</a>
   						</c:otherwise>  
						</c:choose>
                  </div>
                  <div class="top_share">
                  	 <div class="my_order">
                          <a href="${pageContext.request.contextPath }/PersonalC/common/personalC_main.jsp">我的订单</a>
                  	 </div> 
                  </div>
                  <div class="top_share">
                  	   <div class="shop">
                          <i class="shop_icon">&#xe623;</i>
                  	      <a href="${pageContext.request.contextPath }/shopping/buyCar" class="shop_title">购物车 </a>
                  	   </div>
                  </div>
                  <div class="top_share">
                       <div class="shop">
                          <!-- <i class="shop_icon">&#xe623;</i> -->
                          <a href="${pageContext.request.contextPath }/PersonalC/PersonalC-Mycollection.jsp" class="shop_title">收藏夹 </a>
                       </div>
                  </div>
             </div>
       </div>
  </div>
  <!-- 顶部结束 -->
  <!-- logo-搜索开始 -->
  <div id="at_ls">
       <div class="at_ls_frame">
            <div class="at_logo">
                 <a href="${pageContext.request.contextPath }/index"></a>
            </div>
            <div class="search_box">
                <form>
                   <input type="text" class="search_text fl"/>  
                   <input type="button" value="" class="search_btn fr"/> 
                   <!-- <a href="" class="search_btn fr"></a> -->
                </form>
            </div>
       </div>
  </div>
  <!-- logo-搜索结束 -->