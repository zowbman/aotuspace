//cookie验证
function getCookie(c_name)
{
   if (document.cookie.length>0)
{ 
   c_start=document.cookie.indexOf(c_name + "=")
   if (c_start!=-1)
{ 
   c_start=c_start + c_name.length+1 
   c_end=document.cookie.indexOf(";",c_start)
   if (c_end==-1) c_end=document.cookie.length
   return unescape(document.cookie.substring(c_start,c_end))
} 
}
   return ""
}

function setCookie(c_name,value,expiredays)
{
    var exdate=new Date()
    exdate.setDate(exdate.getDate()+expiredays)
    document.cookie=c_name+ "=" +escape(value)+((expiredays==null) ? "" : "; expires="+exdate.toGMTString())
}

//登陆验证
function login(){
	  var map={},temp={};
	  temp['spAccount']=$('#userName').val();
	  temp['spPassword']=$('#passWord').val();
	  map['spUserC']=temp;
	  
     // console.log(JSON.stringify(map));
	  $.ajax({
	    //同步异步
	    contentType:'application/json',//配置
	    type:'post',
	    url:'loginSubmit',//action
	  
	    data:JSON.stringify(map),//参数 form username:'123' passwrod:'123123'
	    
	    success:function(data){//回掉函数
	    	console.log(data);
	    	if(data.spCode==100000){
	    		setCookie('userName',$("#userName").val(),365);
	    		document.location.href="/aotuspace/index";
	    	}else{
	    		alert('error');
	    	}
	    }
	  })
};

//注册验证
function registered(){
	  var map={},temp={};
	  temp['spAccount']=$('#userName').val();
	  temp['spPassword']=$('#passWord').val();
	  map['spUser']=temp;
	  map['repPass']=$('#passWordAgain').val();
//   console.log(JSON.stringify(map));
	 $.ajax({
	    //同步异步
	    contentType:'application/json',//配置
	    type:'post',
	    url:'registerSubmit',//action
	  
	    data:JSON.stringify(map),//参数 form username:'123' passwrod:'123123'
	    
	    success:function(data){//回掉函数
           console.log(data);
	       if(data.spCode==100000){
	    	   
	    	  document.location.href="login";  
	       }else{
	    	   alert('error');
	       }
	    }
	  })
};




