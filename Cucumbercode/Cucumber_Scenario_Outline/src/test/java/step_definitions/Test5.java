package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test5 {
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.out.println("zero");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("one");
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn() throws Throwable {
		System.out.println("two");
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("three");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		System.out.println("four");
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("five");
	}



}
