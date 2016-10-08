// 个人中心下拉菜单
 $(function(){
       $(".m_collect").click(function(){
       	$('.p_left ul li').removeClass("nav_red");
         $(this).toggleClass("currentDd").siblings(".m_collect").removeClass("currentDd");//siblings：筛选 toggleClass:设置或移除被选元素  
         $(this).toggleClass("currentDt").siblings(".m_collect").removeClass("currentDt");
         $(this).next(".mycollection").slideToggle(300).siblings(".mycollection").slideUp(500);
       });
     });

// 加载Js
$(window).load(function() { // makes sure the whole site is loaded
        $('.status').fadeOut(); // will first fade out the loading animation
        $('.preloader').delay(350).fadeOut('slow'); // will fade out the white DIV that covers the website.
        $('.pic-link').delay(350).css({'overflow':'visible'});
});

//商品详细页-商品信息与评论切换
$(document).ready(function(){
    $('#tabmenu li').click(function() {
        var $this = $(this),
            html = $.trim($this.html());
        $this.parent().find('.purchase-comment').removeClass('purchase-comment');
        $this.addClass('purchase-comment');
        if(html === '商品信息 DESCRIPTION'){
            $('#review').hide();
            $('#description').show();
        }else if(html === '购买评论 COMMENT'){
            $('#description').hide();
            $('#review').show();
        }   
    });
});

// 弹出层
$(function () {
        $(".operat_w_c_e").click(function () {
            $("#goods_bg").css({
                display: "block", height: $(document).height()
            });
            var $comment = $('.comment');
            $comment.css({
                display: "block"
            });
        });
        //点击关闭按钮的时候，遮罩层关闭
        $(".c_close").click(function () {
            $("#goods_bg,.comment").css("display", "none");
        });
});

// 解决placeholder在ie下兼容问题
$(document).ready(function() {
    var doc = document,
    inputs = doc.getElementsByTagName('input'),
    supportPlaceholder = 'placeholder' in doc.createElement('input'),
    placeholder = function(input) {
        var text = input.getAttribute('placeholder'),
        defaultValue = input.defaultValue;
        if (defaultValue == '') {
            input.value = text
        }
        input.onfocus = function() {
            if (input.value === text) {
                this.value = ''
            }
        };
        input.onblur = function() {
            if (input.value === '') {
                this.value = text
            }
        }
    };
    if (!supportPlaceholder) {
        for (var i = 0,
        len = inputs.length; i < len; i++) {
            var input = inputs[i],
            text = input.getAttribute('placeholder');
            if (input.type === 'text' && text) {
                placeholder(input)
            }
        }
    }
});

// 解决ie7以下focus的兼容问题
$(function(){
     $("#userName").focus(function(){
        $("#userName").css("border-color","red");
    });
     $("#userName").blur(function(){
        $("#userName").css("border-color","#b7babf");
    });
});
$(function(){
     $("#passWord").focus(function(){
        $("#passWord").css("border-color","red");
    });
     $("#passWord").blur(function(){
        $("#passWord").css("border-color","#b7babf");
    });
});
$(function(){
     $("#passWordAgain").focus(function(){
        $("#passWordAgain").css("border-color","red");
    });
     $("#passWordAgain").blur(function(){
        $("#passWordAgain").css("border-color","#b7babf");
    });
});
$(function(){
     $("#captcha").focus(function(){
        $("#captcha").css("border-color","red");
    });
     $("#captcha").blur(function(){
        $("#captcha").css("border-color","#b7babf");
    });
});
$(function(){
     $("#qqName").focus(function(){
        $("#qqName").css("border-color","red");
    });
     $("#qqName").blur(function(){
        $("#qqName").css("border-color","#b7babf");
    });
});
$(function(){
     $("#phone").focus(function(){
        $("#phone").css("border-color","red");
    });
     $("#phone").blur(function(){
        $("#phone").css("border-color","#b7babf");
    });
});
$(function(){
     $("#ID").focus(function(){
        $("#ID").css("border-color","red");
    });
     $("#ID").blur(function(){
        $("#ID").css("border-color","#b7babf");
    });
});
$(function(){
     $("#bankNum").focus(function(){
        $("#bankNum").css("border-color","red");
    });
     $("#bankNum").blur(function(){
        $("#bankNum").css("border-color","#b7babf");
    });
});
$(function(){
     $("#bankAccount").focus(function(){
        $("#bankAccount").css("border-color","red");
    });
     $("#bankAccount").blur(function(){
        $("#bankAccount").css("border-color","#b7babf");
    });
});
$(function(){
     $("#bankCard").focus(function(){
        $("#bankCard").css("border-color","red");
    });
     $("#bankCard").blur(function(){
        $("#bankCard").css("border-color","#b7babf");
    });
});
$(function(){
     $("#consName").focus(function(){
        $("#consName").css("border-color","red");
    });
     $("#consName").blur(function(){
        $("#consName").css("border-color","#b7babf");
    });
});
$(function(){
     $("#Tel").focus(function(){
        $("#Tel").css("border-color","red");
    });
     $("#Tel").blur(function(){
        $("#Tel").css("border-color","#b7babf");
    });
});
$(function(){
     $("#post").focus(function(){
        $("#post").css("border-color","red");
    });
     $("#post").blur(function(){
        $("#post").css({"background-color":"#fff","border-color":"#b7babf"});
    });
});

