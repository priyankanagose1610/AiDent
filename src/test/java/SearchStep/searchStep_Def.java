package SearchStep;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.factory.Base_Class;

import PageObject.ProfilePage;
import PageObject.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStep_Def {

		Base_Class basedriver = new Base_Class();
		SearchPage search = new SearchPage(Base_Class.getDriver());
		private WebDriver driver;
		
		 
		@Given("User on home page")
		public void user_on_home_page() {
			driver = basedriver.initializedDriver("chrome");
	   	     search = new SearchPage(driver);
		        driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");

		}   
	

	@When("I enter {string} into the search bar")
	public void i_enter_into_the_search_bar(String term) throws InterruptedException, AWTException {
	 search.i_enter_into_the_search_bar(term);
	}
	@Then("I should see a list related to term")
	public void i_should_see_a_list_related_to_term() {
	 search.i_should_see_a_list_related_to_term();
	}

	@Then("I will get error message")
	public void i_will_get_error_message() {
	   search.i_will_get_error_message();
	}



}
