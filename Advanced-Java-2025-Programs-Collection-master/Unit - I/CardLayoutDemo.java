import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CardLayoutDemo extends JFrame implements ActionListener
{
	
	CardLayout card;
	Container c;
	Button b1,b2,b3,b4,b5;
	CardLayoutDemo()
	{
		Font f = new Font("Arial Black",Font.BOLD,30);
		
		c=getContentPane();
		card=new CardLayout();
		c.setLayout(card);
		
		b1=new Button("C Lang");
		b1.setFont(f);
		b1.setBackground(Color.cyan);
		b2=new Button("c++ Lang");
		b2.setFont(f);
		b2.setBackground(Color.pink);
		b3=new Button("Java Lang");
		b3.setFont(f);
		b3.setBackground(Color.yellow);
		b4=new Button("PHP Lang");
		b4.setFont(f);
		b4.setBackground(Color.green);
		b5=new Button("Python Lang");
		b5.setFont(f);
		b5.setBackground(Color.red);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		c.add(b1,"a");
		c.add(b2,"b");
		c.add(b3,"c");
		c.add(b4,"d");
		c.add(b5,"e");
	}
	public void actionPerformed(ActionEvent ae)
	{
		card.next(c);
		//card.previous(c);
	}
	public static void main(String args[])
	{
		CardLayoutDemo f1 = new CardLayoutDemo();
		f1.setVisible(true);
		f1.setTitle("CardLayout Manager");
		f1.setSize(500,500);
	}
}