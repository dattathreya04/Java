package com.MavenProject.MyMavenProject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.companyname.projectname.testReport.ActionEngine;

public class ListMousehour {
	WebDriver driver;
	@Test
	public void test()
	{
		driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/");
		List<WebElement> mh=driver.findElements(By.cssSelector("span.menu-text"));
	
	Iterator<WebElement> it=mh.iterator();
	
	while(it.hasNext())
	{ WebElement e1=it.next();
	Actions a=new Actions(driver);
	a.moveToElement(e1).perform();
		
			
	}}

}
