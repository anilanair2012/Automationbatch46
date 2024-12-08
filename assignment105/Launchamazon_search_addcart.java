package assignment105;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Launchamazon_search_addcart extends Browser_Launch_Quit  {
@Test(priority=-1)
public void search()
{
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoe");
	e1.sendKeys(Keys.ENTER);
WebElement e2=	driver.findElement(By.linkText("Red Tape Casual Sneaker Shoes for Men | Classic Rounded Toe, Soothing Insole & Impact-Resistant Comfort"));
e2.click();
driver.findElement(By.id("submit.add-to-cart")).click();
}
}