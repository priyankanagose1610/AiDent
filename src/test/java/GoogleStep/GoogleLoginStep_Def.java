package GoogleStep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.factory.Base_Class;
import PageObject.GoogleLoginPage;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLoginStep_Def  {
	 Base_Class basedriver = new Base_Class();
	 private WebDriver driver;
	 private GoogleLoginPage googleLoginPage;
	 

	 @Given("I am on the Google login page")
	 public void i_am_on_the_google_login_page() {
		 driver = basedriver.initializedDriver("chrome");
    	googleLoginPage = new GoogleLoginPage(driver);
		driver.get("https://crmtesting.d3n4scrgmiw3r8.amplifyapp.com/");
	    
	 }

	 @When("I click the Sign in with Google")
	 public void i_click_the_sign_in_with_google() {
		 googleLoginPage.Googlelogin();
	 }


	 @When("I enter my email  {string}")
	 public void i_enter_my_email(String username) throws InterruptedException {
		 googleLoginPage.enterEmail(username);
	 }
	
	 @When("I click on Forget Password.")
	 public void i_click_on_forget_password() throws InterruptedException {
		 googleLoginPage.forgetPassword();
	 }
	 
//	 @When("I click the {string} button")
//	 public void i_click_the_button(String button) {
//	 if (button.equalsIgnoreCase("Next")) {
//	            googleLoginPage.clickNext();
//	       } else if (button.equalsIgnoreCase("Password Next")) {
//	            googleLoginPage.clickPasswordNext();
//	        }
//	 }
	 
	 @When("I click the Next button")
	 public void i_click_the_next_button() {
		 googleLoginPage.clickNext();
	 }
	 
	 @When("I enter my password {string}")
	 public void i_enter_my_password(String password) throws InterruptedException{
		  googleLoginPage.enterPassword(password);
		}

	 @When("I click the Password Next button")
	 public void i_click_the_password_next_button() throws InterruptedException {
		 googleLoginPage.clickPasswordNext();
	 }
	 @Then("I should be logged in")
	 public void i_should_be_logged_in() throws InterruptedException {
		Thread.sleep(5000);
		 System.out.println("Sucessfully login");
	        driver.quit();
	 }
	 
	
	 @Given("user on login page")
	 public void user_on_login_page() {
			 driver = basedriver.initializedDriver("chrome");
	    	googleLoginPage = new GoogleLoginPage(driver);
			driver.get("https://crmtesting.d3n4scrgmiw3r8.amplifyapp.com/");
		    
	 }
	 @When("click on loginwithgoogle link")
	 public void click_on_loginwithgoogle_link() {
		 googleLoginPage.Googlelogin();
	 }



}
	 





	
	

