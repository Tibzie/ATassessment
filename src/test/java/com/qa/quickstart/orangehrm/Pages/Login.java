package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement submit;
	
	public void loggingIn(WebDriver driver) {
		Actions log = new Actions(driver);
		log.moveToElement(username).click().sendKeys("Admin").perform();
		log.moveToElement(password).click().sendKeys("AdminAdmin").perform();
		log.moveToElement(submit).click().perform();
	}
}
