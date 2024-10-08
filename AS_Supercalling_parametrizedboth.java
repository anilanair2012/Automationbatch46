/*"Assignment 18
WAP on Parameterised and non parametrized super calling statement (within multiple class)"*/

package basicprogram;

class first
{
first()

{
	
System.out.println("First");
}}
class second extends first
{
second(int a,String b)	
{
	super();
	System.out.println("second");	
}
}

public class AS_Supercalling_parametrizedboth extends second{
	AS_Supercalling_parametrizedboth(int a)
	{
		super(2,"3");
		System.out.println("Last");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AS_Supercalling_parametrizedboth (5);
	}
}

