//Class: KeyEvent & Interface: KeyListener
import java.awt.*;
import java.awt.event.*;
class KeyEventDemo extends Frame implements KeyListener
{
	KeyEventDemo()
	{
		setBackground(Color.cyan);
		
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f);
		
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
		
		TextField tf1 = new TextField(30);
		add(tf1);
		tf1.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		System.out.println("Key Pressed...!!!");
	}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("Key Typed...!!!");
	}
	public void keyReleased(KeyEvent ke)
	{
		System.out.println("Key Released...!!!");
	}
	public static void main(String args[])
	{
		KeyEventDemo f1 = new KeyEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("KeyEvent Frame");
	}
}