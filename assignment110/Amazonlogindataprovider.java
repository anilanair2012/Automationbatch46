package assignment110;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazonlogindataprovider extends Prerquisite {
@DataProvider(name="logindetails")
public Object[][] method2()
{
	Object data[][]=new Object[3][2];
	data[0][0]="9495989216";
	data[0][1]="abc@abc.com";
	data[1][0]="anilanair2012@gmail.com";
	data[1][1]="sdc.com";
	data[2][0]="sd@ab.com";
	data[2][1]="gggg";
	return data;
	
}



@Test(dataProvider="logindetails")
public void method1(String emailid,String password)
{
	driver.findElement(By.id("ap_email")).sendKeys(emailid);
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys(password);


}}
