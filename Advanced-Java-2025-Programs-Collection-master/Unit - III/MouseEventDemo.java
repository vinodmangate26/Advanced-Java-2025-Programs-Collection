//Class: MouseEvent & Interface: MouseListener
import java.awt.*;
import java.awt.event.*;
class MouseEventDemo extends Frame implements MouseListener,MouseMotionListener
{
	MouseEventDemo()
	{
		setBackground(Color.cyan);
		
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f);
		
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
		
		TextField tf1 = new TextField(30);
		add(tf1);
		tf1.addMouseListener(this);
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse Entered Event Occured...!!!");
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("Mouse Exited Event Occured...!!!");
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse Dragged Event Occured...!!!");
	}
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse Pressed Event Occured...!!!");
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released Event Occured...!!!");
	}
	public void mouseMoved(MouseEvent me)
	{
		System.out.println("Mouse Moved Event Occured...!!!");
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked Event Occured...!!!");
	}
	public static void main(String args[])
	{
		MouseEventDemo f1 = new MouseEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("MouseEvent Frame");
	}
}