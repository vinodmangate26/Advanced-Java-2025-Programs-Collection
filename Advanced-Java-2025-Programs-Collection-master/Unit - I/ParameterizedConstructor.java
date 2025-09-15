// parameterized Constructor program
import java.awt.*;
class ParameterizedConstructor extends Frame
{
	ParameterizedConstructor(String Title)
	{
		super(Title);
	}
	public static void main(String args[])
	{
		ParameterizedConstructor d1= new ParameterizedConstructor("Gaurav Frame");
		d1.setVisible(true);
		d1.setSize(500,500);
	}
}