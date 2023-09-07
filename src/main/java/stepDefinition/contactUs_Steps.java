package stepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contactUs_Steps {
	
	contactUs_Page contactUs_Page = new contactUs_Page();


	@And("click on contact us button")
	public void click_on_contact_us_button() {
		contactUs_Page.clickContactUsButton();
	}

	@And("select Subject Heading")
	public void select_subject_heading() {
		contactUs_Page.selectFromDropdown();
	}

	@And("type Email")
	public void type_email() {
		contactUs_Page.typeEmail();
	}

	@And("type Order reference")
	public void type_order_reference() {
		contactUs_Page.typeOrder();
	}

	@And("type a message")
	public void type_a_message() {
		contactUs_Page.typeMessage();
	}

	@When("click on send button")
	public void click_on_send_button() {
		contactUs_Page.clickOnSendButton();
	}

	@Then("verify success message")
	public void verify_success_message() {
		contactUs_Page.assertMyMessage();
	}

}
