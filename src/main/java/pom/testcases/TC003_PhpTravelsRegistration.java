package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phpregister.pages.PhpTravelsRegisterPage;
import wrappers.ProjectWrappers;

public class TC003_PhpTravelsRegistration extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC003_PhpTravelsRegistration";
		testCaseDescription="To verify the PHP SignUp";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="PHP";		
	}
	
	@Test
	public void PhpTravelsRegistration () {
		
		new PhpTravelsRegisterPage(driver,test)
		.enterFirstname("Brindha")
		.enterLastname("V")
		.enterEmail("brindha@gmail.com")
		.clickOnCountryCode()
		.clickOnCountryCodeOption()
		.enterPhone("9965575678")
		.enterCompanyName("Test Ltd")
		.enterAddress1("Thiruvalluvar nagar")
		.enterAddress2("Anna salai")
		.enterState("Tamil Nadu")
		.enterPostcode("600123")
		.enterMobile("9887765657")
		.selectCountry("IN")
		.enterPassword("Winter2021$")
		.enterConfPassword("Winter2021$")
		.clickRegister();
		
		
		
		
		
	}

}
