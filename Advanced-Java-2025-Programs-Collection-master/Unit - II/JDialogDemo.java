import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JDialogDemo extends JFrame implements ActionListener
{
	JDialog jd;
	JDialogDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,30);
		Font f2 = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();
		
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,40,40);
		c.setLayout(f);
		
		c.setBackground(Color.cyan);

		JButton b1 = new JButton("Display Dialog Window");
		b1.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		b1.setFont(f1);
		
		JButton b2 = new JButton("Ok");
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.red);
		b2.setFont(f2);
		
		JButton b3 = new JButton("Cancel");
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.red);
		b3.setFont(f2);
		
		JButton b4 = new JButton("Retry");
		b4.setBackground(Color.yellow);
		b4.setForeground(Color.red);
		b4.setFont(f2);
		
		jd = new JDialog(this,"Dialog Window",true);
		jd.setSize(500,500);
		jd.setLayout(f);
		jd.getContentPane().setBackground(Color.pink);
		
		jd.add(b2);
		jd.add(b3);
		jd.add(b4);
		
		c.add(b1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		jd.setVisible(true);
	}
	public static void main(String args[])
	{
		JDialogDemo jf=new JDialogDemo();
		jf.setVisible(true);
		jf.setTitle("JDialog Demo");
		jf.setSize(800,800);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}