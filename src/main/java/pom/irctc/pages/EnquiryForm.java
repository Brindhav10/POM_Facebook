package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryForm extends GenericWrappers {

	public EnquiryForm(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
		
	public EnquiryForm enterApplicantName(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.ApplicantName.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterOrganisationtName(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OrganisationtName.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterAddress(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Address.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterMobile(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Mobile.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterEmail(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Email.XPath"), data);
		return this;
	}
	
	public EnquiryForm selectRequestFor(String data) {
		selectValueByXpath(prop.getProperty("EnquiryFormPage.RequestFor.XPath"), data);
		return this;
	}
	
	
	public EnquiryForm enterOrginStation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OrginStation.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterDestOrgin(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DestOrgin.XPath"), data);
		return this;
	}
	
	public EnquiryForm clickOnCheckInDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckInDate.XPath"));
		return this;
	}
	
	public EnquiryForm clickOnDate()
	{
		clickByXpath(prop.getProperty("EnquiryFormPage.Date.XPath"));
		return this;
	}
	
	public EnquiryForm clickOnCheckoutDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckoutDate.XPath"));
		return this;
	}
	
	public EnquiryForm clickOnDate1()
	{
		clickByXpath(prop.getProperty("EnquiryFormPage.Date1.XPath"));
		return this;
	}
	
	public EnquiryForm enterDuration(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Duration.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterCoatchType(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.CoatchType.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterPassenderNo(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.PassenderNo.XPath"), data);
		return this;
	}
	
	
	public EnquiryForm enterPurpose(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Purpose.XPath"), data);
		return this;
	}
	
	public EnquiryForm enterAdditionalServices(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.AdditionalServices.XPath"), data);
		return this;
	}
	
	public EnquiryForm clickOnSubmit() {
		clickByXpath(prop.getProperty("EnquiryFormPage.Submit.XPath"));
		return this;
	}
	
	
	public EnquiryForm verifyMobilenoValidationText(String errormsg) {
		verifyTextByXpath(prop.getProperty("EnquiryFormPage.MobilenoValidationText.XPath"), errormsg);
		return this;
	}

}
