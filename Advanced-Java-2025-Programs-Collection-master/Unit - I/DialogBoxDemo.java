import java.awt.*;
import java.awt.event.*;
class DialogBoxDemo extends Frame
{
	public static void main(String args[])
	{
		Font fn = new Font("Arial Black",Font.BOLD,20);
		
		DialogBoxDemo f1 = new DialogBoxDemo();
		f1.setVisible(true);
		f1.setTitle("Dialog Box Frame");
		f1.setSize(600,600);
		f1.setBackground(Color.cyan);
		
		Dialog d1 = new Dialog(f1,"Dialog Box",false);
		d1.setVisible(true);
		d1.setSize(300,200);
		d1.setBackground(Color.pink);
		
		d1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		Button b1 = new Button("Ok");
		b1.setFont(fn);
		Button b2 = new Button("Cancel");
		b2.setFont(fn);
		Button b3 = new Button("Retry");
		b3.setFont(fn);
		
		d1.add(b1);
		d1.add(b2);
		d1.add(b3);
	}
}
