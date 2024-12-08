package assignmnt106;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class crossbrowser {
	WebDriver driver;
@BeforeMethod
@Parameters("Browser")
public void launch(String nameofbrowser)
{
	if(nameofbrowser.equals("Chrome"))
{
		driver=new ChromeDriver();
		//driver.manage().window().maximize();	
}
	if(nameofbrowser.equals("Edge"))
	{
			driver=new EdgeDriver();
			//driver.manage().window().maximize();	
	}
}
	@AfterMethod
	public void quit()
	{
		driver.close();
	}
}

