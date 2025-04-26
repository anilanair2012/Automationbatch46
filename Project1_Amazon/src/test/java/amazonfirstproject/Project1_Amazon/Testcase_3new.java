package amazonfirstproject.Project1_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase_3new extends Brpwser_launch{
	
	@DataProvider(name="log")
	public Object[][]data1() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\anila\\eclipse-workspace\\Project1_Amazon\\Anilanair.xlsx");
		Workbook w1=WorkbookFactory.create(f1); 
		Object data[][]=new Object[2][3];
		
	
	for(int i=0;i<2;i++)
	{
		
		
		for (int j=0;j<3;j++)
		{
			
			String un =w1.getSheet("login").getRow(i).getCell(0).getStringCellValue();
			String pwd1=w1.getSheet("login").getRow(i).getCell(1).getStringCellValue();	
			String ER=w1.getSheet("login").getRow(i).getCell(2).getStringCellValue();	
			data[i][0]=un;
			data[i][1]=pwd1;
			data[i][2]=ER;
		}}
	return data;
}
	
	@Test(dataProvider="log",retryAnalyzer=amazonfirstproject.Project1_Amazon.IretryAnalyzer_1.class)
	
public void ddt(String un,String pwd1,String ER) throws InterruptedException
{
	Loginpage lp=new Loginpage( driver);
	lp.login(driver);
	lp.loginfailed(un,pwd1);
String text1 = lp.validation();

Assert.assertEquals(text1,ER);
	//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	
}
}
