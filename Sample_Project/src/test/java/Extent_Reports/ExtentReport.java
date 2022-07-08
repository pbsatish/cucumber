package  Extent_Reports;

import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.text.SimpleDateFormat;
import java.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.*;


public class ExtentReport
{
	
	WebDriver driver;
	 
	public static String TestScreenShotFolderName;
	String TestHtmlName="";
	String screenShotPath;
	//public static String TestName="";
	

	

	String HtmlOutputFileName = "";

	public  ExtentReport(String TestName) {
		
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_SSS_a");
		 Date now = new Date();
		 String strDate = sdfDate.format(now);
	
		 TestScreenShotFolderName=TestName+"_"+strDate;
		 TestHtmlName="C:/HTML Report/test-output/ExtentReportScreenShots/"+TestScreenShotFolderName+ ".html";
		
		 System.out.println("TestName is : "+TestName);
		 System.out.println("Path is : "+TestHtmlName);
	}

	/*
	
	@Test
	public void Test3() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(TestHtmlName);
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest(TestScreenShotFolderName);
	
		String TestURL = "https://opensource-demo.orangehrmlive.com/";

		
		driver.get(TestURL);
		
		screenShotPath = ExtentReport.capture(driver);
		logger.pass("Ornage HRM URL opened",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
	//	Reporter1 R1= new Reporter1(driver,"Test3");
	//	String str=R1.getScreenShotPath(driver);
	//	logger.pass("Open Browser",MediaEntityBuilder.createScreenCaptureFromPath(str).build());
		
	
	
		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		screenShotPath =ExtentReport.capture(driver);
		logger.pass("UserName Entered",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		screenShotPath = ExtentReport.capture(driver);
		logger.pass("Password Entered",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
	
		
		
		Login l1 = new Login();
		l1.Login(driver, HtmlOutputFileName, TH3,R1,logger);
		l1.OrangeHRMSigninClick();
		
		extent.flush();
		driver.close();
		
	}*/
	

	
	
	public static  String capture(WebDriver driver) throws IOException
    {
				
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_SSS_a");
		 Date now = new Date();
		 String strDate = sdfDate.format(now);
		
		
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = "C:\\HTML Report\\test-output\\ExtentReportScreenShots\\"+TestScreenShotFolderName+"\\"+TestScreenShotFolderName+"_"+strDate+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
	
	

	public static  String capture(WebDriver driver,String TestScriptName) throws IOException
    {
		
			
		//String TestHtmlName1=TestName;
	
		
		// String TestHtmlName1="C:/HTML Report/test-output/ExtentReportScreenShots/"+TestName+".html";
		
		 System.out.println("Test Script Name is : "+TestScriptName);
		// System.out.println("Path is : "+TestHtmlName1);
		
				
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_SSS_a");
		 Date now = new Date();
		 String strDate = sdfDate.format(now);
		
		
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
       // String dest = "C:\\HTML Report\\test-output\\ExtentReportScreenShots\\"+TestScreenShotFolderName+"\\"+TestScreenShotFolderName+"_"+strDate+".png";
        
        String dest = "C:\\HTML Report\\test-output\\ExtentReportScreenShots\\"+TestScriptName+ "\\"+strDate+".png";
        
        System.out.println("dest path  is : "+dest);
        
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
	
	
	
	
	
	
}












