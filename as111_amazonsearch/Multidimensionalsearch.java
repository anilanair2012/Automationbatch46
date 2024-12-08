package as111_amazonsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multidimensionalsearch {
	WebDriver driver;
	@DataProvider(name="input")
	public Object[][]data()
	{
		Object data1[][]=new Object[10][1];
		
		data1[0][0]="shoe";
		data1[1][0]="saree";
		data1[2][0]="book";
		data1[3][0]="pen";
		data1[4][0]="pencil";
		data1[5][0]="mobile";
		data1[6][0]="bag";
		data1[7][0]="calculator";
		data1[8][0]="TV";
		data1[9][0]="laptop";
		return data1;
		
	}
	
	
	
@Test(dataProvider="input")
public void method1(String input)
{
	driver=new ChromeDriver();		
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input);
driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		

}

}
 