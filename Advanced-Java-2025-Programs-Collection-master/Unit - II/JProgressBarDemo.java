import java.awt.*;
import javax.swing.*;
class JProgressBarDemo extends JFrame
{
	JProgressBar jpb;
	JProgressBarDemo()
	{
		Font f1 = new Font("Cambria",Font.BOLD,20);
		Container c=getContentPane();

		setLayout(null);
		
		c.setBackground(Color.cyan);
	
		jpb = new JProgressBar(0,3000);
		jpb.setValue(0);
		jpb.setBounds(150,200,200,30);
		jpb.setStringPainted(true);

		c.add(jpb);
	}
	public void changeProgressBarValue() throws Exception
	{
		int i=0;
		while(i<=3000)
		{
			jpb.setValue(i);
			i=i+50;
			
			Thread.sleep(500);
		}
	}
	public static void main(String args[])
	{
		JProgressBarDemo jf=new JProgressBarDemo();
		jf.setVisible(true);
		jf.setTitle("JProgressBar Demo");
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try
		{
			jf.changeProgressBarValue();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}