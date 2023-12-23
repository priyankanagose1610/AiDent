package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class common {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\IdeaPad\\\\OneDrive\\\\Desktop\\\\Selenium1\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");
		Thread.sleep(5000);
		WebElement googlelogin = driver.findElement(By.xpath("//button[@class='amplify-button amplify-field-group__control federated-sign-in-button']"));
		googlelogin.click();
		WebElement gemail =driver.findElement(By.cssSelector("input[type='email']"));
		WebElement gnext = driver.findElement(By.cssSelector("div#identifierNext"));
		WebElement gpass = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement pnext = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]"));
		
		
		WebElement email = driver.findElement(By.id("amplify-id-:r4:"));
		email.sendKeys("priyanka@varahitechnologies.com");
		Thread.sleep(5000);
		WebElement Password = driver.findElement(By.xpath("amplify-id-:r7:"));
		email.sendKeys("Priy@123");
		Thread.sleep(5000);
		WebElement Button = driver.findElement(By.cssSelector("button[type='submit']"));
		Button.click();
		Thread.sleep(5000);
		WebElement terms = driver.findElement(By.xpath("(//input[@id='termsCheckbox'])[1]"));
         terms.click();
         WebElement Agree = driver.findElement(By.xpath("//button[normalize-space()='Agree']"));
         terms.click();
         WebElement dropdown = driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault rightHeader_avatar__UrXOP css-154ogbs']//*[name()='svg']"));
         dropdown.click();
         Select sel = new Select(dropdown);
		 List<WebElement> opt = sel.getOptions();
		    
		    System.out.println("Total option" + opt.size());
		    Thread.sleep(2000);
		    
		 for(WebElement ele : opt) {
		    	String name = ele.getText();
		    	System.out.println(name);
	}

	}}