// 收货地址显示与隐藏
/*$(document).ready(function(){
   $(".adr_radio").click(function(){
       $(".form-box").hide();
   });
   $(".new_radio").click(function(){
       $(".form-box").show();
   });
});
*/

// 账号注册密码强度
function CheckIntensity(pwd){ 
  var Mcolor,Wcolor,Scolor,Color_Html; 
  var m=0; 
  var Modes=0; 
  for(i=0; i<pwd.length; i++){ 
    var charType=0; 
    var t=pwd.charCodeAt(i); 
    if(t>=48 && t <=57){charType=1;} 
    else if(t>=65 && t <=90){charType=2;} 
    else if(t>=97 && t <=122){charType=4;} 
    else{charType=4;} 
    Modes |= charType; 
  } 
  for(i=0;i<4;i++){ 
  if(Modes & 1){m++;} 
      Modes>>>=1; 
  } 
  if(pwd.length<=4){m=1;} 
  if(pwd.length<=0){m=0;} 
  switch(m){ 
    case 1 : 
      Wcolor="pwd pwd_Weak_c"; 
      Mcolor="pwd pwd_c"; 
      Scolor="pwd pwd_c pwd_c_r"; 
      Color_Html="弱"; 
    break; 
    case 2 : 
      Wcolor="pwd pwd_Medium_c"; 
      Mcolor="pwd pwd_Medium_c"; 
      Scolor="pwd pwd_c pwd_c_r"; 
      Color_Html="中"; 
    break; 
    case 3 : 
      Wcolor="pwd pwd_Strong_c"; 
      Mcolor="pwd pwd_Strong_c"; 
      Scolor="pwd pwd_Strong_c pwd_Strong_c_r"; 
      Color_Html="强"; 
    break; 
    default : 
      Wcolor="pwd pwd_c"; 
      Mcolor="pwd pwd_c pwd_f"; 
      Scolor="pwd pwd_c pwd_c_r"; 
      Color_Html=""; 
    break; 
  } 
  document.getElementById('pwd_Weak').className=Wcolor; 
  document.getElementById('pwd_Medium').className=Mcolor; 
  document.getElementById('pwd_Strong').className=Scolor; 
  document.getElementById('pwd').innerHTML=Color_Html; 
};

// 全部商品更多选项下拉
  $(document).ready(function(e) {
      $(".control-bar").find(".button-more").toggle(function(){
          $(this).addClass("infont_bg");
          $(".category").show()
          },function(){
          $(this).removeClass("infont_bg");
          $(".category").hide()
      });
  });

// 全部商品更多下拉
  $(document).ready(function(e) {
        $("#selectList").find(".more").toggle(function(){
            $(this).addClass("more_bg");
            $(".more-none").show()
            },function(){
            $(this).removeClass("more_bg");
            $(".more-none").hide()
        });
  });


//即将上线-时间轴
$(document).scroll(function(){
  var baseheight=$(document).scrollTop();
  if(baseheight>665){
    $(".time-flow").addClass("list-header-fixed");
  }
   if(baseheight<665){
    $(".time-flow").removeClass("list-header-fixed"); 
  }
});


//申请页
//主播代言申请
$(document).ready(function(){
  //默认代言主播申请页
  appForm(1,null);
});

//申请表单类型
function appForm(formType,target){
	$.ajax({
		type : 'POST',
		url : '/aotuspace/a/register/form',
		data : {
			formType:formType,
		},
		success : function(data) {
			$('.endorsement_right').empty();
			$('.endorsement_right').html(data);
			if(target){
				//去除全部焦点
				$('#endorsement_appli').find('.endorsement_left').find('ul').find('li:first').nextAll().find('a').removeClass('e_nav_bg');
				//设置焦点
				$(target).addClass('e_nav_bg');
			}
		},
	});
}

