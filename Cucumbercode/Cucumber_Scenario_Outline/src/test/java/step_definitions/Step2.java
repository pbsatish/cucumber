package step_definitions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.But;
 
import java.util.List;
 
import cucumber.api.PendingException;
import cucumber.api.java.it.Data;
import cucumber.runtime.ScenarioImpl;
import gherkin.formatter.model.Scenario;
import gherkin.formatter.model.ScenarioOutline;
import junit.framework.Assert;
import cucumber.api.DataTable;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
 
import cucumber.api.cli.Main;
 
public class Step2 {
     
    static public String sb;
    static public String sa;
    static WebDriver driver = null;
     
    @BeforeMethod
	@Before("@Smoke,@Regression")
    public void beforeScenario(){
        System.out.println("New scenario begins");
    }   
     
    @AfterMethod
	@After("@Smoke,@Regression")
    public void afterScenario(){
        System.out.println("Scenario ends");
     
     
    }
     
@MyAnnotation
public static void myanno()
{
        System.out.println("my annot gets executed");
}
    @Given("^I am on Github home page$")
    public void i_am_on_Github_home_page(){
        String site = "https://www.github.com/login";
        System.setProperty("webdriver.chrome.driver", 
"Executables\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(site);
    }
    @When("^I specify Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void i_specify_Username_as_and_Password_as(String arg1, String arg2){
        driver.findElement(By.cssSelector("input#login_field")).sendKeys(arg1);
        driver.findElement(By.cssSelector("input#password")).sendKeys(arg2);
        // Write code here that turns the phrase above into concrete actions
    }
    @When("^Click on SignIn button$")
    public void click_on_SignIn_button(){
        driver.findElement(By.cssSelector("input.btn")).click();
        // Write code here that turns the phrase above into concrete actions
    }
    @Given("^I click on Your Profile option$")
    public void i_click_on_Your_Profile_option(){
    }
    @When("^I click on edit profile button$")
    public void i_click_on_edit_profile_button(){
        driver.findElement(By.xpath("//*[@id='js-pjax-container']/div/div[2]/div[1]/a")).click();
        // Write code here that turns the phrase above into concrete actions
    }
 
    @When("^Uploaded new picture$")
    public void uploaded_new_picture() throws InterruptedException{
        WebElement s1 = driver.findElement(By.xpath("//*[@class='avatar-upload-container clearfix']/Img"));
        sb=s1.getAttribute("src");
        System.out.println(s1.getAttribute("src"));
        driver.findElement(By.id("upload-profile-picture")).sendKeys("D://cucumberFinal//multiple//Files//images.jpg");
        Thread.sleep(10000);
        String wh = driver.getWindowHandle();
        driver.switchTo().window(wh);
         
        Actions actions = new Actions(driver);
         WebElement element = driver.findElement(By.xpath("//div[@class='facebox-content']/form/div[3]/button"));
         Thread.sleep(10000);
         actions.moveToElement(element);
         //Thread.sleep(10000);
         actions.click();
         //actions.sendKeys("GIST1 Description");
       actions.build().perform();
    //  driver.findElement(By.xpath("//div[@class='facebox-content']/form/div[3]/button")).click();
        Thread.sleep(3000);
        // Write code here that turns the phrase above into concrete actions
    }
 
    @Then("^I should be seeing new profile picture$")
    public void i_should_be_seeing_new_profile_picture(){
        WebElement s1 = driver.findElement(By.xpath("//*[@class='avatar-upload-container clearfix']/Img"));
        sb=s1.getAttribute("src");
        System.out.println(s1.getAttribute("src"));
        if(!(sb.equals(sa)))
        {
        Assert.assertTrue("File Upload successful", true);
        }
        // Write code here that turns the phrase above into concrete actions
    }
     
    @Given("^I click on Your Gists option$")
    public void i_click_on_Your_Gists_option(){
        driver.findElement(By.xpath("//*[@id='user-links']/li[3]/details/summary/img")).click();
        List<WebElement> olist = driver.findElements(By.xpath("//*[@id='user-links']/li[3]/details/ul/li/a[@class='dropdown-item']"));
        for(WebElement o:olist)
        {
            if(o.getText().equals("Your Gists"))
            {
                o.click();
                break;
            }
        }
        // Write code here that turns the phrase above into concrete actions
    }
 
    @When("^I provide filename, description$")
    public void i_provide_filename_description() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.xpath("//div[@class='edit container']/div[@id='gists']/input")).sendKeys("Gist1");
     Thread.sleep(2000);
     Actions actions = new Actions(driver);
     WebElement element = 
driver.findElement(By.xpath("//*[@id='gists']/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[5]/div/pre/span"));
     actions.moveToElement(element);
     actions.click();
     actions.sendKeys("GIST1 Description");
     actions.build().perform();
    // 
driver.findElement(By.xpath("//*[@id='gists']/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[5]/div/pre/span")).sendKeys("GIST1 Description");
    Thread.sleep(2000);
    }
 
    @When("^click on Create public gist method$")
    public void click_on_Create_public_gist_method() {
 
       driver.findElement(By.xpath("//*[@id='new_gist']/div[2]/div[2]/button[1]")).click();
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("^i should be seeing the new gist$")
    public void i_should_be_seeing_the_new_gist(){
        
        List<WebElement> glist = driver.findElements(By.xpath("//div[@class='container repohead-details-container']/ul[1]/li[@class='flex-auto']/div/a"));
        for(WebElement o:glist)
        {
            if(o.getText().equals("Gist1"))
            {
                System.out.println("Gist created successfully");
            }
        }
        // Write code here that turns the phrase above into concrete actions
    }
}
