import java.awt.*;
import javax.swing.*;
class JPanel_1 extends JPanel
{
	JPanel_1()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		JButton b1= new JButton("Ok");
		b1.setFont(f1);
		b1.setBackground(Color.pink);
		
		JButton b2= new JButton("Cancel");
		b2.setFont(f1);
		b2.setBackground(Color.pink);
		
		JButton b3= new JButton("Retry");
		b3.setFont(f1);
		b3.setBackground(Color.pink);
		
		add(b1);
		add(b2);
		add(b3);
	}
}
class JPanel_2 extends JPanel
{
	JPanel_2()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f);
		
		setBackground(Color.yellow);
		setForeground(Color.black);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(f1);
		r1.setBackground(Color.yellow);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(f1);
		r2.setBackground(Color.yellow);
		
		JRadioButton r3 = new JRadioButton("Other");
		r3.setFont(f1);
		r3.setBackground(Color.yellow);
		
		add(r1);
		add(r2);
		add(r3);
	}
}
class JPanel_3 extends JPanel
{
	JPanel_3()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f);
		
		setBackground(Color.blue);
		setForeground(Color.black);
		
		JComboBox jcb = new JComboBox();
		jcb.setFont(f1);
		jcb.setBackground(Color.orange);
		jcb.addItem("C Lang");
		jcb.addItem("C++ Lang");
		jcb.addItem("Java Lang");
		jcb.addItem("PHP Lang");
		jcb.addItem("Python Lang");
		
		add(jcb);
	}
}
class JPanel_4 extends JPanel
{
	JPanel_4()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f);
		
		setBackground(Color.orange);
		setForeground(Color.black);
		
		JCheckBox c1 = new JCheckBox("C Lang");
		c1.setFont(f1);
		c1.setBackground(Color.orange);
		
		JCheckBox c2 = new JCheckBox("C++ Lang");
		c2.setFont(f1);
		c2.setBackground(Color.orange);
		
		JCheckBox c3 = new JCheckBox("Java Lang");
		c3.setFont(f1);
		c3.setBackground(Color.orange);
		
		JCheckBox c4 = new JCheckBox("PHP Lang");
		c4.setFont(f1);
		c4.setBackground(Color.orange);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
}
class JTabbedPaneDemo extends JFrame
{
	JTabbedPaneDemo()
	{
		Container c=getContentPane();
		
		c.setBackground(Color.gray);
		
		JTabbedPane jtp=new JTabbedPane();
		JPanel_1 p1 = new JPanel_1();
		JPanel_2 p2 = new JPanel_2();
		JPanel_3 p3 = new JPanel_3();
		JPanel_4 p4 = new JPanel_4();
		jtp.addTab("Tab 1",p1);
		jtp.addTab("Tab 2",p2);
		jtp.addTab("Tab 3",p3);
		jtp.addTab("Tab 4",p4);
		
		c.add(jtp);
	}
	public static void main(String args[])
	{
		JTabbedPaneDemo jf=new JTabbedPaneDemo();
		jf.setVisible(true);
		jf.setTitle("JTabbedPane Demo");
		jf.setSize(650,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}