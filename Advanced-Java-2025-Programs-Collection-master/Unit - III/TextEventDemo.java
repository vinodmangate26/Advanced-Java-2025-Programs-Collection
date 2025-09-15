//Class: TextEvent & Interface: TexListener
import java.awt.*;
import java.awt.event.*;
class TextEventDemo extends Frame implements TextListener
{
	Label L1;
	TextEventDemo()
	{
		setBackground(Color.cyan);
		
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f);
		
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
		
		TextField tf1 = new TextField(30);
		L1 = new Label("                                               ");
		add(tf1);
		add(L1);
		tf1.addTextListener(this);
	}
	public void textValueChanged(TextEvent ke)
	{
		L1.setText("TextEvent occurred");
	}
	public static void main(String args[])
	{
		TextEventDemo f1 = new TextEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("TextEvent Frame");
	}
}