package as96;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Timeout {
@Test(timeOut=1000)
public void method1()
{
	
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://google.in");
	WebElement e1 = driver.findElement(By.name("q"));
	e1.sendKeys("Book");
	List<WebElement> elements = driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
	
}
}
