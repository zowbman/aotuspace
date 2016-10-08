$(function() {
	//默认加载支行
	getBranchSel($('#bank').val(),$('#bank-region-pro').val(),$('#bank-region-city').val());
	//银行
	$("#bank").change(function() {
		//选择银行时候出发
		getBranchSel($('#bank').val(),$('#bank-region-pro').val(),$('#bank-region-city').val());	
	});
	//省
	$("#bank-region-pro").change(function() {
		getCitySel($(this).val());
		//选择省时候出发
	});
	//市
	$('#bank-region-city').change(function(){
		//选择市时候出发
		getBranchSel($('#bank').val(),$('#bank-region-pro').val(),$('#bank-region-city').val());	
	});
});

//银行地域市function
function getCitySel(id) {
	if(!id){
		$('#bank-region-city').html('<option value>选择市</option>');
		return;
	}
	
	$.ajax({
		url : '/aotuspace/bank/region/citys',
		data : {
			'spBankR.pid' : id
		},
		success : function(data) {
			if (!data)
				return;
			var html = "";
			$('#bank-region-city').empty();
			for ( var i in data) {
				html += '<option value="' + data[i].id + '">' + data[i].name
						+ '</option>';
			}
			$('#bank-region-city').append(html);
			getBranchSel($('#bank').val(),$('#bank-region-pro').val(),$('#bank-region-city').val());	
		}
	});
}

function getBranchSel(bankId,proId,cityId){
	//支行
	$.ajax({
		url : '/aotuspace/bank/region/branchs',
		data:{
			bankId:bankId,
			proId:proId,
			cityId:cityId,
		},
		success : function(data) {
			if(data.length<1){
				$('#bank-region-branch').html('<option value>请选择支行</option>');
				return;
			}
			var html = "";
			$('#bank-region-branch').empty();
			for ( var i in data) {
				html += '<option value="' + data[i].id + '">' + data[i].name
						+ '</option>';
			}
			$('#bank-region-branch').append(html);
		}
	});
}

$(function(){
	//提交主播代言申请
	$('.endorsement_right').on('click','#anAppSave',function(){
		var options={
				url:'/aotuspace/a/an/register/upload',
				type:'post',
				contentType: 'application/json;charset=utf-8',
				success:function(data){
					//判断图片上传是否成功，成功则保存表单注册数据
					if(data.spCode==100000){
						$('#spIdnumsort').val(data.spData.spIdnumSortPath);//身份证截图
						$('#spLiscreensort').val(data.spData.spLiscreensortPath);//演出截图
						$.ajax({      
     		  		  		type: 'post',         
     		  		  		url:'/aotuspace/a/an/registerSubmit' ,        
     		  		  		contentType: "application/json; charset=utf-8",   
     		  		  		data:decodeURIComponent($('#anAppForm').formjson(),true),//解码，.serialize()自动调用了encodeURIComponent方法将数据编码了，调用decodeURIComponent(XXX,true);将数据解码 
     		  		  		success: function (data) { 
     		  		  			
     		  		  		},             
     		  			}); 
					}else{//不成功，部分上传成功的图片删除
						
					}
					console.log(data);
				}
		}
		// 提交表单  
		$('#anAppForm').ajaxSubmit(options);
	});
	
	//提交艺人代言申请
	$('.endorsement_right').on('click','#arAppSave',function(){
		var options={
				url:'/aotuspace/a/ar/register/upload',
				type:'post',
				contentType: 'application/json;charset=utf-8',
				success:function(data){
					//判断图片上传是否成功，成功则保存表单注册数据
					if(data.spCode==100000){
						$('#spIdnumsort').val(data.spData.spIdnumSortPath);//身份证截图
						$('#spArscreensort').val(data.spData.spArscreensortPath);//演出截图
						console.log(decodeURIComponent($('#anAppForm').formjson(),true));
						$.ajax({      
     		  		  		type: 'post',         
     		  		  		url:'/aotuspace/a/ar/registerSubmit' ,        
     		  		  		contentType: "application/json; charset=utf-8",   
     		  		  		data:decodeURIComponent($('#arAppForm').formjson(),true),//解码，.serialize()自动调用了encodeURIComponent方法将数据编码了，调用decodeURIComponent(XXX,true);将数据解码 
     		  		  		success: function (data) { 
     		  		  			
     		  		  		},             
     		  			}); 
					}else{//不成功，部分上传成功的图片删除
						
					}
					console.log(data);
				}
		}
		// 提交表单  
		$('#arAppForm').ajaxSubmit(options);
	});
});