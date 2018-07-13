package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Employee {
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(id="location_inputfileddiv")
	private WebElement loc;
	
	
	public void fillOutDetails(WebDriver driver) {
		Actions details = new Actions(driver);
		details.moveToElement(firstname).click().sendKeys("Yolo").perform();
		details.moveToElement(lastname).click().sendKeys("Warrior").perform();
		details.moveToElement(loc).click().perform();
		details.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).perform();
		
	}
	
}
