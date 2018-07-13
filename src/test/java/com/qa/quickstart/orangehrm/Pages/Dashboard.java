package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/a")
	private WebElement pim;
	
	public void clickPim(WebDriver driver) {
		Actions pimming = new Actions(driver);
		pimming.moveToElement(pim).click().perform();
	}
}
