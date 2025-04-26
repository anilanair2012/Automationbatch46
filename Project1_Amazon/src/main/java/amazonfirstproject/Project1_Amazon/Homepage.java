package amazonfirstproject.Project1_Amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	@FindBy(xpath="(//span[@class='nav-icon nav-arrow'])[2]")WebElement accounts;
	@FindBy(linkText="Start here.")WebElement starthere;
	@FindBy(xpath="//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")WebElement Manage;
	@FindBy(xpath="//div[@class='sc-hmdomO qqYTW']")WebElement view;
	@FindBy(id="twotabsearchtextbox")WebElement search;
	//@FindBy(id="twotabsearchtextbox1")WebElement search;
	@FindBy(id="s-result-sort-select")WebElement filter;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")WebElement product;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[13]")WebElement size;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")WebElement brand;
	@FindBy(xpath="//span[.='Returns']")WebElement orders;
  public void newuser(WebDriver driver)
  {
	Actions a1=new Actions(driver);
	a1.moveToElement(accounts).perform();
	starthere.click();
  }
  public void manageprofile(WebDriver driver)
  {
		Actions a1=new Actions(driver);
		a1.moveToElement(accounts).perform();
		Manage.click();
		view.click();
  }
  
  public void shoesearch(WebDriver driver)
  {
	  JavascriptExecutor js1=(JavascriptExecutor) driver;
	  js1.executeScript("arguments[0].value='shoe';",search );
	  search.sendKeys(Keys.ENTER);  
  }
  public void filter_1()
  {
	  Select s1=new Select(filter);
	  s1.selectByIndex(1);
	  product.click();
  }
  public void brandsize()
  {
	 size.click();
	  brand.click();
  }
  public void order_1()
  {
	  orders.click();
  }
  
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  }

