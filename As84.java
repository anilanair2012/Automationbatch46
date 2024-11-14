package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.navigate().to("https://www.flipkart.com/");
WebElement e1=driver.findElement(By.xpath("//span[.='Login']"));
Actions a1=new Actions(driver);
a1.doubleClick(e1).perform();
	}

}
