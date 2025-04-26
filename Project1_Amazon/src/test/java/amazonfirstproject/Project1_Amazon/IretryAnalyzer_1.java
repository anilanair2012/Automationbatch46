package amazonfirstproject.Project1_Amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyzer_1 implements IRetryAnalyzer {

	int initialcount=0;
	int retrytimes=2;
	public boolean retry(ITestResult result) {
	
	if(initialcount<retrytimes)
	{
		initialcount++;
		return true;
	}
return false;
	

}}
