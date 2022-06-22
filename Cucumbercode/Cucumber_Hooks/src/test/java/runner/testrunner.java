package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "classpath:features"
,glue= {"step_definitions"},
plugin = {"pretty", "html:target/cucumber-html-report"},
tags = {}
//Running single Cucumber Feature file or single Cucumber Tag
//Execute all tests tagged as @SmokeTests


//tags = {"@End2End"}
//Execute all tests tagged as @End2End

//tags = {"@End2End"}
//Execute all tests tagged as @End2End
//https://www.toolsqa.com/cucumber/cucumber-tags/


//tags = {"@End2End"}
//Execute all tests of a Feature tagged as @FunctionalTest : Feature Tagging


//tags = {"@FunctionTests"}
//Execute all tests of a Feature tagged as @FunctionalTest : Feature Tagging


)

public class testrunner {

}