import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class JAppletDemo extends JApplet
{
	public void paint(Graphics g)
	{
		Font f1 = new Font("Arial Black",Font.BOLD,20);
		g.drawString("Welcome to world  of Java Programming!!!",50,100);
		setFont(f1);
	}
}
/*<applet code="JAppletDemo.class" width=500 height=500>
</applet>*/