package temptestpack;

import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.contentstream.operator.text.ShowText;
import org.apache.poi.sl.draw.geom.Context;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginOrSignUpPage;
import pages.SignUp;

public class TestNgClassSignUpPage {
    WebDriver driver;
	LoginOrSignUpPage loginOrSignUpPage;
	SignUp signup;
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
     	loginOrSignUpPage.clickOnCreateNewAcc();
        signup = new SignUp(driver);
	}
	
	@Test
	public void test()
	{
		System.out.println("Test");
		signup.enterFirstName();
		signup.enterSurname();
		signup.enterEmailId();
		signup.enterPassword();
		signup.enterBirthDate();
		signup.enterBirthMonth();
		signup.enterBirthYear();
		signup.clickOnCustom();		
		boolean result = signup.verifyPronoun();
		Assert.assertEquals(result, false);
//		if(result == true)
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
		System.out.println("logout");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
		driver.close();
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

