import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JButtonDemo extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel L1;
	ImageIcon ii;
	JButtonDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,35);
		Font f2 = new Font("Arial Black",Font.BOLD,30);
		Container c=getContentPane();
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,20,20);
	    setLayout(f);
		
		c.setBackground(Color.cyan);
		
		b1 = new JButton("Click");
		b1.setFont(f1);
		b1.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		
		L1 = new JLabel(                        );
		L1.setFont(f2);
		L1.setForeground(Color.red);
		
		ii = new ImageIcon("gaurav_logo.png");
		b2 = new JButton(                     );
		b2.setBackground(Color.cyan);
		
		c.add(b1);
		c.add(L1);
		c.add(b2);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		L1.setText("Gaurav Creation...");
		b2.setIcon(ii);
	}
	public static void main(String args[])
	{
		JButtonDemo jf=new JButtonDemo();
		jf.setVisible(true);
		jf.setTitle("JButton Demo");
		jf.setSize(700,700);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}