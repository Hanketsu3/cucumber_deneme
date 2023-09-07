package stepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjectModel.register_Page;
import io.cucumber.java.en.And;

public class register_Steps {

	
	register_Page register_page = new register_Page();


	@And("click Sign in button")
	public void click_sign_in_button() {
	    register_page.clickOnSignInButton();
	}

	@And("type email {string}")
	public void type_email(String string) {
	    register_page.typeEmail(string);
	}

	@And("click on Create an Account button")
	public void click_on_create_an_account_button() {
	    register_page.clickOnSubmitButton();
	}

	@And("choose title")
	public void choose_title() {
	 register_page.clickOnGender();
	}

	@And("type firstname {string} and lastname {string}")
	public void type_firstname_and_lastname(String firstname, String lastname) {
	    register_page.typeFirstnameAndLastname(firstname, lastname);
	}

	@And("type password {string}")
	public void type_password(String password) {
	    register_page.typePassword(password);
	}
}
