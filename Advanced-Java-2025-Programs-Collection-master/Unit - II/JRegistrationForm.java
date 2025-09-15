import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JRegistrationForm extends JFrame implements ActionListener
{
	
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JButton b1;
	JRegistrationForm()
	{
		Container c = getContentPane();
		c.setLayout(null);
		setLayout(null);
		
		Font f1 = new Font("ALGERIAN",Font.BOLD,35);
		Font f2 = new Font("Arial Black",Font.BOLD,20);
		Font f3 = new Font("Arial Black",Font.BOLD,30);
		Font f4 = new Font("Arial Black",Font.BOLD,16);
		
		c.setBackground(Color.cyan);
		
		L1 = new JLabel("***Registration Form***");
		L1.setFont(f1);
		L1.setForeground(Color.red);
		
		L2 = new JLabel("Enter First Name:",JLabel.RIGHT);
		L2.setForeground(Color.black);
		L2.setFont(f2);
		L3 = new JLabel("Enter Last Name:",JLabel.RIGHT);
		L3.setForeground(Color.black);
		L3.setFont(f2);
		L4 = new JLabel("Enter  Address:",JLabel.RIGHT);
		L4.setForeground(Color.black);
		L4.setFont(f2);
		L5 = new JLabel("Enter Mobile No:",JLabel.RIGHT);
		L5.setForeground(Color.black);
		L5.setFont(f2);
		L6 = new JLabel("Enter Email ID:",JLabel.RIGHT);
		L6.setForeground(Color.black);
		L6.setFont(f2);
		L7 = new JLabel("Enter City Name:",JLabel.RIGHT);
		L7.setForeground(Color.black);
		L7.setFont(f2);
		L8 = new JLabel("Enter DOB:",JLabel.RIGHT);
		L8.setForeground(Color.black);
		L8.setFont(f2);
		L9 = new JLabel("        ",JLabel.CENTER);
		L9.setFont(f4);
		L9.setForeground(Color.red);

		tf1 = new JTextField(30);
		tf1.setFont(f2);
		tf2 = new JTextField(30);
		tf2.setFont(f2);
		tf3 = new JTextField(30);
		tf3.setFont(f2);
		tf4 = new JTextField(30);
		tf4.setFont(f2);
		tf5 = new JTextField(30);
		tf5.setFont(f2);
		tf6 = new JTextField(30);
		tf6.setFont(f2);
		tf7 = new JTextField(30);
		tf7.setFont(f2);
		
		b1 = new JButton("SUBMIT");
		b1.setFont(f3);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);

		L1.setBounds(120,70,500,50);
		L2.setBounds(100,200,220,30);
		tf1.setBounds(340,200,200,30);
		L3.setBounds(100,250,220,30);
		tf2.setBounds(340,250,200,30);
		L4.setBounds(100,300,220,30);
		tf3.setBounds(340,300,200,30);
		L5.setBounds(100,350,220,30);
		tf4.setBounds(340,350,200,30);
		L6.setBounds(100,400,220,30);
		tf5.setBounds(340,400,200,30);
		L7.setBounds(100,450,220,30);
		tf6.setBounds(340,450,200,30);
		L8.setBounds(100,500,220,30);
		tf7.setBounds(340,500,200,30);
		b1.setBounds(260,580,200,40);
		L9.setBounds(210,630,300,30);
	
		c.add(L1);
		c.add(L2);c.add(tf1);
		c.add(L3);c.add(tf2);
		c.add(L4);c.add(tf3);
		c.add(L5);c.add(tf4);
		c.add(L6);c.add(tf5);
		c.add(L7);c.add(tf6);
		c.add(L8);c.add(tf7);
		c.add(b1);
		c.add(L9);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String firstname = tf1.getText();
		String lastname  = tf2.getText();
		String address   = tf3.getText();
		String mobileno  = tf4.getText();
		String emailid   = tf5.getText();
		String cityname  = tf6.getText();
		String dob       = tf7.getText();
		
		if(firstname.isEmpty())
		{
			L9.setText("Please Enter Your First Name");
		}
		else if(lastname.isEmpty())
		{
			L9.setText("Please Enter Your Last Name");
		}
		else if(address.isEmpty())
		{
			L9.setText("Please Enter Your Address");
		}
		else if(mobileno.isEmpty())
		{
			L9.setText("Please Enter Your Mobile No");
		}
		else if(emailid.isEmpty())
		{
			L9.setText("Please Enter Your Emial ID");
		}
		else if(cityname.isEmpty())
		{
			L9.setText("Please Enter Your City Name");
		}
		else if(dob.isEmpty())
		{
			L9.setText("Please Enter Your DOB");
		}
		else
		{
			L9.setText("Registration Success...");
		}
	}
	public static void main(String args[])
	{
		JRegistrationForm jf = new JRegistrationForm();
		jf.setVisible(true);
		jf.setTitle("Registration Form");
		jf.setSize(700,750);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}