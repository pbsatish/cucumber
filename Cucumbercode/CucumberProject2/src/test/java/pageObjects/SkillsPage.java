package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	
	WebDriver driver;
	
	public SkillsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="btnAdd")
    WebElement addskill;
	
	@FindBy(id="btnDel")
    WebElement deleteskill;
	
	@FindBy(id="skill_name")
    WebElement skillname;
	
	@FindBy(id="skill_description")
    WebElement skilldesc;
	
	@FindBy(id="btnSave")
    WebElement saveskill;
	
	@FindBy(id="btnCancel")
    WebElement cancel;
	
	@FindBy(xpath="//*[@id='recordsListTable']/thead/tr/th")
    List <WebElement> skillcolumns;
	
	@FindBy(xpath="//*[@id='recordsListTable']/tbody/tr/td[1]")
	List <WebElement> skillrows;
	
	
	
	public void addSkill() {
		try {
			addskill.click();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void enterSkillName(String name) {
		try {
			skillname.clear();
			skillname.sendKeys(name);

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void enterDesc(String desc) {
		try {
			skilldesc.clear();
			skilldesc.sendKeys(desc);
		}catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	public void saveSkill() {
		try {
			saveskill.click();
		}catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	public void clearSkill() {
		try {
			cancel.click();
			skillname.clear();
			skilldesc.clear();
		}catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	public void selectRecord(String skillname) {
		
		 System.out.println("No of columns in WebTable : " + skillcolumns.size());
		 //No.of rows  
		 System.out.println("No of rows in WebTable : " + skillrows.size());
		 //driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr/td[1]")).click();
		 //driver.findElement(By.id("btnDel")).click();
		 System.out.println("skillname Text Value : " + skillname);
		 for ( int i=1 ; i<=skillrows.size() ;i++)
			{
			 String str1="//*[@id='recordsListTable']/tbody/tr["  + i +  "]"  + "/td[2]";
			 WebElement skilRec=driver.findElement(By.xpath(str1));
			 String WebElementText = skilRec.getText();
			 System.out.println("Get Text Value is from the WebElement: " + WebElementText);
			 
			 if(WebElementText.equalsIgnoreCase(skillname)) {
				 System.out.println("Get Text Value is from the WebElement: " + WebElementText);
				 driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr["  + i +  "]"  + "/td[1]")).click();
			 }
			 	
			}
	}
	
	public void deleteSkill() {
		try {
			deleteskill.click();
		}catch (Exception e) {
			System.out.println(e);
		}	
	}
	
}
