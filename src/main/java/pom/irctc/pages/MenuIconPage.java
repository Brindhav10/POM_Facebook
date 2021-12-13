package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class MenuIconPage extends GenericWrappers {
	
	
	public MenuIconPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public FTRCoachPage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("MenuIconPage.BookYourCoach.XPath"));
		return new FTRCoachPage(driver,test);
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("MenuIconPage.Charter.XPath"));
		return new CharterPage(driver,test);
	}
	

}
