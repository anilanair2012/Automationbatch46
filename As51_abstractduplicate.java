package basicprogram;


interface grantparent11
{
	void method();
	void method2();
}
abstract class father11 implements grantparent11
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
public class As51_abstractduplicate extends father11
{
	void method7()
	{
	}
	void method8()
	{
	}
	public static void main(String[] args) {
		As51_abstractduplicate as=new As51_abstractduplicate();
		as.method2();
		}
		// TODO Auto-generated method stub
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
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


