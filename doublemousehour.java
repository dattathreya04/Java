package com.MavenProject.MyMavenProject;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.companyname.projectname.testReport.ActionEngine;

public class doublemousehour {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();	
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
        driver.get("http://toolsqa.com/"); 
        LogReports.LogMsg("apllication is successfully launched"+driver.getTitle());
        List<WebElement> headers=driver.findElements(By.cssSelector("span.menu-text"));
        LogReports.LogMsg("elements stored in list object");
        Iterator<WebElement> it=headers.iterator();
        LogReports.LogMsg("iterator is initiated");
        while(it.hasNext())
        {
        	  LogReports.LogMsg("loop is starting");
        	WebElement e=it.next();
        	if(e.getText().equalsIgnoreCase("Tutorial"))
        	{
        		Actions a=new Actions(driver);
        		a.moveToElement(e).perform();
        		  LogReports.LogMsg("mousehour is performed");
        		  List<WebElement> headers1=driver.findElements(By.cssSelector("span.menu-item-text"));
        		  Iterator<WebElement> it1=headers1.iterator();
        		  LogReports.LogMsg("iterator is initiated");
        		  while(it1.hasNext())
        		  {
        			  WebElement e1=it1.next();
        			  if(e1.getText().equalsIgnoreCase("Mobile Testing Tool"))
        			  {
        				  
        			 
        			  a.moveToElement(e1).perform();
        			  driver.findElement(By.xpath("//span[text()='Appium']")).click();
        			  Thread.sleep(2000);
        			  driver.findElement(By.xpath("//span[text()='Set Up Appium']")).click();
        			  LogReports.LogMsg("link is clicked");
        			 driver.findElement(By.xpath("//span[text()='Install the Java Development Kit (JDK)']")).click();
        			 JavascriptExecutor js=(JavascriptExecutor)driver;
        			 js.executeScript("window.scrollBy(0,300)");
        			 Thread.sleep(3000);
        			 driver.findElement(By.xpath("//a[text()='Java downloads page on Oracle’s']")).click();
        				System.out.println(driver.getTitle());
        				//driver.switchTo().window("TOOLSQA | Free QA Automation Tools Tutorials");
        			Thread.sleep(3000);
        				driver.findElement(By.xpath("//li/a/div")).click();
        			 
        			  LogReports.LogMsg("s");
        			  }
        		  }
        	}
        }
	}

}
