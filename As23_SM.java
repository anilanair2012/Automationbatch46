/*WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM*/
 package basicprogram;
 class grantparent
 {
	 void method1()
	 {
	 }
	 void method2()
	 {
	 }
	 }
 abstract class father extends grantparent
 {
	 abstract void method3();
	 abstract void method4();
	 void method5()
	 {
	 }
	 void method6()
	 {
	 }
	 }
 

public class As23_SM extends father{
	void method7()
	{
	}
	void method8()
	{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		As23_SM as=new As23_SM();
		as.method1();
		as.method2();
		as.method3();
		as.method4();
		as.method5();
		as.method6();
		as.method7();
		as.method8();
		

	}
	@Override
	void method3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void method4() {
		// TODO Auto-generated method stub
		
	}

}
