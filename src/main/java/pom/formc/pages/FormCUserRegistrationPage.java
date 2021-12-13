package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCUserRegistrationPage extends GenericWrappers {
	
	public FormCUserRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
	
	public FormCUserRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.UserId.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterConfPassword(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.ConfPassword.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage selectSecQtn(String data) {
		selectValueByXpath(prop.getProperty("FormCUserRegistrationPage.SecQtn.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterAnswer(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Answer.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Name.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterGender(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Gender.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterDOB(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.DOB.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Designation.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Email.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterPhoneno(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Phoneno.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterHtlname(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Htlname.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterHtlcapacity(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Htlcapacity.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage enterHtladdress(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Htladdress.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage selectHtlstate(String data) {
		selectValueByXpath(prop.getProperty("FormCUserRegistrationPage.Htlstate.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage selectHtlcity(String data) {
		selectValueByXpath(prop.getProperty("FormCUserRegistrationPage.Htlcity.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage selectAcctype(String data) {
		selectValueByXpath(prop.getProperty("FormCUserRegistrationPage.Acctype.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage selectAccgrade(String data) {
		selectValueByXpath(prop.getProperty("FormCUserRegistrationPage.Accgrade.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterHtlemail(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Htlemail.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterHtlmobile(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Htlmobile.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterHtlphno(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Htlphno.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnername(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Ownername.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwneraddresso(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Owneraddresso.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage selectOwnerstate(String data) {
		selectValueByXpath(prop.getProperty("FormCUserRegistrationPage.Ownerstate.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage selectOwnercity(String data) {
		selectValueByXpath(prop.getProperty("FormCUserRegistrationPage.Ownercity.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwneremail(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Owneremail.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnerphno(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Ownerphno.XPath"), data);
		return this;
	}
	
	public FormCUserRegistrationPage enterOwnermobile(String data) {
		enterByXpath(prop.getProperty("FormCUserRegistrationPage.Ownermobile.XPath"), data);
		return this;
	}
	
	
	public FormCUserRegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("FormCUserRegistrationPage.Add.XPath"));
		return this;
	}
	
	public FormCUserRegistrationPage waitForFormCPage(long time) {		
		waitProperty(time);
		return this;
	}
}
