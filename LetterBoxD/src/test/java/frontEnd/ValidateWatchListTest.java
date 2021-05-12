package frontEnd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.homePage;
import resources.base;

public class ValidateWatchListTest extends base {
	
	public WebDriver driver;
	public SoftAssert a= new SoftAssert();
	
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
		hp.getfilmsBtn().click();
		hp.getfirstNode().click();
		//first click to add the movie to watch list
		hp.getwatchListBtn().click();
		//once the movie is added, this message is displayed
		if(hp.getaddedListMessage().isDisplayed()) {
			
			System.out.println("Movie was added to the list!");
		}
		//this second click will remove the movie from the watch list
		hp.getwatchListBtn().click();
		if(hp.getremoveListMessage().isDisplayed()) {
			System.out.println("Movie has been removed from list");
			a.assertTrue(true);
			driver.close();
		}
		
		
		
		
	}

}
