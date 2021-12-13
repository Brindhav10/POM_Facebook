package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestLoginPage extends GenericWrappers{
	
	public GuestLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public GuestLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("GuestLoginPage.GuestLogin.XPath"));
		return this;
	}
	
		
	public GuestLoginPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("GuestLoginPage.EmailId.XPath"), data);
		return this;
	}
	
	public GuestLoginPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("GuestLoginPage.MobileNo.XPath"), data);
		return this;
	}
	
	public HotelsPage clickOnLoginButton() {
		clickByXpath(prop.getProperty("GuestLoginPage.LoginButton.XPath"));
		return new HotelsPage(driver, test);
	}
	
	public PersonalDetailsPage clickOnLoginButton1() {
		clickByXpath(prop.getProperty("GuestLoginPage.LoginButton1.XPath"));
		return new PersonalDetailsPage(driver, test);
	}
	
	public GuestLoginPage waitForGuestLoginPage(long time) {		
		waitProperty(time);
		return this;
		
	}
	
	public GuestLoginPage lastWindow() {		
		switchToLastWindow();
		return this;
		
	}

	public GuestLoginPage clickOnGuestUserLogin1() {
		// TODO Auto-generated method stub
		clickByXpath(prop.getProperty("GuestLoginPage.GuestLogin1.XPath"));
		return this;
		
	}	

}
