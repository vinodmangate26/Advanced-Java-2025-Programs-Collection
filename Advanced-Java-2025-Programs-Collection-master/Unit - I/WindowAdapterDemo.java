import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame
{
	FrameDemo()
	{
		Font f = new Font("Arial Black",Font.BOLD,20);
		setBackground(Color.cyan);
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		Button b1 = new Button("Ok");
		b1.setFont(f);
		b1.setBackground(Color.pink);
		Button b2 = new Button("Cancel");
		b2.setFont(f);
		b2.setBackground(Color.pink);
		Button b3 = new Button("Retry");
		b3.setFont(f);
		b3.setBackground(Color.pink);
		
		add(b1);
		add(b2);
		add(b3);
	}
}
class WindowAdapterDemo extends WindowAdapter
{
	FrameDemo f1;
	WindowAdapterDemo()
	{
		f1=new FrameDemo();
		f1.setVisible(true);
		f1.setTitle("Frame");
		f1.setSize(600,600);
		f1.addWindowListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		f1.dispose();
	}
	public static void main(String args[])
	{
		WindowAdapterDemo w1=new WindowAdapterDemo();
	}
}