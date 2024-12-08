package as98_104;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class As_102 {
@BeforeMethod
public static void a()
{
	System.out.println("a");
}
@Test
public static void b()
{
	System.out.println("b");
}
@Test
public static void c()
{
	System.out.println("d");	
}
@AfterMethod
public static void d()
{
	System.out.println("c");
}
}

