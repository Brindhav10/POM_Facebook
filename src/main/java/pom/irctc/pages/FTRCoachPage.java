package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRCoachPage extends GenericWrappers{
	
	public FTRCoachPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public FTRUserRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FTRCoachPage.SignUp.XPath"));
		return new FTRUserRegistrationPage(driver, test);
	}
	
	public FTRCoachPage lastWindow() {		
		switchToLastWindow();
		return this;
		
	}	

}
