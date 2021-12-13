package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("IRCTCHomePage.REGISTER.XPath"));
		return new RegistrationPage(driver, test);
	}
	
	
	public HomePage mouseHoverOnHolidays() {
		clickByXpath(prop.getProperty("IRCTCHomePage.HOLIDAYS.XPath"));
		return this;
	}
	
	
	public HomePage mouseHoverOnStays() {
		clickByXpath(prop.getProperty("IRCTCHomePage.Stays.XPath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("IRCTCHomePage.Lounge.XPath"));
		return new AccommodationPage(driver, test);
	}
	
	public HomePage waitForHomePage(long time) {		
		waitProperty(time);
		return this;
		
	}
	
	public HomePage lastWindow() {		
		switchToLastWindow();
		return this;
		
	}

}
