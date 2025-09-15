import java.awt.*;
class CheckboxDemo extends Frame
{
	CheckboxDemo()
	{
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f1);
		
		Font f = new Font("Arial Black",Font.BOLD,16);
		setFont(f);
		
		setBackground(Color.cyan);
		
		Checkbox c1 = new Checkbox("C Lang");
		Checkbox c2 = new Checkbox("C++ Lang");
		Checkbox c3 = new Checkbox("Java Lang");
		Checkbox c4 = new Checkbox("PHP Lang");

		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
	public static void main(String args[])
	{
		CheckboxDemo cb = new CheckboxDemo();
		cb.setVisible(true);
		cb.setTitle("CheckBox");
		cb.setSize(600,600);
	}
}