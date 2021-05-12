package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initinalizeBrowser() throws IOException {

		prop = new Properties();
		
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\data.properties");
		// this gives knowledge that the data.properties file exists in fis
		prop.load(fis);
		// this sets a string value for browser from the data file
		String browserName = System.getProperty("browser");
		// String browserName=prop.getProperty("browser");

		// if chrome is needed
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver();
		}

		// if firefox is needed
		else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// if IE is needed
		else if (browserName.equals("IE")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		return driver;

	}

}
