package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OTPPopupPage extends GenericWrappers {
	
	public OTPPopupPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public OTPPopupPage clickOnVerify() {
		clickByXpath(prop.getProperty("OTPPopupPage.Verify.XPath"));
		return this;
	}
	
	public OTPPopupPage verifyOTPValidationMsg(String data) {
		verifyTextByXpath(prop.getProperty("OTPPopupPage.OTPValidationMsg.XPath"), data);
		return this;
	}
	

}
