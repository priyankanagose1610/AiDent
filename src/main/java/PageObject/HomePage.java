package PageObject;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_Class;

public class HomePage {
			

	    private By dropimg  = By.xpath("//div[@class='imageDropZone_dropzone-message__6HYyz']//*[name()='svg']");
	    private By insertCondition =  By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[1]");
	    private By selectCondition = By.xpath("//div[@id='demo-simple-select']");
	    private By confirmbtn1 = By.xpath("//div[@class='insertCondition_btn-container__Kgrhu']");
	    private By cancel1 = By.xpath("//button[normalize-space()='Cancel']");
	    
	    private By FlipVertical = By.xpath("//button[@aria-label='Flip vertically']//*[name()='svg']");
	    private By FlipHorizontal = By.xpath("//button[@aria-label='Flip horizontally']//*[name()='svg']");
	    
	    private By Crop = By.xpath("//button[@aria-label='Crop']//*[name()='svg']");
	    private By Custom = By.xpath("//body/div[@id='root']/div[@class='app_container__XBPJS']/div[@class='app_content__kzxes']/div[@class='app_canvas-container__C5f-J']/div[@class='controls_container__mIWCt react-draggable']/div[@class='controls_content__mURXT']/div[@class='cropControl_container__vsMXc']/div[@class='cropControl_aspect-ratios__ew0yu']/div[1]//*[name()='svg']");
	    private By crop1 = By.xpath("(//*[name()='path'])[32]");
	    private By crop2 = By.xpath("//div[@class='controls_container__mIWCt react-draggable']//div[3]//*[name()='svg']");
	    private By Crop_Apply = By.xpath("//span[normalize-space()='Apply']");
	    private By Crop_Cancel = By.xpath("//span[normalize-space()='Cancel']");
	    
	    private By Rotate = By.xpath("//button[@aria-label='Rotate']//*[name()='svg']");
	    private By Pointer = By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeSmall MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeSmall MuiSlider-thumbColorPrimary css-1lww39a']");
	    private By slider = By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeSmall css-1kkqfx2']");
	    private By Rotate_Close = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium controls_close-icon__ftOL9 css-vubbuv'])[1]");
	 
	    private By RestoreOrignalimg = By.xpath("//button[@aria-label='Restore original image']//*[name()='svg']");
	    private By Delete = By.xpath("//*[name()='path' and contains(@d,'M6 19c0 1.')]");
        private By Del_Confirmclear = By.xpath("//span[normalize-space()='Confirm clear']");
       private By Del_Cancel = By.xpath("(//span[normalize-space()='Cancel'])[1]");
  
       public HomePage(WebDriver driver) {
           this.driver = driver; 
       }
 	 private WebDriver driver;
	  Base_Class  basedriver = new Base_Class();
	  ImageUploadPage uploadpage = new  ImageUploadPage(Base_Class.getDriver());
		
		public void i_click_on_insert_a_condition_icon() throws AWTException, InterruptedException {
			
			uploadpage.i_select_an_Rvg_image_to_upload();
		    Thread.sleep(12000);
			driver.findElement(insertCondition).click();
			System.out.println("rvg img");
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			WebElement conditionIcon = wait.until(ExpectedConditions.elementToBeClickable(insertCondition));
//			conditionIcon.click();
		
		}
		
		public void i_click_on_select_a_condition() throws InterruptedException {
	    WebElement dropdown = driver.findElement(selectCondition);
		 Select sel = new Select(dropdown);
		 
		 sel.selectByVisibleText("Pulp");
		 List<WebElement> opt = sel.getOptions();
		    
		    System.out.println("Total option" + opt.size());
		    Thread.sleep(2000);
		    
		 for(WebElement ele : opt) {
		    	String name = ele.getText();
		    	System.out.println(name);
		    	
		    	if(name.equals("Pulp")) {
		    		sel.selectByVisibleText(name);
		    		System.out.println("Option Selected");
		    	}else
		    		System.out.println("Option not  Selected");
		    }

		}

		
		 public void Confirm() {
	    	 driver.findElement(confirmbtn1);
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(confirmbtn1));
	         nextButtonElement.click();
	         System.out.println("confirmclick");
	    }
		 
		 public void Cancel() {
	    	 driver.findElement(cancel1);
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(cancel1));
	         nextButtonElement.click();
	         System.out.println("cancelclick");
	    }
		 
		 public void i_should_see_a_successful_message() {
				System.out.println("Condition selected Sucessfully");
				driver.close();
			}

			public void i_should_return_to_homepage() {
				driver.findElement(dropimg);
				System.out.println("Condition selected Sucessfully");	
			}	 

			public void i_click_on_flip_vertical_icon() throws InterruptedException, AWTException {
				uploadpage.i_select_an_Rvg_image_to_upload();
			    Thread.sleep(12000);
				 Base_Class.driver.findElement(FlipVertical);
				 Thread.sleep(3000);
			}

			public void the_image_should_move_vertically() throws InterruptedException, AWTException {
				uploadpage.i_select_an_Rvg_image_to_upload();
			    Thread.sleep(12000);
				 Base_Class.driver.findElement(FlipHorizontal);	
				 Thread.sleep(3000);
			}

			public void i_click_on_the_rotate_icon() {
				 Base_Class.driver.findElement(Rotate);
			}

			public void i_move_the_pointer_to_rotate_the_image() throws InterruptedException {
//				 WebElement frame = driver.findElement(slider);
//				 driver.switchTo().frame(frame);
				WebElement pointer = Base_Class. driver.findElement(Pointer);
				Actions act = new Actions(driver);
				act.clickAndHold(pointer).moveByOffset(200, 0).release().build().perform();
			     Thread.sleep(8000);
			     Base_Class. driver.findElement(Rotate_Close);
			}

			public void the_image_should_be_rotated_based_on_the_pointer_s_movement() {
				   System.out.println("Image Rotated");
			}

			public void i_click_on_restore_original_image() {
				driver.findElement(RestoreOrignalimg).click();
				
			}

			public void image_restore_sucessfully() {
				 System.out.println("image restore sucessfully");
			}
			
			public void i_click_on_delete_icon() {
				driver.findElement(Delete);
				
			}
			 public void Confirm_Clear() {
		    	 driver.findElement( Del_Confirmclear);
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		         WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable( Del_Confirmclear));
		         nextButtonElement.click();
		         System.out.println(" DelConfirmclear");
		    }
			 public void i_should_see_the_image_deleted_message() {
					
				  System.out.println("image is deleted");
			}
			 public void cancel() {
		    	 driver.findElement(Del_Cancel);
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		         WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(Del_Cancel));
		         nextButtonElement.click();
		         System.out.println("DelCancel");
		    }

			public void i_should_see_the_image_still_there_message() {
				  System.out.println("image is still there");
				
			}	    
}
