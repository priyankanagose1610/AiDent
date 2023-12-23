package PageObject;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.factory.Base_Class;

public class PrintPage {

	 private WebDriver driver;
	  Base_Class  basedriver = new Base_Class();
	  ImageUploadPage uploadimg = new  ImageUploadPage(Base_Class.getDriver());
	 private By download  = By.xpath("//button[@aria-label='download']//*[name()='svg']");
	 private By Print = By.xpath("//*[name()='path' and contains(@d,'M19 8H5c-1')]");
	 private By Printxray = By.className("action-button");
	 private By CancelBtn= By.className("cancel-button");
	
	    public PrintPage(WebDriver driver) {
	        this.driver = driver;  
	    }

		public void user_click_on_download() throws InterruptedException, AWTException {
			uploadimg.i_select_an_Rvg_image_to_upload();
			driver.findElement(download).click();
		}

		public void x_ray_will_download() throws InterruptedException {
			Thread.sleep(3000);
		System.out.println("X-ray will download ");
		}

		public void user_click_on_print() throws InterruptedException, AWTException, IOException {
			driver.findElement(Print).click();
			Thread.sleep(5000);
			//driver.findElement(Printxray);
			TakesScreenshot tss = (TakesScreenshot)driver;
			//step-2  calling getScreenShot
		    File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		   // step-3  path of location where we want to store screen shot 
		    String path =  "C:\\Users\\IdeaPad\\OneDrive\\Desktop\\Selenium1\\DentalAi\\ScreenShot\\snap1.png";
		   // String path = System.getProperty("user.dir")+"\\ScreenShot\\snap.png";
		   //step-4 File Class
		   File destinationFile = new File(path);
		    //Step-5 file to copy and to which destination
		   FileHandler.copy(sourceFile, destinationFile);
		   System.out.println("Screenshot capture successfully ");
			
		}

		public void we_will_get_print_of_x_ray() {
				System.out.println("----------Printed X-ray---------- ");
				driver.quit();
		}
	    
}
