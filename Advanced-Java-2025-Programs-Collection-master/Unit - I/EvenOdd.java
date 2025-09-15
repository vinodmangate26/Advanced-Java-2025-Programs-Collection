import java.awt.*;
import java.awt.event.*;
class EvenOdd extends Frame implements ActionListener
{
	Label L1,L2,L3;
	TextField tf1,tf2;
	Button b1;
	EvenOdd()
	{
		setLayout(null);
		
		Font f1 = new Font("Arial Black",Font.BOLD,35);
		Font f2 = new Font("Arial Black",Font.BOLD,20);
		Font f3 = new Font("Arial Black",Font.BOLD,30);
		Font f4 = new Font("Arial Black",Font.BOLD,16);
		setFont(f2);
		
		setBackground(Color.cyan);
		
		L1 = new Label("***Check EVEN/ODD***");
		L1.setFont(f1);
		L1.setForeground(Color.red);

		L2 = new Label("Enter Any Number:",Label.RIGHT);
		L2.setForeground(Color.black);
		L3 = new Label("Result:",Label.RIGHT);
		L3.setForeground(Color.black);

		tf1 = new TextField(30);
		tf2 = new TextField(30);

		b1 = new Button("EVEN/ODD");
		b1.setFont(f4);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);
		
		L1.setBounds(120,100,400,50);
		L2.setBounds(80,230,200,30);
		tf1.setBounds(300,230,200,30);
		L3.setBounds(80,290,200,30);
		tf2.setBounds(300,290,200,30);
		b1.setBounds(270,400,150,50);
		
		add(L1);
		add(L2);add(tf1);
		add(L3);add(tf2);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int no = Integer.parseInt(tf1.getText());
		
		if(no%2==0)
		{
			tf2.setText("Even No");
		}
		else
		{
			tf2.setText("Odd No");
		}
	}
	public static void main(String args[])
	{
		EvenOdd e1 = new EvenOdd();
		e1.setVisible(true);
		e1.setTitle("EVEN/ODD Frame");
		e1.setSize(600,600);
	}
}