<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%@include file="../../staticPub/common/public_style.jspf" %>
<!-- fullavatareditor  -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/fullavatareditor/swfobject.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/fullavatareditor/fullAvatarEditor.js"></script>
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
                          &nbsp;<span>更换头像</span>
                      </div>
                      <div class="changeAvatar-content">
                      	   <div>
                      	   		<div>
                      	   			<span>头像</span>
                      	   		</div>
                      	   		<div>
                                	<img class="b_name_img" src="/pic/${spUser.userAvatar.spAvatar }">
                                </div>
                           </div>
                           <div>
		                      <p id="avatarSwfContainer">
								本组件需要安装Flash Player后才可使用，请从 
								<a href="http://www.adobe.com/go/getflashplayer">这里</a> 下载安装。
							  </p>
						  </div>
                      </div>
                 </div>
            </div>
       </div>
  </div>
  <!-- 个人中心结束 -->
  <div class="auto_notice_content" style="height: 1px;background-color: #eaeceb;"></div>
  <script type="text/javascript">
	    swfobject.addDomLoadEvent(function () {
	        var swf = new fullAvatarEditor("${pageContext.request.contextPath }/swf/fullAvatarEditor.swf", "${pageContext.request.contextPath }/swf/expressInstall.swf", "avatarSwfContainer",{
	                id : "avatarSwf",
	                upload_url : "${pageContext.request.contextPath }/u/changeAvatar!upload",
	                method : "post",
	                tab_visible:false,
	                src_upload : 2,
	                avatar_tools_visible:false,
	                checkbox_visible:false,
	                browse_box_align:'left',
	                
	            }, function (msg) {
	                switch(msg.code)
	                {
	                    case 1 : 
	                    	//alert("页面成功加载了组件！");
	                    	console.log("页面成功加载了组件！");
	                    break;
	                    case 2 : 
	                    	if(msg.type==0){
	                    		console.log("已成功加载图片到编辑面板。");
		                    	//alert("已成功加载图片到编辑面板。");
	                    	}else{
	                    		console.log("加载图片失败到编辑面板。");
	                    	}
	                    	break;
	                    case 4:
	                    	alert("选择的原图片文件大小超出了指定的值。")
	                    case 5 : 
	                        if(msg.type == 0)
	                        {
	                            if(msg.content.success)
	                            {
	                                alert(msg.content.msg);
	                                window.location.reload();
	                            }else{
	                            	alert(msg.content.msg);
	                            }
	                        }
	                    break;
	                }
	            }
	        );
	        
	    });
  </script>
  <!-- 底部开始 -->
<%@include file="../../staticPub/aotu_foot.jsp" %>
</body>
</html>