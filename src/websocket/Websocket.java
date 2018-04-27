package websocket;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
public class Websocket extends WebSocketServer {

	

	public Websocket(int port) throws UnknownHostException {
		super(new InetSocketAddress(port));
		System.out.print("端口"+port);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onClose(WebSocket conn, int message, String reason, boolean remote) {
		// TODO Auto-generated method stub
	WebsocketService.removeUser(conn);
	WebsocketService.sendMessage("用户下线了");
	}

	@Override
	public void onError(WebSocket arg0, Exception arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMessage(WebSocket conn, String message) {
		// TODO Auto-generated method stub
		System.out.println("进来了");
		message=message.toString();
         System.out.println(message);
		if(message!=null){
			//将用户加入
			WebsocketService.addUser(message, conn);
	 WebsocketService.sendMessage("系统时间"+new Date().toString());
	
		}
	}

	
	@Override
	public void onOpen(WebSocket arg0, ClientHandshake arg1) {
		// TODO Auto-generated method stub
		
	}
/**/
	}
	


