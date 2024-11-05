package basicprogram;
class object
{
	void sub()
	{
		System.out.println("perform subtraction");
	}
}
class parento extends object{
	void add()
	{
		System.out.println("perform addition");	
	}
}
public class As76_class_Typecasting extends parento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parento p1	=new As76_class_Typecasting();//upcasting
		p1.add();
		p1.sub();
		As76_class_Typecasting c1=(As76_class_Typecasting) p1;//downcasting
		child c2=new child();
		c2.mult();
	}

}
class child extends As76_class_Typecasting
{
	void mult()
	{
		System.out.println("perform multiplication");
	}
	}
