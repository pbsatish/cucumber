package stepDefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class LoginSteps extends BaseDriver{
	
	WebDriver driver;
	public LoginPage lp ;
	public HomePage hp;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		try {
			
		System.out.println("in launch browser");
		driver=getDriver();
		System.out.println("Finished launch");
		
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		
		try {
				System.out.println("Inside openURL");
				driver.get(url);
				
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String uname, String pwd) {
		try {	
			
			lp = new LoginPage(driver);
			lp.Login(uname, pwd);
			
		}catch (Exception e) {
			System.out.println(e);
		}	
				
	}

	

	@Then("Page URL Should be {string}")
	public void page_URL_Should_be(String url) {
		try {
			
			lp.validCredentialsCheck(url);
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	   
	}
	
	@Then("Error message should displayed {string}")
	public void error_message_should_displayed(String err) {
		try {
			lp.invalidCredentialsCheck(err);
			}catch (Exception e) {
				System.out.println(e);
			}
	}
	
	
}
