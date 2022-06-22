package step_definitions;


import java.util.List;
import java.util.concurrent.TimeUnit;

//https://www.axelerant.com/resources/team-blog/setup-for-selenium-with-cucumber-using-maven

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllKeyWords{
	
    public WebDriver driver;
    String TestURL,UserName,Password;
    
    
    
   //@When("User enters username as {string} and password as {string}")
    @When("^I open Orange HRM Website$")
    public void i_open_automationpractice_website() throws Throwable {
    
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    
    
    
    
    
    
    
    
    
    

 
    @Then("^I created Nationality Record \"(.*?)\"$")
   // @Then("^I created Nationality Record Indian(\\d+)$")
    public void I_created_Nationality_Record(String NationalityName1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(NationalityName1);
		findElement(By.id("btnSave")).click();
    }

    
    
    
    
    
    
  /*  @Then("^I created Skills Record$")
    public void I_created_Skills_Record() throws Throwable {
    findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_Qualifications")).click();
	findElement(By.id("menu_admin_viewSkills")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("skill_name")).sendKeys("Selenium8");
	findElement(By.id("skill_description")).sendKeys("Selenium Decsription8");
	findElement(By.id("btnSave")).click();
    }*/
    
    //@Given("^Sign in Details$")
    

   // @Then("^User enters username as \"([^\"]*)\"$) and password as \"([^\"]*)\"$)")
   // @When("^I enter valid username and valid password$")
    @When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
    public void i_sign_in(String UserName,String Password) throws Throwable {
    	
    	
    	
   /* 	ExcelApiTest4 eat=new ExcelApiTest4();
   	 
   	 TestURL=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",1,0);
   	 UserName=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",1,1);
	 Password=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",1,2);
		
	 System.out.println("TestURL :"+TestURL);
	 System.out.println("TestURL :"+UserName);
	 System.out.println("TestURL :"+Password);
    */
    	
	 
        // Write code here that turns the phrase above into concrete actions
    	findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
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