//商品详细页数量js
$(function(){
	if($('.ui-porduct').find('span').length){
		$('.ui-porduct').find('span').on('click',function(e){
			 var e = e || window.event;
	         var el = e.target || e.srcElement; //通过事件对象的target属性获取触发元素
	         var cls = el.className; //触发元素的class
	         var countInout = $(this).find('input'); // 数目input
	         var value = parseInt($(countInout).val()); //数目
	         switch (cls) {
		         case 'btn-amountAdd': //点击了加号
		             $(countInout).val(value + 1);
		             btnAmountStyle(this);
		             checkCount($(countInout));
		             break;
		         case 'btn-amountReduce': //点击了减号
		             if (value > 1) {
		            	 $(countInout).val(value - 1);
		            	 btnAmountStyle(this);
			             checkCount($(countInout));
		             }
		             break;
	         }
		});
		// 给数目输入框绑定keyup事件
		$('.ui-porduct').find('span').find('input').on('keyup',function(){
		    var val = parseInt(this.value);
	        if (isNaN(val) || val <= 0) {
	            val = 1;
	        }
	        if (this.value != val) {
	            this.value = val;
	        }
	        checkCount($(this));
		}); 
	}
	
    function btnAmountStyle(span) {
    	var countInput=$(span).find('input');
    	var a=$(span).find('a')[0];
    	if(a){
	        //如果数目只有一个，把-号去掉
	        if (countInput.val() == 1) {
	            a.innerHTML = '';
	        }else{
	            a.innerHTML = '-';
	        }
        }
    }
    //checkCount function
    function checkCount(count){
    	//获取sku
    	var _sku_ul,
    	_selectSkuPId=[];
		_sku_ul=$('.ui-sku-check').find('ul');
		$.each(_sku_ul,function(i,t){
			$.each($(t).find('li'),function(j,t1){
				if($(t1).find('span').attr('class')=='js-seleted'){
					_selectSkuPId.push($(t1).attr('sp-value'));
				}
			});
		});
		
		var skuProp;
		if(_selectSkuPId.length==_sku_ul.length){
			skuProp=_selectSkuPId.join(';');//sku值
			re=new RegExp(":","g");
			skuProp=skuProp.replace(re,"-");
		}
		
		//ajax
		$.ajax({
			type : 'POST',
			data:{
				skuProp:skuProp,
				count:count.val(),
				pdId:g_config.represent.pId,
				treasureId:g_config.represent.tId,
			},
			url : '/aotuspace/shopping/'+g_config.represent.id+'!checkCount',
			success : function(data) {
				if(data.spCode==100000){
					if(data.spData){
						//提示不能超过库存量
						count.val(data.spData)
					}
				}else{//错误
					
				}
			}
		});
		
    }
    btnAmountStyle($('.ui-porduct').find('span'));
});


/**
 * 收货地址省市区三级联动
 */
$(function(){
	/**
	 * 省
	 */
	$('#deliver-pro').change(function(){
		if($('#deliver-pro :selected').val()==''){
			$('#deliver-city').html('<option value>选择市</option>');
			$('#deliver-district').html('<option value>区/县</option>');
			$('#deliver-town').html('<option value>乡道/街道</option>');
		}else{
			lowerArea($('#deliver-pro :selected').val(),$('#deliver-city'),'<option value>选择市</option>');
			$('#deliver-district').html('<option value>区/县</option>');
			$('#deliver-town').html('<option value>乡道/街道</option>');
		}
	});
	
	/**
	 * 市
	 */
	$('#deliver-city').change(function(){
		if($('#deliver-city').val()==''){
			$('#deliver-district').html('<option value>区/县</option>');
			$('#deliver-town').html('<option value>乡道/街道</option>');
		}else{
			lowerArea($('#deliver-city :selected').val(),$('#deliver-district'),'<option value>区/县</option>');
			$('#deliver-town').html('<option value>乡道/街道</option>');
		}
	});
	
	/**
	 * 区
	 */
	$('#deliver-district').change(function(){
		if($('#deliver-district').val()==''){
			$('#deliver-town').html('<option value>乡道/街道</option>');
		}else{
			lowerArea($('#deliver-district :selected').val(),$('#deliver-town'),'<option value>乡道/街道</option>');
		}
	});
	
	/**
	 * higherId: 区域上级id
	 * taget：对象
	 */
	function lowerArea(higherId,taget,head){
		$.ajax({
			data:{
				higherId:higherId,
			},
			type : 'POST',
			url : '/aotuspace/area/lowerArea',
			success : function(data) {
				if(data.spCode==100000){
					var html='';
					$(taget).empty();
					html=head;
					$.each(data.spData,function(i,item){
						html += '<option value="' + item.spId + '">' + item.spDistrict
						+ '</option>';
					});
					$(taget).append(html);
					
				}else{
					alert('获取信息失败')
				}
			}
		});
	}
});


	

