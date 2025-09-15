//Class: ComponenetEvent & Interface: ComponentListener
import java.awt.*;
import java.awt.event.*;
class ComponentEventDemo extends Frame implements ComponentListener
{
	ComponentEventDemo()
	{
		setBackground(Color.cyan);
		addComponentListener(this);
	}
	public void componentMoved(ComponentEvent ce)
	{
		System.out.println("Componenet Moved...!!!");
	}
	public void componentResized(ComponentEvent ce)
	{
		System.out.println("Componenet Resized...!!!");
	}
	public void componentShown(ComponentEvent ce)
	{
		System.out.println("Componenet Shown...!!!");
	}
	public void componentHidden(ComponentEvent ce)
	{
		System.out.println("Componenet Hidden...!!!");
	}
	public static void main(String args[])
	{
		ComponentEventDemo f1 = new ComponentEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("ComponenetEvent Frame");
	}
}