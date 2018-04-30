package com.MavenProject.MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavascriptExcuter {
	WebDriver driver;
	@Test
	public void test()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement gmaillink=driver.findElement(By.linkText("Sign in"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", gmaillink);
		js.executeScript("scrollBy(0,400)");
	}

}
