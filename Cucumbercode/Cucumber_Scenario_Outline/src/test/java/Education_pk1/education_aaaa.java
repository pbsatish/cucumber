package Education_pk1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class education_aaaa {
	
	WebDriver driver;
	
	  @Given("^openorange$")
	  
	  public void opor() throws Exception{
		  

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
			driver.manage().deleteAllCookies();
	        // Write code here that turns the phrase above into concrete actions
	    	driver.get("https://opensource-demo.orangehrmlive.com/");	
		  
		  
		  
	  }
	
	  @When("^login credentials as usrname \"(.*?)\" and pass \"(.*?)\"$")
	  
	 
		  
		  public void lgin(String username,String passs  ) throws Exception{
				driver.findElement(By.id("txtUsername")).sendKeys(username);
				driver.findElement(By.id("txtPassword")).sendKeys(passs);
				driver.findElement(By.id("btnLogin")).click();
		  
		  
		  
		  
		  
	  }
	  
	  
	  @Then("^educationadded \"(.*?)\"$")
	  
	  public void education(String edname)throws Exception{
		  
		  
		  
		  
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("menu_admin_Qualifications")).click();
			
			driver.findElement(By.id("menu_admin_viewEducation")).click();
			
			driver.findElement(By.id("btnAdd")).click();
			
			
			driver.findElement(By.id("education_name")).sendKeys(edname);
		  
		  
		  
	  }
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
}
