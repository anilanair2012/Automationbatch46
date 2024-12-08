package as98_104;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class As_99 {
@BeforeMethod
public static void one()
{
	System.out.println("beforemethod");
}
@Test
public static void two()
{
	System.out.println("test");
}
@AfterSuite
public static void  three()
{
	System.out.println("aftersuite");
}
}
