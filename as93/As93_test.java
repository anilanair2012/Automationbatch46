package as93;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class As93_test {
	WebDriver driver;
@Test
public void method1()
{
driver=new ChromeDriver();
driver.get("https://amazon.in");

}
}
