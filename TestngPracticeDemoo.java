package com.MavenProject.MyMavenProject;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestngPracticeDemoo {

	 private static WebDriver driver;
	 @Parameters("browser")
	 @BeforeSuite
	 public void TestngOpenBrowser(String browser)
	 {
		 if(browser.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	LogReports.LogMsg("Browser is Successfully Lunched");
	ExtentReportsDemo.ExtentReports("Browser is Successfully Lunched");
	
		 }
	 }
	 @AfterSuite
	 public void TestngCloseBrowser()
	 {
		// driver.quit();
	 }
	 @AfterMethod 
	 public void  AfterMethod(ITestResult result) throws IOException
	 {
		 if(ITestResult.FAILURE==result.FAILURE)
		 {
			 String dest=ScreenshotDemo.GetScreenshot(driver, result.getName());
		ExtentReportsDemo.ExtentReports("Look Below Image"+ExtentReportsDemo.getet().addScreenCapture(dest));
		 }
	 }
	@Test
	public void TestngTestCase()
	{
	driver.get("http://www.newtours.demoaut.com/");
	try {
		ScreenshotDemo.GetScreenshot(driver, "newtours");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	LogReports.LogMsg("Application is Successfully Opend");
    List<WebElement> l = driver.findElements(By.tagName("a"));
    LogReports.LogMsg(l.size());
    try
    {
    	
    
    for(int i=0; i<=l.size(); i++)
    {
    	if(l.get(i).isDisplayed())
    	{
    	LogReports.LogMsg(l.get(i).getText());
    }
    	else
    	{
    		LogReports.LogMsg("Link is not Displayed");
    	}
	
	}
    }
    catch(Exception e)
    {
    	LogReports.LogMsg(e.getMessage());
    }
    
}
}
