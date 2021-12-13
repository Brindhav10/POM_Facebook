package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FindHotelsPage extends GenericWrappers {
	
	public FindHotelsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public FindHotelsPage getHotelName() {
		getTextByXpath(prop.getProperty("FindHotelsPage.HotelName.XPath"));
		return this;		
	}
	
	public FindHotelsPage getPrice() {
		getTextByXpath(prop.getProperty("FindHotelsPage.Price.XPath"));
		return this;		
	}
	
	/*public PersonalDetailsPage cliclOnContinuetoBook() {
		clickByXpath(prop.getProperty("FindHotelsPage.ContinuetoBook.XPath"));
		return new PersonalDetailsPage(driver, test);
	}*/
	
	public FindHotelsPage lastWindow() {		
		switchToLastWindow();
		return this;
		
	}	
	
	public GuestLoginPage cliclOnContinuetoBook() {
		clickByXpath(prop.getProperty("FindHotelsPage.ContinuetoBook.XPath"));
		return new GuestLoginPage(driver, test);
	}

}
