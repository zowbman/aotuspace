<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="fl p_left">
	<div class="p_left_titile">
		<h3>个人中心</h3>
		<span>Personal Center</span>
	</div>
	<ul>
		<li><%--class="nav_red"--%>
		    <a title="基本资料" href="${pageContext.request.contextPath }/u/myProfile">基本资料</a>
		</li>
		<li>
		    <a title="账号安全" href="${pageContext.request.contextPath }/u/safety">账号安全</a>
		</li>
		<li>
		    <a title="我的货物" href="${pageContext.request.contextPath }/u/boughtItems">我的订单</a>
		</li>
		<li>
		    <a title="收货地址" href="${pageContext.request.contextPath }/u/deliver">收货地址</a>
		</li>
		<li>
		    <a title="我的收藏" href="javascript:;" class="m_collect">我的收藏</a>
			<ul class="mycollection">
				<li class="mc_red">
				    <a href="${pageContext.request.contextPath }/u/collectBaby"><span>.</span>宝贝收藏</a>
				</li>
				<li>
				    <a href="${pageContext.request.contextPath }/u/collectArtist"><span>.</span>艺人收藏</a>
				</li>
			</ul>
	    </li>
	</ul>
</div>