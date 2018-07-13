package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddEmployee {
	@FindBy(xpath="//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
	private WebElement employeelist;
	
	@FindBy(xpath="//*[@id=\"addEmployeeButton\"]/i")
	private WebElement addbtn;
	
	public void clickAdd(WebDriver driver) throws InterruptedException {
		Actions add = new Actions(driver);
		add.moveToElement(employeelist).click().perform();
		Thread.sleep(7000);
		add.moveToElement(addbtn).click().perform();
	}
}
