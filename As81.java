package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class As81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/registration/");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("Skills"));
//Select s1=new Select(e1);
//s1.selectByVisibleText("Select an Skill");
//.selectByValue("select1");
//.selectByIndex(2);
driver.findElement(By.id("Skills")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.id("Skills")).sendKeys(Keys.ARROW_DOWN);
WebElement e2=driver.findElement(By.id("Country"));
Select s2=new Select(e2);
s2.selectByVisibleText("Afganistan ");
//s2.selectByValue("Bangladesh");
//s2.selectByIndex(0);
WebElement e3=driver.findElement(By.id("Relegion"));
Select s3=new Select(e3);
s3.selectByIndex(1);
//s3.selectByVisibleText("Muslim");
//s3.selectByValue("Sikh");





	}

}
