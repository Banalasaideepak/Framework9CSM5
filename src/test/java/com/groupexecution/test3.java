package com.groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test3 {
	@Test(groups = "regression")
	public void demo1() {
		Reporter.log("test3-demo1-regression", true);
	}

	@Test(groups = "smoke")
	public void demo2() {
		Reporter.log("test3-demo2-smoke", true);
	}

	@Test(groups = { "regression", "smoke" })
	public void demo3() {
		Reporter.log("test3-demo3-regression and smoke", true);
	}
}
