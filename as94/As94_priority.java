package as94;

import org.testng.annotations.Test;

public class As94_priority {
@Test(priority=-1)
public void method1()
{
System.out.println("first");	
}
@Test(priority=-2)
public void method2()
{
System.out.println("second");	
}

}