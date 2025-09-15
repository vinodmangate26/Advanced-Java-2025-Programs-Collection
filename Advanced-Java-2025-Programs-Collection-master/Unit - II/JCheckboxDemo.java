import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JCheckboxDemo extends JFrame implements ItemListener
{
	JCheckBox c1,c2,c3,c4,c5;
	JLabel L1;
	JCheckboxDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,30);
		Font f2 = new Font("Arial Black",Font.BOLD,35);
		Container c=getContentPane();
	    setLayout(null);
		
		c.setBackground(Color.cyan);
		c.setForeground(Color.black);
		
		c1 = new JCheckBox("C Lang");
		c1.setFont(f1);
		c1.setBackground(Color.cyan);
		
		c2 = new JCheckBox("C++ Lang");
		c2.setFont(f1);
		c2.setBackground(Color.cyan);
		
		c3 = new JCheckBox("Java Lang");
		c3.setFont(f1);
		c3.setBackground(Color.cyan);
		
		c4 = new JCheckBox("PHP Lang");
		c4.setFont(f1);
		c4.setBackground(Color.cyan);
		
		c5 = new JCheckBox("Python Lang");
		c5.setFont(f1);
		c5.setBackground(Color.cyan);
		
		L1 = new JLabel(           );
		L1.setFont(f2);
		L1.setForeground(Color.red);
		
		c1.setBounds(150,100,250,30);
		c2.setBounds(150,150,250,30);
		c3.setBounds(150,200,250,30);
		c4.setBounds(150,250,250,30);
		c5.setBounds(150,300,250,30);
		L1.setBounds(50,400,500,40);
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(L1);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.isSelected())
		{
			L1.setText(c1.getText()+" is Selected");
		}
		else if(c2.isSelected())
		{
			L1.setText(c2.getText()+" is Selected");
		}
		else if(c3.isSelected())
		{
			L1.setText(c3.getText()+" is Selected");
		}
		else if(c4.isSelected())
		{
			L1.setText(c4.getText()+" is Selected");
		}
		else if(c5.isSelected())
		{
			L1.setText(c5.getText()+" is Selected");
		}
	}
	public static void main(String args[])
	{
		JCheckboxDemo jf=new JCheckboxDemo();
		jf.setVisible(true);
		jf.setTitle("JCheckbox Demo");
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}