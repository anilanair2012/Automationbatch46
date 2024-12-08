package as98_104;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class As_103 {
@BeforeMethod
public static void e()
{
	System.out.println("a");	
}
@Test
public static void g() {
	System.out.println("b");
}


@Test
public static void h() {
	System.out.println("d");	
}
@Test
public static void i()
{
	System.out.println("e");
}
@AfterMethod
public static void j()
{
	System.out.println("c");
}

}
