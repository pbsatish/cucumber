
package  TestCases;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

import Pages.*;
import Extent_Reports.*;

public class TC01_Add_Nationalities
{
	WebDriver driver;
	
	
	Map<String, HashMap<String, String>> Datatable = new HashMap<String, HashMap<String, String>>();

	
	//step2
	 ExtentTest logger;
	 ExtentReports extent;
	 String screenShotPath;
	 public static String TestScriptName;
	 public static String TestName;
	 
	
	
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		//String TestURL = "https://opensource-demo.orangehrmlive.com/";
		//driver.get(TestURL);
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Datatable=eat.getDataTable("C:\\selenium\\HTML Report\\OrangeHRM6TC01_EMPExport4.xlsx", "Sheet1");
		
		TestScriptName=(Datatable.get("TC01").get("TestName"));
		
				
		//Extent HTML Report Creation Starts
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_SSS_a");
		 Date now = new Date();
		 String strDate = sdfDate.format(now);
		 
		 TestName=TestScriptName+"_"+strDate+".html";
		 TestScriptName=TestScriptName+"_"+strDate;
		 String TestHtmlName="C:/HTML Report/test-output/ExtentReportScreenShots/"+ TestScriptName +"/"+TestName;
		  
	
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter(TestHtmlName);
		 System.out.println("Html Report path is : "+TestHtmlName);
		 
		 extent=new ExtentReports();
		 extent.attachReporter(reporter);
		 logger=extent.createTest(TestName);
		//Extent HTML Report Creation Ends
	}
	
	
	@Test
	public void Test1_Nationality() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		/*System.out.println(Datatable.get("TC01").get("UserName"));
		System.out.println(Datatable.get("TC01").get("Password"));
		System.out.println(Datatable.get("TC01").get("Nationality"));*/
		String TestURL= Datatable.get("TC01").get("TestURL");
		String UserName= Datatable.get("TC01").get("UserName");
		String Password= Datatable.get("TC01").get("Password");
		String Nationality= Datatable.get("TC01").get("Nationality");
		

		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver,TestScriptName,logger,extent);
		L1.Login123(UserName,Password);
		
		Nationalities N1= new Nationalities();
		N1.Nationalities(driver,TestScriptName,logger,extent);
		N1.AddNationality(Nationality);
		
		HomePage H1= new HomePage();
		H1.HomePage(driver,TestScriptName,logger,extent);
		H1.Logout();
	}
	
	
	
	
	@AfterTest 
	public void  TestCloser()throws Exception {	
		driver.quit();
		extent.flush();
	}
	
	
	
	
	
	
}












