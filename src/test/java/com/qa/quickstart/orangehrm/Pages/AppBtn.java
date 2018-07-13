package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AppBtn {
	@FindBy(xpath="//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement tickbtn;
	
	public void clickAllTheButtons(WebDriver driver) {
		Actions tick = new Actions(driver);
		tick.moveToElement(tickbtn).click().perform();
	}
}
