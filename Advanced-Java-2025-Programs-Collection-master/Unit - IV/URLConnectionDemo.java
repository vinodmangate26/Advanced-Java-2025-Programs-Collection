//URLConnection Class
import java.net.*;
import java.util.*;
class URLConnectionDemo
{
	public static void main(String args[])throws Exception
	{
		
		URL u1=new URL("https://www.google.com");
		URLConnection u2=u1.openConnection();
		
		System.out.println("Date="+new Date(u2.getDate()));
		System.out.println("Type of contents="+(u2.getContentType()));
		System.out.println("length of contents="+(u2.getContentLength()));
		System.out.println("Expiration Date="+new Date(u2.getExpiration()));
		System.out.println("Last Modified Date="+new Date(u2.getLastModified()));
	}
}
/*
Date=Sat Sep 07 15:42:26 IST 2024
Type of contents=text/html; charset=ISO-8859-1
length of contents=-1
Expiration Date=Thu Jan 01 05:30:00 IST 1970
Last Modified Date=Thu Jan 01 05:30:00 IST 1970
*/