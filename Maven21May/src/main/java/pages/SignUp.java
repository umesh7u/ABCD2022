package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement firstName;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement surName;

	@FindBy (xpath = "(//input[@type='text'])[4]")
	private WebElement emailId;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement password;

	@FindBy (xpath = "//select[@id='day']")
	private WebElement birthDay;

	@FindBy (xpath = "//select[@id='month']")
	private WebElement birthMonth;
	
	@FindBy (xpath = "//select[@id='year']")
	private WebElement birthYear;
	
	@FindBy (xpath = "(//input[@type='radio'])[3]")
	private WebElement custom;
	
	@FindBy (xpath = "//select[@aria-label='Select your pronoun']")
	private WebElement pronoun;

	
///////
	public SignUp(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
   }
///////
    
    public void enterFirstName() {
     firstName.sendKeys("sachin");	
    }
    
    public void enterSurname() {
       surName.sendKeys("asdfg");	
    }
    
    public void enterEmailId() {
       emailId.sendKeys("sachin@mail,com");	
   }
    
    public void enterPassword() {
       password.sendKeys("101010");	
    }
   
    public void enterBirthDate() {
    	Select d = new Select(birthDay);
    	d.selectByValue("10");
	}
  
    public void enterBirthMonth() {
    	Select m = new Select(birthMonth);
    	m.selectByValue("5");
	}

    public void enterBirthYear() {
    	Select y = new Select(birthYear);
    	y.selectByValue("2010");
	}

    public void clickOnCustom() {
    	custom.click();
	}

    public boolean verifyPronoun() {
    	return pronoun.isDisplayed();
	}
    
    public boolean Pronoun() {
    	return pronoun.isDisplayed();
	}

}

  





















