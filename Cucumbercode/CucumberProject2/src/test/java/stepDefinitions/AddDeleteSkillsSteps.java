package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.SkillsPage;

public class AddDeleteSkillsSteps extends BaseDriver{
	WebDriver driver = getDriver();
	public SkillsPage sp = new SkillsPage(driver);
	public HomePage hp;
	
	@Then("Go to Skill Page")
	public void go_to_Skill_Page() {
		hp = new HomePage(driver);
	    hp.goToSkillPage();
	}

	@When("Add skills with {string} and {string}")
	public void add_skills_with_and(String skillname, String skilldesc) {
		sp = new SkillsPage(driver);
		sp.addSkill();
	    sp.enterSkillName(skillname);
	    sp.enterDesc(skilldesc);
	}

	@Then("Click on Save button")
	public void click_on_Save_button() {
	   sp.saveSkill();
	}
	
	@Then("Select {string} record to delete")
	public void select_record_to_delete(String skillname) {
		sp.selectRecord(skillname);
	}
	
	@Then("Click on Delete button to delete selected record")
	public void click_on_Delete_button_to_delete_selected_record() {
	    sp.deleteSkill();
	}
	
}
