package com.MavenProject.MyMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.companyname.projectname.testReport.ActionEngine;

public class mouseHour {

	 public static WebDriver driver;
	@Test
	public void MouseHourTest() throws InterruptedException
	{
		new FirefoxDriver().get("https://www.facebook.com/");
		Thread.sleep(3000);
        ActionEngine.mouseHourbycss("a[href='http://store.demoqa.com/products-page/product-category/']");		
		
	}
}
