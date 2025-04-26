package amazonfirstproject.Project1_Amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Checkoutpage {
	WebDriver driver;
@FindBy(id="deliver-to-customer-text")WebElement Addresss;
@FindBy(id="checkout-paymentOptionPanel")WebElement payment;
@FindBy(linkText="Review Order")WebElement review;
@FindBy(id="ppw-claimCode")WebElement debit;
@FindBy(id="pp-NvJ1Wp-103")WebElement credit;
@FindBy(id="pp-NvJ1Wp-109")WebElement netbanking;
@FindBy(id="pp-NvJ1Wp-129")WebElement otherupi;
@FindBy(id="pp-NvJ1Wp-139")WebElement cash;
@FindBy(id="//div[@data-a-input-name='ppw-instrumentRowSelection']")private List<WebElement> paymentgateways;
@FindBy(xpath="//input[@value='SelectableAddCreditCard']")WebElement creditcard;
@FindBy(linkText="Save Card")WebElement savecard;
@FindBy(name="ppw-claimCode")WebElement coupon;
@FindBy(name="ppw-claimCodeApplyPressed")WebElement apply;
public void address()
{
	//Addresss.getText();
	Assert.assertEquals(Addresss.getText(), "Delivering to Anila Nair");
}
public void payment_1()
{

	Assert.assertEquals(payment.isDisplayed(), true);
}
public void review()
{
	review.isDisplayed();
	Assert.assertEquals(review.isDisplayed(),true);
}
public void secure()
{
	for( WebElement w1:paymentgateways)
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfAllElements(paymentgateways));
		w1.click();
		
	}}
	public void coupon_1()
	{
		coupon.sendKeys("COOL");
		apply.click();
	}
	

public Checkoutpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
