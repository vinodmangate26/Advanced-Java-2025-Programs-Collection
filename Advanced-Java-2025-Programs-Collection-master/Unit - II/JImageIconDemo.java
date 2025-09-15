import java.awt.*;
import javax.swing.*;
class JImageIconDemo extends JFrame
{
	JImageIconDemo()
	{
		Container c = getContentPane();
		FlowLayout f1=new FlowLayout();
		c.setLayout(f1);
		c.setBackground(Color.cyan);
		ImageIcon ii=new ImageIcon("gaurav_logo.png");
		JLabel L1=new JLabel(ii);
		c.add(L1);
	}
	public static void main(String args[])
	{
		JImageIconDemo jf= new JImageIconDemo();
		jf.setVisible(true);
		jf.setTitle("JFrame");
		jf.setSize(700,700);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}