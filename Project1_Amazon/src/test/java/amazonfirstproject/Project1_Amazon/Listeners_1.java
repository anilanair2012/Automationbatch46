package amazonfirstproject.Project1_Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listeners_1 implements ITestListener {

	static WebDriver driver;

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		TakesScreenshot t1=(TakesScreenshot)driver;
		
		File screenshotAs = t1.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\anila\\eclipse-workspace\\Project1_Amazon\\failedscreenshots\\Photo"+Math.random() +".png");
		
		
		try {
			FileHandler.copy(screenshotAs, f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		TakesScreenshot t2=(TakesScreenshot)driver;
		File screenshotAs1 = t2.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\anila\\eclipse-workspace\\Project1_Amazon\\pass screenshots\\pass"+new Listeners_1().getClass()+".png");
	try {
		FileHandler.copy(screenshotAs1, f2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}



	
}

	
