package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SaveButton {
	
	@FindBy(id="systemUserSaveBtn")
	private WebElement savebtn;
	
	
	public void clickSave(WebDriver driver) {
		Actions save = new Actions(driver);
		save.moveToElement(savebtn).click().perform();
	}
}
