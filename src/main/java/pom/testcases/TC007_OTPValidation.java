package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007_OTPValidation extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC007_OTPValidation";
		testCaseDescription="To verify OTP Validation";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="IRCTC";		
	}
	
	@Test
	public void otpValidation() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.lastWindow()
		.clickOnHotel()
		.waitForHotelsPage(2000)
		.clickOnLogin()
		//.waitForGuestLoginPage(3000)
		.clickOnGuestUserLogin()
		//.waitForGuestLoginPage(2000)
		.enterEmailId("Brindhamanian@gmail.com")
		.enterMobileNo("9876543211")
		.clickOnLoginButton()
		.lastWindow()
		.enterDestination("Hotel The Pride")
		.clickOnDestinationselect()
		.clickOnCheckIn()
		.clickOnCheckInDate()
		.clickOnCheckout()
		.clickOnCheckoutDate()
		.clickOnRoom()
		.selectNoofRooms("1")
		.selectNoofAdult("2")
		//.selectNoofChildren("1")
		.clickOnDone()
		.clickOnFindHotel()
		//.clickOnFirstDisplayHotel()
		.getHotelName()
		.getPrice()		
		.cliclOnContinuetoBook()
		.lastWindow()
		.clickOnGuestUserLogin()
		.enterEmailId("Brindhamanian@gmail.com")
		.enterMobileNo("9876543211")
		.clickOnLoginButton1()
		.selectTitle("2")
		.enterFirstName("Brindha")
		.selectLastName("V")
		.selectState("TN")
		.cliclOnContinue()
		.compareHotelName("te")
		.compareHotelPrice("sf")
		.clickOnAgree()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyOTPValidationMsg("otp is required.");
		
		
		
	}

}
