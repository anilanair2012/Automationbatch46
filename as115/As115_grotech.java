package as115;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class As115_grotech {
@Test
public void regis() throws InterruptedException
{
	String text="C:\\\\Users\\\\anila\\\\OneDrive\\\\Desktop\\\\Anila_Pan";

	EdgeDriver driver=new EdgeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	driver.findElement(By.id("fname")).sendKeys("ANILA");
	driver.findElement(By.id("lname")).sendKeys("Nair");
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Abc@2");
	driver.findElement(By.id("male")).click();
	WebElement e1=driver.findElement(By.id("Skills"));

	Select s1=new Select(e1);
	Thread.sleep(2000);
	s1.selectByVisibleText("Technical skills");
	WebElement e2=driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[8]"));
	Thread.sleep(2000);
	Select s2=new Select(e2);
	s2.selectByValue("Python");
	WebElement e3=driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[9]"));
	Thread.sleep(2000);
	Select s3=new Select(e3);
	s3.selectByIndex(0);
	driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[10]")).sendKeys("ANILANJALI");
	driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[11]")).sendKeys("ANILANJALI1");
	driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[12]")).sendKeys("123456");
	WebElement e4=driver.findElement(By.xpath("(//div[@class='form-group col-md-6'])[13]"));
	Thread.sleep(2000);
	Select s4=new Select(e4);
	s4.selectByIndex(0);
	
	WebElement file = driver.findElement(By.id("file"));
Thread.sleep(2000);
	file.sendKeys(text);
	WebElement relocate = driver.findElement(By.id("relocate"));

	relocate.click();
	driver.findElement(By.linkText("Submit")).click();
	Thread.sleep(2000);
	
	
}
}
