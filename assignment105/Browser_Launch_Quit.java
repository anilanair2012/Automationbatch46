package assignment105;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browser_Launch_Quit {
	ChromeDriver driver;
	
@BeforeMethod
public void launch()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
}

@AfterMethod
public void quit()
{
	driver.close();
}
}
