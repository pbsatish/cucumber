package seleniumgluecode1;

//https://www.axelerant.com/resources/team-blog/setup-for-selenium-with-cucumber-using-maven

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OR1.OR;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test2{
    public WebDriver driver;

  
    
    @When("^I open OpenOrangeHRM website1$")
    public void i_open_automationpractice_website() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://opensource-demo.orangehrmlive.com/");
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