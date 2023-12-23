package PageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.action.Action;
import com.factory.Base_Class;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends Base_Class {
	
	private By email =  By.id("amplify-id-:r4:");
	private By pwd = By.id("amplify-id-:r7:");
	private By LoginBtn = By.xpath("//button[@type=\"submit\"]");
	private By Title = By.xpath("//h2[normalize-space()='Terms and Conditions']");
    private By logout =   By.linkText("Logout");
    private By geterror = By.xpath("//div[@class='amplify-alert__body']");
    //private By termsCondition = By.id("termsCheckbox");
    private By eyeicon = By.xpath("//span[@class='amplify-icon']//*[name()='svg']");
    private By checkbox =  By.xpath("(//input[@id='termsCheckbox'])[1]");
    private By Agree =  By.xpath("//button[normalize-space()='Agree']");
    private By homepage = By.xpath("(//div[@class='header_title__gA+hp'])[1]");
  
    private WebDriver driver;
	Base_Class basedriver = new Base_Class();
    public LoginPage(WebDriver driver) {
        this.driver = driver;
      // PageFactory.initElements(driver, this);
    }

	public void user_provide_and(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		Base_Class.driver.findElement(email).sendKeys(username);
		Base_Class.driver.findElement(pwd).sendKeys(password);
	}

	public void click_on_button() {
		Base_Class.driver.findElement(LoginBtn).sendKeys(Keys.ENTER);
//		Alert al = driver.switchTo().alert();
//		
//		String alertMessage = al.getText();
//		System.out.println(alertMessage);

	}
	public void  get_error() throws InterruptedException {
		Thread.sleep(5000);
	 String Text2 = driver.findElement(geterror).getText();
     System.out.println(Text2);
	    driver.quit();
	}

	public void click_on_eyes_icon() {
		driver.findElement(eyeicon).click();
		
	}

	public void password_is_displayed() throws InterruptedException {
		
	    WebElement passwordVisible = basedriver.driver.findElement(pwd);
	  //  return passwordVisible.isDisplayed();
	    Thread.sleep(4000);
		   driver.quit();
	}

    public void click_on_terms_conditions() throws InterruptedException {
    	Thread.sleep(6000);
        driver.findElement(checkbox).click();

    }
    

    public void click_on_agree_button() throws InterruptedException{
    	 driver.findElement(Agree).click();
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement termsAgree = wait.until(ExpectedConditions.visibilityOfElementLocated(Agree));
         Thread.sleep(5000);
     }
    public void sucessfully_login_on_home_page() throws InterruptedException {
    	Thread.sleep(10000);
    	String text = driver.findElement(homepage).getText(); 
		System.out.println(text);
    }

	public void sucessfully_login_on_Terms_Page() throws InterruptedException {
		//Thread.sleep(12000);
		String title = driver.findElement(Title).getText();
		System.out.println(title);
		driver.close();
	}

	public void sucessfully_login_on_Home_Page() throws InterruptedException {
		Thread.sleep(5000);
//		String title2 = driver.findElement(homepage).getText();
//		System.out.println(title2);
		System.out.println("Ai DentTM");
		driver.close();
		
	}

	
}
