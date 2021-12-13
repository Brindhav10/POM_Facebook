package pom.irctc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRUserRegistrationPage extends GenericWrappers{
	
	public FTRUserRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	public FTRUserRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.UserId.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterConfPassword(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.ConfPassword.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectSecQtn(String data) {
		selectValueByXpath(prop.getProperty("FTRUserRegistrationPage.SecQtn.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterSecAns(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.SecAns.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterDOB(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.DOB.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage clickOnDate() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.Birthdate.XPath"));
		return this;
	}
	
	
	public FTRUserRegistrationPage clickOnGender() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.Gender.XPath"));
		return this;
	}
	
	
	public FTRUserRegistrationPage clickOnMaritalStatus() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.MaritalStatus.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectOccupation(String data) {
		selectValueByXpath(prop.getProperty("FTRUserRegistrationPage.Occupation.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterFname(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Fname.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterMname(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Mname.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterLname(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Lname.XPath"), data);
		return this;
	}
	
	
	public FTRUserRegistrationPage selectNationality(String data) {
		selectValueByXpath(prop.getProperty("FTRUserRegistrationPage.Nationality.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.FlatNo.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Area.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectCountry(String data) {
		selectValueByXpath(prop.getProperty("FTRUserRegistrationPage.Country.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Pincode.XPath"), data);
		return this;
	}
	
		
	public FTRUserRegistrationPage clickPostoffice() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.Postoffice.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage clickPostofficeOption() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.PostofficeOption.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage selectPostOffice(String value) {
		selectValueByXpath(prop.getProperty("FTRUserRegistrationPage.Postoffice1.XPath"), value);
		return this;
	}
	
	
	public FTRUserRegistrationPage pageDown() {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.PageDown.XPath"), Keys.PAGE_DOWN);
		return this;
	}
	
	
	
	
	public FTRUserRegistrationPage clickCommunicationAddressAsResidentialAddress() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.AddressSelection.XPath"));
		return this;
	}
	
	
	public FTRUserRegistrationPage enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OffFlatNo.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectOfficeCountry(String data) {
		selectValueByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeCountry.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeMobile(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeMobile.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficePincode.XPath"), data);
		return this;
	}
	
		
	public FTRUserRegistrationPage clickOfficePostoffice() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.OfficePostoffice.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage clickOfficePostofficeOption() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.OfficePostofficeOption.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage clickOnCreateProfile()
	{
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.CreateProfile.XPath"));
		return this;
	}
	
	
	public FTRUserRegistrationPage clickOnResetButton()
	{
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.ResetButton.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage waitForFTRUserRegistrationPage(long time) {		
		waitProperty(time);
		return this;
		
	}

}
