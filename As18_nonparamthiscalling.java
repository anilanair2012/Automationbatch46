/*"Assignment 18
WAP on parameterized and non-parameterized this calling statement in java"*/
package basicprogram;

public class As18_nonparamthiscalling {
	As18_nonparamthiscalling (int a)
	{
		System.out.println("printfirst");	
	}
	As18_nonparamthiscalling ()
	{
		this(2);
		System.out.println("printsecond");	
	}
	As18_nonparamthiscalling (String b)
	{
		this();
		System.out.println("printlast");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new As18_nonparamthiscalling("b");
	}

}
