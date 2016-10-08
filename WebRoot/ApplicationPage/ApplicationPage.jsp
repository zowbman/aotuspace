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
                      <li><a href="#" id="anchor" class="e_nav_bg">主播代言申请</a></li>
                      <li><a href="#" id="otherAnchor">当红艺人申请</a></li>
                      <li><a href="#" id="supplier">供应商申请</a></li>
                  </ul>
             </div>
             <div class="endorsement_right">
                  <div id="endorsement_anchor" class="endorsement_right_main">
                       <form class="enForm">
                             <div class="appli_tile">
                                  <h3>代言主播申请</h3>
                             </div>
                             <table width="100%" cellpadding="0" cellspacing="0">
                                    <tbody>
                                          <tr class="a_type">
                                              <th>直播平台:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>直播链接:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>直播昵称:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>直播截图:</th>
                                              <td>
                                                  <div class="bg" style="width: 340px;*width:344px;_width:344px;">
                                                       <input type="text" class="file" name='textfield' id='textfield' />
                                                       <input type="button" class='btn' value='浏览...' style="background-color: #FFF;border: 1px solid #CDCDCD;height: 29px;width: 70px;margin-left: 5px;margin-right: 10px;height:28px;"/>
                                                       <input type="file" name="first_orders1.file" value="" id="file" data-toggle="tooltip" data-placement="bottom" title="请上传2M以下的照片噢!" style="width: 318px;right: 273px;height: 28px;position: absolute !important;left: 3px;border: 0;"/>
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>真实姓名:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>身份证号码:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户银行:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户地:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" style="width: 110px;float:left;"/>
                                                       <span style="display:block;float:left;height:28px;width: 13px;">-</span>
                                                       <input type="text" style="width: 110px;"/>
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>支行:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户人:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>银行卡:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>手机号码:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                    </tbody>
                             </table>
                             <div class="apple_but">
                                  <button type="button">提交</button>
                             </div>
                       </form>
                  </div>
                  <div id="other_anchor" class="endorsement_right_main" style="display:none;">
                       <form class="enForm">
                             <div class="appli_tile">
                                  <h3>当红艺人申请</h3>
                             </div>
                             <table width="100%" cellpadding="0" cellspacing="0">
                                    <tbody>
                                          <tr class="a_type">
                                              <th>艺名:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>内容概述:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>演出截图:</th>
                                              <td>
                                                  <div class="bg" style="width: 340px;*width:344px;_width:344px;">
                                                       <input type="text" class="file" name='textfield' id='textfield' />
                                                       <input type="button" class='btn' value='浏览...' style="background-color: #FFF;border: 1px solid #CDCDCD;height: 29px;width: 70px;margin-left: 5px;margin-right: 10px;height:28px;"/>
                                                       <input type="file" name="first_orders1.file" value="" id="file" data-toggle="tooltip" data-placement="bottom" title="请上传2M以下的照片噢!" style="width: 318px;right: 273px;height: 28px;position: absolute !important;left: 3px;border: 0;"/>
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>真实姓名:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>身份证号码:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户银行:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户地:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>支行:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户人:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>银行卡:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>手机号码:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                    </tbody>
                             </table>
                             <div class="apple_but">
                                  <button type="button">提交</button>
                             </div>
                       </form>
                  </div>
                  <div id="supplier_applica" class="endorsement_right_main" style="display:none;">
                       <form class="enForm">
                             <div class="appli_tile">
                                  <h3>供应商申请</h3>
                             </div>
                             <table width="100%" cellpadding="0" cellspacing="0">
                                    <tbody>
                                          <tr class="a_type">
                                              <th>艺名:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>内容概述:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>演出截图:</th>
                                              <td>
                                                  <div class="bg" style="width: 340px;*width:344px;_width:344px;">
                                                       <input type="text" class="file" name='textfield' id='textfield' />
                                                       <input type="button" class='btn' value='浏览...' style="background-color: #FFF;border: 1px solid #CDCDCD;height: 29px;width: 70px;margin-left: 5px;margin-right: 10px;height:28px;"/>
                                                       <input type="file" name="first_orders1.file" value="" id="file" data-toggle="tooltip" data-placement="bottom" title="请上传2M以下的照片噢!" style="width: 318px;right: 273px;height: 28px;position: absolute !important;left: 3px;border: 0;"/>
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>真实姓名:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>身份证号码:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户银行:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户地:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>支行:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>开户人:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>银行卡:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                          <tr class="a_type">
                                              <th>手机号码:</th>
                                              <td>
                                                  <div class="bg">
                                                       <input type="text" />
                                                  </div>
                                              </td>
                                          </tr>
                                    </tbody>
                             </table>
                             <div class="apple_but">
                                  <button type="button">提交</button>
                             </div>
                       </form>
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