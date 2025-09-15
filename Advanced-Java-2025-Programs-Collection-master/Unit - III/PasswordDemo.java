import java.awt.*;
import java.awt.event.*;
class PasswordDemo extends Frame implements ActionListener
{
	Button b1;
	Label L1;
	TextField tf1;
	PasswordDemo()
	{
		setBackground(Color.cyan);

		FlowLayout f = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f);
		
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
		
		L1 = new Label("Enter Password:");
		tf1 = new TextField(20);
		tf1.setEchoChar('*');
		b1 = new Button("Show Password");
		b1.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		
		add(L1);add(tf1);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Show Password"))
		{
			b1.setLabel("Hide Password");
			tf1.setEchoChar('\0');
		}
		else
		{
			b1.setLabel("Show Password");
			tf1.setEchoChar('*');
		}
	}
	public static void main(String args[])
	{
		PasswordDemo f1 = new PasswordDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("password Frame");
	}
}