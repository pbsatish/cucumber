package CommonUtil;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.testng.annotations.*;
import java.io.File;
import java.io.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBrowser

{
	 public static String ChromedriverPath = "C:\\chromedriver_win32\\chromedriver.exe";
	 public static String IEdriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
	 public static String FirefoxdriverPath = "C:\\FireFoxDriver\\geckodriver.exe";
		

	 
	// static WebDriver driver1 ; 

			  
		  public  static   WebDriver  OpenChromeBrowser()throws Exception
			 {
			     WebDriver driver1 ; 
	 			 	
	 			 	 //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	 			 	System.setProperty("webdriver.chrome.driver",ChromedriverPath);
	 			 	driver1 =new ChromeDriver();
	 			 	driver1.manage().window().maximize() ;	
	 			 	
				    return driver1;
	 			
			}
		  /*
		  public static WebElement findElement(By by) throws Exception 
			{
		
				WebElement elem = driver1.findElement(by);  
				
				if (driver1 instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver1).executeScript("arguments[0].style.border='3px solid blue'", elem);
			 
				}
				return elem;
			}

		  */
		  
		  public static WebDriver RemoteWebDriver() throws Exception
		  {
			  WebDriver driver ; 
			  
	    	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	    	  //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+"//Drivers//chromedriver.exe"));
	    	  
	    	    ChromeOptions options = new ChromeOptions();
	    	    
	    		DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WINDOWS);
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				options.merge(capabilities);
				
	    	  driver = new RemoteWebDriver(new URL("http://localhost:4444/"), capabilities);
	    	  
			    return driver;
		  }
		  
		  
		 
		//  @Test  
		  public  static WebDriver OpenIEBrowser()throws Exception
			 {
				 WebDriver driver ; 
				 System.setProperty("webdriver.ie.driver",IEdriverPath);
				 driver = new InternetExplorerDriver();
				 driver.manage().window().maximize() ;
				 return driver;
			}
		  
		  public  static   WebDriver FirefoxBrowser()throws Exception
			 {
			     WebDriver driver2 ;
				 //System.setProperty("webdriver.gecko.driver",FirefoxdriverPath);
				 System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\geckodriver.exe");
				
				 driver2 = new FirefoxDriver();
				 
				 Thread.sleep(8000);
				 driver2.manage().window().maximize() ;
				return driver2;	
				 
			 }
		  
		  
		  
		//  @Test  
		  public  static   WebDriver OpenFirefoxBrowser()throws Exception
			 {
				
				 System.setProperty("webdriver.gecko.driver",FirefoxdriverPath);
				 DesiredCapabilities capabilities=DesiredCapabilities.firefox();
				 capabilities.setCapability("marionette", true);
				 WebDriver driver = new FirefoxDriver(capabilities);
				 driver.manage().window().maximize() ;	
				 return driver;
			 }
		  
		  
		  
		 
		  
		  
		  
		  public  static   WebDriver OpenFirefoxBrowser1()throws Exception
			 {
				 WebDriver driver ; 
				 FirefoxOptions options = new FirefoxOptions();
				 options.setCapability("marionette", true);
				 System.setProperty("webdriver.gecko.driver",FirefoxdriverPath);
				 driver = new FirefoxDriver(options); 
				  driver = new FirefoxDriver(options); 
				// driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

				 driver.manage().window().maximize() ;	
				 return driver;
			 }
		    
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		//  @Test  
		  public  static void   CloseBrowser(WebDriver driver)throws Exception
			 {
			  
				driver.quit();	
			 
			 }
		  
		  
		  
		  
  
		  

}
	  
		  
		  
		  
		  
		  
		  
			
	  



/*  public  String baseUrl1 = "http://www.newtours.demoaut.com/";
 public String baseUrl2 = "https://www.facebook.com/";
 public String baseUrl3 = "https://www.amazon.in/";*/





