import java.awt.*;
import javax.swing.*;
class JTableDemo extends JFrame
{
	JTableDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();

		FlowLayout f = new FlowLayout(FlowLayout.CENTER,10,10);
		setLayout(f);
		
		c.setBackground(Color.cyan);
	
		String colHeads[] = {"RollNo","Name","Marks"};
		String data[][] = {
							{"1010","Gaurav","99.99"},
							{"1020","Vinod","98.90"},
							{"1030","Akash","95.80"},
							{"1040","Vitthal","94.50"},
							{"1050","Shivam","90.90"},
						  };
							
		JTable jt = new JTable(data,colHeads);
		jt.setBackground(Color.pink);
		jt.setForeground(Color.black);	
		jt.setFont(f1);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(jt,v,h);

		c.add(jsp);
	}
	public static void main(String args[])
	{
		JTableDemo jf=new JTableDemo();
		jf.setVisible(true);
		jf.setTitle("JTable Demo");
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}