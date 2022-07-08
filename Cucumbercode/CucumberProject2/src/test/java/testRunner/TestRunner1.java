package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
		
			features = {"classpath:features/Login123.feature"},
			glue="stepDefinitions",
			plugin = {"pretty", "html:target/cucumber-html-report"},
			tags = {}
			)
	
	public class TestRunner1 {
	
}
