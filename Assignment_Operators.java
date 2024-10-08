package basicprogram;

public class Assignment_Operators {
	void add()
	{
		int a=5;
		int b=6;
		int Sum=a+b;
		System.out.println(Sum);
	}
	void sub()
	{
		int a=5;
		int b=6;
		int Sub=b-a;
		System.out.println(Sub);
	}
	
	void mul()
	{
	int a=5;
		int b=6;
		int mul=a*b;
		System.out.println(mul);
	}
	
	void div()
	{
	int a=5;
		int b=5;
		int div=a/b;
		System.out.println(div);
	}
	void mod()
	{
	int a=10;
		int b=5;
		int mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_Operators a1=new Assignment_Operators();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();
		
	}

}
