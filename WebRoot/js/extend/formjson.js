/** @serializedParams looks like "prop1=value1&prop2=value2".   
Nested property like 'prop.subprop=value' is also supported **/ 
//���л������Ӷ���
function paramString2obj (serializedParams) { 

var obj={}; 
function evalThem (str) { 
var attributeName = str.split("=")[0]; 
var attributeValue = str.split("=")[1]; 
if(!attributeValue){ 
return ; 
} 
var array = attributeName.split("."); 
for (var i = 1; i < array.length; i++) { 
var tmpArray = Array(); 
tmpArray.push("obj"); 
for (var j = 0; j < i; j++) { 
tmpArray.push(array[j]); 
}; 
var evalString = tmpArray.join("."); 
// alert(evalString); 
if(!eval(evalString)){ 
eval(evalString+"={};"); 
} 
}; 
eval("obj."+attributeName+"='"+attributeValue+"';"); 

}; 
var properties = serializedParams.split("&"); 
for (var i = 0; i < properties.length; i++) { 
evalThem(properties[i]); 
}; 
return obj; 
} 

//������formjson
$.fn.formjson = function(){ 
var serializedParams = this.serialize(); 
var obj = paramString2obj(serializedParams); 
return JSON.stringify(obj); 
} 


//��չ�����л��������ͣ�
/*$.fn.serializeObject = function() {
	var o = {};
	var a = this.serializeArray();//���л�Ϊformһ�����Ķ���
	$.each(a, function() {
		if (o[this.name]) {//����Ѿ��������name(�������ظ���input)
			if (!o[this.name].push) {//����ǲ���һ�����飬Ҳ���Ǵ�ʱΪ�ڶ�����ͬ��name
				o[this.name] = [ o[this.name] ];//�����Ϊ����
			}
			o[this.name].push(this.value || '');//��������ֵת��Ϊ�ַ�������ղű�õĵ�����
		} else {
			o[this.name] = this.value || '';//��������ظ�����ת��Ϊ�ַ���д��o����
		}
	});
	return o;
};*/