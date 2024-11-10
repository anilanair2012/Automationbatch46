package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As80_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://amazon.com");
driver.manage().window().maximize();
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().refresh();
driver.navigate().to("https://amazon.com");
WebElement e2=driver.findElement(By.linkText("Customer Service"));
e2.click();
	}

}
