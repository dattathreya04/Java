package com.MavenProject.MyMavenProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Popups {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException
	{
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); //go button
		
		Alert alert =  driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println("Alert message: "+text);
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct error messg");
		}else{
			System.out.println("in-correct error messg");
		}
		Thread.sleep(3000);
		
		//ok button:
		alert.accept();
		
		//cancel button:
		//alert.dismiss();
		
		
		
		
		
		
	}

	}


