import java.awt.*;
class ChoiceDemo extends Frame
{
	ChoiceDemo()
	{
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,50,50);
		setLayout(f1);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		
		Choice c1 = new Choice();
		c1.add("C Lang");
		c1.add("C++ Lang");
		c1.add("Java Lang");
		c1.add("PHP Lang");
		c1.add("Python Lang");

		add(c1);
	}
	public static void main(String args[])
	{
		ChoiceDemo cd = new ChoiceDemo();
		cd.setVisible(true);
		cd.setTitle("Choice Demo");
		cd.setSize(500,500);
	}
}