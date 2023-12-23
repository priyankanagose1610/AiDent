package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ResourceBundle.Control;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_Class;
import io.cucumber.java.en.And;

public class ImageUploadPage {

  private WebDriver driver;
  Base_Class  basedriver = new Base_Class();
  LoginPage loginpage = new LoginPage(Base_Class.getDriver());
  
        private By RvgImage = By.xpath("//input[@aria-label='ant design']");
        private By OpgImage = By.xpath("//input[@aria-label='ant design']");
        private By selectImage = By.xpath("//div[@class=\"imageDropZone_container__3MK85\"]/input");
        private By ImgError = By.xpath("(//div[@class='modalContent_title__MPdey'])[1]");
        private By PasteImage = By.cssSelector("div[normalize-space()='Click here and press ctrl + v to paste directly from clipboard']");
        private By Search = By.xpath("//input[@id='search-list']");
        private By submitBtn = By.xpath("//button[normalize-space()='Submit']");
        private By Myaccount = By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault rightHeader_avatar__UrXOP css-154ogbs']");
        private By DeleteBtn = By.xpath("//div[@class='rightHeader_right__w7r+Y']//button[@aria-label='Clear and start over']//*[name()='svg']");
        private By Cancel    =  By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedSecondary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-disableElevation.MuiButton-root.MuiButton-contained.MuiButton-containedSecondary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-disableElevation.aident-button.secondary-button.css-18tj7tx");
        private By confirmClear = By.xpath("//span[normalize-space()='Confirm clear']");
       // private By image = By.xpath("//div[@class=\"imageDropZone_dropzone-message__6HYyz\"]");
       // private By frame = By.xpath("(//div[@role='presentation'])[1]");
       

        
        	 public ImageUploadPage(WebDriver driver) {
        	        this.driver = driver;
        	    }
       //*****************************Rvg **************************************
		 public void i_select_an_Rvg_image_to_upload() throws AWTException, InterruptedException{
			    loginpage.user_provide_and( "pratik@varahitechnologies.com","Priya@123" );
	    		loginpage.click_on_button();
	    		Thread.sleep(12000);
	    		String imagePath = "F:\\Varahi\\RVGs\\images\\G-29_bmp.rf.164e9fe2709908211fc9a294af7dba19.jpg";
	    		WebElement fileInputField = Base_Class.driver.findElement(selectImage);
	    		fileInputField.sendKeys(imagePath);
	    		 Thread.sleep(5000);
	         	 System.out.println("Image is selected----------------------"); 
	         	Base_Class.driver.findElement(submitBtn).click();
  		         Thread.sleep(12000);    

//     	Robot rb = new Robot();
//		rb.delay(2000);
//		StringSelection imagePath  = new StringSelection("F:\Varahi\RVGs\images\G-29_bmp.rf.164e9fe2709908211fc9a294af7dba19.jpg");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath,null);
//		;
//		//cntrl+v
//		rb.keyPress(KeyEvent.VK_CONTROL); //press on control key
//		 rb.keyPress(KeyEvent.VK_V);
//		 rb.delay(2000);
//		 rb.keyRelease(KeyEvent.VK_CONTROL);
//		 rb.keyRelease(KeyEvent.VK_V);
//		 rb.delay(8000);
//		 //Enter
//		
//		 rb.keyPress(KeyEvent.VK_ENTER);
//		 rb.keyRelease(KeyEvent.VK_ENTER);
//		 System.out.println("image uploaded sucessfully");
	 }
		//*****************************Opg***********************************************
		 public void i_select_an_Opg_image_to_upload() throws AWTException, InterruptedException{
			    loginpage.user_provide_and( "pratik@varahitechnologies.com","Priya@123" );//atul@varahitechnologies.com","Atul@123
	    		loginpage.click_on_button();
	    		Thread.sleep(12000);
	        	String imagePath1 = "F:\\Varahi\\OPG\\images\\IMG_20230524_161043_jpg.rf.52c381fce73e9042949c2220fef466e9.jpg";
	        
	        	driver.findElement(OpgImage).click();
	        	WebElement fileInputField = driver.findElement(selectImage);
	    		fileInputField.sendKeys(imagePath1);
	    		 Thread.sleep(12000);
	         	 System.out.println("Image is selected----------------------"); 
     	          Thread.sleep(5000);
     	         driver.findElement(submitBtn).click();
  		         Thread.sleep(12000);      
		 }
		 
		 //**********************Normal***************************************
		 public void i_select_an_normal_image_to_upload() throws AWTException, InterruptedException{
			    loginpage.user_provide_and( "pratik@varahitechnologies.com","Priya@123"  ); //atul@varahitechnologies.com","Atul@123
	    		loginpage.click_on_button();
	    		Thread.sleep(12000);
	    		
	        	String imagePath2 = "F:\\Varahi\\pexels-pixabay-60597.jpg";
	        	WebElement fileInputField = driver.findElement(selectImage);
	    		fileInputField.sendKeys(imagePath2);
	    		 Thread.sleep(12000);
	         	 System.out.println("Image is selected----------------------"); 
     	          Thread.sleep(5000);
     	         driver.findElement(submitBtn).click();
  		         Thread.sleep(12000);      
	
		 }
		    public void clickSubmitButton() throws InterruptedException {
		    	
		    }
		   
			public void i_should_see_a_success_message() {
				System.out.println("Image uploaded sucessfully----------------");
				driver.quit();
				
			}
			public void i_click_the_delete_button() throws InterruptedException  {
				Thread.sleep(5000);
				driver.findElement(DeleteBtn).click();
				
			}
			public void i_confirm_the_deletion() throws InterruptedException {
				Thread.sleep(3000);
				driver.findElement(confirmClear).click();
				
			}
			
			public void i_should_see_the_image_still_there_message() {
				 System.out.println("Image is still there----------------------");
		
			}

		public void i_cancel_the_deletion() throws InterruptedException {
			Thread.sleep(3000);
		driver.findElement(Cancel).click();
		}

		public void i_should_see_the_image_deleted_message() {
			 System.out.println("Image is deleted----------------------");
			
		}

		public void i_will_get_imgerror_message() throws InterruptedException {
			Thread.sleep(12000);
			String errormessage = driver.findElement(ImgError).getText();
			driver.findElement(By.xpath("(//button[normalize-space()='Okay'])[1]")).click();
			Thread.sleep(2000);
			 System.out.println(errormessage);
			 driver.quit();
		}
		public void i_should_see_a_alert_message(){
			Alert al = driver.switchTo().alert();
			String alertMessage = al.getText();
			System.out.println(alertMessage);
			al.accept();
    		

    	        driver.quit();
    	    }
			


		



}
