package basicprogram;

class Singlelevel{
	
	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
}

public class As14_Singleinheritance_static extends Singlelevel
{
	static void mul(int a,int b)
	{int mul=a*b;
	
		System.out.println(mul);
	}
	static void div(int a,int b)
	{int div=a/b;
	
		System.out.println(div);
	}
	public static void main(String[] args)
	{
		add(2,3);
		sub(5,3);
		mul(2,5);
		div(10,2);
	}
	}
