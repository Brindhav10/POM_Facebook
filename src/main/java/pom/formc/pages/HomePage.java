package pom.formc.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public FormCUserRegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("FormCHomePage.Register.XPath"));
		return new FormCUserRegistrationPage(driver,test);
	}

}
