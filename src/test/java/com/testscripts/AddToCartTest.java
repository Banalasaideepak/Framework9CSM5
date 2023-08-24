package com.testscripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.annotations.baseclass;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass {
	@Test
	public void addToCartTest() throws InterruptedException {
		Map<String, String> map = excel.getData("Sheet1", "Add Address");
		welcome.clickloginbutton();
		login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		home.mouseHoverToElectronic(webUtil);
		Thread.sleep(3000);
		home.clickHeadPhoneLink();
		headPhone.clickAddToCart();
		Thread.sleep(3000);
		Assert.assertEquals(headPhone.getAddToCartText(), "ADDED");
		String itemName = headPhone.getItemName();
		headPhone.clickOnCartIcon();
		Assert.assertTrue(cart.getCartItem().equalsIgnoreCase(itemName));
	}
}
