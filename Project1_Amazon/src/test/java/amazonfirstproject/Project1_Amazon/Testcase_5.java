package amazonfirstproject.Project1_Amazon;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listeners_1.class)

public class Testcase_5 extends Brpwser_launch {
	
@Test(retryAnalyzer =amazonfirstproject.Project1_Amazon.IretryAnalyzer_1.class)


public void search_1()
{
	Homepage hp=new Homepage(driver);
	hp.shoesearch(driver);
Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe");
}
}
