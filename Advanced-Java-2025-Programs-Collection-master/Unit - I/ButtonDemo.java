//Button Class
import java.awt.*;
class ButtonDemo extends Frame
{
	ButtonDemo()
	{
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		Button b1= new Button("Ok");
		Button b2= new Button("Cancel");
		Button b3= new Button("Retry");
		
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String args[])
	{
		ButtonDemo f1 = new ButtonDemo();
		f1.setVisible(true);
		f1.setTitle("Button Frame");
		f1.setSize(550,550);
	}
}