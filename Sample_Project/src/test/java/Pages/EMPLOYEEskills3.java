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

public class EMPLOYEEskills3
{
	
	 WebDriver driver;
	 
	ExtentTest logger;
	ExtentReports extent;
	String screenShotPath;
	String TestScriptName;
		
	public void EMPLOYEEskills3(WebDriver driver,String TestScriptName, ExtentTest logger,ExtentReports extent)
		{
			this.driver = driver;
			this.logger=logger;
			this.extent=extent;
			this.TestScriptName=TestScriptName;
		}
		

	public  void AddEMPLOYEEskills3(String Employeeid,String street1,String city,String province,String zipcode,String telephone,String email2,String telephone1) throws Exception
	{driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 findElement(By.linkText("PIM")).click();
 	 findElement(By.id("menu_pim_viewEmployeeList")).click();
 	
 	 findElement(By.xpath("//input[@id='empsearch_id']")).clear();
 	findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(Employeeid);
 	findElement(By.xpath("//a[contains(text(),'0243')]")).click();
 	Thread.sleep(1000);
 	findElement(By.xpath(" //a[contains(text(),'Contact Details')]")).click();
 	
	findElement(By.xpath("//input[@id='btnSave']")).click();
	
	findElement(By.xpath("//input[@id='contact_street1']")).sendKeys(street1);
	Thread.sleep(1000);
	//findElement(By.xpath("//input[@id='contact_street2']")).sendKeys(street2);
	
	findElement(By.xpath(" //input[@id='contact_city']")).sendKeys(city);
	Thread.sleep(1000);
	findElement(By.xpath("//input[@id='contact_province']")).sendKeys(province);
	
	findElement(By.xpath("//input[@id='contact_emp_zipcode']")).sendKeys(zipcode);
	
	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='contact_country']")));
	dropdown.selectByValue("IN");
	
	findElement(By.xpath("//input[@id='contact_emp_hm_telephone']")).sendKeys(telephone);
	
	//findElement(By.xpath("//input[@id='contact_emp_work_email']")).sendKeys(email1);
	Thread.sleep(1000);
	findElement(By.xpath("//input[@id='contact_emp_oth_email']")).sendKeys(email2);
	Thread.sleep(1000);
	findElement(By.xpath("//input[@id='contact_emp_work_telephone']")).sendKeys(telephone1);
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
	














