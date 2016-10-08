<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <!-- 顶部开始 -->
  <div id="top">
       <div class="frame">
             <div class="auto-home">
                  <s class="home-ico">&#xe66c;</s>
                  <a href="${pageContext.request.contextPath }/index.jsp">凹凸首页</a>
             </div>
             <div class="site-top-nav">
                  <div class="top_share at_top_login">
                     <a href="${pageContext.request.contextPath }/Landed&Registered/Landinginterface.jsp" class="land-name">请登陆</a>
                     <a href="${pageContext.request.contextPath }/Landed&Registered/Registered.jsp" class="registeredr-name">免费注册</a>
                  </div>
                  <div class="top_share">
                  	 <div class="my_order">
                          <a href="${pageContext.request.contextPath }/PersonalC/ContentsPage/MyGoods.jsp">我的订单</a>
                  	 </div> 
                  </div>
                  <div class="top_share">
                  	   <div class="shop">
                          <i class="shop_icon">&#xe623;</i>
                  	      <a href="${pageContext.request.contextPath }/ShoppingCart/ShoppingCart.jsp" class="shop_title">购物车 </a>
                  	   </div>
                  </div>
                  <div class="top_share">
                       <div class="shop">
                          <!-- <i class="shop_icon">&#xe623;</i> -->
                          <a href="${pageContext.request.contextPath }/PersonalC/ContentsPage/Mycollection-Baby.jsp" class="shop_title">收藏夹 </a>
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
                 <a href="${pageContext.request.contextPath }/index.jsp"></a>
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