<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
</head>
<body>
	<!-- 顶部开始 -->
	<%@include file="staticPub/aotu_head.jsp" %>
	<%@include file="staticPub/aotu_nav.jsp" %>
	<!-- 我要代开始 -->
	<!-- 简介开始 -->
	<div id="agent-introduct">
		<div class="auto_notice_content">
			<p class="ai-t">
				<span class="to">我要代&nbsp;|</span>一种全新的营销方式
			</p>
			<p class="ai-t at-c">MeTell New marketing mode</p>
			<p>各种扯蛋各种扯蛋各种扯蛋各种扯蛋各</p>
			<p>种扯蛋各种扯蛋各种扯蛋各种扯蛋各种扯蛋各种扯蛋各种扯蛋各种扯蛋各种扯蛋各种扯蛋</p>
		</div>
	</div>
	<!-- 简介结束 -->
	<!-- banner开始 -->
	<div id="agent-banner">
		<div class="auto_notice_content">
			<div class="banner-top">
				<div class="fl bt-1">
					<div class="category_img">
						<div class="inner">
							<div>
								<img src="images/Represent_03.jpg" />
							</div>
							<div>
								<img src="images/Represent_03.jpg" />
							</div>
						</div>
					</div>
					<div class="all-name">
						<a class="c-box">
							<div class="apparel">
								服装类&nbsp;&nbsp;|<span>&nbsp;Apparel</span>
							</div>
							<div class="c-address">aotuspace.com</div> </a>
					</div>
				</div>
				<div class="fl bt-1">
					<div class="all-name" style="background-color: #fdd247;">
						<a class="c-box">
							<div class="apparel">
								海外类&nbsp;&nbsp;|<span>&nbsp;Overseas</span>
							</div>
							<div class="c-address">aotuspace.com</div> </a>
					</div>
					<div class="category_img">
						<div class="inner">
							<div>
								<img src="images/Represent_06.jpg" />
							</div>
							<div>
								<img src="images/Represent_06.jpg" />
							</div>
						</div>
					</div>
				</div>
				<div class="fl bt-1">
					<div class="category_img">
						<div class="inner">
							<div>
								<img src="images/Represent_03 (2).jpg" />
							</div>
							<div>
								<img src="images/Represent_03 (2).jpg" />
							</div>
						</div>
					</div>
					<div class="all-name" style="background-color:#fd536b;">
						<a class="c-box">
							<div class="apparel">
								食品类&nbsp;&nbsp;|<span>&nbsp;Food</span>
							</div>
							<div class="c-address" style="margin-left:-32px;">aotuspace.com</div>
						</a>
					</div>
				</div>
			</div>
			<div class="banner-bottom">
				<div class="taste-title">
					<a href="#"> 情趣类&nbsp;&nbsp;|&nbsp;<span>Taste</span>
						<div class="t-address">aotuspace.com</div> </a>
				</div>
				<div class="taste-img">
					<div class="inner">
						<div>
							<img src="images/Represent_0553_03-2.jpg" />
						</div>
						<div>
							<img src="images/Represent_0553_03.jpg" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- banner结束 -->
	
	<!-- 服装类展品开始 -->
	<div id="zp-category">
		<div class="auto_notice_content">
			<div class="zp-c-title">
				<h1>服装类&nbsp;&nbsp;|&nbsp;Apparel</h1>
				<span>啊是大叔大苏打三啊是大叔大时代大三的</span>
			</div>
			<div class="zp-c-goods">
				<c:forEach items="${rgoods }" var="item">
					<div class="fl c-1">
						<div class="c-1-img">
							<a href="/aotuspace/goods/r/${item.spId }"> 
							   <img src="/pic/${item.spAotuerpTreasureInfoCustom.treasurePrimaryImg.spImg }">
	                        </a>
						</div>
						<p class="c-1-titile">
							<a href="/aotuspace/g/r/${item.spId }">
								${item.spAotuerpTreasureInfoCustom.spTreasuretitle }
						     </a>
						</p>
						<p class="c-1-price">￥${item.spAotuerpTreasureInfoCustom.goodsShowPrice}</p>
						<div class="c-1-button">
							<span class="c-1-b">匈是个撒的发生牙利设计师</span> 
							<span class="c-1-b">小巧轻撒的发生便</span>
							<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
						</div>
					</div>
				</c:forEach>
				
			</div>
			<div class="zp-check">
				<a href="">+&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查看更多&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+</a>
			</div>
		</div>
	</div>
	<!-- 服装类展品结束 -->
	
	<!-- 海外类展品开始 -->
	<div id="zp-category" style="background:#eee;">
		<div class="auto_notice_content">
			<div class="zp-c-title s-titile">
				<h1>海外类&nbsp;&nbsp;|&nbsp;Overseas</h1>
				<span>啊是大叔大苏打三啊是大叔大时代大三的</span>
			</div>
			<div class="zp-c-goods">
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> 
						   <img src="images/Represent_05.jpg"> 
					    </a>
					</div>
					<p class="c-1-titile">
						<a href="Details-Page/Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比
					    </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> 
						<span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Details-Page/Endorsement_details.html"> 
						   <img src="images/Represent_05.jpg"> 
						</a>
					</div>
					<p class="c-1-titile">
						<a href="Details-Page/Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比
					    </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> 
						<span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Details-Page/Endorsement_details.html"> 
						   <img src="images/Represent_05.jpg"> 
						</a>
					</div>
					<p class="c-1-titile">
						<a href="Details-Page/Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 
					    </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> 
						<span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Details-Page/Endorsement_details.html">
						   <img src="images/Represent_05.jpg"> 
						</a>
					</div>
					<p class="c-1-titile">
						<a href="Details-Page/Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比
					    </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span>
						 <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Details-Page/Endorsement_details.html"> 
						   <img src="images/Represent_05.jpg"> 
						</a>
					</div>
					<p class="c-1-titile">
						<a href="Details-Page/Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 
						</a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> 
						<span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Details-Page/Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Details-Page/Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
			</div>
			<div class="zp-check zp-check-w">
				<a href="">+&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查看更多&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+</a>
			</div>
		</div>
	</div>
	<!-- 海外类展品结束 -->
	<!-- 食品类展品开始 -->
	<div id="zp-category">
		<div class="auto_notice_content">
			<div class="zp-c-title">
				<h1>食品类&nbsp;&nbsp;|&nbsp;Food</h1>
				<span>啊是大叔大苏打三啊是大叔大时代大三的</span>
			</div>
			<div class="zp-c-goods">
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button c-1-button-r">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button c-1-button-r">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button c-1-button-r">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button c-1-button-r">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button c-1-button-r">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button c-1-button-r">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
			</div>
			<div class="zp-check">
				<a href="">+&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查看更多&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+</a>
			</div>
		</div>
	</div>
	<!-- 食品类展品结束 -->
	<!--情趣类展品开始 -->
	<div id="zp-category"
		style="background: url(images/Represent_08.jpg) top center no-repeat;-moz-background-size: 100% 100%;background-size: 100% 100%;">
		<div class="auto_notice_content">
			<div class="zp-c-title s-titile">
				<h1>情趣类&nbsp;&nbsp;|&nbsp;Taste</h1>
				<span>啊是大叔大苏打三啊是大叔大时代大三的</span>
			</div>
			<div class="zp-c-goods">
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
				<div class="fl c-1">
					<div class="c-1-img">
						<a href="Endorsement_details.html"> <img
							src="images/Represent_05.jpg"> </a>
					</div>
					<p class="c-1-titile">
						<a href="Endorsement_details.html">
							男的萨菲飞是短发是短发等所发生的费水电费水电费水电费版 T-shirt 碧芬个逗比 </a>
					</p>
					<p class="c-1-price">￥1200.00</p>
					<div class="c-1-button s-1-button">
						<span class="c-1-b">匈是个撒的发生牙利设计师</span> <span class="c-1-b">小巧轻撒的发生便</span>
						<span class="c-1-b">路由器等所发生的费最佳伴侣</span>
					</div>
				</div>
			</div>
			<div class="zp-check zp-check-w">
				<a href="">+&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查看更多&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+</a>
			</div>
		</div>
	</div>
	<!-- 情趣类展品结束 -->
	<!-- 我要代结束 -->
	<div class="auto_notice_content"
		style="height: 1px;background-color: #eaeceb;"></div>
	<!-- 底部开始 -->
	<%@include file="staticPub/aotu_foot.jsp" %>
	<script type="text/javascript">
        $(".category_img").mouseenter(function () {
          var $this = $(this);
          var $div = $this.find(".inner div");
          $div.eq(1).stop();
          $div.eq(1).css({ "top": "0px", "left": "0px", "width": "400px", "height": "288px" });
          $div.eq(0).stop().animate({ "top": "-25px", "left": "-25px", "width": "450px", "height": "338px", "opacity": "0" }, 500);
          $div.eq(1).stop().animate({ "top": "-25px", "left": "-25px", "width": "450px", "height": "338px", "opacity": "1" }, 500);
        }).mouseleave(function () {
          var $this = $(this);
          var $div = $this.find(".inner div");
          $div.eq(0).stop().animate({ "top": "0", "left": "0", "width": "400px", "height": "288px", "opacity": "1" }, 500);
          $div.eq(1).stop().animate({ "top": "0", "left": "0", "width": "400px", "height": "288px", "opacity": "0" }, 500);
        }); 
   </script>
</body>
</html>