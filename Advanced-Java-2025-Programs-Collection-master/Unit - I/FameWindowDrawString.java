//Displaying information within frame window.
import java.awt.*;
class FameWindowDrawString extends Frame
{
	FameWindowDrawString()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
	}
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		setForeground(Color.black);
		g.drawString("Welcome to world of Java Programming",50,200);
	}
	public static void main(String args[])
	{
		FameWindowDrawString f1 = new FameWindowDrawString();
		f1.setVisible(true);
		f1.setTitle("My Frame");
		f1.setSize(550,550);
	}
}