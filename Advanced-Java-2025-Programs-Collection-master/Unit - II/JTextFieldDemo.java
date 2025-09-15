import java.awt.*;
import javax.swing.*;
class JTextFieldDemo extends JFrame
{
	JTextFieldDemo()
	{
		Font f = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER,10,10);
		c.setLayout(f1);
		
		c.setBackground(Color.cyan);
		
		JLabel L1=new JLabel("Enter Username:");
		L1.setFont(f);
		JLabel L2=new JLabel("Enter Password:");
		L2.setFont(f);
		JTextField tf1=new JTextField(20);
		tf1.setFont(f);
		JTextField tf2=new JTextField(20);
		tf2.setFont(f);
		JButton b1=new JButton("Login");
		b1.setFont(f);
		
		c.add(L1);
		c.add(tf1);
		c.add(L2);
		c.add(tf2);
		c.add(b1);
	}
	public static void main(String args[])
	{
		JTextFieldDemo jfd=new JTextFieldDemo();
		jfd.setVisible(true);
		jfd.setTitle("JTextField Demo");
		jfd.setSize(750,500);
		jfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}