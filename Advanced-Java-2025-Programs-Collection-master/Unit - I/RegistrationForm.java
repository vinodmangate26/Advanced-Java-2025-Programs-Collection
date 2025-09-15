import java.awt.*;
import java.awt.event.*;
class RegistrationForm extends Frame implements ActionListener
{
	
	Label L1,L2,L3,L4,L5,L6,L7,L8,L9;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	Button b1;
	RegistrationForm()
	{
		setLayout(null);
		
		Font f1 = new Font("Arial Black",Font.BOLD,35);
		Font f2 = new Font("Arial Black",Font.BOLD,20);
		Font f3 = new Font("Arial Black",Font.BOLD,30);
		Font f4 = new Font("Arial Black",Font.BOLD,16);
		setFont(f2);
		
		setBackground(Color.cyan);
		
		L1 = new Label("***Registration Form***");
		L1.setFont(f1);
		L1.setForeground(Color.red);
		
		L2 = new Label("Enter First Name:",Label.RIGHT);
		L2.setForeground(Color.black);
		L3 = new Label("Enter Last Name:",Label.RIGHT);
		L3.setForeground(Color.black);
		L4 = new Label("Enter  Address:",Label.RIGHT);
		L4.setForeground(Color.black);
		L5 = new Label("Enter Mobile No:",Label.RIGHT);
		L5.setForeground(Color.black);
		L6 = new Label("Enter Email ID:",Label.RIGHT);
		L6.setForeground(Color.black);
		L7 = new Label("Enter City Name:",Label.RIGHT);
		L7.setForeground(Color.black);
		L8 = new Label("Enter DOB:",Label.RIGHT);
		L8.setForeground(Color.black);
		L9 = new Label("        ",Label.CENTER);
		L9.setFont(f4);
		L9.setForeground(Color.red);

		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		tf4 = new TextField(30);
		tf5 = new TextField(30);
		tf6 = new TextField(30);
		tf7 = new TextField(30);
		
		b1 = new Button("SUBMIT");
		b1.setFont(f3);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);

		L1.setBounds(100,70,400,50);
		L2.setBounds(70,200,200,30);
		tf1.setBounds(290,200,200,30);
		L3.setBounds(70,250,200,30);
		tf2.setBounds(290,250,200,30);
		L4.setBounds(70,300,200,30);
		tf3.setBounds(290,300,200,30);
		L5.setBounds(70,350,200,30);
		tf4.setBounds(290,350,200,30);
		L6.setBounds(70,400,200,30);
		tf5.setBounds(290,400,200,30);
		L7.setBounds(70,450,200,30);
		tf6.setBounds(290,450,200,30);
		L8.setBounds(70,500,200,30);
		tf7.setBounds(290,500,200,30);
		b1.setBounds(220,580,150,40);
		L9.setBounds(170,630,250,30);
	
		add(L1);
		add(L2);add(tf1);
		add(L3);add(tf2);
		add(L4);add(tf3);
		add(L5);add(tf4);
		add(L6);add(tf5);
		add(L7);add(tf6);
		add(L8);add(tf7);
		add(b1);
		add(L9);
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
		RegistrationForm r1 = new RegistrationForm();
		r1.setVisible(true);
		r1.setTitle("Registration Form");
		r1.setSize(600,700);
	}
}