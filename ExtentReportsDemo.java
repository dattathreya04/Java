package com.MavenProject.MyMavenProject;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsDemo {

	private static ExtentReports er;
	private static ExtentTest et;
	public static void ExtentReports(String msg)
	{
		
		er=new ExtentReports("D:\\newfolder.html");
		et=er.startTest("ExtentReportss");
		et.log(LogStatus.INFO, msg);
		er.flush();
		er.endTest(et);
	}
	public static ExtentTest getet()
	{
		return et;
		
	}
}
