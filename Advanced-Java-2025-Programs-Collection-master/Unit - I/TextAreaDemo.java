import java.awt.*;
class TextAreaDemo extends Frame
{
	TextAreaDemo()
	{
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		
		Font f = new Font("Arial Black",Font.BOLD,20);
		setFont(f);
		
		setBackground(Color.cyan);
		
		TextArea ta1 = new TextArea(10,15);
		ta1.setBackground(Color.pink);
		TextArea ta2 = new TextArea("Welcome to world of Java Programming",20,25,TextArea.SCROLLBARS_BOTH);
		ta2.setBackground(Color.pink);
		
		add(ta1);
		add(ta2);
	}
	public static void main(String args[])
	{
		TextAreaDemo ta = new TextAreaDemo();
		ta.setVisible(true);
		ta.setTitle("TextArea Demo");
		ta.setSize(800,700);
	}
}