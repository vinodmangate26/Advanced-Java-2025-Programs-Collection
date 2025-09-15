import java.awt.*;
import javax.swing.*;
class JDefaultFrame extends JFrame
{
	JDefaultFrame()
	{
		
	}
	public static void main(String args[])
	{
		JDefaultFrame jf= new JDefaultFrame();
		jf.setVisible(true);
		jf.setTitle("JFrame");
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}