package ipandhost;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class iptest2 {

	public static void main(String[] args) throws Exception {
//		InetAddress address = InetAddress.getByName("douban.com");
//		String hostAddress = address.getHostAddress();
//		System.out.println(address.getHostName());
//		System.out.println(address.getHostAddress());
//		System.out.println(address.getAddress());
//		System.out.println(address.getLocalHost());
		URL url = new URL("http://14.215.177.38/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=%E8%B1%86%E7%93%A3&rsv_pq=9be57129002114b2&rsv_t=bb6a26KtiheX4VUTjrYO%2BjJUf4eycxQ2PfYoFD3p2ok6dgN4H3Fgpo5cHBo&rqlang=cn&rsv_enter=1&rsv_dl=tb&rsv_sug3=7&rsv_sug1=2&rsv_sug7=100&rsv_sug2=0&inputT=1065&rsv_sug4=1065");
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getContent());
		
	}
}
