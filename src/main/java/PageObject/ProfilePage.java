package PageObject;
import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.factory.Base_Class;

import io.cucumber.java.en.Given;



public class ProfilePage {
	    private WebDriver driver;
	    Base_Class  basedriver = new Base_Class();
	    LoginPage loginpage = new LoginPage(Base_Class.getDriver());
	    //ImageUploadPage imgpage = new ImageUploadPage(Base_Class.getDriver());
	                              
	private By Accountprofile = By.cssSelector(".MuiAvatar-root.MuiAvatar-circular.MuiAvatar-colorDefault.rightHeader_avatar__UrXOP.css-154ogbs");
	private By profile =  By.xpath("(//li[@role='menuitem'])[1]");
	private By Points = By.xpath("//li[2]//div[1]//*[name()='svg']");
	private By Revenue = By.xpath("(//span[@class='accountMenu_item-list__oT1vl'])[3]"); 
    private By Subscribe=   By.xpath("(//li[@role='menuitem'])[4]");
    private By Logout = By.xpath("//li[5]//div[1]//*[name()='svg']");
    private By LogoutBtn = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation aident-button error-button css-18tj7tx']");
    private By CancelBtn = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation aident-button secondary-button css-18tj7tx'])[1]");
    private By Idname = By.xpath("(//div[@id='contained-modal-title-vcenter'])[1]");

   
      public ProfilePage(WebDriver driver) {
          this.driver = driver; 
      }
    
	public void user_click_on_profileicon() throws InterruptedException, AWTException {
		
		    loginpage.user_provide_and( "priyanka@varahitechnologies.com","Priyanka@123" );
	  		loginpage.click_on_button();
             Thread.sleep(10000);
	      	
	//	imgpage.i_select_an_Rvg_image_to_upload();
      	
		
	      	WebElement dropdown =  driver.findElement(Accountprofile);
	      	dropdown.click();
	      	
	         List<WebElement> options = driver.findElements(By.xpath("(//li[@role='menuitem'])"));
	         System.out.println("Total options: " + options.size());
	      
		    Thread.sleep(2000);
		   
		    for (WebElement option : options) {
		        String name = option.getText();
		        System.out.println(name);

		        if (name.equals("Subscribe")) {
		            option.click();
		            System.out.println("Option Selected");
		        } else
		            System.out.println("Option not Selected");
		    }
		    driver.findElement(profile).click();
		    Thread.sleep(5000);
		   
		   	}


	public void user_will_be_on_profile_detail_page() throws InterruptedException {
//     	WebElement dropdown1 = driver.findElement(profile);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropdown1);
		WebElement id = driver.findElement(Idname) ;
		System.out.println(id);
		driver.navigate().refresh();
		driver.quit();
		
	}

	public void user_click_on_Points() throws InterruptedException {
	    loginpage.user_provide_and( "priyanka@varahitechnologies.com","Priyanka@123" );
  		loginpage.click_on_button();
         Thread.sleep(12000);
		driver.findElement(Accountprofile).click();
		 Thread.sleep(5000);
		WebElement points = driver.findElement(Points);	
		points.click();
		System.out.println(points.getText());
		
	}

	public void user_click_on_Revenue() throws InterruptedException {
		loginpage.user_provide_and( "priyanka@varahitechnologies.com","Priyanka@123" );
  		loginpage.click_on_button();
         Thread.sleep(12000);
         driver.findElement(Accountprofile).click();
		 Thread.sleep(5000);
		 WebElement revenue = driver.findElement(Revenue);
		 revenue.click();
		System.out.println(revenue.getText());
		
	}

	public void user_click_on_Subscribe() throws InterruptedException {
		loginpage.user_provide_and( "priyanka@varahitechnologies.com","Priyanka@123" );
  		loginpage.click_on_button();
         Thread.sleep(12000);
		driver.findElement(Accountprofile).click();
		 Thread.sleep(5000);
	    driver.findElement(Subscribe).click();
		
	}

	public void whenUserClickOnLogout() throws InterruptedException {
		loginpage.user_provide_and( "priyanka@varahitechnologies.com","Priyanka@123" );
  		loginpage.click_on_button();
         Thread.sleep(12000);
         driver.findElement(Accountprofile).click();
   	    Thread.sleep(3000);
		driver.findElement(Logout).click();
   	    Thread.sleep(3000);
		driver.findElement(LogoutBtn).click();
		  
		
	}
	
	public void whenIClickCancelButton() throws InterruptedException {
		loginpage.user_provide_and( "priyanka@varahitechnologies.com","Priyanka@123" );
  		loginpage.click_on_button();
         Thread.sleep(12000);
         driver.findElement(Accountprofile).click();
    	    Thread.sleep(3000);
		driver.findElement(Logout).click();
		  Thread.sleep(3000);
		driver.findElement(CancelBtn).click();
		
	}

	public void thenUserWillRemainOnSamePage() {
		System.out.println("User will remain on same Page");
		driver.quit();
	}

	public void user_will_logout() {
		System.out.println("User will Log out and Navigate to Login Page");
		driver.quit();
	}

	

	

	}


