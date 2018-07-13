package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CorrectDetails {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="confirmPassword")
	private WebElement confpassword;
	
	
	public void userDetails(WebDriver driver) {
		Actions user = new Actions(driver);
		user.moveToElement(username).click().sendKeys("TheLollercaster126").perform();
		user.moveToElement(password).click().sendKeys("HaxingHax798").perform();
		user.moveToElement(confpassword).click().sendKeys("HaxingHax798").perform();
	}
}
