package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listenerImplementation implements ITestListener {
	@Override
	public void onTestFailure (ITestResult result) {
		Reporter.log("Test script failed",true);
	}

}
