package com.frames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigaterefreshandfetchtitleurl_javascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//navigate to facebook.com
		js.executeScript("window.location=aruguments[0]","https://www.facebook.com/");
		
		//fetch title
		System.out.println(js.executeScript("return document.title"));
		
		//fetch URL
		System.out.println(js.executeScript("return document.URL"));
		
		Thread.sleep(2000);
		
		//refresh page
		js.executeScript("history.go(0)");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
