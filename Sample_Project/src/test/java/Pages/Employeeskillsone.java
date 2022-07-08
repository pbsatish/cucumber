package  Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Extent_Reports.ExtentReport;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Employeeskillsone
{
	
	 WebDriver driver;
	 
	ExtentTest logger;
	ExtentReports extent;
	String screenShotPath;
	String TestScriptName;
		
	public void Employee12(WebDriver driver,String TestScriptName, ExtentTest logger,ExtentReports extent)
		{
			this.driver = driver;
			this.logger=logger;
			this.extent=extent;
			this.TestScriptName=TestScriptName;
			
		}
		

	public  void Employee123(String Employeeid) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		findElement(By.linkText("PIM")).click();
	 	 findElement(By.id("menu_pim_viewEmployeeList")).click();
	 	 
	 	
	 	// findElement(By.linkText( Employeeid)).click();
	 	 
	 	findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(Employeeid);
	 	 
	 	 findElement(By.xpath("//a[contains(text(),'0243')]")).click();
	 	 
	 	 findElement(By.xpath("//form[@id='frmEmpDelAttachments']")).click();
	 	
	 	Thread.sleep(1000);
	 	 
	 	WebElement  button=findElement(By.xpath("//*[@id=\"ufile\"]"));
		Actions actions = new Actions(driver);
	  	actions.moveToElement(button).click().build().perform();
 	 
		
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Employee Page - Screenshot",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		
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


	public void PhotoUpload(String photoUpload) throws Exception {
		 String str1="C:\\HTML Report\\OrangeHRM6\\sateesh.jpg";
	 	// PhotoUpload str1();
		StringSelection sel = new StringSelection(str1 );
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 
		 System.out.println("selection" +sel);
		 
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
		 Thread.sleep(2000);
		      
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(2000);
		        

	       //  Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(8000);
	
		findElement(By.xpath("//*[@id=\"txtAttDesc\"]")).sendKeys("satish");
	
		findElement(By .xpath("//*[@id=\"btnSaveAttachment\"]")).click();
		Thread.sleep(10000);
	
		
	}




	

}












