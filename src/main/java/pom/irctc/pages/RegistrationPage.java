package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), data);
		return this;
	}

	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterConfPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfPassword.XPath"), data);
		return this;
			}
	
	public RegistrationPage clickOnPreferredLang() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLang.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnPreferredLangOption() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLangOption.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnSecQuestn() {
		clickByXpath(prop.getProperty("RegistrationPage.SecQuestn.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnSecQuestnOption() {
		clickByXpath(prop.getProperty("RegistrationPage.SecQuestnOption.XPath"));
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnCancel() {
		clickByXpath(prop.getProperty("RegistrationPage.Cancel.XPath"));
		return this;
	}
	
	
	public RegistrationPage clickOnContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.Continue.XPath"));
		return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnOccupationOption() {
		clickByXpath(prop.getProperty("ReRegistrationPage.OccupationOption.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnDateOfBirth()
	{
		clickByXpath(prop.getProperty("RegistrationPage.DateOfBirth.XPath"));
		return this;
	}
	
	public RegistrationPage clickYear()
	{
		clickByXpath(prop.getProperty("RegistrationPage.Year.XPath"));
		return this;
	}
	
	public RegistrationPage clickYearOption()
	{
		clickByXpath(prop.getProperty("RegistrationPage.YearOption.XPath"));
		return this;
	}
	
	
	public RegistrationPage clickMonth()
	{
		clickByXpath(prop.getProperty("RegistrationPage.Month.XPath"));
		return this;
	}
	

	public RegistrationPage clickMonthOption()
	{
		clickByXpath(prop.getProperty("RegistrationPage.Month.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnDay()
	{
		
		clickByXpath(prop.getProperty("RegistrationPage.Day.XPath"));
			
		return this;
	}
	
	public RegistrationPage clickOnMaritalstatus()
	{
		clickByXpath(prop.getProperty("RegistrationPage.Maritalstatus.XPath"));
		return this;
	}
	
	public RegistrationPage selectkOnCountry(String Value) {
		selectValueByXpath(prop.getProperty("RegistrationPage.Country.XPath"), Value);
		return this;
	}
	
			
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMobile(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.Mobile.XPath"), data);
	return this;
	}

	public RegistrationPage selectNationality(String data) {
		selectValueByXpath(prop.getProperty("RegistrationPage.Nationality.XPath"), data);
		return this;
	}

	
	public RegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FlatNo.XPath"), data);
		return this;
	}

	public RegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Street.XPath"), data);
		return this;
	}


	public RegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.XPath"), data);
		return this;
	}

	public RegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Pincode.XPath"), data);
		return this;
	}	


	public RegistrationPage clickOnCity() {
		clickByXpath(prop.getProperty("RegistrationPage.City.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnCityOption() {
		clickByXpath(prop.getProperty("RegistrationPage.CityOption.XPath"));
		return this;
	}

	public RegistrationPage selectPostoffice(String data) {
		selectValueByXpath(prop.getProperty("RegistrationPage.Postoffice.XPath"), data);
		return this;
	}

	public RegistrationPage enterPhoneno(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Phoneno.XPath"), data);
		return this;
	}
	
	
	public RegistrationPage clickOnResidenceToOfficeAddress()
	{
		clickByXpath(prop.getProperty("RegistrationPage.ResidenceToOfficeAddress.XPath"));
		return this;
	}
		
	
	public RegistrationPage enterOffFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffFlatNo.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOffStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffStreet.XPath"), data);
		return this;
	}


	public RegistrationPage enterOffArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffArea.XPath"), data);
		return this;
	}
	
	
	public RegistrationPage selectOffCountry(String data) {
		selectValueByXpath(prop.getProperty("RegistrationPage.OffCountry.XPath"), data);
		return this;
	}

	public RegistrationPage enterOffPincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPincode.XPath"), data);
		return this;
	}	
		

	public RegistrationPage clickOnOffCity() {
		clickByXpath(prop.getProperty("RegistrationPage.OffCity.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnOffCityOption() {
		clickByXpath(prop.getProperty("RegistrationPage.OffCity.XPath"));
		return this;
	}

	public RegistrationPage clicnOnOffPostoffice() {
		clickByXpath(prop.getProperty("RegistrationPage.OffPostoffice.XPath"));
		return this;
	}
	
	public RegistrationPage clicnOnOffPostofficeOption() {
		clickByXpath(prop.getProperty("RegistrationPage.OffPostoffice.XPath"));
		return this;
	}

	public RegistrationPage enterOffPhoneno(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPhoneno.XPath"), data);
		return this;
	}
	
	
	public RegistrationPage clickOnTerms() {
		clickByXpath(prop.getProperty("RegistrationPage.TermsAndCondition.XPath"));
		return this;
	}
	
	public RegistrationPage waitForRegistrationPage(long time) {		
		waitProperty(time);
		return this;
		
	}

}
