package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
WebElement  e1=driver.findElement(By.xpath("//a[@title='Become a Seller']"));
Actions a1=new Actions(driver);
a1.contextClick(e1).perform();


	}

}
