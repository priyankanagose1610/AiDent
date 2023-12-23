package com.factory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.util.configuration;

import PageObject.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class  {	

	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	 public static WebDriver driver;
	public LoginPage loginPg;
	public static Properties prop;
	public WebDriver initializedDriver(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options= new ChromeOptions();
//			options.addArguments("--remote-allow-origins=*");
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\IdeaPad\\OneDrive\\Desktop\\Selenium1\\chrome driver\\chromedriver-win64\\chromedriver.exe");
			
               driver = new ChromeDriver(options);	

		}else if (browser.equalsIgnoreCase("Firefox")) {
			//System.setProperty("webdriver.gecho.driver","C:\\Users\\IdeaPad\\OneDrive\\Desktop\\Selenium1\\gecho driver\\geckodriver.exe");
			FirefoxOptions options= new FirefoxOptions();	
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\IdeaPad\\OneDrive\\Desktop\\Selenium1\\gecho driver\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  
		}else  {
			System.out.println( browser+"browser not suported");
		}
		return getDriver();
	}
	
	
	public static  WebDriver getDriver() {
		return  driver;
	}
	 
	
		
	}
	
	
	
//public void loadConfig() {
//try {
//	prop = new Properties();
//	System.out.println("super constructor invoked");
//	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + ".\\src\\test\\resources\\configfiles\\config.properties");
//	prop.load(ip);
//	System.out.println("driver: + driver");
//	
//}catch(FileNotFoundException e) {
//	e.printStackTrace();
//}catch (IOException e) {
//	e.printStackTrace();
//}
//}
	

	
