package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pan.pages.PanSignUpPage;
import wrappers.ProjectWrappers;

public class TC002_PanApplication extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC002_PanApplication";
		testCaseDescription="To verify the PAN Application";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="PAN";		
	}
	@Test
	public void panApplication() {
		
	new PanSignUpPage(driver,test)
	.selectTitle("2")
	.enterFirstName("Brindha")
	.enterMiddleName("Venkat")
	.enterLastName("Manian")
	.enterFatherFirstName("Venkata")
	.enterFatherMiddleName("Subra")
	.enterFatherLastName("Manian")
	.enterMobileNo("9987865544")
	.enterEmail("brindha.manian@gmail.com")
	.selectSourceOfincome("2")
	.clikOnAddress()
	.enterDob("10081990")
	.pageDown()
	.enterResAddressl1("Shree Gokulam")
	.enterResAddressl2("Thiruvalluvar nagar")
	.enterResCity("Madurai")
	.selectResstate("Tamil Nadu")
	.enterResPincode("625100")
	.enterOffName("ABC Ltd")
	.enterOffAddressl1("Palavan nagar")
	.enterOffAddressl2("Perumbakkam")
	.enterOffCity("Madurai")
	.selectOffstate("Tamil Nadu")
	.enterOffPincode("625003")
	.selectIndentityproof("16")
	.selectAddressproof("6")
	.selectDobproof("14")
	.selectAadharproof("Copy of Aadhaar Card/Letter")
	.selectOffAddproof("2")
	.pageDown()
	.clickonTerms();
	
	

	}

}
