package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccountPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IdeaPad\\Desktop\\Selenium1\\chromedriver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");	
	}

}
