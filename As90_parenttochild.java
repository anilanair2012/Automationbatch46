package basicprogram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As90_parenttochild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get(" https://www.naukri.com/registration/createAccount?othersrcp=22636");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.name("google-register"));
e1.click();
Set<String> s1=driver.getWindowHandles();
Iterator<String> s2=s1.iterator();
String s3=s2.next();
String s4=s2.next();
driver.close();
Thread.sleep(2000);
driver.switchTo().window(s4);



	}

}
