package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.HomePage;
import wrappers.ProjectWrappers;


public class TC009_FormC extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC009_FormC";
		testCaseDescription="To verify the FORMC SignUp";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="FormC";		
	}
	
	@Test
	public void userRegistration() {
		
		
		new HomePage(driver,test)
		.clickOnRegister()
		.enterUserId("Brindhamanian10")
		.enterPassword("India123")
		.enterConfPassword("India123")
		.selectSecQtn("2")
		.enterAnswer("blacky")
		.enterName("Brindha")
		.enterGender("F")
		.enterDOB("10/08/1990")
		.enterDesignation("IT")
		.enterEmail("brindha@gmail.com")
		.enterMobile("9876543210")
		.enterPhoneno("2343545")
		.enterHtlname("ITC")
		.enterHtlcapacity("1000")
		.enterHtladdress("T nagar")
		.selectHtlstate("28")
		.waitForFormCPage(3000)
		.selectHtlcity("4C")
		.selectAcctype("H")
		.selectAccgrade("5s")
		.enterHtlemail("ITC@gmail.com")
		.enterHtlmobile("9878787676")
		.enterHtlphno("23423545")
		.enterOwnername("Shravan")
		.enterOwneraddresso("Anna salai")
		.selectOwnerstate("28")
		.waitForFormCPage(7000)
		.selectOwnercity("4C")
		.enterOwneremail("shravan@gamil.com")
		.enterOwnerphno("4545466")
		.enterOwnermobile("9897877676")
		.clickOnAdd();
	
		
	}

}
