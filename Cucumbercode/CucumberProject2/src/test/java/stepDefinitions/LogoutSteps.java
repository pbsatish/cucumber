package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class LogoutSteps extends BaseDriver{
	
	public WebDriver driver = getDriver();
	public HomePage hp;
	
	@When("Click on logout button")
	public void click_on_logout_button() {
		try {
			
		/*	if(BaseDriver.isDriverLaunched.equals("Launched"))
			{
				
			}*/
				
			hp = new HomePage(driver);
			hp.clickLogout();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Then("Close Browser")
	public void close_Browser() {
		try {
			driver.close();
			driver.quit();
			isDriverLaunched ="";
		}catch (Exception e) {
			System.out.println(e);
		}  
	}
	
	
}
