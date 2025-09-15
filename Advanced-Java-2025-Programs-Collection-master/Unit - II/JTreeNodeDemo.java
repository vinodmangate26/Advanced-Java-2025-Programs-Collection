import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
class JTreeNodeDemo extends JFrame
{
	JTreeNodeDemo()
	{
		Container c1=getContentPane();
		
		BorderLayout b1 = new BorderLayout();
		
		c1.setBackground(Color.cyan);
		c1.setForeground(Color.black);
		
		DefaultMutableTreeNode lang = new DefaultMutableTreeNode("Language");
		
		DefaultMutableTreeNode pop = new DefaultMutableTreeNode("POP Lang");
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("C Lang");
		DefaultMutableTreeNode pascal = new DefaultMutableTreeNode("Pascal Lang");
		DefaultMutableTreeNode fortran = new DefaultMutableTreeNode("Fortran Lang");
		
		DefaultMutableTreeNode oop = new DefaultMutableTreeNode("OOP Lang");
		DefaultMutableTreeNode cpp= new DefaultMutableTreeNode("C++ Lang");
		DefaultMutableTreeNode java= new DefaultMutableTreeNode("Java Lang");
		DefaultMutableTreeNode python= new DefaultMutableTreeNode("Python Lang");
		
		lang.add(pop);
		lang.add(oop);
		
		pop.add(c);
		pop.add(pascal);
		pop.add(fortran);
		
		oop.add(cpp);
		oop.add(java);
		oop.add(python);
		
		JTree jt = new JTree(lang);
		jt.setBackground(Color.pink);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(jt,v,h);

		c1.add(jsp,BorderLayout.WEST);
	}
	public static void main(String args[])
	{
		JTreeNodeDemo jf=new JTreeNodeDemo();
		jf.setVisible(true);
		jf.setTitle("JTreeNode Demo");
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}