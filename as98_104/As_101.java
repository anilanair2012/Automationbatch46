package as98_104;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class As_101 {
@Test(priority=-1)
public static void seven()
{
	System.out.println("test1");
}

@Test
public static void eight()
{
	System.out.println("test2");
}
@AfterMethod
public static void nine()
{
	System.out.println("quit");
}
}