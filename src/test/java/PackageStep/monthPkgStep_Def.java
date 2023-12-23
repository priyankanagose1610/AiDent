package PackageStep;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.factory.Base_Class;

import PageObject.ImageUploadPage;
import PageObject.MonthPackage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class monthPkgStep_Def {


	Base_Class basedriver = new Base_Class();
	MonthPackage monthPage = new MonthPackage(Base_Class.getDriver());
	private WebDriver driver;
	public monthPkgStep_Def() {
      
    }

	@Given("User is on the profileDetail page")
	public void user_is_on_the_profile_detail_page() {
		 driver = basedriver.initializedDriver("chrome");
    	 monthPage  = new MonthPackage (driver);
	        driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");
	}
	
	@When("user clicks on Buy Package")
	public void user_clicks_on_buy_package() throws InterruptedException, AWTException  {
		 monthPage.user_clicks_on_buy_package();
	}
	
	@When("Clicks on Monthly Subscribe")
	public void clicks_on_monthly_subscribe() throws InterruptedException {
		monthPage.clicks_on_monthly_subscribe();
	}
	@When("User clicks on earlybird discount1")
	public void user_clicks_on_earlybird_discount1() {
		monthPage.User_clicks_on_earlybird_discount1();	
	}

	@When("Clicks on Half Yearly Subscribe")
	public void clicks_on_Half_Yearly_subscribe1() throws InterruptedException  {
		monthPage.clicks_on_Half_Yearly_subscribe();
	}
	@When("User clicks on earlybird discount2")
	public void User_clicks_on_earlybird_discount2() {
	monthPage.User_clicks_on_earlybird_discount2();
	}

	
	@When("User clicks on earlybird discount3")
	public void User_clicks_on_earlybird_discount3() {
		monthPage.User_clicks_on_earlybird_discount3();
	}


	@When("Clicks on card details")
	public void clicks_on_card_details() {
		monthPage.clicks_on_card_details();
	}
	
	@When("Enters \"{string}\" and \"{string}\" and \"{string}\"")
	public void enters_and_and(String card_no, String expirey_date, String cvv_no)  {
	    monthPage.enters_and_and(card_no, expirey_date, cvv_no);
	}

	@When("Clicks on pay_now")
	public void clicks_on_pay_now() {
		monthPage.clicks_on_pay_now();
	}
	
	@When("Clicks on Pay without saving card")
	public void clicks_on_pay_without_saving_card() {
	monthPage.clicks_on_pay_without_saving_card();
	}
	
	@When("Enters \"\"{string}\"\" and clicks on Submit")
	public void enters_and_clicks_on_submit(String OTP_pin) {
		monthPage.enters_and_clicks_on_submit(OTP_pin);
	}
	
	@Then("Payment is Successful")
	public void payment_is_successful() {
		monthPage.payment_is_successful() ;
	}

	@When("Clicks on  Yearly Subscribe")
	public void clicks_on_yearly_subscribe() throws InterruptedException {
		monthPage.clicks_on_yearly_subscribe();
	}



	

}





