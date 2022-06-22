package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*

@RunWith(Cucumber.class)
@CucumberOptions(
	
		features="C:\\Appium_Scripts\\Appium_Training\\Selenium\\CucumberProject\\Features\\",
		glue="stepDefinitions", //the path of the step definitions file
		dryRun=false, //to check proper mapping between feature file  and step definition file
		monochrome=true,//displays the console  output in proper readable format
		strict=true,// it will check if any step is not defined in Step Definitions file
		plugin= {"pretty","html:target/cucumber-html-report"}
		)

public class TestRun {
	

}*/

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"D://Day3_Cucumber//CucumberProject2//Login.feature"},
		features = "classpath:features/Login.feature",
		glue="stepDefinitions",
		strict=true,// it will check if any step is not defined in Step Definitions file
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
public class TestRun{
	
}  

