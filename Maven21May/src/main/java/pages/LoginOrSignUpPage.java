package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {

	//private variables
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginButton;
	
	@FindBy (xpath = "//a[text()='Create New Account']")
	private WebElement createNewAccount;
	
	@FindBy (xpath = "//a[text()='Messenger']")
	private WebElement messangeLink;
	

	// public constructor (to initiate WebElement)
	public LoginOrSignUpPage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
	}
	
	
	// public method (action on WebElement)
	public void senduserName() {
		userName.sendKeys("sachin@gmail.com");
	}
	
	public void sendPassword() {
		password.sendKeys("12345");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnCreateNewAcc() {
		createNewAccount.click();
	}
	
	public void openMessanger() {
		messangeLink.click();
	}
	
	// OR
	// Complete Functionality
//	public void LoginOrSignUpPage() {
//		userName.sendKeys("Sachin@gmail.com");
//		password.sendKeys("12345");
//		loginButton.click();
//	}
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}
	

