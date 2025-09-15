import java.awt.*;
class BorderLayoutDemo extends Frame
{
	BorderLayoutDemo()
	{
		 BorderLayout bl = new BorderLayout(20,20);
		setLayout(bl);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		Button b1=new Button("EAST REGION");
		b1.setBackground(Color.pink);
		Button b2=new Button("WEST REGION");
		b2.setBackground(Color.pink);
		Button b3=new Button("SOUTH REGION");
		b3.setBackground(Color.pink);
		Button b4=new Button("NORTH REGION");
		b4.setBackground(Color.pink);
		
		TextArea ta1=new TextArea("Welcome to world of Java Programming...");
		ta1.setForeground(Color.white);
		ta1.setBackground(Color.gray);
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
		add(ta1,BorderLayout.CENTER);
		
	}
	public static void main(String args[])
	{
		BorderLayoutDemo b1 = new BorderLayoutDemo();
		b1.setVisible(true);
		b1.setTitle("BorderLayout Manager");
		b1.setSize(700,700);
	}
}