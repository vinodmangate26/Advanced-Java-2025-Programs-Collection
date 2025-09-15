import java.awt.*;
import java.awt.event.*;
class Notepad extends Frame implements ActionListener
{
	MenuItem m12,m13,m14,m15;
	Notepad()
	{
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		
		setBackground(Color.cyan);
		
		MenuBar mbr = new MenuBar();
		
		Menu m1 = new Menu("File");
		MenuItem m11 = new MenuItem("New");
		m12 = new MenuItem("Open");
		m13 = new MenuItem("Save");
		m14 = new MenuItem("Save As");
		m15 = new MenuItem("Save All");
		MenuItem m16 = new MenuItem("Rename...");
		MenuItem m17 = new MenuItem("Close");
		MenuItem m18 = new MenuItem("Close All");
		
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m1.add(m15);
		m1.add(m16);
		m1.add(m17);
		m1.add(m18);
		
		
		Menu m2 = new Menu("Edit");
		MenuItem m21 = new MenuItem("Undo");
		MenuItem m22 = new MenuItem("Redo");
		MenuItem m23 = new MenuItem("Cut");
		MenuItem m24 = new MenuItem("Copy");
		MenuItem m25 = new MenuItem("Paste");
		MenuItem m26 = new MenuItem("Delete");
		MenuItem m27 = new MenuItem("Select All");
		Menu m28 = new Menu("Insert");
		MenuItem m281 = new MenuItem("Date Time (Short)");
		MenuItem m282 = new MenuItem("Date Time (long)");
		MenuItem m283 = new MenuItem("Date Time (Customized)");
		
		m28.add(m281);
		m28.add(m282);
		m28.add(m283);
		
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		m2.add(m25);
		m2.add(m26);
		m2.add(m27);
		m2.add(m28);
		
		Menu m3 = new Menu("Search");
		MenuItem m31 = new MenuItem("Find...");
		MenuItem m32 = new MenuItem("Find in Files...");
		MenuItem m33 = new MenuItem("Find Next");
		MenuItem m34 = new MenuItem("Find Previous");
		MenuItem m35 = new MenuItem("Select and Find Next");
		MenuItem m36 = new MenuItem("Select and Find Previous");
		MenuItem m37 = new MenuItem("Go to...");
		MenuItem m38 = new MenuItem("Bookmark");
		
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		m3.add(m34);
		m3.add(m35);
		m3.add(m36);
		m3.add(m37);
		m3.add(m38);
		
		Menu m4 = new Menu("View");
		Menu m41 = new Menu("Zoom");
		MenuItem m411 = new MenuItem("Zoom In");
		MenuItem m412 = new MenuItem("Zoom Out");
		
		m41.add(m411);
		m41.add(m412);
		
		MenuItem m42 = new MenuItem("Tab");
		CheckboxMenuItem m43 = new CheckboxMenuItem("Word Wrap");
		MenuItem m44 = new MenuItem("Hide Lines");
		
		m4.add(m41);
		m4.add(m42);
		m4.add(m43);
		m4.add(m44);
		
		Menu m5 = new Menu("Language");
		MenuItem m51 = new MenuItem("C Lang");
		MenuItem m52 = new MenuItem("C++ Lang");
		MenuItem m53 = new MenuItem("Java Lang");
		MenuItem m54 = new MenuItem("PHP Lang");
		MenuItem m55 = new MenuItem("Python Lang");
		
		m5.add(m51);
		m5.add(m52);
		m5.add(m53);
		m5.add(m54);
		m5.add(m55);
	
		Menu m6 = new Menu("Settings");
		MenuItem m61 = new MenuItem("About us");
		MenuItem m62 = new MenuItem("Contact us");
		MenuItem m63 = new MenuItem("My profile");
		MenuItem m64 = new MenuItem("Log Out");
		
		m6.add(m61);
		m6.add(m62);
		m6.add(m63);
		m6.add(m64);
		
		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		mbr.add(m4);
		mbr.add(m5);
		mbr.add(m6);
		
		m12.addActionListener(this);
		m13.addActionListener(this);
		m14.addActionListener(this);
		m15.addActionListener(this);
		
		setMenuBar(mbr);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==m12)
		{
			FileDialog fd1 = new FileDialog(this,"Open",FileDialog.LOAD);
			fd1.setVisible(true);
		}
		else if(ae.getSource()==m13)
		{
			FileDialog fd2 = new FileDialog(this,"Save",FileDialog.SAVE);
			fd2.setVisible(true);
		}
		else if(ae.getSource()==m14)
		{
			FileDialog fd3 = new FileDialog(this,"Save As",FileDialog.SAVE);
			fd3.setVisible(true);
		}
		else if(ae.getSource()==m15)
		{
			FileDialog fd4 = new FileDialog(this,"Save All",FileDialog.SAVE);
			fd4.setVisible(true);
		}
	}
	public static void main(String args[])
	{
		Notepad n1 = new Notepad();
		n1.setVisible(true);
		n1.setTitle("Notepad");
		n1.setSize(800,800);
	}
}