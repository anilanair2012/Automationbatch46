package amazonfirstproject.Project1_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Testcase14 extends Brpwser_launch{
@Test
public void rating()
{
Homepage hp=new Homepage(driver);
	
	Loginpage lp=new Loginpage( driver);
	lp.login(driver);
	lp.loginsuccessfull(driver);
	hp.shoesearch(driver);
	hp.filter_1();
	Set<String> wh = driver.getWindowHandles();
	Iterator<String> i1 = wh.iterator();
String parentid = i1.next();
String childid = i1.next();
driver.switchTo().window(childid);
Productdesc pd=new Productdesc(driver);
pd.addquantity();
driver.navigate().refresh();

//Thread.sleep(2000);
pd.addtocart(driver);
//pd.removefrom();	
//pd.checkout();
/*Loginpage lp=new Loginpage( driver);
lp.login(driver);
lp.loginsuccessfull();*/
//Checkoutpage cp=new Checkoutpage(driver);
//cp.address();
//cp.payment_1();
//cp.secure();
hp.order_1();
	Orderspage op=new Orderspage(driver);
	op.rating();
}
}
