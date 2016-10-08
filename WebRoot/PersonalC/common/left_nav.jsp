<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="fl p_left">
	<div class="p_left_titile">
		<h3>个人中心</h3>
		<span>Personal Center</span>
	</div>
	<ul>
		<li><%--class="nav_red"--%>
		    <a title="基本资料" href="BasicData.jsp">基本资料</a>
		</li>
		<li>
		    <a title="账号安全" href="AccountSecurity.jsp">账号安全</a>
		</li>
		<li>
		    <a title="购物车" href="javascript:void(0)">购物车</a>
		</li>
		<li>
		    <a title="我的货物" href="MyGoods.jsp">我的订单</a>
		</li>
		<li>
		    <a title="收货地址" href="ReceivAddress.jsp">收货地址</a>
		</li>
		<li>
		    <a title="我的收藏" href="#" class="m_collect">我的收藏</a>
			<ul class="mycollection">
				<li class="mc_red">
				    <a href="Mycollection-Baby.jsp"><span>.</span>宝贝收藏</a>
				</li>
				<li>
				    <a href="Mycollection-Artist.jsp"><span>.</span>艺人收藏</a>
				</li>
			</ul>
	    </li>
	</ul>
</div>