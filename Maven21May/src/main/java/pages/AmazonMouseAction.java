package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonMouseAction {

	private WebDriver driver; 
	
	@FindBy (xpath = "//span[text()='Account & Lists']")
	private WebElement accountAndList;

	@FindBy (xpath = "//span[text()='Your Orders']")
	private WebElement yourOrder;
///
	 public AmazonMouseAction(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 this.driver=driver;
  }
///
	 public void clickOnaccountAndList() {
	 Actions act = new Actions(driver);
	 act.moveToElement(accountAndList).perform();
  }
	 
	 public void clickOnyourOrder() {
	 Actions act = new Actions(driver);
   	act.moveToElement(yourOrder).click().build().perform();
  }















}

