package com.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("9562962945");
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("watches");
		driver.findElement(By.className("searchTextSpan")).click();
		if(driver.getCurrentUrl().contains("watches")) {
			System.out.println("is passed");
		}
		else {
			System.out.println("is failed");
		}
		

	}

}
