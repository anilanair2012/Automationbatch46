/*"Assignment 20
WAP on Super keyword in java"*/
package basicprogram;
class Parent_1
{
	void login()
	{
	System.out.println("First");
	}
	
}
public class As20_superkeyword extends Parent_1 {

	void login()
	{
		System.out.println("second");
		super.login();
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		As20_superkeyword as2=new As20_superkeyword();
		as2.login();
	}

}