/**
 * 设置默认地址
 * @param id
 * @param target
 */
function setDefault(id,target){
	$.ajax({
		type : 'POST',
		url : '/aotuspace/deliver/setDefault/'+id,
		success : function(data) {
			if(data.spCode==100000){
				//table中的tr背景色去除
				$('.tbl-main').find('tr').removeClass('thead-tbl-grade');
				$('.tbl-main').find('tr').find('a.setDefault').text('[设置为常用地址]');
				//添加要设置默认地址的tr class
				$(target).parent().parent().addClass('thead-tbl-grade');
				//设置字为以常用的默认地址
				$(target).text('[已设为常用地址]');
			}else{
				alert('设置为常用地址失败');
			}
		}
	});
}


/**
 * 更改收货地址
 * @param id
 */
function editDeliver(id){
	$.ajax({
		type : 'POST',
		url : '/aotuspace/deliver/edit/'+id,
		success : function(data) {
			if(data.spCode==100000){
				$('#editSpId').val(data.spData.spId);
				$('#deliverForm').find('input[name="spDeliverC.spReceiver"]').val(data.spData.spReceiver);
				$('#deliverForm').find('#deliver-pro').val(data.spData.province.spId);
				lowerAreaEdit($('#deliver-pro :selected').val(),$('#deliverForm').find('#deliver-city'),'<option value>选择市</option>',data.spData.city.spId);
				lowerAreaEdit($('#deliver-city :selected').val(),$('#deliverForm').find('#deliver-district'),'<option value>选择区/县</option>',data.spData.district.spId);
				if(data.spData.town!=null)
					lowerAreaEdit($('#deliver-town :selected').val(),$('#deliverForm').find('#deliver-city'),'<option value>乡道/街道</option>',data.spData.town.spId);
				$('#deliverForm').find('input[name="spDeliverC.spAddress"]').val(data.spData.spReceiver);
				$('#deliverForm').find('input[name="spDeliverC.spMobie"]').val(data.spData.spMobie);
				$('#deliverForm').find('input[name="spDeliverC.spTelephone"]').val(data.spData.spTelephone);
				$('#deliverForm').find('input[name="spDeliverC.spPostcode"]').val(data.spData.spPostcode);
			}else{
				alert('地址信息获取失败');
			}
		}
	});
}

/**
 * 删除收货地址
 * @param id
 */
function deleteDeliver(id){
	$.ajax({
		type : 'POST',
		url : '/aotuspace/deliver/delete/'+id,
		success : function(data) {
			if(data.spCode==100000){
				alert('删除收货地址成功');
				window.location.reload();
			}else{
				alert('删除收货地址失败');
			}
		}
	});
}

/**
 * higherId: 区域上级id
 * taget：对象
 */
function lowerAreaEdit(higherId,taget,head,selected){
	$.ajax({
		async : false,
		data:{
			higherId:higherId,
		},
		type : 'POST',
		url : '/aotuspace/area/lowerArea',
		success : function(data) {
			if(data.spCode==100000){
				var html='';
				$(taget).empty();
				html=head;
				$.each(data.spData,function(i,item){
					html += '<option value="' + item.spId + '">' + item.spDistrict
					+ '</option>';
				});
				$(taget).append(html);
				$(taget).val(selected);
			}else{
				alert('获取信息失败')
			}
		}
	});
}

/**
 * 选择收货地址
 */
$(function(){
	if($('#check-information .auto_notice_content .consignee-information .receiving-i').first().find('.all-receiving').length){
		$('#check-information .auto_notice_content .consignee-information .receiving-i').first().find('.all-receiving').click(function(){
			$('#check-information .auto_notice_content .consignee-information .receiving-i').first().find('.all-receiving').removeClass('defalut-address');
			$(this).addClass('defalut-address');
		});
	}
})









