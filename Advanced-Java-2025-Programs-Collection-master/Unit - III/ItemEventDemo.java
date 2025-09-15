//Class: ItemEvent & Interface: ItemListener
import java.awt.*;
import java.awt.event.*;
class ItemEventDemo extends Frame implements ItemListener
{
	Checkbox c1;
	Label L1;
	ItemEventDemo()
	{
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f);
		
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
		
		c1 = new Checkbox("India");
		L1 = new Label("                                                              ");
		
		add(c1);
		add(L1);
		c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		L1.setText("You have selected India Checkbox");
		L1.setForeground(Color.black);
	}
	public static void main(String args[])
	{
		ItemEventDemo f1 = new ItemEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("ItemEvent Frame");
	}
}