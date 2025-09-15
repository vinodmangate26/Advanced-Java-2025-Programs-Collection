import java.awt.*;
import javax.swing.*;
class JTextAreaDemo extends JFrame
{
	JTextAreaDemo()
	{
		Font f = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f1);
		
		c.setBackground(Color.cyan);
		c.setForeground(Color.black);
		
		JTextArea jta1 = new JTextArea(10,10);
		jta1.setFont(f);
		jta1.setBackground(Color.pink);
		JTextArea jta2 = new JTextArea("Wlcome to world of Java Programming",20,20);
		jta2.setFont(f);
		jta2.setBackground(Color.pink);
		
		c.add(jta1);
		c.add(jta2);
	}
	public static void main(String args[])
	{
		JTextAreaDemo jf=new JTextAreaDemo();
		jf.setVisible(true);
		jf.setTitle("JTextArea Demo");
		jf.setSize(800,700);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}