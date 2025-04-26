package amazonfirstproject.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
@FindBy(name="customerName")WebElement name;
@FindBy(name="email")WebElement phone;
@FindBy(name="password")WebElement password;
@FindBy(id="auth-continue")WebElement verify;

public void registration(WebDriver driver)
{
	name.sendKeys("Nakshatra");
	phone.sendKeys("8240319408");
	password.sendKeys("Pournami@123");
	verify.click();
	
}
public Registration(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
