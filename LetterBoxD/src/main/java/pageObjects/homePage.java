package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	public WebDriver driver;
	
	public homePage(WebDriver driver) {
		
		this.driver = driver; 
		
	}
	
	//create account button
	
	By createAccountBtn = By.className("navlink has-icon cboxElement");
		public WebElement getCreateAccountBtn() {
			return driver.findElement(createAccountBtn);
	}
		
	By emailAddress = By.id("frm-reg-email");
		public WebElement getemailAddress() {
			return driver.findElement(emailAddress);
	}
		
	By userName = By.id("frm-reg-username");
		public WebElement getuserName() {
			return driver.findElement(userName);
	}
		
	By password = By.id("frm-reg-password");
		public WebElement getpassword() {
			return driver.findElement(password);
	}
		
	By checkBoxAge = By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/div[1]/article[1]/section[1]/form[1]/fieldset[1]/section[1]/div[4]/label[1]/i[1]");
		public WebElement getcheckBoxAge() {
			return driver.findElement(checkBoxAge);
	}
		
	By acceptCheckBox = By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/div[1]/article[1]/section[1]/form[1]/fieldset[1]/section[1]/div[5]/label[1]/i[1]");
		public WebElement getacceptCheckBox() {
			return driver.findElement(acceptCheckBox);
	}
		
	By notRobot = By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/div[1]/article[1]/section[1]/form[1]/fieldset[1]/section[1]/div[5]/label[1]/i[1]");
		public WebElement getnotRobot() {
			return driver.findElement(notRobot);
	}
		
	By signUpBtn = By.className("signup-button button -action button-action");
		public WebElement getsignUpBtn() {
			return driver.findElement(signUpBtn);
	}
	
	By validationMessage = By.xpath("//p[contains(text(),'That’s good! You’ve taken your first step into a l')]");
		public WebElement getvalidationMessage() {
			return driver.findElement(validationMessage);
		}

	By filmsBtn = By.cssSelector("body.person-home.person-home.logged-in:nth-child(4) header.site-header.js-hide-in-app:nth-child(5) div.react-component:nth-child(2) div:nth-child(1) nav.main-nav ul.navitems li.navitem.films-page.main-nav-films:nth-child(3) > a.navlink.has-icon");
		public WebElement getfilmsBtn() {
			return driver.findElement(filmsBtn);
		}
		
	By firstNode = By.cssSelector("body.films-page.main-nav-films.logged-in:nth-child(4) div.site-body:nth-child(5) div.content-wrap div.carousel-wrap.carousel-horizontal div.carousel-mask ul.poster-list.film-list.-p230.film-slider.carousel li.listitem:nth-child(1) div.react-component.film-poster.film-poster-431888.poster.linked-film-poster.removed-from-watchlist.film-not-watched div:nth-child(1) a.frame.has-menu > span.overlay");
		public WebElement getfirstNode() {
			return driver.findElement(firstNode);
		}
	
	By watchListBtn = By.cssSelector("body.film.backdropped.logged-in.backdrop-loaded:nth-child(4) div.site-body.-backdrop:nth-child(6) div.content-wrap div.cols-3.overflow div.col-17 aside.sidebar section.actions-panel ul.js-actions-panel li.action-large.-watchlist:nth-child(4) > a.action.-watchlist.add-to-watchlist.ajax-click-action");
		public WebElement getwatchListBtn() {
			return driver.findElement(watchListBtn);
		}
		
	By addedListMessage = By.cssSelector("body.film.backdropped.logged-in.backdrop-loaded:nth-child(4) div.jnotify-container:nth-child(19) div.jnotify-notification.jnotify-notification-success div.jnotify-message > div:nth-child(1)");
		public WebElement getaddedListMessage() {
			return driver.findElement(addedListMessage);
		}
		
	By removeListMessage = By.cssSelector("body.film.backdropped.logged-in.backdrop-loaded:nth-child(4) div.jnotify-container:nth-child(19) div.jnotify-notification.jnotify-notification-success div.jnotify-message > div:nth-child(1)");
		public WebElement getremoveListMessage() {
			return driver.findElement(removeListMessage);
		}
		
	By profileDropDown = By.cssSelector("body.films-page.main-nav-films.logged-in:nth-child(4) header.site-header.js-hide-in-app:nth-child(4) div.react-component:nth-child(2) div:nth-child(1) nav.main-nav ul.navitems li.navitem.nav-account.js-nav-account:nth-child(1) > a.has-icon.toggle-menu");
		public WebElement getprofileDropDown() {
			return driver.findElement(profileDropDown);
		}
		
	By watchListButtonDropDown = By.cssSelector("body.films-page.main-nav-films.logged-in:nth-child(4) header.site-header.js-hide-in-app:nth-child(4) div.react-component:nth-child(2) div:nth-child(1) nav.main-nav ul.navitems li.navitem.nav-account.js-nav-account:nth-child(1) > a.has-icon.toggle-menu");
		public WebElement getwatchListButtonDropDown() {
			return driver.findElement(watchListButtonDropDown);
		}
		
	By sortList = By.cssSelector("body.watchlist.logged-in.my-own-page.show-hide-toggle.my-watchlist:nth-child(4) div.site-body:nth-child(5) div.content-wrap div.cols-2.js-watchlist-content:nth-child(2) section.section.col-17.col-main.js-watchlist-main-content div.basic div.sorting-selects.has-hide-toggle section.smenu-wrapper:nth-child(2) div.smenu > label:nth-child(1)");
		public WebElement getsortList() {
			return driver.findElement(sortList);
		}
		
	By sortListFilmName = By.cssSelector("body.watchlist.logged-in.my-own-page.show-hide-toggle.my-watchlist:nth-child(4) ul.smenu-menu:nth-child(12) li.smenu-subselected:nth-child(3) > a.item");
		public WebElement getsortListFlimName() {
			return driver.findElement(sortListFilmName);
		}	
		
	By firstMovieNode = By.xpath("a[contains(text(),'The Mitchells vs. The Machines (2021)')]");
		public WebElement getfirstMovieNode() {
			return driver.findElement(firstMovieNode);
		}
		
	By welcomeTxt = By.cssSelector("body.person-home.person-home.logged-in:nth-child(4) div.site-body:nth-child(6) div.content-wrap > h1.title-hero:nth-child(2)");
		public WebElement getwelcomeTxt() {
			return driver.findElement(welcomeTxt);
		}	
	
////a[contains(text(),'The Mitchells vs. The Machines (2021)')]
}
