package amazonfirstproject.Project1_Amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_1.class)

public class Testcase_1 extends Brpwser_launch  {
	
@Test
	
	//@Test(retryAnalyzer = amazonfirstproject.IretryAnalyzer_1.class)
public void startnewuser() throws IOException
{
	
	Homepage hp=new Homepage(driver);
	hp.newuser(driver);

	Registration r1=new Registration(driver);
	r1.registration(driver);
	
}

}
