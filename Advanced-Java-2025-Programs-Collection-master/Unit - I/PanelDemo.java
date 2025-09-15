import java.awt.*;
import java.awt.event.*;
class ParentClassPanel extends Panel
{
	ParentClassPanel()
	{
		Font f = new Font("Arial Black",Font.BOLD,20);
		setBackground(Color.pink);
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		Label L1=new Label("This is Panel Window");
		L1.setFont(f);
		Button b1=new Button("Panel");
		b1.setFont(f);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		add(L1);
		add(b1);
	}
}	
class PanelDemo extends Frame
{
	PanelDemo()
	{
		Font f = new Font("Arial Black",Font.BOLD,20);
		setBackground(Color.cyan);
		
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		Label L1=new Label("This is Frame Window");
		L1.setFont(f);
		Button b1=new Button("Frame");
		b1.setFont(f);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		add(L1);
		add(b1);
		
		ParentClassPanel p1 = new ParentClassPanel();
		add(p1);
	}
	public static void main(String args[])
	{
		PanelDemo f1 = new PanelDemo();
		f1.setVisible(true);
		f1.setTitle("Panel");
		f1.setSize(800,800);
	}
}