
 setTimeout(function(){
    Push();
//  alert("setTimeout called");
},1500);



function Push(){
    $.ajax({
        type:"POST",
        url:"login3",
        data:{},
      //  beforeSend:function(){},
        error: function(){
            $("body").append("<br>"+"请求失败");
           Push();
        },
        success: function(data1){
        	var data = eval("("+data1+")");
        	 var $iframe = $("<iframe id='frame' name='polling' style='display: none;' src='login3'></iframe>");    
             $("body").append($iframe);
             $iframe.load(function () {
                 $("#logs").append("[data: " +data.num + " ]<br/>");
                
                 $iframe.remove();
                 
                 // 递归
                 Push();
             });
          
        }

 
    });
}