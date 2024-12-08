package as_ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_1 {

	@DataProvider(name="log")
	public Object[][]data1() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream f1=new FileInputStream("C:\\Users\\anila\\eclipse-workspace\\Java_Programs\\excel\\Anila.xlsx");
		Workbook w1=WorkbookFactory.create(f1); 
		Object data[][]=new Object[3][2];
		//Sheet s1=w1.getSheet("login");
		for(int i=0;i<3;i++)
		{
			
			
			for (int j=0;j<1;j++)
			{
				
				String un1 =w1.getSheet("login").getRow(i).getCell(0).getStringCellValue();		
		String pwd1=w1.getSheet("login").getRow(i).getCell(1).getStringCellValue();	
		data[i][0]=un1;
		data[i][1]=pwd1;
		}
		}
		return data;
		
	
			}
	
WebDriver driver;	
	@Test(dataProvider="log")
	public void method1(String un1,String pwd1) throws InterruptedException
	{
driver=new EdgeDriver();
driver.get("https://amazon.in");
//driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Actions a1=new Actions(driver);
WebElement e1=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
a1.moveToElement(e1).perform();
Thread.sleep(3000);
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.id("ap_email")).sendKeys(un1);
driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']")).click();

driver.findElement(By.id("ap_password")).sendKeys(pwd1);	
driver.findElement(By.id("signInSubmit")).click();
	}
}
