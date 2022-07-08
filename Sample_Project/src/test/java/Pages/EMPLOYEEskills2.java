package  Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Extent_Reports.ExtentReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class EMPLOYEEskills2
{
	
	 WebDriver driver;
	 
	ExtentTest logger;
	ExtentReports extent;
	String screenShotPath;
	String TestScriptName;
		
	public void EMPLOYEEskills(WebDriver driver,String TestScriptName, ExtentTest logger,ExtentReports extent)
		{
			this.driver = driver;
			this.logger=logger;
			this.extent=extent;
			this.TestScriptName=TestScriptName;
		}
		

	public  void AddEMPLOYEEskills(String Employeeid) throws Exception
	{driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 findElement(By.linkText("PIM")).click();
 	 findElement(By.id("menu_pim_viewEmployeeList")).click();
 	 
 	
 	 findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(Employeeid);
 	 
 	findElement(By.xpath("//a[contains(text(),'0243')]")).click();
 	
 	//findElement(By.xpath("//*[@id=\"btnAddAttachment\"]")).click();
 	
 	/*findElement(By.xpath("//input[@id='btnEditCustom']")).click();
 	
 	Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"frmEmpCustomFields\"]/ol/li[1]/select")));
	dropdown.selectByVisibleText("O+");
 	
	findElement(By.cssSelector("#btnEditCustom")).click();*/
	
	findElement(By.xpath("//input[@id='btnSave']")).click();
	
	findElement(By.xpath(" //input[@id='personal_txtLicenNo']")).sendKeys("123456789");
	
	Thread.sleep(1000);
	findElement(By.xpath("//input[@id='personal_txtNICNo']")).sendKeys("987654321");
	
	findElement(By.xpath(" //input[@id='personal_optGender_1']")).click();
	Thread.sleep(1000);
	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
	dropdown.selectByValue("195");
	Thread.sleep(1000);
	findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys("selenium");
	Thread.sleep(1000);
	findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys("testing");
	findElement(By.xpath(" //input[@id='btnSave']")).click();
	Thread.sleep(1000);
	
	
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("EMPLOYEE Page - Screenshot",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		findElement(By.id("btnSave")).click();
		
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
	














