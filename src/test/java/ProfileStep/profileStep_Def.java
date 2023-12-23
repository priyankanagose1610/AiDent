package ProfileStep;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.factory.Base_Class;

import PageObject.ImageUploadPage;
import PageObject.LoginPage;
import PageObject.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class profileStep_Def {
     
	Base_Class basedriver = new Base_Class();
	ProfilePage profile = new ProfilePage(Base_Class.getDriver());
	private WebDriver driver;
	
	 
	@Given("User on home page")
	public void user_on_home_page() {
		driver = basedriver.initializedDriver("chrome");
   	     profile = new ProfilePage(driver);
	        driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");

	}   
	
	@When("user click on Profileicon")
	public void user_click_on_profileicon() throws InterruptedException, AWTException {
	    profile.user_click_on_profileicon();
	}
	@When("user click on Points")
	public void user_click_on_Points() throws InterruptedException, AWTException {
	    profile.user_click_on_Points();
	}
	@When("user click on Revenue")
	public void user_click_on_Revenue() throws InterruptedException, AWTException {
	    profile.user_click_on_Revenue();
	}
	@When("user click on Subscribe")
	public void user_click_on_Subscribe() throws InterruptedException, AWTException {
	    profile.user_click_on_Subscribe();
	}
	
	@Then("user will be on profileDetail page")
	public void user_will_be_on_profile_detail_page() throws InterruptedException {
	    profile.user_will_be_on_profile_detail_page();
	}
	  @When("user click on Logout")
	    public void whenUserClickOnLogout() throws InterruptedException {
	       profile.whenUserClickOnLogout();
	    }

	    @When("I click the logout button")
	    public void whenIClickLogoutButton() throws InterruptedException {
	        profile.whenIClickCancelButton();
	    }

	    @When("I click the cancel button")
	    public void whenIClickCancelButton() throws InterruptedException {
	        profile.whenIClickCancelButton();
	    }

	    @Then("User will remain on same page.")
	    public void thenUserWillRemainOnSamePage() {
	       profile.thenUserWillRemainOnSamePage();
	    }
	   

	    @Then("User will logout.")
	    public void user_will_logout() {
	       profile.user_will_logout();
	    }




}
