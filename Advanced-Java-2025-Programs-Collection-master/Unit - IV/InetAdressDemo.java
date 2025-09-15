//InetAdress Class
import java.net.*;
class InetAdressDemo
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr);
		
		addr=InetAddress.getByName("www.facebook.com");
		System.out.println(addr);
		
		System.out.println("(www.google.com)Is Multicast Addresss="+addr.isMulticastAddress());

		InetAddress a[]=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
/*
Gaurav_patil/192.168.43.39
www.facebook.com/163.70.140.35
(www.google.com)Is Multicast Addresss=false
www.google.com/142.250.66.4
www.google.com/2404:6800:4009:824:0:0:0:2004
*/