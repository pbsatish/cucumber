package step_definitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Hooks_Steps {
	
		@Given("^this is the first step$")
		public void This_Is_The_First_Step(){
			System.out.println("This is the first step");
		}
		
		@When("^this is the second step$")
		public void This_Is_The_Second_Step(){
			System.out.println("This is the second step");
		}
		
		@Then("^this is the third step$")
		public void This_Is_The_Third_Step(){
			System.out.println("This is the third step");
		}

	}


