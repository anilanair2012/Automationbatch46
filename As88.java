package basicprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As88 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://google.com");
driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Bangalore");

Thread.sleep(2000);
List<WebElement> e2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));//to locate all the autosuggestion values
int length=e2.size();
System.out.println(length);//to print the count of auto suggesstion values
for(int i=0;i<length;i++)
{
	

WebElement a1=e2.get(i);
String s2=a1.getText();
System.out.println(s2);//to print the entitre auto suggestions
	}

	}
}
