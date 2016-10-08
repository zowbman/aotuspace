<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="staticPub/common/public_style.jspf" %>
<title>凹凸空间</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.5.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/myfocus-2.0.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/mF_pithy_tb.js"></script>
<script type="text/javascript">
      myFocus.set({
        id:'boxID',//焦点图ID
        pattern:'mF_pithy_tb',//风格样式
        time:3,//切换时间间隔(秒)
        trigger:'click',//触发切换模式：'click'(点击)/'mouseover'(悬停)
        width:1070,//设置宽度(主图区)
        height:355,//设置高度(主图区)
        txtHeight:'default'//文字层高度设置，'default'为默认高度，0为隐藏
      });
  </script>
</head>
<body>
	<!-- 顶部开始 -->
    <%@include file="staticPub/aotu_head.jsp" %>
    <%@include file="staticPub/aotu_nav.jsp" %>
	<!-- 全部商品类别切换开始 -->
	<div id="a_g_nav_box">
		<div class="auto_notice_content">
			<div id="boxID">
				<!--焦点图盒子-->
				<div class="loading">
					<img src="images/loading.gif" alt="请稍候..." />
				</div>
				<div class="pic">
					<ul>
						<li><a href="#"> <img src="images/12.jpg" thumb=""
								alt="标题1" text="" /> </a></li>
						<li><a href="#"> <img src="images/13.jpg" thumb=""
								alt="标题2" text="" /> </a></li>
						<li><a href="#"> <img src="images/14.jpg" thumb=""
								alt="标题3" text="" /> </a></li>
						<li><a href="#"> <img src="images/15.jpg" thumb=""
								alt="标题4" text="" /> </a></li>
						<li><a href="#"> <img src="images/13.jpg" thumb=""
								alt="标题5" text="" /> </a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- 全部商品类别切换结束 -->
	<!-- 筛选开始 -->
	<div id="a_g_screen">
		<div class="auto_notice_content a_g_screen_main">
			<div class="list-screen">
				<div class="hasBeenSelected clearfix">
					<div style="float:right;" class="eliminateCriteria">【清空全部】</div>
					<dl>
						<dt>已选条件：</dt>
						<dd style="display:none;" class="clearDd">
							<div class="clearList"></div>
						</dd>
					</dl>
				</div>
				<div
					style="border-top: 1px solid #eaeceb;padding: 10px 10px 0px 10px;">
					<div class="screen-term">
						<div class="selectNumberScreen">
							<div id="selectList" class="screenBox screenBackground">
								<dl class=" listIndex" attr="terminal_os_s"
									style="border: none;">
									<dt>品牌：</dt>
									<dd>
								         <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="symbian">asdasd</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="symbian">伊诗岱</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">Afs Jeep/战地吉普</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">Afs Jeep/战地吉普</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">立彬</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">森马</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">胖织缘福</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">翰代维</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">泰芝郎</a>
                                          </label>
                                          <label>
                                              <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                              <a href="javascript:;" values2="" values1="" attrval="百度易平台">金牌梦</a>
                                          </label>
									</dd>
								</dl>
								<dl class="listIndex" attr="terminal_brand_s">
									<dt>选购热点：</dt>
									<dd data-more=true>
										 <label>
                                             <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                             <a href="javascript:;" values2="" values1="" attrval="潮流">潮流</a>
                                         </label>
                                         <label>
                                             <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                             <a href="javascript:;" values2="" values1="" attrval="打底衫">打底衫</a> 
                                         </label>
                                         <label>
                                             <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                             <a href="javascript:;" values2="" values1="" attrval="韩版">韩版</a> 
                                         </label>
                                         <label>
                                             <input name="checkbox2" type="checkbox" value="" autocomplete="off"/>
                                             <a href="javascript:;" values2="" values1="" attrval="针织衫">针织衫</a>
                                         </label>
                                           <span class="more"><em class="open"></em>更多</span>
									</dd>
								</dl>
								<dl class="listIndex more-none" attr="terminal_brand_s"
									style="display:none;">
									<dt style='visibility:hidden'>选购热点</dt>
									<dd>
										<form action="" method="get" style="overflow: hidden;">
											 <label>
                                                 <input name="checkbox2" type="checkbox" value="" />
                                                 <a href="javascript:;" values2="" values1="" attrval="薄款">薄款</a>
                                             </label>
                                             <label>
                                                 <input name="checkbox2" type="checkbox" value="" />
                                                 <a href="javascript:;" values2="" values1="" attrval="修身款">修身款</a> 
                                             </label> 
                                             <label>
                                                  <input name="checkbox2" type="checkbox" value="" />
                                                  <a href="javascript:;" values2="" values1="" attrval="纯棉">纯棉</a> 
                                             </label>  
										</form>
									</dd>
								</dl>
								<div class="category" style="display:none;">
									<dl class="listIndex" attr="价格范围"
										style="border-top: 1px dashed #eaeceb;">
										<dt>价格</dt>
										<dd>
											<label>
                                                 <input name="radio2" type="radio" value="" />
                                                 <a href="javascript:;" values2="99" values1="1" attrval="1-99">0-300元</a>
                                             </label>
                                             <label>
                                                 <input name="radio2" type="radio" value="" />
                                                 <a href="javascript:;" values2="300" values1="100" attrval="100-300">100-300元 </a>
                                             </label>
                                             <label>
                                                 <input name="radio2" type="radio" value="" />
                                                 <a href="javascript:;" values2="600" values1="300" attrval="300-600">300-600元</a>
                                             </label>
                                             <label>
                                                 <input name="radio2" type="radio" value="" />
                                                 <a href="javascript:;" values2="1500" values1="600" attrval="5000以上">600-1500元</a>
                                             </label>
										</dd>
									</dl>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="control-bar">
				<!--  <input type="hidden" id="more-flag"> -->
				<a class="button-more" href="javascript:void(0);"> 更多选项 <span
					class="ifont10"></span> </a>
			</div>
		</div>
	</div>
	<!-- 筛选结束 -->
	<!-- 全部商品-商品价格筛选开始 -->
	<div id="price-sort">
		<div class="auto_notice_content sort-condition">
			<div class="fl sort-left">
				<a href="#" class="selected_new">最新<span class="new_i"></span>
				</a> <a href="#" class="selected_price">价格&nbsp;<span
					class="price_i"></span>
				</a> <a href="#" class="selected_discount">折扣&nbsp;<span
					class="discount_i"></span>
				</a> 
				<a href="#" class=""><span class="select-input"></span><span>新品</span>
				</a> <a href="#" class=""><span class="select-input"></span><span>打折</span>
				</a> <a href="#" class=""><span class="select-input"></span><span>限量</span>
				</a>
			</div>
			<div class="fr sort-right">
				<ul>
					<li><a href="#">1</a>
					</li>
					<li><a href="#">2</a>
					</li>
					<li><a href="#">3</a>
					</li>
					<li><a href="#">4</a>
					</li>
					<li><a href="#">5</a>
					</li>
					<li><a href="#">6</a>
					</li>
					<li><a href="#">.....</a>
					</li>
					<li><a href="#">200 ></a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- 全部商品-商品价格筛选结束 -->
		<!-- 全部商品-商品展示开始 -->
		<div id="all-goods">
			<div class="auto_notice_content goods-box">
				<c:forEach items="${goods }" var="item">
					<!-- 商品简介开始 -->
					<div class="a_g_items fl">
						<div class="items_top">
							<div class="i-img fl">
								<a href="" class="imglink">
								     <img src="/pic/${item.spAnchorBinfoCustom.spUsersBinfoCustom.spUsersDinfoCustom.spUsersAvatar.spAvatar }_64x64.jpg"> 
								</a>
							</div>
							<div class="i-text fl">
								<div class="spokesperson">
									<a href=""><nobr>代言主播&nbsp;&nbsp;&nbsp;${item.spAnchorBinfoCustom.spUsersBinfoCustom.spUsersDinfoCustom.spNickname}</nobr></a>
								</div>
								<div class="message">
									<a href="" title="小伙伴快来买我的商品，我为自己带盐"><nobr>小伙伴快来买我的商品，我为自己fdsfsdfsd带盐</nobr></a>
								</div>
							</div>
						</div>
						<div class="productGraph">
							<a class="pic-link" href="/aotuspace/goods/${item.spAnid}/${item.spId}"> 
							   <img src="/pic/${item.spAotuerpTreasureInfoCustom.treasurePrimaryImg.spImg }_200x200.jpg"> 
							</a>
							<div class="preloader">
								<div class="status">&nbsp;</div>
							</div>
						</div>
						<div class="ctx-box">
							<div class="row-1">
								<a href="Details-Page/Representdetail.jsp" title="${item.spAotuerpTreasureInfoCustom.spTreasuretitle }">
								    ${item.spAotuerpTreasureInfoCustom.spTreasuretitle }
								</a>
							</div>
							<div class="row-2">
								<a href="">${item.spAotuerpTreasureInfoCustom.spProductBinfoCustom.spProductBrands.spBrandn}</a>
							</div>
							<div class="row-3">
								<div class="row-price fl">
									<span>￥${item.spAotuerpTreasureInfoCustom.goodsShowPrice}</span>
								</div>
								<div class="mind fr">
									<a href=""><img src="images/icon/allOrder13_38.png"></a>
								</div>
							</div>
						</div>
					</div>		
			</c:forEach>
			<!-- 商品简介结束 -->
		</div>
	</div>
	<!-- 全部商品-商品展示结束 -->
	<!-- 全部商品-分页符开始 -->
	<div id="pagingbox">
		<div class="auto_notice_content all-paging">
			<div class="page-number">
				<ul class="items">
					<li class="item pre-age"><a class="num" href=""><&nbsp;上一页</a>
					</li>
					<li class="item active"><a class="num one" href="" class="num">1</a>
					</li>
					<li class="item"><a class="num" href="">2</a>
					</li>
					<li class="item"><a class="num" href="">3</a>
					</li>
					<li class="item"><a class="num" href="">4</a>
					</li>
					<li class="item"><a class="num" href="">5</a>
					</li>
					<li class="item"><a class="num" href="">6</a>
					</li>
					<li class="item dot">...</li>
					<li class="item"><a class="num" href="">100</a>
					</li>
					<li class="item next-page"><a class="num" href="">下一页&nbsp;></a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- 全部商品-分页符结束 -->
	<!-- 底部开始 -->
    <%@include file="staticPub/aotu_foot.jsp" %>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/public_112aotu.js"></script>
</body>
</html>