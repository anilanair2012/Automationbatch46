package as_109registration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Grotech_regis {
@DataProvider(name="regisdetails")
public Object[][] method1()
{
	Object data[][]=new Object[4][6];
	data[0][0]="Anila";
	data[0][1]="Nair";
	data[0][2]="abc@gmail.com";
	data[0][3]="xyz";
	data[0][4]="Anilanjali";
	data[0][5]="Pournami";
	
	data[1][0]="nila";
	data[1][1]="air";
	data[1][2]="bc@gmail.com";
	data[1][3]="yz";
	data[1][4]="nilanjali";
	data[1][5]="ournami";
	
	data[2][0]="ila";
	data[2][1]="ar";
	data[2][2]="c@gmail.com";
	data[2][3]="z222";
	data[2][4]="lanjali";
	data[2][5]="rnami";
	

	data[3][0]="ia";
	data[3][1]="or";
	data[3][2]="uuc@gmail.com";
	data[3][3]="222";
	data[3][4]="lnjali";
	data[3][5]="rnmi";
	return data;
}
	
	
	
	
	@Test(dataProvider="regisdetails")
public void login(String firstname,String lastname,String emailid,String password,String address,String permanentadd )
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.findElement(By.id("fname")).sendKeys(firstname);
	driver.findElement(By.id("lname")).sendKeys(lastname);
	driver.findElement(By.id("email")).sendKeys(emailid);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("Present-Address")).sendKeys(address);
	driver.findElement(By.id("Permanent-Address")).sendKeys(permanentadd);
}
}
