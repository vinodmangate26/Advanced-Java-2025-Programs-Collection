import java.awt.*;
import javax.swing.*;
class JScrollPaneDemo extends JFrame
{
	JScrollPaneDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();
		
		JTextArea ta1 = new JTextArea("Wlcome to world of Java Programming");
		ta1.setFont(f1);
		ta1.setBackground(Color.cyan);
		ta1.setForeground(Color.black);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(ta1,v,h);

		c.add(jsp);
	}
	public static void main(String args[])
	{
		JScrollPaneDemo jf=new JScrollPaneDemo();
		jf.setVisible(true);
		jf.setTitle("JScrollPane Demo");
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}