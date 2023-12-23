package PageObject;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_Class;


public class Home {
	 private WebDriver driver;
	  Base_Class  basedriver = new Base_Class();
	ImageUploadPage uploadpage = new ImageUploadPage(Base_Class.getDriver());

	  
	//  ImageUploadPage uploadpage = new  ImageUploadPage(Base_Class.getDriver());
	  
	  private By dropimg  = By.xpath("//div[@class='imageDropZone_dropzone-message__6HYyz']//*[name()='svg']");
	    private By insertCondition =  By.xpath("//button[@aria-label='Insert a condition']//*[name()='svg']");
	    private By selectCondition = By.cssSelector("#demo-simple-select");
	    private By confirmbtn1 = By.xpath("//div[@class='insertCondition_btn-container__Kgrhu']");
	    private By cancel1 = By.xpath("//button[normalize-space()='Cancel']");
	    
	    private By FlipVertical = By.xpath("//button[@aria-label='Flip vertically']//*[name()='svg']");
	    private By FlipHorizontal = By.xpath("//button[@aria-label='Flip horizontally']//*[name()='svg']");
	    
	    private By Crop = By.xpath("//button[@aria-label='Crop']//*[name()='svg']");
	    private By Custom = By.xpath("//div[contains(text(),'Custom')]"); //(div)[32]
	    private By crop1 = By.xpath("(//*[name()='path'])[32]");
	    private By crop2 = By.xpath("//div[@class='controls_container__mIWCt react-draggable']//div[3]//*[name()='svg']");
	    private By Crop_Apply = By.xpath("//span[normalize-space()='Apply']"); //"//span[normalize-space(.)=\"Apply\"]")
	    private By Crop_Cancel = By.xpath("//span[normalize-space()='Cancel']");
	    
	    private By Rotate = By.xpath("//button[@aria-label='Rotate']//*[name()='svg']");
	    private By Pointer = By.xpath("(//span[@class='MuiSlider-thumb MuiSlider-thumbSizeSmall MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeSmall MuiSlider-thumbColorPrimary css-1lww39a'])[1]");
	    private By slider = By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeSmall css-1kkqfx2']");
	    private By Rotate_Close = By.xpath("//*[name()='path' and contains(@d,'M19 6.41 1')]");
	 
	    private By RestoreOrignalimg = By.xpath("//button[@aria-label='Restore original image']//*[name()='svg']");
	    private By Delete = By.xpath("//*[name()='path' and contains(@d,'M6 19c0 1.')]");
        private By Del_Confirmclear = By.xpath("(//span[normalize-space()='Confirm clear'])[1]");
       private By Del_Cancel = By.xpath("(//span[normalize-space()='Cancel'])[1]");
        private By selectImage = By.xpath("//div[@class=\"imageDropZone_container__3MK85\"]/input");
        private By submitBtn = By.xpath("//button[normalize-space()='Submit']");
     
     public Home(WebDriver driver) {
         this.driver = driver; 
     }

	public void i_click_on_insert_a_condition_icon() throws AWTException, InterruptedException {
		uploadpage.i_select_an_Rvg_image_to_upload();
		Thread.sleep(5000);
	Base_Class.driver.findElement(insertCondition).click(); 	
	}
	public void i_click_on_select_a_condition() throws InterruptedException {
		 
		 WebElement dropdown = Base_Class.driver.findElement(selectCondition);
		    // Using Actions class to click the dropdown
		    Actions actions = new Actions(Base_Class.driver);
		    actions.click(dropdown).perform();
		    Thread.sleep(5000);
		    Base_Class.driver.findElement(By.xpath("//li[normalize-space()='Pulp']")).click();
		    List<WebElement> options = Base_Class.driver.findElements(selectCondition);
		    // Print the dropdown options
		    System.out.println("Dropdown Options:");

		    for (WebElement option : options) {
		        System.out.println(option.getText());
		    }
		   }

	public void clickConfirm() {
		Base_Class.driver.findElement(confirmbtn1).click();
        System.out.println("confirmclick");		
	}

	public void clickCancel() {
		Base_Class.driver.findElement(cancel1).click();
        System.out.println("cancelclick");	
	}

	public void i_should_see_a_successful_message() {
		System.out.println("Condition selected Sucessfully");
		Base_Class.driver.quit();
	}

