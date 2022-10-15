package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessangerPage {
	
	@FindBy (xpath = "//a[text()='Rooms']")
	private WebElement room;
	
	@FindBy (xpath = "//a[text()='Features']")
	private WebElement Features;
	
	
	public MessangerPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openRooms() {
		room.click();
	}
	
	public void openFeatures() {
		Features.click();
	}
	
}




