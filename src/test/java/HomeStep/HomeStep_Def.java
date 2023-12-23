package HomeStep;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_Class;

import PageObject.GoogleLoginPage;
import PageObject.Home;
import PageObject.HomePage;
import PageObject.ImageUploadPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep_Def {
	
	Base_Class basedriver = new Base_Class();
	Home home = new Home(Base_Class.getDriver());
	private WebDriver driver;

	 @Given("I am on the page with an image")
	 public void i_am_on_the_page_with_an_image() {
		 driver = basedriver.initializedDriver("chrome");
    	 Home home = new Home(driver);
	      driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");

	 }

	 @When("I click on Insert a Condition icon")
	 public void i_click_on_insert_a_condition_icon() throws AWTException, InterruptedException {
	    home. i_click_on_insert_a_condition_icon() ;
	 }
	 @When("I click on Select a Condition")
	 public void i_click_on_select_a_condition() throws InterruptedException {
	    home.i_click_on_select_a_condition() ;
	 } 

	 @When("I click on {string} button")
	 public void i_click_on_button(String button) {
			 if (button.equalsIgnoreCase("Confirm")) {
			            home.clickConfirm();
			       } else if (button.equalsIgnoreCase("Cancel")) {
			           home.clickCancel();
			        }
	 }

	 @Then("I should see a successful message")
	 public void i_should_see_a_successful_message(){	 
		 home.i_should_see_a_successful_message();
	 }
	
	
	 @Then("I should return to homepage")
	 public void i_should_return_to_homepage() {
		 home.i_should_return_to_homepage();
	 }
	 
	 @When("I click on Flip Vertical icon")
	 public void i_click_on_flip_vertical_icon() throws InterruptedException, AWTException {
	    home.i_click_on_flip_vertical_icon();
	 }
	 @Then("the image should move vertically")
	 public void the_image_should_move_vertically() throws InterruptedException {
	    home.the_image_should_move_vertically() ;
	 }
	 @When("I click on  Flip Horizontal icon")
	 public void i_click_on_flip_horizontal_icon() throws InterruptedException, AWTException {
     	home.i_click_on_flip_horizontal_icon();
	 }
	 @Then("the image should move horizontally")
	 public void the_image_should_move_horizontally() throws InterruptedException {
	   home.the_image_should_move_horizontally();
	 }
	 @When("I click on the Rotate icon")
	 public void i_click_on_the_rotate_icon() throws InterruptedException, AWTException {
	    home. i_click_on_the_rotate_icon();
	 }

	 @When("I move the pointer to rotate the image")
	 public void i_move_the_pointer_to_rotate_the_image() throws InterruptedException {
	    home.i_move_the_pointer_to_rotate_the_image();
	 }

	 @Then("the image should be rotated based on the pointer's movement")
	 public void the_image_should_be_rotated_based_on_the_pointer_s_movement() {
	     home.the_image_should_be_rotated_based_on_the_pointer_s_movement();
	 }


	 @When("I click on Restore Original image")
	 public void i_click_on_restore_original_image() throws AWTException, InterruptedException {
	   home.i_click_on_restore_original_image();
	 }

	 @Then("image restore sucessfully.")
	 public void image_restore_sucessfully() {
	    home.image_restore_sucessfully();
	 }
	 
	 @When("I click on Cropicon.")
	 public void i_click_on_cropicon() throws AWTException, InterruptedException {
		 home.i_click_on_cropicon();
	 }
	 @When("I click on custom and Apply it.")
	 public void i_click_on_custom_and_apply_it() throws InterruptedException {
		 home.i_click_on_custom_and_apply_it();
	 }
	 @Then("image crop Sucessfully.")
	 public void image_crop_sucessfully() {
		 home.image_crop_sucessfully();
	 }

	 @When("I click on custom and Cancel it.")
	 public void i_click_on_custom_and_cancel_it() throws InterruptedException {
		 home.i_click_on_custom_and_cancel_it();
	 }

	 @When("I click the confirmclear")
	 public void i_click_the_confirmclear() throws InterruptedException {
		 home.i_click_the_confirmclear();
	 }

	 @When("I click the Canceldelete")
	 public void i_click_the_canceldelete() throws InterruptedException {
	     home.i_click_the_canceldelete();
	 }

	 @When("I click on delete icon .")
	 public void i_click_on_delete_icon() throws AWTException, InterruptedException {
	   home.i_click_on_delete_icon();
	 }

	 @Then("I should see the image deleted message")
	 public void i_should_see_the_image_deleted_message() {
	     home.i_should_see_the_image_deleted_message();
	 }


	 @Then("I should see the image still there message")
	 public void i_should_see_the_image_still_there_message() {
	    home.i_should_see_the_image_still_there_message();
	 }

	 

	 }
	 
	

	
      //////////////////////////////////
	
	 ////////////////////////////////////
	

