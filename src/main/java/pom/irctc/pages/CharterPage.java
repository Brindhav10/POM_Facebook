package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	
	public EnquiryForm clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.XPath"));
		return new EnquiryForm(driver, test);
	}
	
	public CharterPage clickOnSidebarDismiss() {
		clickByXpath(prop.getProperty("CharterPage.SidebarDismiss.XPath"));
		return this;
	}
	
	}
