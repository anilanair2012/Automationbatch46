package as116;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.Listener;

public class Listener_1 extends Object implements ITestListener {

static	WebDriver driver;
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Date d1=new Date();
		long d2=d1.getTime();
		Date d3=new Date(d2);
		System.out.println(d3.toString());
		Reporter.log("pass");
		
		TakesScreenshot t1=(TakesScreenshot) driver;
		File screenshot_1 = t1.getScreenshotAs(OutputType.FILE);
		//File f1=new File("C:\\Users\\anila\\eclipse-workspace\\Java_Programs\\pass_scrrenshot\\pass"+Math.random()+".png");
		//File f1=new File("C:\\Users\\anila\\eclipse-workspace\\Java_Programs\\pass_scrrenshot\\pass"+new Listener_1().getClass()+".png");
		File f1=new File("C:\\Users\\anila\\eclipse-workspace\\Java_Programs\\pass_scrrenshot\\pass"+d3+".png");
		try {
			FileHandler.copy(screenshot_1, f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("fail");
		TakesScreenshot t1=(TakesScreenshot) driver;
		File screenshot_1 = t1.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\anila\\eclipse-workspace\\Java_Programs\\fail_screenshot\\fail.png");
		try {
			FileHandler.copy(screenshot_1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			FileHandler.copy(screenshot_1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}