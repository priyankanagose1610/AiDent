package PageObject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_Class;

public class SearchPage {
	  private WebDriver driver;
	  Base_Class  basedriver = new Base_Class();
	  ImageUploadPage imgpage = new ImageUploadPage(Base_Class.getDriver());
	    
		private By Search   = By.xpath("(//input[@id='search-list'])[1]");
		private By Searcherror = By.xpath("//p[@id='search-list-helper-text']");
	      public SearchPage(WebDriver driver) {
	          this.driver = driver; 
	      }
	    

		public void i_enter_into_the_search_bar(String term) throws InterruptedException, AWTException {

			imgpage.i_select_an_Rvg_image_to_upload();
			WebElement searchElement = driver.findElement(Search);
			Thread.sleep(8000);
			searchElement.sendKeys(term);
			Thread.sleep(2000);
	        String name = searchElement .getText();
			
		}

		public void i_should_see_a_list_related_to_term() {
			  System.out.println(" got term_------------ ");
			  driver.close();			
		}


		public void i_will_get_error_message() {
		String errormsg =	driver.findElement(Searcherror).getText();
		System.out.println(errormsg);
		driver.quit();
		}
}
