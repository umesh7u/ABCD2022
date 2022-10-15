package temptestpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginOrSignUpPage;
import pages.MessangerPage;
import pages.RoomsPage;

public class TestNgClassMessanger {
   private WebDriver driver;
   private RoomsPage roomsPage;
   private LoginOrSignUpPage loginOrSignUpPage;
   private SoftAssert soft;
    
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	    System.setProperty("webdriver.chrome.driver","C:\\Velocity\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe"); 
	    driver = new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		loginOrSignUpPage = new LoginOrSignUpPage(driver);
     	loginOrSignUpPage.openMessanger();
        soft = new SoftAssert();
		
		 String messangerPageURL = driver.getCurrentUrl();
		 Assert.assertEquals(messangerPageURL, "https://www.messenger.com/");
//	     	if(messangerPageURL.equals("https://www.messenger.com/")) 
//	     	{
//	     		System.out.println("Messanger url is verified");
//	     	}
//	     	else
//	     	{
//	     		System.out.println("Messanger url is wrong");
//	     	}

	     	MessangerPage messangerPage = new MessangerPage(driver);
	        messangerPage.openRooms();
	        
	        String messangerRoomPageURL = driver.getCurrentUrl();
	        Assert.assertEquals(messangerRoomPageURL, "https://www.messenger.com/rooms");

//	     	if(messangerRoomPageURL.equals("https://www.messenger.com/rooms")) 
//	     	{
//	     		System.out.println("Messanger room page url is verified");
//	     	}
//	     	else
//	     	{
//	     		System.out.println("Messanger room page url is wrong");
//	     	}
//
//	        
	        roomsPage = new RoomsPage(driver);
	}
	
	@Test
	public void test()
	{
		System.out.println("Test");
		 roomsPage.goBackToMessanger();
	        
	        String goBackToMessangerURL = driver.getCurrentUrl();
	        String title = driver.getTitle();
	        
	        soft.assertEquals(goBackToMessangerURL, "https://www.messenger.com/");
	        soft.assertEquals(title, "Messenger");
	        soft.assertAll();
//	     	if(goBackToMessangerURL.equals("https://www.messenger.com/")) 
//	     	{
//	     		System.out.println("Test Case Pass");
//	     	}
//	     	else
//	     	{
//	     		System.out.println("Test Case Fail");
//	     	}
	}
	
	@Test
	public void test123()
	{
		System.out.println("Test123");
		roomsPage.visitOurHelpCenter();
        String helpCenterURL = driver.getCurrentUrl();
     	Assert.assertEquals(helpCenterURL,"https://www.messenger.com/help");
//     	if(helpCenterURL.equals("https://www.messenger.com/help")) 
//     	{
//     		System.out.println("Test Case Pass");
//     	}
//     	else
//     	{
//     		System.out.println("Test Case Fail");
//     	}
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
		System.out.println("Logout");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
		driver.close();
	}
	
	
	
	
	
	
	
	
}
