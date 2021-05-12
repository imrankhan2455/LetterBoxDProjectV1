package frontEnd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.homePage;
import resources.base;

public class ValidateWelcomeSignTest extends base{
	
	public WebDriver driver;
	public SoftAssert a= new SoftAssert();
	public Actions action = new Actions(driver);
	
	@BeforeTest
	public void startUp() throws IOException {
		driver = initinalizeBrowser();
	}
	
	@Test
	public void validateWatchList() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		homePage hp = new homePage(driver);
		
		if(hp.getwelcomeTxt().isDisplayed()) {
			System.out.println("The test is passed!");
			driver.close();
		}
		else {
			System.out.println("Test not Passed");
			driver.close();
		}

}}
