package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class As86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/anila/OneDrive/Desktop/grotechminds.html");
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("ANILA");
driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
WebElement e1=driver.findElement(By.xpath("/html/body/select"));
Select s1=new Select(e1);
s1.selectByVisibleText("Christian");
	}

}
