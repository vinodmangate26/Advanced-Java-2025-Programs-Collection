import java.awt.*;
import java.awt.event.*;
class FrameWindowCloseDemo extends Frame implements WindowListener
{
	FrameWindowCloseDemo()
	{
		setBackground(Color.cyan);
		addWindowListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		dispose();
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowActivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	
	public static void main(String args[])
	{
		FrameWindowCloseDemo f1 = new FrameWindowCloseDemo();
		f1.setVisible(true);
		f1.setTitle("frame Window close");
		f1.setSize(500,500);
	}
}
