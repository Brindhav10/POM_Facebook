package pom.phpregister.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpTravelsRegisterPage extends GenericWrappers {
	
	public PhpTravelsRegisterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	
	public PhpTravelsRegisterPage enterFirstname(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Firstname.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterLastname(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Lastname.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterEmail(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Email.XPath"), data);
		return this;		
	}
	
	
	public PhpTravelsRegisterPage clickOnCountryCode() {
		clickByXpath(prop.getProperty("PhpTravelsRegistrationPage.CountryCode.XPath"));
		return this;
	}
	
	public PhpTravelsRegisterPage clickOnCountryCodeOption() {
		clickByXpath(prop.getProperty("PhpTravelsRegistrationPage.CountryCodeOption.XPath"));
		return this;
	}
	
	
	public PhpTravelsRegisterPage enterPhone(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Phone.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterCompanyName(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.CompanyName.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterAddress1(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Address1.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterAddress2(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Address2.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterState(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.State.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterPostcode(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Postcode.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterMobile(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Mobile.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage selectCity(String data) {
		selectValueByXpath(prop.getProperty("PhpTravelsRegistrationPage.City.XPath"), data);
		return this;
	}
	
	public PhpTravelsRegisterPage selectCountry(String data) {
		selectValueByXpath(prop.getProperty("PhpTravelsRegistrationPage.Country.XPath"), data);
		return this;
	}
	
	public PhpTravelsRegisterPage enterPassword(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Password.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage enterConfPassword(String data){
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.ConfPassword.XPath"), data);
		return this;		
	}
	
	public PhpTravelsRegisterPage clickRegister(){
		clickByXpath(prop.getProperty("PhpTravelsRegistrationPage.Register.XPath"));
		return this;		
	}
	

}
