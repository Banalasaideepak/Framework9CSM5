package com.groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test(groups = "regression")
	public void demo1() {
		Reporter.log("test2-demo1-regression", true);
	}

	@Test(groups = "functional")
	public void demo2() {
		Reporter.log("test2-demo2-functional", true);
	}

	@Test(groups = { "regression", "functional" })
	public void demo3() {
		Reporter.log("test2-demo3-regression and functional", true);
	}

}
