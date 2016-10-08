<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="staticPub/common/public_style.jspf" %>
<title>嗷兔空间</title>
<script type="text/javascript">
        myFocus.set({
          id:'boxID',//焦点图ID
          pattern:'mF_fscreen_tb',//风格样式
          time:3,//切换时间间隔(秒)
          trigger:'click',//触发切换模式：'click'(点击)/'mouseover'(悬停)
          width:1200,//设置宽度(主图区)
          height:590,//设置高度(主图区)
          txtHeight:'default'//文字层高度设置，'default'为默认高度，0为隐藏
        });
</script>
</head>
<body>
	<!-- 顶部开始 -->
	<%@include file="staticPub/aotu_head.jsp" %>
	<%@include file="staticPub/aotu_nav.jsp" %>
	<!-- 幻灯片开始 -->
	<div id="ifocus">
		<div class="auto_notice_content slides">
			<div id="boxID" style="margin:0 auto;">
				<!--焦点图盒子-->
				<div class="loading">
					<img src="${pageContext.request.contextPath }/images/loading.gif" alt="请稍候..." />
				</div>
				<!--载入画面(可删除)-->
				<div>
					<!--内容列表(li数目可随意增减)-->
					<ul class="pic">
						<!--图片标题-->
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/2.jpg" thumb="" alt="图片1来源于网络，版权属于作者" text="图片1更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/3.jpg" thumb="" alt="版权属于作者，图片2来源于网络" text="图片2更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/4.jpg" thumb="" alt="图片3来源于网络，版权属于作者" text="图片3更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/5.jpg" thumb="" alt="版权属于作者，图片4来源于网络" text="图片4更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/6.jpg" thumb="" alt="图片5来源于网络，版权属于作者" text="图片5更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/6.jpg" thumb="" alt="图片5来源于网络，版权属于作者" text="图片5更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/4.jpg" thumb="" alt="图片3来源于网络，版权属于作者" text="图片3更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/6.jpg" thumb="" alt="图片5来源于网络，版权属于作者" text="图片5更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/4.jpg" thumb="" alt="图片3来源于网络，版权属于作者" text="图片3更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/2.jpg" thumb="" alt="图片1来源于网络，版权属于作者" text="图片1更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/3.jpg" thumb="" alt="版权属于作者，图片2来源于网络" text="图片2更详细的描述文字" /></a>
						</li>
						<li>
							<a href="#"><img src="${pageContext.request.contextPath }/images/banner/4.jpg" thumb="" alt="图片3来源于网络，版权属于作者" text="图片3更详细的描述文字" /></a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- 幻灯片结束 -->
	<!-- 底部开始 -->
    <%@include file="staticPub/aotu_foot.jsp" %>
</body>
</html>