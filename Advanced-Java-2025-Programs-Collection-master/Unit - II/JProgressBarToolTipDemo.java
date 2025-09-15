import java.awt.*;
import javax.swing.*;
class JProgressBarToolTipDemo extends JFrame
{
	JProgressBar jpb;
	JProgressBarToolTipDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		Container c=getContentPane();

		setLayout(null);
		
		c.setBackground(Color.cyan);

		jpb = new JProgressBar(0,3000);
		jpb.setValue(0);
		jpb.setBounds(150,200,200,30);
		jpb.setStringPainted(true);
		jpb.setToolTipText("This is Progress Bar");

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
		JProgressBarToolTipDemo jf=new JProgressBarToolTipDemo();
		jf.setVisible(true);
		jf.setTitle("JProgressBarToolTip Demo");
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