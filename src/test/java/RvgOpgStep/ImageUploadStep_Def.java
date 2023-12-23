package RvgOpgStep;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.factory.Base_Class;
import PageObject.ImageUploadPage;
import PageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ImageUploadStep_Def {

	Base_Class basedriver = new Base_Class();
	ImageUploadPage uploadPage = new ImageUploadPage(Base_Class.getDriver());
	private WebDriver driver;
	
    @Given("I am on the upload page")
    public void i_am_on_the_upload_page()
    {
    	 driver = basedriver.initializedDriver("chrome");
    	 uploadPage = new ImageUploadPage (driver);
	        driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");
	     //   https://crm.d3n4scrgmiw3r8.amplifyapp.com/
    }
   
    @When("I select an Rvg image to upload")
    public void i_select_an_Rvg_image_to_upload()throws AWTException, InterruptedException {
        uploadPage.i_select_an_Rvg_image_to_upload();
    }


    @When("I select an Opg image to upload")
    public void i_select_an_Opg_image_to_upload()throws AWTException, InterruptedException {
        uploadPage.i_select_an_Opg_image_to_upload();
    }
    @When("I select an normal image to upload")
    public void i_select_an_normal_image_to_upload()throws AWTException, InterruptedException {
        uploadPage.i_select_an_normal_image_to_upload();
    }
    @And("I click the submit button")
    public void clickSubmitButton() throws InterruptedException {
    	Thread.sleep(3000);
    	 uploadPage.clickSubmitButton();
    }
  
    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
       uploadPage.i_should_see_a_success_message();
    }
  
    @Then("I will get Imgerror Message")
	public void i_will_get_imgerror_message() throws InterruptedException {
	   uploadPage.i_will_get_imgerror_message();
	}
  
    @Then("I should see a Alert message")
    public void i_should_see_a_alert_message() {
        uploadPage.i_should_see_a_alert_message();
     }
	    
    @When("I click the delete button")
	public void i_click_the_delete_button() throws InterruptedException {
    	 uploadPage.i_click_the_delete_button();
	}


	@When("I confirm the deletion")
	public void i_confirm_the_deletion() throws InterruptedException {
	   uploadPage.i_confirm_the_deletion();
	}

	@Then("I should see the image deleted message")
	public void i_should_see_the_image_deleted_message() {
		 uploadPage.i_should_see_the_image_deleted_message() ;
		 
//		String deleteMessage = uploadPage.i_should_see_the_image_deleted_message() ;
//      Assert.assertEquals("Image deleted message not displayed", "Image Deleted!", deleteMessage);
	}
	@When("I cancel the deletion")
    public void i_cancel_the_deletion() throws InterruptedException {
		uploadPage.i_cancel_the_deletion();
    }
   
    @Then("I should see the image still there message")
	    public void i_should_see_the_image_still_there_message() {
    	 uploadPage.i_should_see_the_image_still_there_message();
//    	 String message = uploadPage.i_should_see_the_image_still_there_message();
//    	 Assert.assertEquals("Image Still There!", message);
     }

     @After
	    public void closeBrowser() {
	        Base_Class.driver.quit();
	    }
}
