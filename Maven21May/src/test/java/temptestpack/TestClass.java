package temptestpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AmazonMouseAction;
import pages.AmazonPageScroll;
import pages.LoginOrSignUpPage;
import pages.MessangerPage;
import pages.RoomsPage;
import pages.SignUp;

public class TestClass {

public static void main(String[] args) {
		

        System.setProperty("webdriver.chrome.driver","C:\\Velocity\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe"); 
		
     	WebDriver driver = new ChromeDriver();
     	
     	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  //   	driver.get("https://www.amazon.in/");
//     	AmazonPageScroll amazonPageScroll = new AmazonPageScroll(driver);
//     	 amazonPageScroll.moveOnrelatedToItem();

     	
     	
     	
//     	driver.get("https://www.amazon.in/");
//  
//     	AmazonMouseAction amazonMouseAction= new AmazonMouseAction(driver);   	
//     	amazonMouseAction.clickOnaccountAndList();
//     	amazonMouseAction.clickOnyourOrder();
     	
     	
     	
     	
     	
     	driver.get("https://www.facebook.com/");
     	
     	LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
     	loginOrSignUpPage.openMessanger();
  	
       String messangerPageURL = driver.getCurrentUrl();
     	if(messangerPageURL.equals("https://www.messenger.com/")) 
     	{
     		System.out.println("Messanger url is verified");
     	}
     	else
     	{
     		System.out.println("Messanger url is wrong");
     	}

     	MessangerPage messangerPage = new MessangerPage(driver);
        messangerPage.openRooms();
        
        String messangerRoomPageURL = driver.getCurrentUrl();
     	if(messangerRoomPageURL.equals("https://www.messenger.com/rooms")) 
     	{
     		System.out.println("Messanger room page url is verified");
     	}
     	else
     	{
     		System.out.println("Messanger room page url is wrong");
     	}

////        
        RoomsPage roomsPage = new RoomsPage(driver);
        roomsPage.goBackToMessanger();
        
        String goBackToMessangerURL = driver.getCurrentUrl();
     	if(goBackToMessangerURL.equals("https://www.messenger.com/")) 
     	{
     		System.out.println("Test Case Pass");
     	}
     	else
     	{
     		System.out.println("Test Case Fail");
     	}
////
     	RoomsPage contactToHelpCenter = new RoomsPage(driver);
     	contactToHelpCenter.visitOurHelpCenter();
     	
     	String helpCenterURL = driver.getCurrentUrl();
     	
     	if(helpCenterURL.equals("https://www.messenger.com/help")) 
     	{
     		System.out.println("Test Case Pass");
     	}
     	else
     	{
     		System.out.println("Test Case Fail");
     	}
        
        
        
        
        
        
        
        
        
        
  }
}