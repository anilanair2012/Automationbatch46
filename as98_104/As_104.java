package as98_104;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class As_104 {
@BeforeMethod
public static void k()
{
	System.out.println("a");
}
@Test
public static void l()
{
	System.out.println("b ");	
}
@AfterMethod
public static void m()
{
	System.out.println("c");
}
}
