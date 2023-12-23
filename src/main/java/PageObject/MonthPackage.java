package PageObject;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_Class;

public class MonthPackage {
	
	  private WebDriver driver;
	  Base_Class  basedriver = new Base_Class();
	//  ProfilePage profpage = new ProfilePage(Base_Class.getDriver());
	  LoginPage loginpage = new LoginPage(Base_Class.getDriver());
	 private By Phonepe = By.xpath("//button[@data-type= 'individual']");
	 private By Buy_Package  = By.xpath("//button[normalize-space()='Buy Package']");
	 private By MontlySubscribe = By.xpath("(//button[@type='button'][normalize-space()='SUBSCRIBE'])[1]");
	 private By Mon_EarlyBird = By.xpath("(//input[@id='customCheck1'])[1]");
	 private By HalfYearlySubscribe = By.xpath("(//button[@type='button'][normalize-space()='SUBSCRIBE'])[2]");
	 private By Half_EarlyBird = By.xpath("(//input[@id='customCheck2'])[1]");
	 private By YearlySubscribe = By.xpath("(//button[@type='button'][normalize-space()='SUBSCRIBE'])[3]");
	 private By Yearly_EarlyBird= By.xpath("(//input[@id='customCheck3'])[1]");
	 private By cardno = By.id("card_number");
	 private By expirey= By.id("card_expiry");
	 private By cvv = By.id("card_cvv");
	 private By fourdigitPin = By.xpath("//input[@placeholder='OTP']");
	 private By SubmitBtn = By.xpath("(//button[@id='submit-action'])[1]");
	 private By CloseBtn = By.xpath("(//button[@type='button'])[27]");
	 private By PayNowBtn = By.id("redesign-v15-cta");
	// private By Pay_without_saving_card = By.className("later-button btn svelte-1wnplxx");
	// private By card = By.className("svelte-wf46od title-one-cc");
	 
	    public MonthPackage(WebDriver driver) {
	        this.driver = driver;
	     
	    }
		public void user_clicks_on_buy_package() throws InterruptedException, AWTException {
 	//	profpage.user_click_on_profileicon();
			 
			loginpage.user_provide_and( "priyanka@varahitechnologies.com","Priyanka@123" );
    		loginpage.click_on_button();
        	Thread.sleep(10000);
        	driver.findElement(By.xpath("(//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault rightHeader_avatar__UrXOP css-154ogbs'])[1]")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//span[normalize-space()='Subscribe']")).click();
        	Thread.sleep(1000);
        	driver.findElement(Buy_Package).click();
			
		}
	public void clicks_on_monthly_subscribe() throws InterruptedException  {
			Thread.sleep(3000);
			driver.findElement(MontlySubscribe).click();
			Thread.sleep(3000);
		//	driver.findElement(CloseBtn).click();	
	
			}
		
		public void User_clicks_on_earlybird_discount1() {
			driver.findElement(Mon_EarlyBird).click();	
		}
		
		public void clicks_on_Half_Yearly_subscribe() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(HalfYearlySubscribe).click();
			//driver.findElement(CloseBtn).click();	
		
		}
		
		public void User_clicks_on_earlybird_discount2() {
			driver.findElement(Half_EarlyBird).click();				
		}
			
		public void clicks_on_yearly_subscribe() throws InterruptedException{
			Thread.sleep(5000);
			driver.findElement(YearlySubscribe).click();	
		//	driver.findElement(CloseBtn).click();
		}
		public void User_clicks_on_earlybird_discount3() {
        	 driver.findElement(Yearly_EarlyBird).click();
			
		}
		
		public void clicks_on_card_details() {
		//	driver.findElement(card).click();
			
		}
		public void enters_and_and(String card_no, String expirey_date, String cvv_no) {
				driver.findElement(cardno).sendKeys(card_no );
			  driver.findElement(expirey).sendKeys(expirey_date);
			 driver.findElement(cvv).sendKeys(cvv_no);
			 
		}
		public void clicks_on_pay_now( ) {
			driver.findElement(PayNowBtn).click();
		}
		public void clicks_on_pay_without_saving_card() {
         //    driver.findElement(Pay_without_saving_card).click();
            
		}
		public void enters_and_clicks_on_submit(String OTP_pin) {
			 driver.findElement(fourdigitPin).sendKeys( OTP_pin);
				driver.findElement(SubmitBtn).click();
			
		}
		public void payment_is_successful() {
			System.out.println("Payment Sucessfull");	
			driver.quit();
		}

		}

	

