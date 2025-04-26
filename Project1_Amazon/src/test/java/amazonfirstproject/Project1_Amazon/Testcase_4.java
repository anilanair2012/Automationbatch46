package amazonfirstproject.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase_4 extends Brpwser_launch {
@Test
public void editprofile() throws InterruptedException
{
	Loginpage lp=new Loginpage(driver);
	lp.login(driver);
	lp.loginsuccessfull(driver);
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	Homepage  hp=new Homepage(driver);
hp.manageprofile(driver);
EditProfile ep=new EditProfile(driver);
ep.edit();
}



}
