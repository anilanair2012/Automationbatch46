package amazonfirstproject.Project1_Amazon;

import org.testng.annotations.Test;

public class Testcase_8 extends Brpwser_launch {
@Test
public void filtermethod()
{
	
	Homepage hp=new Homepage(driver);
	hp.shoesearch(driver);
	hp.filter_1();
}
}
