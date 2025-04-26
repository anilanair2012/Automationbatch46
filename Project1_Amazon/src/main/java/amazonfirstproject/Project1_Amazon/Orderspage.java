package amazonfirstproject.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Orderspage {

@FindBy(xpath="//select[@name='timeFilter']")WebElement filter;
@FindBy(xpath="(//span[@class='a-button a-button-normal a-spacing-mini a-button-base'])[3]")WebElement writereview;
@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")WebElement star;
public void rating()
{
	
	Select s1=new Select(filter);
	s1.selectByIndex(2);
	writereview.click();
	star.click();
}
public Orderspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
