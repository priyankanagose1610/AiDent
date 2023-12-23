package PrintStep;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.factory.Base_Class;

import PageObject.ImageUploadPage;
import PageObject.PrintPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintStep_Def {

	
	Base_Class basedriver = new Base_Class();
	PrintPage printPage = new PrintPage(Base_Class.getDriver());
	private WebDriver driver;
	 
 
	@Given("user on login page")
	public void user_on_login_page() {
		 driver = basedriver.initializedDriver("chrome");
    	 printPage  = new PrintPage (driver);
	        driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");
	        driver.manage().window().maximize();
	}
	@When("user click on download")
	public void user_click_on_download() throws InterruptedException, AWTException {
		printPage.user_click_on_download();
	}
	@Then("x-ray will download")
	public void x_ray_will_download() throws InterruptedException {
		printPage.x_ray_will_download();
	}
	@When("user click on Print")
	public void user_click_on_print() throws InterruptedException, AWTException, IOException  {
		printPage.user_click_on_print();
	}
	
	@Then("we will get print of x-ray")
	public void we_will_get_print_of_x_ray() {
		printPage.we_will_get_print_of_x_ray();
	}



	
	
	
	
	

}
