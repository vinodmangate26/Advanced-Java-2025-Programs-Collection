import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JLoginPage extends JFrame implements ActionListener
{
	JLabel L1,L2,L3,L4,L5;
	JTextField tf1,tf2;
	JButton b1;
	JLoginPage()
	{
		Container c = getContentPane();
		c.setLayout(null);
		Font f1 = new Font("ALGERIAN",Font.BOLD,45);
		Font f2 = new Font("Britannic Bold",Font.BOLD,40);
		Font f3 = new Font("Arial Black",Font.BOLD,20);
		Font f4 = new Font("Arial Black",Font.BOLD,25);
		Font f5 = new Font("Arial Black",Font.BOLD,16);
		
		c.setBackground(Color.cyan);
		
		L1 = new JLabel("Gaurav Creation");
		L1.setFont(f1);
		L1.setForeground(Color.red);
		
		L2 = new JLabel("Login Form",JLabel.CENTER);
		L2.setFont(f2);
		L2.setForeground(Color.blue);
		
		L3 = new JLabel("Username:",JLabel.RIGHT);
		L3.setFont(f3);
		L3.setForeground(Color.black);
		
		L4 = new JLabel("password:",JLabel.RIGHT);
		L4.setFont(f3);
		L4.setForeground(Color.black);
		
		L5 = new JLabel("        ",JLabel.CENTER);
		L5.setFont(f5);
		L5.setForeground(Color.red);
		
		tf1 = new JTextField(30);
		tf1.setFont(f3);
		tf1.setForeground(Color.black);
		tf2 = new JPasswordField(30);
		tf2.setFont(f3);
		tf2.setForeground(Color.black);
		
		b1 = new JButton("Login");
		b1.setFont(f4);
		
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);
		
		L1.setBounds(110,70,450,50);
		L2.setBounds(170,150,300,40);
		L3.setBounds(120,270,150,30);
		tf1.setBounds(290,270,200,30);
		L4.setBounds(120,330,150,30);
		tf2.setBounds(290,330,200,30);
		b1.setBounds(260,430,150,40);
		L5.setBounds(180,490,300,30);
	
		c.add(L1);
		c.add(L2);
		c.add(L3);c.add(tf1);
		c.add(L4);c.add(tf2);
		c.add(L5);
		c.add(b1);
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
		JLoginPage jf = new JLoginPage();
		jf.setVisible(true);
		jf.setTitle("Login Page");
		jf.setSize(650,650);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}