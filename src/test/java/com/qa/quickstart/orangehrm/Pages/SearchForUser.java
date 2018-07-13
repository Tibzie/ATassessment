package com.qa.quickstart.orangehrm.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchForUser {
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
	private WebElement employeelist;
	
	@FindBy(id="employee_name_quick_filter_employee_list_value")
	private WebElement searchbar;
	
	
	public void clickList(WebDriver driver) {
		Actions list = new Actions(driver);
		list.moveToElement(employeelist).click().perform();
		list.moveToElement(searchbar).click().sendKeys("Yolo").sendKeys(Keys.ENTER).perform();

	}
}
