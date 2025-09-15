//URL Class
import java.net.*;
class URLDemo
{
	public static void main(String args[])throws MalformedURLException
	{
		
		URL u1 = new URL("https://www.google.com:80/about.html");
		System.out.println("Protoclol="+u1.getProtocol());
		System.out.println("Host Name="+u1.getHost());
		System.out.println("Port Name="+u1.getPort());
		System.out.println("File path="+u1.getFile());
	}
}
/*
Protoclol=https
Host Name=www.google.com
Port Name=80
File path=/about.html
*/