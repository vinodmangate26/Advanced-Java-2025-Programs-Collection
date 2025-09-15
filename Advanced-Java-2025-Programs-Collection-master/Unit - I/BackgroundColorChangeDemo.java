import java.awt.*;
import java.awt.event.*;
class BackgroundColorChangeDemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;
	BackgroundColorChangeDemo()
	{
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,30,30);
		setLayout(f1);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		
		b1 = new Button("Yellow");
		b1.setBackground(Color.pink);
		b2 = new Button("Blue");
		b2.setBackground(Color.pink);
		b3 = new Button("Green");
		b3.setBackground(Color.pink);
		b4 = new Button("Red");
		b4.setBackground(Color.pink);
		b5 = new Button("Gray");	
		b5.setBackground(Color.pink);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals("Yellow"))
		{
			setBackground(Color.yellow);
		}
		else if(str.equals("Blue"))
		{
			setBackground(Color.blue);
		}
		else if(b3 == ae.getSource())
		{
			setBackground(Color.green);
		}
		else if(b4 == ae.getSource())
		{
			setBackground(Color.red);
		}
		else if(b5 == ae.getSource())
		{
			setBackground(Color.gray);
		}
	}
	public static void main(String args[])
	{
		BackgroundColorChangeDemo b1 = new BackgroundColorChangeDemo();
		b1.setVisible(true);
		b1.setTitle("Change Background Color");
		b1.setSize(600,600);
	}
}