package as116;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_1.class)
public class As116_screenshot extends Listener_1 {
	
	
	
@Test
public void method1() throws IOException
{
	driver=new EdgeDriver();
	driver.get("https://google.in");
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("shoe");
	
}

}

