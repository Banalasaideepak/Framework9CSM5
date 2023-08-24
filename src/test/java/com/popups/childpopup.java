package com.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class childpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()= ' GEARS ']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']"+"/descendant::a[text()=' SkillRary Essay']")).click();
		
		String parentID=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles(); 
		
		for(String s:ids)
		{
			driver.switchTo().window(s);
		}
		driver.findElement(By.id("mytext")).sendKeys("SAIDEEPAK09");
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		String text =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3")))).getText();
		System.out.println(text);
		
		driver.close();
		
		driver.switchTo().window(parentID);
		driver.quit();
	}

}
