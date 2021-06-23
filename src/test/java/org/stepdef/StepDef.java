package org.stepdef;

import org.base.BaseClass;
import org.locator.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass {
	LoginPage page;

	@Given("user is on FB page")
	public void user_is_on_FB_page() {
	
	}


	@When("user enter incorrect {string} and incorrect {string}")
	public void user_enter_incorrect_and_incorrect(String string, String string2) {
		page = new LoginPage();
		WebElement txtUserName = page.getTxtUserName();
		typeText(txtUserName, string);
		WebElement txtPassword = page.getTxtPassword();
		typeText(txtPassword, string2);
	}

	@When("user is click login button")
	public void user_is_click_login_button() {
		WebElement btnLogin = page.getBtnLogin();
		butnClick(btnLogin);

	}

	@Then("user should validate Fb home page is available or not")
	public void user_should_validate_Fb_home_page_is_available_or_not() {
		System.out.println("Invalid user name");
	}

}
