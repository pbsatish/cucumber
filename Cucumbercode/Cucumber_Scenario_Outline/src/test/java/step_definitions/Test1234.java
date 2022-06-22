package step_definitions;

import cucumber.api.java.en.Given;

public class Test1234 {

@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() throws Throwable {
	System.out.println("hello");
}

@Given("^some other precondition$")
public void some_other_precondition() throws Throwable {
	System.out.println("hello");
}



}
