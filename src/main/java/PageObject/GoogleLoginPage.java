package PageObject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_Class;


public class GoogleLoginPage {
	
		private WebDriver driver;
      Base_Class  basedriver = new Base_Class();
      
	        private By Googlelogin = By.xpath("//button[@class='amplify-button amplify-field-group__control federated-sign-in-button']");
	        private By emailInput = By.cssSelector("input[type='email']");
	       // private By nextButton = By.xpath(span[normalize-space()='Next']) ;
	       private By nextButton = By.cssSelector("div#identifierNext");
	        private By passwordInput = By.cssSelector("input[type='password']");
	        private By passwordNextButton = By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]");
	       private By ForgetPassword = By.xpath("(//span[normalize-space()='Forgot password?'])[1]");
	        private By ShowPassword = By.xpath("(//input[@type='checkbox'])[1]");	
            private By homepage = By.xpath("//div[@class='header_title__gA+hp']");	    
	    
	       public GoogleLoginPage(WebDriver driver) {
	        this.driver = driver;

	    }
	    public void Googlelogin(){
	    	Base_Class.driver.findElement(Googlelogin);
	    	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	           WebElement googleLoginElement = wait.until(ExpectedConditions.elementToBeClickable(Googlelogin));
	           googleLoginElement.click();
	      //     driver.navigate().to("");
		}	
	    
//	    public void enterEmail(String username) throws InterruptedException {
//			Thread.sleep(5000);
//		   driver.findElement(emailInput).sendKeys(username);
//			
//		}

		public void enterEmail(String username){
			driver.findElement(emailInput);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement emailInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
	        emailInputElement.sendKeys(username);
	    }
		
	    public void clickNext() {
	    	 driver.findElement(nextButton);
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
	         nextButtonElement.click();
	         System.out.println("Aident");
	    }
//	    public void enterPassword(String password) throws InterruptedException{ 
//	    	Thread.sleep(5000);
//			driver.findElement(passwordInput).sendKeys(password);
//	    }

    public void enterPassword(String password){ 
	     driver.findElement(passwordInput);
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement passwordInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
	        passwordInputElement.sendKeys(password);
	        driver.findElement(ShowPassword).click();	 
	    }

	    public void clickPasswordNext() throws InterruptedException {
	    	  WebElement passwordNextButtonElement = Base_Class.driver.findElement(passwordNextButton); 
	    	
	    	    // Using JavascriptExecutor to click the element
	    	    JavascriptExecutor executor = (JavascriptExecutor) Base_Class.driver;
	    	    executor.executeScript("arguments[0].click();", passwordNextButtonElement);
	    	    Thread.sleep(5000);

	}

	  public void i_should_be_logged_in() throws InterruptedException {    	
	  String text =  driver.findElement(homepage).getText();
			 System.out.println(text);
			 Thread.sleep(5000);
		        driver.quit();
}
	public void forgetPassword() throws InterruptedException {
	driver.findElement(ForgetPassword).click();
	Thread.sleep(3000);
	driver.quit();
		
	}
	
	
	
}