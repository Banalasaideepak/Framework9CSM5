package com.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testclass1 
{
	@Test(retryAnalyzer =com.listeners.retryimplementation.class)
	public void test1()
	{
		System.out.println("test1");
		Assert.fail();
	}

}
