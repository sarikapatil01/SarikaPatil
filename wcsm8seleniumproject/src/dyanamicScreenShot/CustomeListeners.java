package dyanamicScreenShot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Testcase Start", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Testcase exicute Succesfully", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("Testcase failed due to :"+failedMethod, true);
		failedMethodToTakeScreenShot(failedMethod);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Testcase is skiped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Testcase Started", true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Testcase finished", true);
	}

	
	
		
	 
}
