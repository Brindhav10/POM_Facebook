package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers {
	
	public PersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public PersonalDetailsPage selectTitle(String data) {
		selectValueByXpath(prop.getProperty("PersonalDetailsPage.Title.XPath"), data);
		return this;
	}
	
	public PersonalDetailsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.FirstName.XPath"), data);
		return this;
	}	


	public PersonalDetailsPage selectLastName(String data) {
		selectValueByXpath(prop.getProperty("PersonalDetailsPage.LastName.XPath"), data);
		return this;
	}
	
	public PersonalDetailsPage selectState(String data) {
		selectValueByXpath(prop.getProperty("PersonalDetailsPage.State.XPath"), data);
		return this;
	}
	
	public PersonalDetailsPage selectGSTOpt(String data) {
		selectValueByXpath(prop.getProperty("PersonalDetailsPage.GSTOpt.XPath"), data);
		return this;
	}
	
	public PersonalDetailsPage enterGSTNo(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.GSTNo.XPath"), data);
		return this;
	}
	
	public PersonalDetailsPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.CompanyName.XPath"), data);
		return this;
	}
	
	public PersonalDetailsPage enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.Continue1.XPath"), data);
		return this;
	}
	
	public PersonalDetailsPage cliclOnContinue1() {
		clickByXpath(prop.getProperty("PersonalDetailsPage.Continue.XPath"));
		return this;
	}
	
	public HotelSummaryPage cliclOnContinue() {
		return new HotelSummaryPage(driver,test);
	}
	
	public PersonalDetailsPage verifyGstValidationmsg(String text) {
		verifyTextByXpath(prop.getProperty("PersonalDetailsPage.GstValidationmsg.XPath"), text);
		return this;		
	}

}
