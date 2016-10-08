/**
 * @author 张伟宝
 */
function initValidator(base){
	
	$("#deliverForm").validate({
		onkeyup:false,
		//设置验证规则   
		rules: {
			"spDeliverC.spReceiver": {
				required: true,
				isString: true
			},
			"spDeliverC.spMobie": {
				required: true,
				isMobile: true
			},
			"spDeliverC.province.spId": {
				required: true,
			},
			"spDeliverC.city.spId": {
				required: true,
			},
			"spDeliverC.district.spId": {
				required: true,
			},
			"spDeliverC.spAddress": {
				required: true,
				isString: true
			},
			"spDeliverC.spTelephone": {
				isFixed: true
			},
			"spDeliverC.spPostcode": {
				isPost: true
			}
		},
		//设置错误信息  
		messages: {
			"spDeliverC.spReceiver": {
				required: "请正确填写收货人姓名",
				isString: "请正确填写收货人姓名"
			},
			"spDeliverC.spMobie": {
				required: "请正确输入您的手机号码",
				isMobile: "请正确输入您的手机号码"
			},
			"spDeliverC.province.spId": {
				required: "请选择省份",
			},
			"spDeliverC.city.spId": {
				required: "请选择市",
			},
			"spDeliverC.district.spId": {
				required: "请选择区/县",
			},
			"spDeliverC.spAddress": {
				required: "请正确填写具体地址",
				isString: "请正确填写具体地址"
			},
			"spDeliverC.spTelephone": {
				isFixed: "请正确输入您的固话"
			},
			"spDeliverC.spPostcode": {
				ispost: "请正确输入邮政编码"
			}
		},
		errorElement:"font",
		errorPlacement: function(error, element){
			error.appendTo(element.parent().find(".tipinfo"));
		},
		success:"valid",
		submitHandler:function(form){
			var url='/aotuspace/deliver/add';
			if($(form).find('#editSpId').val()){//有值就是更改
				url='/aotuspace/deliver/editSubmit'
			}
			$.ajax({
    			type : 'POST',
    			data:$(form).serialize(),
    			url :url,
    			success : function(data) {
    				if(data.spCode==100000){
    					alert('提交信息成功');
    					window.location.reload();
    				}else{//错误
    					alert('提交信息失败');
    				}
    			}
	    	});
		}
	});
}



