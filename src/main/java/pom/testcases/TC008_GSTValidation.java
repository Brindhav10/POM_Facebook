package pom.testcases;

import org.testng.annotations.BeforeClass;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC008_GSTValidation extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC008_GSTValidation";
		testCaseDescription="To verify the PHP SignUp";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="IRCTC";		
	}
	
	public void gstValidation() {
		
		
	/*	new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.clickOnHotel()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmailId("brindha@gmail.com")
		.enterMobileNo("9876543211")
		.clickOnLoginButton()
		.enterDestination("Chennai")
		.clickOnCheckIn()
		.clickOnCheckInDate()
		.clickOnCheckout()
		.clickOnCheckoutDate()
		.clickOnRoom()
		.selectNoofRooms("1")
		.selectNoofAdult("2")
		.selectNoofChildren("1")
		.clickOnDone()
		.clickOnFindHotel()
		//.clickOnFirstDisplayHotel()
		.getHotelName()
		.getPrice()*/
	//	.cliclOnContinuetoBook()
		/*.selectTitle("2")
		.enterFirstName("Brindha")
		.selectLastName("V")
		.selectState("TN")
		.selectGSTOpt("Yes")
		.enterGSTNo("42345")
		.enterCompanyName("XYZ Corp")
		.enterCompanyAddress("Chennai")
		.cliclOnContinue1()
		.verifyGstValidationmsg("Please Enter Valid GSt number");*/
		
				
	}

}
