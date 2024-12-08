package assignment111;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flipkartsearchtwodimen {
	@DataProvider(name="logindetails")
	
		
	public Object[][] method1()
	{
		Object data[][]=new Object[5][1];
		data[0][0]="mobile";
		data[1][0]="shoe";
		data[2][0]="book";
		data[3][0]="pencil";
		data[4][0]="pen";
		return data;
		
	}
	
	
	@Test(dataProvider="logindetails")
public void login(String input) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.in/");
	driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys(input);
Thread.sleep(2000);
//driver.findElement(By.className("MJG8Up")).sendKeys(Keys.ENTER);
driver.close();
	
}
}
