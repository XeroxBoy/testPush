package filter;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.java_websocket.WebSocketImpl;

import websocket.Websocket;

public class startFilter1 implements Filter {
	/** * 初始化 */ 
	public void init(FilterConfig fc) throws ServletException
	{ 
		this.startWebsocketOnline(); 
		}
	/** * 启动socket服务 */ 
	public void startWebsocketOnline() 
	{ 
		System.out.println("开始启动websocket");
		WebSocketImpl.DEBUG = false;
		int port =8889; // 端口
		Websocket s = null; 
		try { 
			s = new Websocket(port); 
			s.start(); 
			} catch (UnknownHostException e) 
			{
				System.out.println("启动websocket失败！"); 
				e.printStackTrace();
				} 
/*		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ip=addr.getHostAddress().toString();//获得本机IP
		System.out.print(ip);*/
		System.out.println("我是服务器端！");
		}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}
	}
	

