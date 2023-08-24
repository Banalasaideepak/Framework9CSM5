package com.groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test4 {
	@Test(groups = { "regression", "smoke", "functional" })
	public void demo1() {
		Reporter.log("test4-demo1-regression and smoke and functional", true);
	}

	@Test
	public void demo2() {
		Reporter.log("test4-demo2", true);
	}
}
