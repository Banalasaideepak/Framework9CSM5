package com.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseclass 
{
	@BeforeSuite
	public void suiteconfig() 
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void testconfig() 
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void classconfig()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void methodconfig()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void testconfig1()
	{
		System.out.println("Test");
	}
	@AfterMethod
	public void methodconfig1()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void classconfig1()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public void testconfig2()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void suiteconfig1()
	{
		System.out.println("AfterSuite");
	}
	}