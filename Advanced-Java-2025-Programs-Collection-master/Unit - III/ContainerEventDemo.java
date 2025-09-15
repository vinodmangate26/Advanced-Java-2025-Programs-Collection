//Class: ContainerEvent & Interface: ContainerListener
import java.awt.*;
import java.awt.event.*;
class ContainerEventDemo extends Frame implements ContainerListener
{
	ContainerEventDemo()
	{
		addContainerListener(this);
		setBackground(Color.cyan);
		Button b1 = new Button("OK");
		add(b1);
		remove(b1);
	}
	public void componentAdded(ContainerEvent ce)
	{
		System.out.println("Container Added...!!!");
	}
	public void componentRemoved(ContainerEvent ce)
	{
		System.out.println("Container Removed...!!!");
	}
	public static void main(String args[])
	{
		ContainerEventDemo f1 = new ContainerEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("ContainerEvent Frame");
	}
}