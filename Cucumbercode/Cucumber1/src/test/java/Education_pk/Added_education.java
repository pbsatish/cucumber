package Education_pk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OR1.OR;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Added_education {
	
	WebDriver driver;
	
	
	@Given("^open orange hrm$")
	
	public void openor() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://opensource-demo.orangehrmlive.com/");	
		
	}
	
	@When("^login credentials$")
	
	public void lgin() throws Exception{
		driver.findElement(By.xpath(OR.UserName)).sendKeys("Admin");
		driver.findElement(By.xpath(OR.Password)).sendKeys("admin123");
		driver.findElement(By.xpath(OR.Loginbutton)).click();
		
		
	}
	
	@Then("^Adding employee$")
	
	
	public void add_emppppp() throws Exception{
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		
		driver.findElement(By.id("menu_admin_viewEducation")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		
		driver.findElement(By.id("education_name")).sendKeys("Education_1");
		
		
		
		
	}
	
	@And("^logout1$")
	
	public void clsebr() throws Exception{
		
		driver.close();
		
		
	}

}
