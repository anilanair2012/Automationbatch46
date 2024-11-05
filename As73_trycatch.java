package basicprogram;
import java.util.InputMismatchException;
//import java.util.exc
import java.util.Scanner;

public class As73_trycatch {
	static int a;
	public static void main(String[] args) throws ArithmeticException ,InputMismatchException   {
		// TODO Auto-generated method stub
		
Scanner s1=new Scanner(System.in);

try {
	System.out.println("enter a");
	s1.nextInt();
int b=a/0;
System.out.println(b);
	}
catch(ArithmeticException a1)
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("enter a");
		System.out.println(s2.nextInt());	
	}
catch(InputMismatchException a1)
{
	Scanner s2=new Scanner(System.in);
	System.out.println("enter a");
	System.out.println(s2.nextInt());	
}
	finally
	{
	}
}
}
