//cookie��֤
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

//��½��֤
function login(){
	  var map={},temp={};
	  temp['spAccount']=$('#userName').val();
	  temp['spPassword']=$('#passWord').val();
	  map['spUserC']=temp;
	  
     // console.log(JSON.stringify(map));
	  $.ajax({
	    //ͬ���첽
	    contentType:'application/json',//����
	    type:'post',
	    url:'loginSubmit',//action
	  
	    data:JSON.stringify(map),//���� form username:'123' passwrod:'123123'
	    
	    success:function(data){//�ص�����
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

//ע����֤
function registered(){
	  var map={},temp={};
	  temp['spAccount']=$('#userName').val();
	  temp['spPassword']=$('#passWord').val();
	  map['spUser']=temp;
	  map['repPass']=$('#passWordAgain').val();
//   console.log(JSON.stringify(map));
	 $.ajax({
	    //ͬ���첽
	    contentType:'application/json',//����
	    type:'post',
	    url:'registerSubmit',//action
	  
	    data:JSON.stringify(map),//���� form username:'123' passwrod:'123123'
	    
	    success:function(data){//�ص�����
           console.log(data);
	       if(data.spCode==100000){
	    	   
	    	  document.location.href="login";  
	       }else{
	    	   alert('error');
	       }
	    }
	  })
};




