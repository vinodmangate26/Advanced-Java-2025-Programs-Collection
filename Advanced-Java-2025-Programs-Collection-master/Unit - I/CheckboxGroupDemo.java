import java.awt.*;
class CheckboxGroupDemo extends Frame
{
	CheckboxGroupDemo()
	{
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f1);
		
		Font f = new Font("Arial Black",Font.BOLD,16);
		setFont(f);
		
		setBackground(Color.cyan);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("Male",true,cbg);
		Checkbox c2 = new Checkbox("Female",false,cbg);
		Checkbox c3 = new Checkbox("Other",false,cbg);

		add(c1);
		add(c2);
		add(c3);
	}
	public static void main(String args[])
	{
		CheckboxGroupDemo cb = new CheckboxGroupDemo();
		cb.setVisible(true);
		cb.setTitle("CheckBox Group");
		cb.setSize(500,500);
	}
}