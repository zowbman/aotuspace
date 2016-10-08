<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<form id="arAppForm" class="enForm">
	<div class="appli_tile">
		<h3>当红艺人申请</h3>

	</div>
	<table width="100%" cellpadding="0" cellspacing="0">
		<tbody>
			<tr class="a_type">
				<th>艺名:</th>
				<td>
					<div class="bg">
						<input name="spArAppC.spArname" type="text" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>内容概述:</th>
				<td>
					<div class="bg">
						<input name="spArAppC.spArcontent" type="text" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>演出截图:</th>
				<td>
					<div class="bg" style="width: 340px;*width:344px;_width:344px;">
						<input type="text" class="file" name='textfield' id='textfield' />
						<input type="button" class='btn' value='浏览...'
							style="background-color: #FFF;border: 1px solid #CDCDCD;height: 29px;width: 70px;margin-left: 5px;margin-right: 10px;height:28px;" />
						<input type="file" name="spArscreensort_pic" value="" id="file"
							data-toggle="tooltip" data-placement="bottom"
							title="请上传2M以下的照片噢!"
							style="width: 318px;right: 273px;height: 28px;position: absolute !important;left: 3px;border: 0;" />
						<input type="hidden" id="spArscreensort"
							name="spArAppC.spArscreensort" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>真实姓名:</th>
				<td>
					<div class="bg">
						<input name="spArAppC.spArAppDetailC.spRealname" type="text" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>身份证号码:</th>
				<td>
					<div class="bg">
						<input name="spArAppC.spArAppDetailC.spIdnum" type="text" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>身份证截图:</th>
				<td>
					<div class="bg" style="width: 340px;*width:344px;_width:344px;">
						<input type="text" class="file" id='textfield' /> <input
							type="button" class='btn' value='浏览...'
							style="background-color: #FFF;border: 1px solid #CDCDCD;height: 29px;width: 70px;margin-left: 5px;margin-right: 10px;height:28px;" />
						<input type="file" name="spIdnumsort_pic" data-toggle="tooltip"
							data-placement="bottom" title="请上传2M以下的照片噢!"
							style="width: 318px;right: 273px;height: 28px;position: absolute !important;left: 3px;border: 0;" />
						<input type="hidden" id="spIdnumsort"
							name="spArAppC.spArAppDetailC.spIdnumsort" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>开户银行:</th>
				<td>
					<div class="bg">
						<select id="bank" name="spArAppC.spArAppDetailC.spBank">
							<option value>请选择开户银行</option>
							<c:forEach items="${spBanks }" var="item">
								<option value="${item.id }">${item.name }</option>
							</c:forEach>
						</select>
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>开户地:</th>
				<td>
					<div class="bg">
						<select id="bank-region-pro" style="width: 110px;float:left;">
							<option value>选择省</option>
							<c:forEach items="${spPros }" var="item">
								<option value="${item.id }">${item.name }</option>
							</c:forEach>
						</select> <span style="display:block;float:left;height:28px;width: 13px;">-</span>
						<select id="bank-region-city"
							name="spArAppC.spArAppDetailC.spAncdistrict"
							style="width: 110px;">
							<option value>选择市</option>
						</select>
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>支行:</th>
				<td>
					<div class="bg">
						<select id="bank-region-branch"
							name="spArAppC.spArAppDetailC.spBabranch"
							style="width: 110px;float:left;">
							<option value>请选择支行</option>
						</select>
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>开户人:</th>
				<td>
					<div class="bg">
						<input name="spArAppC.spArAppDetailC.spBankusername" type="text" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>银行卡:</th>
				<td>
					<div class="bg">
						<input name="spArAppC.spArAppDetailC.spBaid" type="text" />
					</div>
				</td>
			</tr>
			<tr class="a_type">
				<th>手机号码:</th>
				<td>
					<div class="bg">
						<input name="spArAppC.spArAppDetailC.spMobie" type="text" />
					</div>
				</td>
			</tr>
		</tbody>
	</table>
	<div class="apple_but">
		<button id="arAppSave" type="button">提交</button>
	</div>
</form>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/linkage_aoto1204.js"></script>
