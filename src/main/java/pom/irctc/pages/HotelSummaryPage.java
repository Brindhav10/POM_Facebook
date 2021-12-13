package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelSummaryPage extends GenericWrappers{
	
	public HotelSummaryPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public HotelSummaryPage	compareHotelName(String text)
	{
		verifyTextContainsByXpath(prop.getProperty("HotelSummaryPage.HotelName.XPath"), text);
		return this;
	}
	public HotelSummaryPage	compareHotelPrice(String text)
	{
		verifyTextContainsByXpath(prop.getProperty("HotelSummaryPage.HotelPrice.XPath"), text);
		return this;
	}
	
	public HotelSummaryPage clickOnAgree() {
		clickByXpath(prop.getProperty("HotelSummaryPage.Agree.XPath"));
		return this;
	}
	
	public OTPPopupPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("HotelSummaryPage.MakePayment.XPath"));
		return new OTPPopupPage(driver,test);
	}
	
	public HotelSummaryPage lastWindow() {		
		switchToLastWindow();
		return this;
		
	}	

}
