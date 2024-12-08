package as98_104;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class As_98 {
	@BeforeSuite
	public static void login()
	{
		System.out.println("beforesuite");
	}
	@Test
	public static void regis()
	{
		System.out.println("test");	
	}
   @Test
public static void regis2()
{
	   System.out.println("test2");
}
@AfterSuite
public static void logout()
{
	System.out.println("afteresuite");	
}
}
