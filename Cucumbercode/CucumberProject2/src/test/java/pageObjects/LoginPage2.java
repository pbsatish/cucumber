package pageObjects;





import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	public WebDriver driver;
	
	
	 public LoginPage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	 /*public void LoginPage1(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}*/
	
	@FindBy(name="txtUsername")
    WebElement username;  

    @FindBy(name="txtPassword")
    WebElement password;  
    
    @FindBy(id="btnLogin")
    WebElement loginBtn;
    
    
    
    @FindBy(id="spanMessage")
    WebElement errmsg;
	
	public void setUserName(String uname) {
		try {
			username.clear();
			username.sendKeys(uname);

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void setPassword(String pwd) {
		try {
			password.clear();
			password.sendKeys(pwd);
		}catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	public void clickLogin() {
		try {
			loginBtn.click();
		}catch (Exception e) {
			System.out.println(e);
		}	
	}	

	
	
	public void validCredentialsCheck(String url) {
		try {
			
						System.out.println("url::"+driver.getCurrentUrl());
						String pageUrl = driver.getCurrentUrl();
						
						if(pageUrl.contains(url)) {
							System.out.println("inside url if check");
							Assert.assertTrue(true);
						}else {
							System.out.println("inside url else check");
							Assert.assertTrue(false);
						}
						
		}catch (Exception e) {
			System.out.println(e);
		}	
		
	}
	
	public void invalidCredentialsCheck(String err) {
		try {
			String errMsg = errmsg.getText();
			if(errMsg != null && !errMsg.isEmpty()) {
				Assert.assertEquals(err, errMsg);
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}catch (Exception e) {
			System.out.println(e);
		}	
		
	}


}
