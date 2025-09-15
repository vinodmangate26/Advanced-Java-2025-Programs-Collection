//Client Demo 
import java.net.*;
import java.io.*;
class ClientDemo
{
	public static void main(String args[])throws Exception
	{
		Socket s = new Socket("localhost",9090);
		OutputStream out = s.getOutputStream();
		
		byte str[] = "Hi Server".getBytes();
		out.write(str);
		s.close();
	}
}