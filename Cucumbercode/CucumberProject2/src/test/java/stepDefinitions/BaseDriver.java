package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseDriver {
	protected static WebDriver driver;
	 static String isDriverLaunched;

    protected  WebDriver getDriver() {
        //Create a Chrome driver. All test classes use this.
    	System.out.println("printing driver:::"+driver);
    	if(isDriverLaunched==null || isDriverLaunched=="") {
        	System.out.println("inside null driver:::"+driver);
	    	//System.setProperty("webdriver.chrome.driver","E:\\CucumberProject\\Drivers\\chromedriver.exe");
	    	
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
			isDriverLaunched = "Launched";
    	}
		return driver;
    }
	
}
