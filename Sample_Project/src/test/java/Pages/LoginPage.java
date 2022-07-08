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

public class LoginPage
{
	
	WebDriver driver=null;
	 
	ExtentTest logger;
	ExtentReports extent;
	String screenShotPath;
	String TestScriptName;
	
	public void LoginPage(WebDriver driver,String TestScriptName,ExtentTest logger,ExtentReports extent)
	{
		this.driver = driver;
		this.logger=logger;
		this.extent=extent;
		this.TestScriptName=TestScriptName;
	}
	

	
	public void Login123(String Uname,String Pwd) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		findElement(By.name("txtUsername")).sendKeys(Uname);
		findElement(By.name("txtPassword")).sendKeys(Pwd);
		findElement(By.id("btnLogin")).click();
		
		
		//findElement(By.id("txtUsername")).sendKeys(Uname);
		//findElement(By.name("txtPassword")).sendKeys(Pwd);
		//findElement(By.id("btnLogin"));
		
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Login Page - Screenshot",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		
		
		findElement(By.id("btnLogin")).click();
		
		
		
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















