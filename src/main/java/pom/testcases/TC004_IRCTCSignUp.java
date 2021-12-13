package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004_IRCTCSignUp extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC004_IRCTCSignUp";
		testCaseDescription="To verify the IRCTC SignUp";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="IRCTC";		
	}
	
	@Test
	public void irctcSignUp() {
		
		
		new CovidAlertPage(driver,test)
		.waitForCovidAlertPage(3000)
		.clickOnOk()
		.clickOnRegister()
		.waitForRegistrationPage(5000)
		.enterUserName("Brindha")
		.enterPassword("Summer123")
		.enterConfPassword("Summer123")
		.clickOnPreferredLang()
		.clickOnPreferredLangOption()
		.clickOnSecQuestn()
		.clickOnSecQuestnOption()
		.enterSecurityAnswer("TVS")
		.clickOnContinue()
		.enterFirstName("Brindha")
		.enterMiddleName("Venkat")
		.enterLastName("Mamian")
		.clickOnOccupation()
		.clickOnOccupationOption()
		.clickOnDateOfBirth()
		.clickYear()
		.clickYearOption()
		.clickMonth()
		.clickMonthOption()
		.clickOnDay()
		.clickOnMaritalstatus()
		.selectkOnCountry("94")
		.enterEmail("brinda@gmail.com")
		.enterMobile("908878668")
		.waitForRegistrationPage(5000)
		.selectNationality("94")
		.clickOnContinue()
		.enterFlatNo("F5")
		.enterStreet("Nesamani nagar")
		.enterArea("Perumbakkam")
		.enterPincode("600100")
		.waitForRegistrationPage(7000)
		.clickOnCity()
		.clickOnCityOption()
		.enterPhoneno("908876765")
		.clickOnResidenceToOfficeAddress()
		.enterOffFlatNo("F1")
		.enterOffStreet("Sholinganallur")
		.enterOffArea("OMR")
		.enterOffPincode("625003")
		.waitForRegistrationPage(7000)
		.clickOnOffCity()
		.clickOnOffCityOption()
		.waitForRegistrationPage(5000)
		.clicnOnOffPostoffice()
		.clicnOnOffPostofficeOption()
		.enterOffPhoneno("9088787769");
		
		
	}

}
