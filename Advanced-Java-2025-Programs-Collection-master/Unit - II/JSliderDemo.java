import java.awt.*;
import javax.swing.*;
class JSliderDemo extends JFrame
{
	JSliderDemo()
	{
		Container c=getContentPane();

		setLayout(null);
		
		c.setBackground(Color.cyan);

		JSlider js = new JSlider(0,300,50);
		js.setBackground(Color.cyan);
		js.setBounds(100,200,300,50);

		c.add(js);
	}
	public static void main(String args[])
	{
		JSliderDemo jf=new JSliderDemo();
		jf.setVisible(true);
		jf.setTitle("JSlider Demo");
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}