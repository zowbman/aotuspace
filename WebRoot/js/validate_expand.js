/**
 * jquery.validate相关扩展验证
 * @author Administrator
 */

//验证名称（中文、英文、数字、下划线等字符） 
jQuery.validator.addMethod("isString", function(value, element) {       
    return this.optional(element) || /^[\u0391-\uFFE5\w\-]+$/.test(value);       
}, "中文、英文、数字、下划线等字符");

//验证名称（中文）  
jQuery.validator.addMethod("isChinese", function(value, element) {       
    return this.optional(element) || /^[\u4e00-\u9fa5-\uF900]+$/.test(value);       
}, "汉字");

//验证名称（英文）  
jQuery.validator.addMethod("isEnglish", function(value, element) {       
    return this.optional(element) || /^[A-Za-z]+$/.test(value);    
}, "英文");

//QQ验证       
jQuery.validator.addMethod("isQQ", function(value, element) {       
    var length = value.length;   
    var qq = /^\d{1,9}-?\d{3,9}$/;     
    return this.optional(element) || (qq.test(value));       
}, "QQ");   

//联系电话(手机/电话皆可)验证   
jQuery.validator.addMethod("isPhone", function(value,element) {   
    var length = value.length;   
    var mobile = /(^(13|14|15|18)\d{9}$)|(^0(([1,2]\d)|([3-9]\d{2}))\d{7,8}$)/;    
    var tel = /^\d{3,4}-?\d{7,9}$/;   
    return this.optional(element) || (tel.test(value) || mobile.test(value));   
}, "手机、固话");

//身份证号码验证   
jQuery.validator.addMethod("isIdCardNo", function(value,element) {   
    //var idCardNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;     
    //return this.optional(element) || (idCardNo.test(value));  
	return this.optional(element) ||  (isIdCardNo(value));
}, "身份证号码");

//银行卡号验证   
jQuery.validator.addMethod("isBankNum", function(value,element) {  
    var bankNum = /^[0-9]\d{14,18}$/;     
    return this.optional(element) || (bankNum.test(value));   
}, "银行卡号");

//手机号码 
jQuery.validator.addMethod("isMobile", function(value, element) {       
	var mobile = /(^(13|14|15|18)\d{9}$)|(^0(([1,2]\d)|([3-9]\d{2}))\d{7,8}$)/;    
    return this.optional(element) || (mobile.test(value));       
}, "手机号码");


//固话 
jQuery.validator.addMethod("isFixed", function(value, element) {       
  var fixed = /^\d{3,4}-?\d{7,9}$/;    //电话号码格式010-12345678   
  return this.optional(element) || (fixed.test(value));       
}, "固话");   

//邮政编码验证   
jQuery.validator.addMethod("isPost", function(value,element) {  
    var post = /^[0-9]\d{5,5}$/;     
    return this.optional(element) || (post.test(value));   
}, "邮政编码");


//身份证号码的验证规则
function isIdCardNo(num){ 
　   //if (isNaN(num)) {alert("输入的不是数字！"); return false;} 
　　 var len = num.length, re; 
　　 if (len == 15) 
　　 re = new RegExp(/^(\d{6})()?(\d{2})(\d{2})(\d{2})(\d{2})(\w)$/); 
　　 else if (len == 18) 
　　 re = new RegExp(/^(\d{6})()?(\d{4})(\d{2})(\d{2})(\d{3})(\w)$/); 
　　 else {
        //alert("输入的数字位数不对。"); 
        return false;
    } 
　　 var a = num.match(re); 
　　 if (a != null) 
　　 { 
　　 if (len==15) 
　　 { 
　　 var D = new Date("19"+a[3]+"/"+a[4]+"/"+a[5]); 
　　 var B = D.getYear()==a[3]&&(D.getMonth()+1)==a[4]&&D.getDate()==a[5]; 
　　 } 
　　 else 
　　 { 
　　 var D = new Date(a[3]+"/"+a[4]+"/"+a[5]); 
　　 var B = D.getFullYear()==a[3]&&(D.getMonth()+1)==a[4]&&D.getDate()==a[5]; 
　　 } 
　　 if (!B) {
        //alert("输入的身份证号 "+ a[0] +" 里出生日期不对。"); 
        return false;
    } 
　　 } 
　　 if(!re.test(num)){
        //alert("身份证最后一位只能是数字和字母。");
        return false;
    }
　　 return true; 
} 







  
