package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="welcome")
    WebElement welcome; 
	
    @FindBy(linkText="Logout")
    WebElement logout; 
    
    @FindBy(id="menu_admin_viewAdminModule")
    WebElement admin;
    
    @FindBy(id="menu_admin_Qualifications")
    WebElement qualification;
    
    @FindBy(id="menu_admin_viewSkills")
    WebElement viewskills;
    
    public void clickLogout() {
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			welcome.click();
			System.out.println("after welcom");
			WebDriverWait wait=  new WebDriverWait(driver,120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))) ;
			logout.click();
		}catch (Exception e) {
			System.out.println(e);
		}	
	}
    
    public void goToSkillPage() {
    	try {
    		System.out.println("inside gotoskill");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			admin.click();
			qualification.click();
			viewskills.click();
			
    	}catch (Exception e) {
			System.out.println(e);
		}	
    }
    
    

}
