package basicprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As88_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("MOBILE");
Thread.sleep(2000);
List<WebElement>s1=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
Thread.sleep(2000);
int length=s1.size();
System.out.println(length);
for(int i=0;i<length;i++)
{
	WebElement s2=s1.get(i);
	String s3=s2.getText();
	System.out.println(s3);
	
}

s1.get(2).click();

	}

}
