package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPageScroll {
    private WebElement driver;
	
	@FindBy (xpath = "(//h2[@class='as-title-block-left'])[1]")
    private WebElement relatedToItem;

	
	public AmazonPageScroll(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = (WebElement) driver;
   }
	
	
	
	public void moveOnrelatedToItem() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntiView(true);",relatedToItem);
		
	}
	
	

}
