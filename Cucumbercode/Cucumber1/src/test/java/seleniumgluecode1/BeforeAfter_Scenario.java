package seleniumgluecode1;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfter_Scenario{
	
    public static WebDriver driver;

    
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {
    	
    	/*System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    	System.out.println("Called before scenario starts");
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();*/
    	
    	//before scenario starts
    	
    	System.out.println("Called before scenario starts");
    }

     
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) 
        {
		        try {
		        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
		//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
		            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		            scenario.embed(screenshot, "image/png");
		        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
		            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		        }
		   
		    // driver.quit();
        }
        
        
    }
    
}