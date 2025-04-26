package amazonfirstproject.Project1_Amazon;

import org.testng.annotations.Test;

public class Testcase_6 extends Brpwser_launch {
	@Test
	public void newfilter()
	{
	Homepage hp=new Homepage(driver);
	hp.shoesearch(driver);
	hp.brandsize();
}}
