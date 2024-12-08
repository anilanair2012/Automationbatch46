package assignment109;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_1 {
@DataProvider(name="data1")
public Object[][] method()
{
	return new Object[][] {{"Modi"},{"Bangalore"},{"Airpollution"}};
}
	WebDriver driver;
	
	@Test(dataProvider="data1")
	public void serach(String input)
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(input);	
		
	}
}
