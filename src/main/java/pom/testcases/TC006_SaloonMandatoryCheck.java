package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC006_SaloonMandatoryCheck extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC006_SaloonMandatoryCheck";
		testCaseDescription="To verify Charter - Enquiry Form";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="IRCTC";		
	}
	
	@Test
	public void saloonCheck() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.lastWindow()
		.clickOnMenuIcon()
		.clickOnCharter()
		.clickOnSidebarDismiss()
		.clickOnEnquiryForm()
		.enterApplicantName("Brindha")
		.enterOrganisationtName("ABC Corp")
		.enterAddress("Chennai")
		.enterMobile("99887766")
		.enterEmail("brindha@gmial.com")
		.selectRequestFor("Saloon Charter")
		.enterOrginStation("Chennai")
		.enterDestOrgin("Delhi")
		.clickOnCheckInDate()
		.clickOnDate()
		.clickOnCheckoutDate()
		.clickOnDate1()
		.enterDuration("5")
		.enterCoatchType("C1")
		.enterPassenderNo("3")
		.enterPurpose("Family Trip")
		.enterAdditionalServices("NA")
		.clickOnSubmit()
		.verifyMobilenoValidationText("Mobile no. not valid");
		
		
		
		
		
	}

}
