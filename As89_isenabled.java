package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As89_isenabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/anila/OneDrive/Desktop/grotechminds.html");
WebElement e1=driver.findElement(By.name("lname"));
boolean b1=e1.isDisplayed();
boolean b2=e1.isEnabled();
if(b1==true && b2==true)
{
	e1.sendKeys("anila");
}
System.out.println(e1.isDisplayed());
System.out.println(e1.isEnabled());
	
	}

}
