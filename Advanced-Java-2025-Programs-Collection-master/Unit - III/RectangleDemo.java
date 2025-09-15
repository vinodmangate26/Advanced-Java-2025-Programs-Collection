import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class RectangleDemo extends Applet implements ActionListener
{
	int flag=0;
	public void init()
	{
		Button b1=new Button("Red");
		Button b2=new Button("Green");
		Button b3=new Button("Blue");
		add(b1);add(b2);add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Red"))
		{
			flag=1;
			repaint();
		}
		else if(str.equals("Green"))
		{
			flag=2;
			repaint();
		}
		else if(str.equals("Blue"))
		{
		flag=3;
		repaint();
		}
	}
	public void paint(Graphics g)
	{
		if(flag==1)
		{
			g.setColor(Color.red);
		}
		else if(flag==2)
		{
			g.setColor(Color.green);
		}
		else if(flag==3)
		{
			g.setColor(Color.blue);
		}
		g.fillRect(200,200,200,100);
	}
}
/*<applet code="RectangleDemo.class" width=600 height=600>
</applet>*/