package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class contactUs_Page extends AbstractClass{

	WebDriver driver;
	
	public contactUs_Page() {
		
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a" )
	private WebElement contactUsButton;
	
	public void clickContactUsButton() {
		
		clickFunction(contactUsButton);
	}
	
	@FindBy(xpath = "//*[@id=\"id_contact\"]")
	private WebElement subjectHeadingDropdown;
	
	public void selectFromDropdown() {
		
		selectElementFromDropdown(subjectHeadingDropdown, "Webmaster");
		
	}
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement emailTextArea;
	
	public void typeEmail(){
		
		sendKeys(emailTextArea, "egemenkacikan@gmail.com");
		
	}
	
	@FindBy(xpath = "//*[@id=\"id_order\"]")
	private WebElement orderTextArea;
	
	public void typeOrder() {
		
		sendKeys(orderTextArea, "order123");
	}
	@FindBy(xpath = "//*[@id=\"message\"]")
	private WebElement messageTextArea;
	
	public void typeMessage() {
		
		sendKeys(messageTextArea, "asd123qwe123");
	}
	
	@FindBy(xpath = "//*[@id=\"submitMessage\"]")
	private WebElement sendButton;
	
	public void clickOnSendButton() {
		
		clickFunction(sendButton);
		
	}
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/p")
	private WebElement succesMessage;
	
	public void assertMyMessage() {
		Assertion(succesMessage,"Your message has been successfully sent to our team.");	
	}

	
	
	
}
