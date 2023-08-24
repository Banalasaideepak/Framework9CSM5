package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class disabletest {
	
	@Test(enabled=false)
	public void test1()
	{
		Reporter.log("test1",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("test2",true);
	}
	@Test
	public void test3()
	{
		Reporter.log("test3",true);
	}
}
