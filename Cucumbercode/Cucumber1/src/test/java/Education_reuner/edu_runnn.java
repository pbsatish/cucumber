package Education_reuner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"classpath:features/Education1.feature"}
,glue= {"Education_pk"},
//plugin = {"pretty", "html:target/cucumber-html-report"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
tags = {}
)






public class edu_runnn {

}
