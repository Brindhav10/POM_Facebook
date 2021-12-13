package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005_BookYourCoach extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC005_BookYourCoach";
		testCaseDescription="To verify Book Your Coach Page";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="IRCTC";		
	}
	
	@Test
	public void bookYourCoach() {
		
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.lastWindow()
		.clickOnMenuIcon()
		.clickOnBookYourCoach()
		.lastWindow()
		.clickOnSignUp()
		.enterUserId("Brindha12345")
		.enterPassword("Qwerty12345")
		.enterConfPassword("Qwerty12345")
		.selectSecQtn("1")
		.enterSecAns("TVS School")
		.enterDOB("10/10/1990")
		.clickOnDate()
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterEmail("brindha@gmail.com")
		.selectOccupation("SelfEmployed")
		.enterFname("Brindha")
		.enterMname("Venkata")
		.enterLname("Manian")
		.selectNationality("94")
		.pageDown()
		.waitForFTRUserRegistrationPage(1000)
		.enterFlatNo("F5 Burly")
		.enterStreet("VarathaPuram")
		.enterArea("Perumbakkam")
		.selectCountry("94")
		.enterMobile("9876544440")
		.enterPincode("600119")
		.waitForFTRUserRegistrationPage(5000)
		//.clickPostoffice()
		//.clickPostofficeOption()
		.selectPostOffice("Sholinganallur S.O")
		.pageDown()
		.clickCommunicationAddressAsResidentialAddress()
		.enterOfficeFlatNo("10")
		.enterOfficeStreet("Thiruvalluvar nagar")
		.enterOfficeArea("Palanganatham")
		.selectOfficeCountry("94")
		.enterOfficeMobile("9876543210")
		.enterOfficePincode("625003")
		.waitForFTRUserRegistrationPage(5000)
		.clickOfficePostoffice()
		.clickOfficePostofficeOption();
		
		
	}

}
