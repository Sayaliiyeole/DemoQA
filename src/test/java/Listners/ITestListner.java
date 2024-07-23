package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListner implements ITestListener {


	public void onTestStart(ITestResult result) {
		System.out.println("TestStarted");
	}
	
   
    public void onTestFailure(ITestResult result) {
		
	}
	
    public void onTestSkipped(ITestResult result) {
		
	}
}