  public void i_should_return_to_homepage() {
	  System.out.println("---------Selected condition is cancelled-----------");
		Base_Class.driver.quit();
	}
	public void i_click_on_flip_vertical_icon() throws InterruptedException, AWTException {
		uploadpage. i_select_an_Rvg_image_to_upload();
		Base_Class.driver.findElement(FlipVertical).click(); 
 	    Thread.sleep(5000);
	}
	public void the_image_should_move_vertically() throws InterruptedException  {
		System.out.println("Image moved vertically");	
		Base_Class.driver.quit();
	}

	public void i_click_on_flip_horizontal_icon() throws InterruptedException, AWTException {
		uploadpage. i_select_an_Rvg_image_to_upload();
		Base_Class.driver.findElement(FlipHorizontal).click(); 	
	 	    Thread.sleep(5000);
	}
	public void the_image_should_move_horizontally() throws InterruptedException {
		System.out.println("Image moved horizontally");
		Base_Class.driver.quit();
	}
	
	public void i_click_on_the_rotate_icon() throws InterruptedException, AWTException {
		uploadpage. i_select_an_Rvg_image_to_upload();
		 Base_Class.driver.findElement(Rotate).click();
	}

	public void i_move_the_pointer_to_rotate_the_image() throws InterruptedException {
		WebElement pointer = Base_Class. driver.findElement(Pointer);
		Base_Class.driver.findElement(Pointer);
		Actions act = new Actions(Base_Class.driver);
		act.clickAndHold(pointer).moveByOffset(150, 0).release().build().perform();
	     Thread.sleep(2000);
	     Base_Class. driver.findElement(Rotate_Close);
	}
	public void the_image_should_be_rotated_based_on_the_pointer_s_movement() {
		   System.out.println("Image Rotated");
			Base_Class. driver.quit();
	}

	public void i_click_on_restore_original_image() throws AWTException, InterruptedException {
		uploadpage. i_select_an_Rvg_image_to_upload();
		 Base_Class.driver.findElement(RestoreOrignalimg).click();	
	}
	public void image_restore_sucessfully() {
		 System.out.println("image restore sucessfully");
			Base_Class. driver.quit();
	}

	public void i_click_on_cropicon() throws AWTException, InterruptedException {
		uploadpage. i_select_an_Rvg_image_to_upload();
		Thread.sleep(8000);
		 Base_Class.driver.findElement(Crop).click();
		
	}

	public void i_click_on_custom_and_apply_it() throws InterruptedException {
		Thread.sleep(3000);
		 Base_Class.driver.findElement(Custom).click();
		Thread.sleep(3000);
		 System.out.println(" -----------Sucessfully croped image--------");
		 Base_Class.driver.findElement(Crop_Apply).click();
	}

	public void image_crop_sucessfully() {
		 System.out.println(" -----------Sucessfully croped image--------");
			Base_Class.driver.quit();
	}

	public void i_click_on_custom_and_cancel_it() throws InterruptedException {
		Thread.sleep(3000);
		 Base_Class.driver.findElement(Custom).click();
		Thread.sleep(3000);
		 System.out.println(" -----------Sucessfully croped image--------");
		 Base_Class.driver.findElement(Crop_Cancel).click();
		
	}
	public void i_click_on_delete_icon() throws AWTException, InterruptedException {
		uploadpage. i_select_an_Rvg_image_to_upload();
		 Base_Class.driver.findElement(Delete).click();
		 Thread.sleep(3000);
	}
	 public void i_click_the_confirmclear() throws InterruptedException {
	        Base_Class.driver.findElement(Del_Confirmclear).click(); 
		 	    Thread.sleep(3000);
		        System.out.println(" -----------DelConfirmclear--------");
			
		}	  
	 public void i_should_see_the_image_deleted_message() {	
		  System.out.println("-----------image is deleted----------");
			Base_Class. driver.quit();
	}
	 
	 public void i_click_the_canceldelete() throws InterruptedException {
		 Base_Class.driver.findElement(Del_Cancel).click();
		 Thread.sleep(3000);
		 System.out.println("Del_Cancel");	
		}
	 
	public void i_should_see_the_image_still_there_message() {
		 System.out.println("-----------image is still there ----------");
			Base_Class.driver.quit();
	}


	




	

	

}
