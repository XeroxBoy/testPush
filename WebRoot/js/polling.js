/*setTimeout(function(){
    Push();
    //alert("setInterval called");
},3000);
setInterval(function(){
    Push();
    //alert("setInterval called");
},1000);
function Push(){
	$.ajax(
			{
				type:"post",
			   url:"testPollingServlet",
			
				success:function(data){
                    if( data.age!=0){
                    	$("#name").html(obj.name);
                    	$("#age").html(obj.age);
                    	$("#big").show();
                        $("#log").append( "[data]:    " +
                        		data+"<br>");
                  
           
				}
			
} });
}*/
 setTimeout(function(){
    Push();
//  alert("setTimeout called");
},1500);

setInterval(function(){
    Push();
    //alert("setInterval called");
},3000);

function Push(){
    $.ajax({
        type:"POST",
        url:"login1",
        data:{},
      //  beforeSend:function(){},
        success: function(data1){
        	var data = eval("("+data1+")");
            if(data!=null){

                $("#tongzhi-content").html(data.num);//更新提示内容中的数量部分
                $("#tongzhi").show();//消息提示内容，整个部分都显示出来
                $("body").append("<br>"+"年龄:        "+data.age);
            


        }}
    });
}