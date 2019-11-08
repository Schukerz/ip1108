package ipandhost;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class iptest {

	public static void main(String[] args) throws Exception {
		InetAddress address = InetAddress.getByName("douban.com");
		String hostAddress = address.getHostAddress();
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		System.out.println(address.getAddress());
		System.out.println(address.getLocalHost());
		
	}
}
