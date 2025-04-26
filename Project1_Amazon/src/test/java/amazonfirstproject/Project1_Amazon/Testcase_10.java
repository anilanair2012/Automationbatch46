package amazonfirstproject.Project1_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Testcase_10 extends Brpwser_launch{
@Test
public void itemquantity()
{
	Homepage hp=new Homepage(driver);
	hp.shoesearch(driver);
	hp.filter_1();
	Set<String> wh = driver.getWindowHandles();
	Iterator<String> i1 = wh.iterator();
String parentid = i1.next();
String childid = i1.next();
driver.switchTo().window(childid);
Productdesc pd=new Productdesc(driver);
pd.addquantity();
pd.addtocart(driver);
pd.removefrom();
}
}
