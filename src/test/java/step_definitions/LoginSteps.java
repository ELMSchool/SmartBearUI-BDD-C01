package step_definitions;

import io.cucumber.java.en.And;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class LoginSteps {

	@Given("the user navigates to the home page")
	public void the_user_navigates_to_the_home_page() {
		Driver.getDriver()
				.get(ConfigReader.getPropertyValue("url"));
	}

	@When("the user enters username {string}")
	public void the_user_enters_username(String username) {
		new LoginPage()
				.userNameInput.sendKeys(username);
	}

	@When("the user enters password {string}")
	public void the_user_enters_password(String password) {
		new LoginPage()
				.userPasswordInput.sendKeys(password);
	}

	@When("the user clicks login button")
	public void the_user_clicks_login_button() {
		new LoginPage().loginButton.click();
	}

	@Then("the user should navigate to {string} page")
	public void the_user_should_navigate_to_page(String title) {
		Assert.assertEquals("The page title is incorrect.",
				title, Driver.getDriver().getTitle());
	}
}