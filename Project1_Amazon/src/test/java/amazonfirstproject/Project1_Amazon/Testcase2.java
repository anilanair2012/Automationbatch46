package amazonfirstproject.Project1_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 extends Brpwser_launch{
@Test()
public void testcase2()
{
Loginpage lp=new Loginpage( driver);
lp.login(driver);
lp.loginsuccessfull(driver);
WebElement e1=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
Assert.assertEquals(e1.getText(), "Hello, Anila");
}}