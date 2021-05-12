package frontEnd;

import java.io.IOException;
import java.security.Timestamp;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.homePage;
import resources.base;

public class ValidateHomePageTest extends base{
	
	public WebDriver driver;
	public SoftAssert a= new SoftAssert();
	
	@BeforeTest
	public void startUp() throws IOException {
		driver = initinalizeBrowser();
	}
	
	//creating a new user
	@Test
	public void validateCreateNewUser() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		homePage hp = new homePage(driver);
		hp.getCreateAccountBtn().click();
		hp.getemailAddress().sendKeys(prop.getProperty("emailAddress"));
		hp.getuserName().sendKeys(prop.getProperty("userName"+java.time.LocalTime.now()));
		hp.getpassword().sendKeys(prop.getProperty("password"+java.time.LocalTime.now()));
		hp.getcheckBoxAge().click();
		hp.getacceptCheckBox().click();
		hp.getnotRobot().click();
		hp.getsignUpBtn().click();
		
		if(hp.getvalidationMessage().isDisplayed()) {
			a.assertTrue(true);
			System.out.println("Account created!");
		}
		else {
			a.assertTrue(false);
			System.out.println("Account not created");
			driver.close();
		}
		
		
		
	}
	

}
