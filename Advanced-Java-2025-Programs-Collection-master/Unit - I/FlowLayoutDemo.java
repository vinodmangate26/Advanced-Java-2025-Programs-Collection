import java.awt.*;
class FlowLayoutDemo extends Frame
{
	FlowLayoutDemo()
	{
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,30,30);
		setLayout(f1);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		Button b1= new Button("Ok");
		b1.setBackground(Color.pink);
		Button b2= new Button("Cancel");
		b2.setBackground(Color.pink);
		Button b3= new Button("Retry");
		b3.setBackground(Color.pink);
		
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String args[])
	{
		FlowLayoutDemo f1 = new FlowLayoutDemo();
		f1.setVisible(true);
		f1.setTitle("FlowLayout Manager");
		f1.setSize(550,550);
	}
}