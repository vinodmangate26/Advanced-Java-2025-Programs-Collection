import java.awt.*;
import java.awt.event.*;
class FileDialogDemo extends Frame
{
	public static void main(String args[])
	{
		FileDialogDemo f1 = new FileDialogDemo();
		f1.setVisible(true);
		f1.setTitle("File Dialog");
		f1.setSize(700,700);
		f1.setBackground(Color.cyan);
		
		FileDialog fd1 = new FileDialog(f1,"Save",FileDialog.SAVE);
		//FileDialog fd2 = new FileDialog(f1,"Open",FileDialog.LOAD);
		
		fd1.setVisible(true);

	}
}
