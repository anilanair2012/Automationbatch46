package assignment110;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Prerquisite {
	ChromeDriver driver;
	@BeforeMethod
	public void login() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions a1=new Actions(driver);
	WebElement e1=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	a1.moveToElement(e1).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Sign in")).click();
			
}
	@AfterMethod
	public void logout()
	{
		driver.close();
	}
}