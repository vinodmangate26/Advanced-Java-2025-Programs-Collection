import java.awt.*;
class ListDemo extends Frame
{
	ListDemo()
	{
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,50,50);
		setLayout(f1);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		
		List L1 = new List();
		L1.add("C Lang");
		L1.add("C++ Lang");
		L1.add("Java Lang");
		L1.add("PHP Lang");
		L1.add("Python Lang");

		add(L1);
	}
	public static void main(String args[])
	{
		ListDemo Ld = new ListDemo();
		Ld.setVisible(true);
		Ld.setTitle("List Demo");
		Ld.setSize(500,500);
	}
}