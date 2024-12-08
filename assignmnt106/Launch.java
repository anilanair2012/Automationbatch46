package assignmnt106;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Launch extends crossbrowser  {
@Test
public void search ()
{
	{
		driver.get("https://www.amazon.in/");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
	}
}
}
