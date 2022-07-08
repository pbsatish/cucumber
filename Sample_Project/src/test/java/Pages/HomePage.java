package  Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Extent_Reports.ExtentReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage
{
	
	WebDriver driver;
	
	ExtentTest logger;
	ExtentReports extent;
	String screenShotPath;
	String TestScriptName;
	
	public void HomePage(WebDriver driver,String TestScriptName,ExtentTest logger,ExtentReports extent)
	{
		this.driver = driver;
		this.logger=logger;
		this.extent=extent;
		this.TestScriptName=TestScriptName;
	}
	

	
	public   void Logout() throws Exception
	 {
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				findElement(By.id("welcome")).click();
			
				screenShotPath = ExtentReport.capture(driver,TestScriptName);
				logger.pass("HomePage - Logout Page",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
				
				findElement(By.linkText("Logout")).click();
	 }
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	
	
	
	
}















