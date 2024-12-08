package as98_104;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_1 {

	@Test(priority=1,invocationCount=10)
	
		public static void method1()
		{
		}
		@Test(priority=-1,enabled=false)
		public static void method2()
		{
		}
		@Test(timeOut=1000)
		public void method3()
		{
			ChromeDriver driver=new ChromeDriver();
		}
		
		}
	

