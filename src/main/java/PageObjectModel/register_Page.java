package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.Driver;


public class register_Page extends AbstractClass{

	private WebDriver driver;
	
	public register_Page() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath= "/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")
	private WebElement signInButton;
	@FindBy(xpath = "//*[@id=\"email_create\"]")
	private WebElement emailTextBox;
	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
	private WebElement submitButton;
	@FindBy(id="id_gender1")
	private WebElement gender;
	@FindBy(id="customer_firstname")
	private WebElement firstnameText;
	@FindBy(id="customer_lastname")
	private WebElement lastnameText;
	@FindBy(name= "passwd")
	private WebElement password;
	public void clickOnSignInButton() {
		
		clickFunction(signInButton);
	}
	
	public void typeEmail(String email) {
		sendKeys(emailTextBox, email);
	}
	
	public void clickOnSubmitButton() {
		clickFunction(submitButton);
	}
	public void clickOnGender() {
		clickFunction(gender);
	}
	public void typeFirstnameAndLastname(String firstname,String lastname) {
		sendKeys(firstnameText, firstname);
		sendKeys(lastnameText, lastname);
	}
	public void typePassword(String password1) {
		sendKeys(password, password1);
	}
}
