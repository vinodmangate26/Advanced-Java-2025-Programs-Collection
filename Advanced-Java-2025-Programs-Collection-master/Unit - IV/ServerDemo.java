//Server Demo 
import java.net.*;
import java.io.*;
class ServerDemo
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss = new ServerSocket(9090);
		Socket s1 = ss.accept();
		InputStream in = s1.getInputStream();
		
		int c;
		while((c=in.read())!= -1)
		{
			System.out.print((char)c);
		}
		ss.close();
	}
}