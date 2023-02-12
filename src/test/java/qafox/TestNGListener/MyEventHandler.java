package qafox.TestNGListener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyEventHandler implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		System.out.println("Testcase started: "+result.getName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Testcase succesfull: "+result.getName());
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Testcase failure: "+result.getName());
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Testcase skipped: "+result.getName());
	}
	
}
