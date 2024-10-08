/*
"Assignment 17:
WAP on Non Parameterised and non parametirised super calling statement (within different class)"*/

package basicprogram;
class One{
	One(int a)
	{
		System.out.println("First");
	}
	
}
class two extends One
{
	two()
	{
	super(2);
	System.out.println("second");
	}
}
public class AS17_Supercalling_Non_parametrizedboth extends two {

	AS17_Supercalling_Non_parametrizedboth()
{
	super();
System.out.println("last class");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AS17_Supercalling_Non_parametrizedboth ();
	}

}
