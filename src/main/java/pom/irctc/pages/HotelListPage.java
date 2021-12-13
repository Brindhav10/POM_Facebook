package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers{
	
	public HotelListPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public FindHotelsPage clickOnFirstDisplayHotel() {
		clickByXpath(prop.getProperty("HotelListPage.FirstDisplayHotel.XPath"));
		return new FindHotelsPage(driver,test);
	}

}
