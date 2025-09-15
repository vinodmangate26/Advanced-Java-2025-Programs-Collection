import java.awt.*;
import java.awt.event.*;
class LoginPage extends Frame implements ActionListener
{
	Label L1,L2,L3,L4,L5;
	TextField tf1,tf2;
	Button b1;
	LoginPage()
	{
		setLayout(null);
		
		Font f1 = new Font("Arial Black",Font.BOLD,40);
		Font f2 = new Font("Arial Black",Font.BOLD,30);
		Font f3 = new Font("Arial Black",Font.BOLD,20);
		Font f4 = new Font("Arial Black",Font.BOLD,25);
		Font f5 = new Font("Arial Black",Font.BOLD,16);
		setFont(f3);
		
		setBackground(Color.cyan);
		
		L1 = new Label("Gaurav Creation");
		L1.setFont(f1);
		L1.setForeground(Color.red);
		
		L2 = new Label("Login Form",Label.CENTER);
		L2.setFont(f2);
		L2.setForeground(Color.blue);
		
		L3 = new Label("Username:",Label.RIGHT);
		L3.setForeground(Color.black);
		
		L4 = new Label("password:",Label.RIGHT);
		L4.setForeground(Color.black);
		
		L5 = new Label("        ",Label.CENTER);
		L5.setFont(f5);
		L5.setForeground(Color.red);
		
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf2.setEchoChar('*');
		
		b1 = new Button("Login");
		b1.setFont(f4);
		
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);
		
		L1.setBounds(150,70,400,50);
		L2.setBounds(200,150,200,40);
		L3.setBounds(120,270,150,30);
		tf1.setBounds(290,270,200,30);
		L4.setBounds(120,330,150,30);
		tf2.setBounds(290,330,200,30);
		b1.setBounds(260,430,100,40);
		L5.setBounds(200,490,250,30);
	
		add(L1);
		add(L2);
		add(L3);add(tf1);
		add(L4);add(tf2);
		add(L5);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String user = tf1.getText();
		String psw = tf2.getText();
		
		if(user.isEmpty())
		{
			L5.setText("Please Enter Your Username...");
		}
		else if(psw.isEmpty())
		{
			L5.setText("Please Enter Your Password...");
		}
		else if(user.equals("Gaurav") && psw.equals("Gaurav"))
		{
			L5.setText("Login Success...");
		}
		else
		{
			L5.setText("Login Fail...");
		}
	}
	public static void main(String args[])
	{
		LoginPage l1 = new LoginPage();
		l1.setVisible(true);
		l1.setTitle("Login Page");
		l1.setSize(600,600);
	}
}