package as108_googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_1 {
	WebDriver driver;
	@DataProvider(name="search")
	public Object[][] method2()
	{
	
		return new Object[][] {{"Modi"},{"Bangalore"},{"Airpollution"}};
		
	}
	
@Test(dataProvider="search")
public void method2(String data)
{
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(data);
}
}
