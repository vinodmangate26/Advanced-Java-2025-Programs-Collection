import java.awt.*;
import java.awt.event.*;
class CheckBoxEventDemo extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,c4,c5;
	Label L1;
	CheckBoxEventDemo()
	{
		setLayout(null);
		
		Font f = new Font("Arial Black",Font.BOLD,16);
		setFont(f);
		
		setBackground(Color.cyan);
		
		c1 = new Checkbox("C Lang");
		c2 = new Checkbox("C++ Lang");
		c3 = new Checkbox("Java Lang");
		c4 = new Checkbox("PHP Lang");
		c5 = new Checkbox("Python Lang");
		
		L1 = new Label("        ",Label.CENTER);
		L1.setForeground(Color.red);
		
		c1.setBounds(200,100,200,30);
		c2.setBounds(200,150,200,30);
		c3.setBounds(200,200,200,30);
		c4.setBounds(200,250,200,30);
		c5.setBounds(200,300,200,30);
		L1.setBounds(100,370,300,30);

		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(L1);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState())
		{
			L1.setText("You Have selected "+c1.getLabel());
		}
		else if(c2.getState())
		{
			L1.setText("You Have selected "+c2.getLabel());
		}	
		else if(c3.getState())
		{
			L1.setText("You Have selected "+c3.getLabel());
		}
		else if(c4.getState())
		{
			L1.setText("You Have selected "+c4.getLabel());
		}
		else if(c5.getState())
		{
			L1.setText("You Have selected "+c5.getLabel());
		}
	}
	public static void main(String args[])
	{
		CheckBoxEventDemo cb = new CheckBoxEventDemo();
		cb.setVisible(true);
		cb.setTitle("CheckBox Event Handling");
		cb.setSize(500,500);
	}
}