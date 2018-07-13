package com.qa.quickstart.orangehrm.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.quickstart.orangehrm.Pages.AddEmployee;
import com.qa.quickstart.orangehrm.Pages.AppBtn;
import com.qa.quickstart.orangehrm.Pages.CorrectDetails;
import com.qa.quickstart.orangehrm.Pages.Dashboard;
import com.qa.quickstart.orangehrm.Pages.Employee;
import com.qa.quickstart.orangehrm.Pages.Login;
import com.qa.quickstart.orangehrm.Pages.SaveButton;
import com.qa.quickstart.orangehrm.Pages.SearchForUser;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangehrm {
	
	
	ChromeDriver driver;
	String url = "https://qa-trials641.orangehrmlive.com/auth/login";
	
	
	@Given("^the login page$")
	public void the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("^I login$")
	public void i_login() {
		Login logging = PageFactory.initElements(driver, Login.class);
		logging.loggingIn(driver);
	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab() {
		Dashboard dashing = PageFactory.initElements(driver, Dashboard.class);
		dashing.clickPim(driver);
	}

	@When("^then the Add Employee Tab$")
	public void then_the_Add_Employee_Tab() throws InterruptedException {
		AddEmployee adding = PageFactory.initElements(driver, AddEmployee.class);
		adding.clickAdd(driver);
	}

	@When("^I fill out the Employee Details correctly$")
	public void i_fill_out_the_Employee_Details_correctly() throws InterruptedException {
		Thread.sleep(15000);
		Employee filling = PageFactory.initElements(driver, Employee.class);
		filling.fillOutDetails(driver);
	}

	@When("^I choose to create Login Details by clicking the appropriate button$")
	public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() throws InterruptedException {
		Thread.sleep(2000);
		AppBtn thebutton = PageFactory.initElements(driver, AppBtn.class);
		thebutton.clickAllTheButtons(driver);
	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly() {
		CorrectDetails createuser = PageFactory.initElements(driver, CorrectDetails.class);
		createuser.userDetails(driver);
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button() throws InterruptedException {
		Thread.sleep(5000);
		SaveButton saving = PageFactory.initElements(driver, SaveButton.class);
		saving.clickSave(driver);
	}

	@Then("^I can search for the Employee I have just created$")
	public void i_can_search_for_the_Employee_I_have_just_created() throws InterruptedException {
		Thread.sleep(15000);
		SearchForUser listing = PageFactory.initElements(driver, SearchForUser.class);
		listing.clickList(driver);
	}

	@Then("^select them for inspection$")
	public void select_them_for_inspection() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
