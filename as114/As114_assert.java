package as114;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class As114_assert {
	@Test
	public void methodlogin() throws InterruptedException
	{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions a1=new Actions(driver);
	WebElement e1=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	a1.moveToElement(e1).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("ap_email")).sendKeys("9495989216");
	driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']")).click();
	
	driver.findElement(By.id("ap_password")).sendKeys("Pournami@123");	
	driver.findElement(By.id("signInSubmit")).click();
	WebElement e3=driver.findElement(By.id("twotabsearchtextbox"));
Assert.assertEquals(e3.isDisplayed(), true);
	Assert.assertEquals(e3.isEnabled(), true);
}}
