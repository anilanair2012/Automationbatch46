package amazonfirstproject.Project1_Amazon;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Productdesc {
//@FindBy(tagName="a")List<WebElement> links;
@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[1]")WebElement rating;
@FindBy(xpath="(//span[@class='a-price-whole'])[1]")WebElement price;
@FindBy(xpath="(//h3[@class='product-facts-title'])[1]")WebElement productdetails;
@FindBy(id="add-to-cart-button")WebElement addtocart;
@FindBy(name="quantity")WebElement quantity_1;
@FindBy(id="nav-cart-count")WebElement cart;
@FindBy(xpath="//span[@class='a-icon a-icon-small-remove']")WebElement remove;
@FindBy(name="proceedToRetailCheckout")WebElement proceed;
public void customerreviewlink()
{
Assert.assertEquals(rating.getText(), "3.6");
Assert.assertEquals(price.getText(), "199", "true");
Assert.assertEquals(productdetails.getText(), "Product details");
}
public void addtocart(WebDriver driver)
{
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click", cart);
	addtocart.click();	
}
public void addquantity()
{
	
Select s1=new Select(quantity_1);	
s1.selectByValue("2");


	
}
public void removefrom()
{
	cart.click();
	remove.click();
}
public void checkout()
{
	proceed.click();	
}


public Productdesc(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}