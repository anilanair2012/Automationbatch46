package as95;

import org.testng.annotations.Test;

public class As95_disable {
@Test(enabled=false)
public void method1()
{
	System.out.println("method1 is disabled");
}
@Test()
public void method2()
{
	System.out.println("method2 is enabled");
}
}
