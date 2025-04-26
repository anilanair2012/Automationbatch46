package amazonfirstproject.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage {
	static WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")WebElement accountslists;
	@FindBy(xpath="//span[.='Sign in']") WebElement signin;
	@FindBy(name="email")WebElement username;
	@FindBy(id="continue")WebElement continuebutton;
	@FindBy(name="password")WebElement pwd;
	@FindBy(id="signInSubmit")WebElement sign;
	//@FindBy(xpath="//span/text()")WebElement validationerror;
	@FindBy(xpath="//span[contains(text(),'Your password is incorrect')]") WebElement validationerror;


	public void login(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountslists).perform();
		signin.click();
	}
	public void loginfailed(String un,String pwd1) throws InterruptedException
	{
		username.sendKeys(un);
		continuebutton.click();
		Thread.sleep(2000);
		pwd.sendKeys(pwd1);
		sign.click();
		}
		public String validation()
		{
	return  validationerror.getText();
	
	}
	
	public void loginsuccessfull(WebDriver driver)
	{
		username.sendKeys("anilanair2012@gmail.com");
		continuebutton.click();
		pwd.sendKeys("Pournami@123");
		sign.click();
		
	}
	
	

	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	}