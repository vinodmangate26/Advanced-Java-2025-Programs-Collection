import java.awt.*;
import javax.swing.*;
class JParameterizedFrame extends JFrame
{
	JParameterizedFrame(String title)
	{
		super(title);
	}
	public static void main(String args[])
	{
		JParameterizedFrame jf= new JParameterizedFrame("JFrame");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}