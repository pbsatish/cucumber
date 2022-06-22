package step_definitions;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
public class Run_All_Features{
	
}  


/*@RunWith(Cucumber.class)
@CucumberOptions(
       // features ="src/test/java/features"
		features = "classpath:features",
        glue= "seleniumgluecode",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
                )

public class Run_All_Features {
	
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    
    }
    
    
}*/