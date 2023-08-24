package com.batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void demo1() {
		Reporter.log("test2-demo1", true);
	}

	@Test
	public void demo2() {
		Reporter.log("test2-demo2", true);
	}

}
