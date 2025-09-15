//Label Class
import java.awt.*;
class LabelDemo extends Frame
{
	LabelDemo()
	{
		setLayout(null);
	
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		Label L1= new Label("C Lang");
		Label L2= new Label("C++ Lang");
		Label L3= new Label("Java Lang");
		Label L4= new Label("PHP Lang");
		Label L5= new Label();
		L5.setText("Python Lang");
		
		L1.setBounds(200,100,200,30);
		L2.setBounds(200,150,200,30);
		L3.setBounds(200,200,200,30);
		L4.setBounds(200,250,200,30);
		L5.setBounds(200,300,200,30);
		
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(L5);
	}
	public static void main(String args[])
	{
		LabelDemo f1 = new LabelDemo();
		f1.setVisible(true);
		f1.setTitle("Label Frame");
		f1.setSize(550,550);
	}
}