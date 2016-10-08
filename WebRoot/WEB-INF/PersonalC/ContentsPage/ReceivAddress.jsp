<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../../staticPub/common/verification_style.jspf" %>
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
                          &nbsp;<span>收货地址</span>
                      </div>
                      <div class="main_info">
                            <span class="keep">已保存了7条地址，还能保存13条地址</span>
                            <!-- 收货信息开始 -->
                            <div class="tbl-deliver-address">
                           
                                <table  cellspacing="0" class="tbl-main">
                                       <tbody>
                                       		<c:forEach items="${delivers }" var="item">
	                                       		<tr
	                                       			<c:choose>
	                                                	<c:when test="${item.spIsdefault==1}">
		                                                	class="thead-tbl-grade"
		                                                </c:when>
	                                                </c:choose>
	                                       		 >
	                                                <td class="td_name">${item.spReceiver }</td>
	                                                <td class="td_address">
	                                                <c:choose>
	                                                	<c:when test="${item.provinceName.spDistrict!=null}">
		                                                	${item.provinceName.spDistrict}，
		                                                </c:when>
	                                                </c:choose>
	                                                <c:choose>
	                                                	<c:when test="${item.cityName.spDistrict!=null}">
		                                                	${item.cityName.spDistrict}，
		                                                </c:when>
		                                            </c:choose>
		                                            <c:choose>
		                                                <c:when test="${item.districtName.spDistrict!=null}">
		                                                	${item.districtName.spDistrict}，
		                                                </c:when>
		                                            </c:choose>
		                                            <c:choose>
		                                                <c:when test="${item.townName.spDistrict!=null}">
		                                                	 ${item.townName.spDistrict}，
		                                                </c:when>
		                                            </c:choose>
	                                                ${item.spAddress}，${item.spPostcode }，${item.spMobie }</td>
	                                                <td class="td_md">
	                                                <a class="setDefault" onclick="setDefault(${item.spId},this)"  href="javascript:;"><c:choose><c:when test="${item.spIsdefault==1}">[已设为常用地址]</c:when><c:otherwise>[设置为常用地址]</c:otherwise></c:choose></a>
	                                                </td>
	                                                <td class="td_md"><a onclick="editDeliver(${item.spId})" href="javascript:;">[修改]</a></td>
	                                                <td class="td_md"><a onclick="deleteDeliver(${item.spId})" href="javascript:;">[删除]</a></td>
	                                            </tr>
	                                            <tr style="height:20px;">
	                                            </tr>
                                       		</c:forEach>
                                       </tbody>
                                </table>
                            </div>
                      </div>
                      <!-- 收货信息结束 -->
                      <!-- 填写收货地址信息开始 -->
                      <div class="form-box">
                           <form class="formDeliver" id="deliverForm">
                           <input type="hidden" id="editSpId" name="spId"/>
                                 <h3 style="margin-bottom:20px;border-top: 1px solid #e1e1e1;padding-top: 28px;">        收货人信息：
                                 </h3>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">收货人姓名&nbsp;<i class="impot_icon">*</i></span>
                                      <input type="text" name="spDeliverC.spReceiver"/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="consignee">
                                      <span class="c_name fl">收货地址&nbsp;<i class="impot_icon">*</i></span>
                                      <div class="c_ipt fl">
	                                  <select id="deliver-pro" name="spDeliverC.province.spId">
											<option value>省/直辖市</option>
											<c:forEach items="${province }" var="item">
												<option value="${item.spId }">${item.spDistrict }</option>
											</c:forEach>
									  </select>
									  <div class="tipinfo"></div>
                                           <%--<div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">省/直辖市</div>
                                                <i class="down"></i>
                                           </div>--%>
                                      </div>
                                       <div class="c_ipt fl">
	                                       <select id="deliver-city" name="spDeliverC.city.spId">
												<option value>市</option>
										  </select>
                                           <%--<div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">市</div>
                                                <i class="down"></i>
                                           </div>--%>
                                           <div class="tipinfo"></div>
                                       </div>
                                       <div class="c_ipt fl">
                                          <select id="deliver-district" name="spDeliverC.district.spId">
												<option value>区/县</option>
										  </select>
                                           <%--<div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">区/县</div>
                                                <i class="down"></i>
                                           </div> --%>
                                           <div class="tipinfo"></div>
                                      </div>
                                       <div class="c_ipt ">
                                       	  <select id="deliver-town" name="spDeliverC.town.spId">
												<option value>乡道/街道</option>
										  </select>
                                          <%-- <div class="province">
                                                <input type="hidden" value="0">
                                                <div class="text placeholder">乡道/街道</div>
                                                <i class="down"></i>
                                           </div>--%>
                                       </div>
                                       <div class="f">
                                            <input type="text" name="spDeliverC.spAddress"  placeholder="收货地址信息" />
                                       		<div class="tipinfo"></div>
                                       </div>
                                 </div>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">手机号码&nbsp;<i class="impot_icon">*</i></span>
                                      <input type="text" name="spDeliverC.spMobie"/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">固定电话&nbsp;</span>
                                      <input type="text" name="spDeliverC.spTelephone"/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="consignee consignee2">
                                      <span class="c_name fl">邮政编码&nbsp;</span>
                                      <input type="text" name="spDeliverC.spPostcode"/>
                                      <div class="tipinfo"></div>
                                 </div>
                                 <div class="save-address">
                                      <button name="Submit" type="submit" class="s_a_button">提交资料</button>
                                 </div>
                           </form>
                      </div>
                      <!-- 填写收货地址信息结束 -->
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