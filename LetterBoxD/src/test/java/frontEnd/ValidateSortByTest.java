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

public class ValidateSortByTest extends base{
	
	
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
		action.moveToElement(hp.getprofileDropDown());
		hp.getwatchListButtonDropDown().click();
		action.moveToElement(hp.getsortList());
		hp.getsortListFlimName().click();
		
		if(hp.getfirstMovieNode().isDisplayed()) {
			
			System.out.println("Movie has been moved to the first node");
			driver.close();
		}
		else {
			System.out.println("Movie has not been sorted");
			driver.close();
		}

}}
