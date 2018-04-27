var ws=new WebSocket("ws://localhost:8889");




//打开Socket 
ws.onopen = function(event) { 
// 监听消息
	alert("websocket一打开");
	//ws.send("我是客户端       "  + new Date());
	$(".sender").click(function(){
		ws.send("我是客户端       "  + new Date());
		//alert("点击");

	});
};
ws.onmessage = function(msg) { 
//	alert(msg.data);

 alert(msg.data);
	//alert(msg.data);//输出一下服务器发送过来的消息
}; 

// 监听Socket的关闭
ws.onclose = function(msg) { 
 console.log('socket已经关闭'); 
}; 

