package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public MenuIconPage clickOnMenuIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.MenuIcon.XPath"));
		return new MenuIconPage(driver, test);
	}	
	
	public HotelsPage clickOnHotel() {
		clickByXpath(prop.getProperty("AccommodationPage.Hotel.XPath"));
		return new HotelsPage(driver, test);
	}
	
	
	public AccommodationPage lastWindow() {		
		switchToLastWindow();
		return this;
		
	}	
	
	public AccommodationPage waitForAccommodationPage(long time) {		
		waitProperty(time);
		return this;
		
	}
		

}
