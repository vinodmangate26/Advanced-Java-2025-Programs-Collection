import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JRadioButtonDemo extends JFrame implements ItemListener
{
	JRadioButton r1,r2,r3;
	JRadioButtonDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f);
		
		c.setBackground(Color.cyan);
		c.setForeground(Color.black);
		
		r1 = new JRadioButton("Male");
		r1.setFont(f1);
		r1.setBackground(Color.cyan);
		
		r2 = new JRadioButton("Female");
		r2.setFont(f1);
		r2.setBackground(Color.cyan);
		
		r3 = new JRadioButton("Other");
		r3.setFont(f1);
		r3.setBackground(Color.cyan);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		c.add(r1);
		c.add(r2);
		c.add(r3);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(r1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You Are Male");
			//This Method is used to display the Message on Current Frame.
			r1.setBackground(Color.pink);
		}
		else if(r2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You Are Female");
			r2.setBackground(Color.pink);
		}
		else if(r3.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You have Selected Other");
			r3.setBackground(Color.pink);
		}
	}
	public static void main(String args[])
	{
		JRadioButtonDemo jf=new JRadioButtonDemo();
		jf.setVisible(true);
		jf.setTitle("JRadioButton Demo");
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}