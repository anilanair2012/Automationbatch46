package assignment105;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launchamazon_searchproduct extends Browser_Launch_Quit {
@Test
public void product()
{
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoe");
	e1.sendKeys(Keys.ENTER);
}
}
