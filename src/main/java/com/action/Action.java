package com.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.factory.Base_Class;

public class Action extends Base_Class {
 
	public static void click(WebDriver ldriver, WebElement locatorName) {
		Actions act = new Actions(ldriver);
		act.moveToElement(locatorName).click().build().perform();
	}
}
