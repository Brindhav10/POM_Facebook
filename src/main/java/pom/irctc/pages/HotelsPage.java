package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers{
	
	public HotelsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public GuestLoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("HotelsPage.Login.XPath"));
		return new GuestLoginPage(driver,test);
	}
	
	
	public HotelsPage enterDestination(String data) {
		enterByXpath(prop.getProperty("HotelsPage.Destination.XPath"), data);
		return this;
	}
	
	
	public HotelsPage clickOnDestinationselect() {
		clickByXpath(prop.getProperty("HotelsPage.Destinationselect.XPath"));
		return this;
	}
	
	public HotelsPage clickOnCheckIn() {
		clickByXpath(prop.getProperty("HotelsPage.Destination.XPath"));
		return this;
	}
	
	public HotelsPage clickOnCheckInDate()
	{
		clickByXpath(prop.getProperty("HotelsPage.CheckIn.XPath"));
		return this;
	 }
	
	
	public HotelsPage clickOnCheckout() {
		clickByXpath(prop.getProperty("HotelsPage.CheckInDate.XPath"));
		return this;
	}
	
	public HotelsPage clickOnCheckoutDate()
	{
		clickByXpath(prop.getProperty("HotelsPage.Checkout.XPath"));
		return this;
	 }
	
	public HotelsPage clickOnRoom() {
		clickByXpath(prop.getProperty("HotelsPage.CheckoutDate.XPath"));
		return this;
	}
	
	public HotelsPage selectNoofRooms(String data) {
		selectValueByXpath(prop.getProperty("HotelsPage.Room.XPath"), data);
		return this;
	}
	
	
	public HotelsPage selectNoofAdult(String data) {
		selectValueByXpath(prop.getProperty("HotelsPage.NoofRooms.XPath"), data);
		return this;
	}
	
	public HotelsPage selectNoofChildren(String data) {
		selectValueByXpath(prop.getProperty("HotelsPage.NoofAdult.XPath"), data);
		return this;
	}
	
	public HotelsPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelsPage.Done.XPath"));
		return this;
	}
	
	public FindHotelsPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("HotelsPage.FindHotel.XPath"));
		return new FindHotelsPage(driver, test);
	}
	
	public HotelsPage waitForHotelsPage(long time) {		
		waitProperty(time);
		return this;
		
	}
	public HotelsPage lastWindow() {		
		switchToLastWindow();
		return this;
		
	}	
	
	

}
