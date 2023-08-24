package com.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementaationClass implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getMethod().getMethodName()+"started execution");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getMethod().getMethodName()+"pass");
	}
}
