package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "classpath:features/Test5.feature"
,glue= {"step_definitions"},
plugin = {"pretty", "html:target/cucumber-html-report"},
tags = {}
)

public class testrunner {

}