import java.awt.*;
import javax.swing.*;
class JComboBoxDemo extends JFrame
{
	JComboBoxDemo()
	{
		Font f = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f1);
		
		c.setBackground(Color.cyan);
		c.setForeground(Color.black);
		
		JComboBox jcb = new JComboBox();
		jcb.setFont(f);
		jcb.setBackground(Color.orange);
		jcb.addItem("C Lang");
		jcb.addItem("C++ Lang");
		jcb.addItem("Java Lang");
		jcb.addItem("PHP Lang");
		jcb.addItem("Python Lang");
		
		c.add(jcb);
	}
	public static void main(String args[])
	{
		JComboBoxDemo jf=new JComboBoxDemo();
		jf.setVisible(true);
		jf.setTitle("JComboBox Demo");
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}