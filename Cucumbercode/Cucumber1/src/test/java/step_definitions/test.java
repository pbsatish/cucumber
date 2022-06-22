package step_definitions;

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

public class test{
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

    @Then("^I created Nationality Record$")
    public void I_created_Nationality_Record() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Mexican7992");
		findElement(By.id("btnSave")).click();
    }
    
    @Then("^I created Skills Record$")
    public void I_created_Skills_Record() throws Throwable {
    findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_Qualifications")).click();
	findElement(By.id("menu_admin_viewSkills")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("skill_name")).sendKeys("Selenium9");
	findElement(By.id("skill_description")).sendKeys("Selenium Decsription9");
	findElement(By.id("btnSave")).click();
    }
    
    
    //starts I_created_Jobs_Record ....developed by Kasi on Feb-07-2020 for Nationality Entity for 
    @Then("^I created Jobs Record$")
    public void I_created_Jobs_Record() throws Throwable {
    	
    	//Added by Kasi on Feb-07-2020 for Nationality Entity
    	findElement(By.id(OR.Admin_id)).click();
    	
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_viewJobTitleList")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales57");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales57 descr");
		findElement(By.id("jobTitle_note")).sendKeys("Sales57 Note");
		findElement(By.id("btnSave")).click();
    }
    //Ends I_created_Jobs_Record ....developed by Kasi on Feb-07-2020 for Nationality Entity for
    
    
    
    @Given("^Sign in Details$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	findElement(By.xpath(OR.UserName)).sendKeys("Admin");
		findElement(By.xpath(OR.Password)).sendKeys("admin123");
		findElement(By.xpath(OR.Loginbutton)).click();
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