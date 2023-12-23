package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_Class;


public class loginwith_Aident {
	Base_Class basedriver = new Base_Class();
	private WebDriver driver;

	private By loginwithgoogle = By.xpath("//button[@class='amplify-button amplify-field-group__control federated-sign-in-button']");
//	private By title = By.xpath("");

	public loginwith_Aident(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_on_loginwithgoogle_link() {
		WebElement icon = Base_Class.driver.findElement(loginwithgoogle);
		icon.click();

		Base_Class.driver.switchTo().activeElement();	 
	}

	public void display_login_icon() {
		WebElement icon = Base_Class.driver.findElement(loginwithgoogle);
		icon.isDisplayed();
	}	
	
}
