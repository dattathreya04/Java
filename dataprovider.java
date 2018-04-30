package com.MavenProject.MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.companyname.projectname.testReport.ActionEngine;

public class dataprovider {
public static	WebDriver d;
	@Test(dataProvider="setdata")
	public void logintest(String uname,String pwd)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys(uname);
		ActionEngine.sendkeysbyid("email", uname);
		d.findElement(By.id("pass")).sendKeys(pwd);
		ActionEngine.sendkeysbyid("pass", pwd);
		d.findElement(By.id("u_0_2")).click();
		ActionEngine.clickbyid("u_0_2");
	}
	@DataProvider
	public Object[][] setdata()
	{
		Object o[][]=new Object[2][2];
		o[0][0]="mahi080290@gmail.com";
		o[0][1]="durgamahesh";
		o[1][0]="dattathreya04@gmail.com";
		o[1][1]="asdfgf";
		return o;
	}

}
