package LoginStep;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.factory.Base_Class;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep_Def {
	Base_Class basedriver = new Base_Class();
	//LoginPage login = new LoginPage(basedriver.getDriver());
	 private WebDriver driver;
	 private LoginPage login;
	 
	@Given("user on login page")
	public void user_on_login_page() {
		    driver = basedriver.initializedDriver("chrome");
		        login = new LoginPage(driver);
		        driver.get("https://crmtesting.d3n4scrgmiw3r8.amplifyapp.com/");
	}      

	@When("user provide {string} and {string}")
	public void user_provide_and(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
		login.user_provide_and( username, password);
	}

	@When("click on button")
	public void click_on_button() {
	   login.click_on_button();
	}
	@Then ("sucessfully login on Terms Page")
	public void sucessfully_login_on_Terms_Page() throws InterruptedException {
		  login.sucessfully_login_on_Terms_Page();
		}
	
	  @Then("sucessfully login on Home Page")
	    public void sucessfully_login_on_Home_Page() throws InterruptedException {
	    	login.sucessfully_login_on_Home_Page();
	    }
	

	@Then("get error")
	public void get_error() throws InterruptedException {
	 login.get_error();
	}

	@Then("click on eyes icon")
	public void click_on_eyes_icon() {
	   login.click_on_eyes_icon();
	}
	@Then("password is displayed")
	public void password_is_displayed() throws InterruptedException {
	   login.password_is_displayed();

	}
	 
    @When("click on termsConditions")
    public void click_on_terms_conditions() throws InterruptedException {
        login.click_on_terms_conditions();
    }
    @When("click on AgreeButton")
    public void click_on_agree_button() throws InterruptedException {
       login.click_on_agree_button();
    }
  


}

