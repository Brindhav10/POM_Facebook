package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001_FacebookSingnup extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC001_FacebookSingnup";
		testCaseDescription="To verify the Facebook SignUp for the New User";
		author="Brindha";
		category="Functional";
		browser="chrome";
		appName="Facebook";		
	}
		
	@Test
	public void facebookSignup() {
		
		new HomePage(driver,test)
		.clickOnCreateNewAccount()
		.enterFirstName("Brindha")
		.enterSurName("V")
		.enterEmail("brindha.manian@gmail.com")
		.enterConfEmail("brindha.manian@gmail.com")
		.enterPassword("Summer2021$")
		.selectDay("10")
		.selectMonth("8")
		.selectYear("1993")
		.clickOnSex("1")
		.clickOnSignup();	
		
	}

}
