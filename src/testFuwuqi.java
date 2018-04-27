import java.net.InetAddress;
import java.net.UnknownHostException;


public class testFuwuqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ip=addr.getHostAddress().toString();//获得本机IP
System.out.print(ip);
	}

}
