package com.batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test4 {
	@Test
	public void demo1() {
		Reporter.log("test4-demo1", true);
	}

	@Test
	public void demo2() {
		Reporter.log("test4-demo2", true);
	}
}
