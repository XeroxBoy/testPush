
 setTimeout(function(){
    Push();
//  alert("setTimeout called");
},1500);



function Push(){
    $.ajax({
        type:"POST",
        url:"login2",
        data:{},
      //  beforeSend:function(){},
        error: function(){
            $("body").append("<br>"+"请求失败");
           Push();
        },
        success: function(data1){
        	var data = eval("("+data1+")");
            if(data!=null){

                $("#tongzhi-content").html(data.num);//更新提示内容中的数量部分
                $("#tongzhi").show();//消息提示内容，整个部分都显示出来
                $("body").append("<br>"+"年龄:        "+data.age+"   回复时间:"+data.time);
                Push();
        }
            Push();
            }
    });
}