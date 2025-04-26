package amazonfirstproject.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class Brpwser_launch extends Listeners_1 {
	//WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new EdgeDriver();
		//driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


/*@AfterMethod
	public void close() {
	driver.quit();
	}*/
	
}
