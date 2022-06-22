package Mango;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//https://www.axelerant.com/resources/team-blog/setup-for-selenium-with-cucumber-using-maven

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps{
	
    public static WebDriver driver;

    
    /*
    @When("^I open OpenOrangeHRM website$")
    public void i_open_automationpractice_website() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    }*/



	@Given("^I open OpenOrangeHRM website$")
	public void user_is_on_Home_Page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
		//List<List<String>> data = usercredentials.raw();
		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		
		String username=data.get(0).get("Username");
		String Password=data.get(0).get("Password");
		
		findElement(By.id("txtUsername")).sendKeys(username); 
	    findElement(By.id("txtPassword")).sendKeys(Password);
	    findElement(By.id("btnLogin")).click();
	}
	
	
    @Then("^I created Skills Record$")
    public void I_created_Skills_Record(DataTable SkillsData) throws Throwable {
    	
    	List<List<String>> data = SkillsData.raw();
    	
    findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_Qualifications")).click();
	findElement(By.id("menu_admin_viewSkills")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("skill_name")).sendKeys(data.get(0).get(0));
	findElement(By.id("skill_description")).sendKeys(data.get(0).get(1));
	findElement(By.id("btnSave")).click();
    }
    
    

    
    @Then("^I created Nationality Record$")

    public void I_created_Nationality_Record(DataTable  Nationality1) throws Throwable {
    	
    	for (Map<String, String> data : Nationality1.asMaps(String.class,String.class)) {
    		//List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
    		//System.out.println("Nation1 text is :"+data.get(0)("Nationality"));
    		
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(data.get("Nationality"));
		findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		
    	}
    }
    
    
    @Then("^I created Nationality Record1$")

    public void I_created_Nationality_Record1(List<Nationalities>  N1) throws Throwable {
    	
    	//for (Map<String, String> data : Nationality1.asMaps(String.class,String.class)) {
    	
    	for (Nationalities NationalitiesData : N1) {	
    		System.out.println("Nation1 text is :"+NationalitiesData.getNationality());
    		
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(NationalitiesData.getNationality());
		findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		
    	}
    }


	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@Then("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		
		findElement(By.id("welcome")).click();
		 
		 WebDriverWait wait=  new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))) ;
		 
		findElement(By.linkText("Logout"));
		findElement(By.linkText("Logout")).click();
		driver.quit();
	}

	/*
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}*/

    public   WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
}