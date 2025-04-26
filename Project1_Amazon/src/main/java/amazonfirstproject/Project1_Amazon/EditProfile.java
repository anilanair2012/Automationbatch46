package amazonfirstproject.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {
@FindBy(linkText="View")WebElement viewbutton;
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']") WebElement editicon;
@FindBy(id="editProfileNameInputId")WebElement editname;
@FindBy(id="editProfileContinueButton")WebElement continuebutton;
@FindBy(xpath="//i[@class='a-icon a-icon-close']")WebElement close;
public void edit() throws InterruptedException
{
	viewbutton.click();
	editicon.click();
	Thread.sleep(5000);
	editname.clear();
	editname.sendKeys("Anila Nachu");
	continuebutton.click();
	//close.click();
}
public EditProfile(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}}