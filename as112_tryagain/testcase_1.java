package as112_tryagain;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase_1 {
@Test(retryAnalyzer=as112_tryagain.Retry_1.class)
public void method()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
}
	
}

