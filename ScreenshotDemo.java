package com.MavenProject.MyMavenProject;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenshotDemo {

	public  static String  GetScreenshot(WebDriver driver,String imagename) throws IOException
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destfile="D:\\"+imagename+".jpeg";
		File destination=new File(destfile);
		FileUtils.copyFile(srcfile, destination);
		return destfile;
	}
}
