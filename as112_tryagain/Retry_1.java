package as112_tryagain;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_1 implements IRetryAnalyzer
{
int initialcount=0;
int retrytimes=1;
	@Override
	public boolean retry(ITestResult result) {
		if (initialcount<retrytimes)
		{
			initialcount++;
		
		return true;
	}
		return false;

}}
