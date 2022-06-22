package step_definitions;

//https://www.axelerant.com/resources/team-blog/setup-for-selenium-with-cucumber-using-maven

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllKeyWords{
	
    public WebDriver driver;

    
    
    @When("^I open OpenOrangeHRM website$")
    public void i_open_automationpractice_website() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    
    @When("^I open OpenOrangeHRM website$")
    public void i_open_automationpractice_website1() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("^I created Nationality Record$")
    public void I_created_Nationality_Record() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Mexican800");
		findElement(By.id("btnSave")).click();
    }
    
    @Then("^I created Skills Record$")
    public void I_created_Skills_Record() throws Throwable {
    findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_Qualifications")).click();
	findElement(By.id("menu_admin_viewSkills")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("skill_name")).sendKeys("Selenium80");
	findElement(By.id("skill_description")).sendKeys("Selenium Decsription80");
	findElement(By.id("btnSave")).click();
    }
    
    @Given("^Sign in Details$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
    }
   
    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    
    	
    	BeforeAfter_Scenario.driver=driver;
    	driver.quit();
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