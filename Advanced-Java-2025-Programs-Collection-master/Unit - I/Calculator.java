import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	Label L1,L2,L3,L4;
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4;
	Calculator()
	{
		setLayout(null);
		
		Font f1 = new Font("Arial Black",Font.BOLD,40);
		Font f2 = new Font("Arial Black",Font.BOLD,25);
		setFont(f2);
		
		setBackground(Color.cyan);
		
		L1 = new Label("Calculator",Label.CENTER);
		L1.setFont(f1);
		L1.setForeground(Color.red);
		
		L2 = new Label("Enter 1st Number:",Label.RIGHT);
		L2.setForeground(Color.black);
		
		L3 = new Label("Enter 2nd Number:",Label.RIGHT);
		L3.setForeground(Color.black);
		
		L4 = new Label("Result:",Label.RIGHT);
		L4.setForeground(Color.black);
		
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		
		b1 = new Button("ADD");
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);
		
		b2 = new Button("SUB");
		b2.setForeground(Color.blue);
		b2.setBackground(Color.pink);
		
		b3 = new Button("MUL");
		b3.setForeground(Color.blue);
		b3.setBackground(Color.pink);
		
		b4 = new Button("DIV");
		b4.setForeground(Color.blue);
		b4.setBackground(Color.pink);
	
		L1.setBounds(100,70,400,50);
		L2.setBounds(50,170,250,30);
		tf1.setBounds(320,170,150,30);
		L3.setBounds(50,240,250,30);
		tf2.setBounds(320,240,150,30);
		L4.setBounds(50,310,250,30);
		tf3.setBounds(320,310,150,30);
		b1.setBounds(30,420,100,40);
		b2.setBounds(160,420,100,40);
		b3.setBounds(290,420,100,40);
		b4.setBounds(420,420,100,40);
	
		add(L1);
		add(L2);add(tf1);
		add(L3);add(tf2);
		add(L4);add(tf3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c;
		
		if(b1 == ae.getSource())
		{
			c = a + b;
			tf3.setText(c +" ");
		}
		else if(b2 == ae.getSource())
		{
			c = a - b;
			tf3.setText(c +" ");
		}
		else if(b3 == ae.getSource())
		{
			c = a * b;
			tf3.setText(c +" ");
		}
		else if(b4 == ae.getSource())
		{
			float d = (float)a / b;
			tf3.setText(d +" ");
		}
		
	}
	public static void main(String args[])
	{
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		c1.setTitle("Calculator");
		c1.setSize(550,550);
	}
}