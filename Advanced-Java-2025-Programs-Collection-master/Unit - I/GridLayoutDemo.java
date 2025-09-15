import java.awt.*;
class GridLayoutDemo extends Frame
{
	GridLayoutDemo()
	{
		GridLayout gl = new GridLayout(5,5,10,10);
		setLayout(gl);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		Button b[] = new Button[26];
		for(int i=1;i<=25;i++)
		{
			// add(new Button("Button"+i));
			b[i] = new Button("Button"+i);
			b[i].setBackground(Color.pink);
			add(b[i]);
		}
		
	}
	public static void main(String args[])
	{
		GridLayoutDemo g1 = new GridLayoutDemo();
		g1.setVisible(true);
		g1.setTitle("GridLayout Manager");
		g1.setSize(600,600);
	}
}