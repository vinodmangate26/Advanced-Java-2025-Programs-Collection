//Class: ActionEvent & Interface: ActionListener
import java.awt.*;
import java.awt.event.*;
class ActionEventDemo extends Frame implements ActionListener
{
	Button b1,b2;
	Label L1;
	ActionEventDemo()
	{
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f);
		
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
		
		b1 = new Button("Ok");
		b1.setBackground(Color.pink);
		b2 = new Button("Cancel");
		b2.setBackground(Color.pink);
		L1 = new Label("                                          ");
		
		add(b1);
		add(b2);
		add(L1);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//String str=ae.getActionCommand();
		//if(str.equals("Ok"))
		if(ae.getSource()==b1)
		{
			L1.setText("Ok Button Pressed");
			L1.setForeground(Color.black);
		}
		else
		{
			L1.setText("Cancel Button Pressed");
			L1.setForeground(Color.black);
		}
	}
	public static void main(String args[])
	{
		ActionEventDemo f1 = new ActionEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("ActionEvent Frame");
	}
}