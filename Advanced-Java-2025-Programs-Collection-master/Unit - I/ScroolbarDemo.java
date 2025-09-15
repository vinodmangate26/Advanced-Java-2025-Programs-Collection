import java.awt.*;
class ScroolbarDemo extends Frame
{
	ScroolbarDemo()
	{
		setLayout(null);
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		
		Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
		sb1.setBackground(Color.pink);
		
		Scrollbar sb2 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);
		sb2.setBackground(Color.pink);
		
		sb1.setBounds(470,40,25,420);
		sb2.setBounds(10,470,460,25);
		
		add(sb1);
		add(sb2);
	}
	public static void main(String args[])
	{
		ScroolbarDemo sb = new ScroolbarDemo();
		sb.setVisible(true);
		sb.setTitle("Scroolbar Demo");
		sb.setSize(500,500);
	}
}