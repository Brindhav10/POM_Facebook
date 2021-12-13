package pom.pan.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanSignUpPage extends GenericWrappers{
	
	public PanSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}	
	
	
	public PanSignUpPage selectTitle(String data) {
	
		//selectValueByXpath(prop.getProperty("PanSignUpPage.Title.XPath"), Integer.parseInt(data));
		selectValueByXpath(prop.getProperty("PanSignUpPage.Title.XPath"),data);
		return this;
	}
	
	public PanSignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.FirstName.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.MiddleName.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterLastName(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.LastName.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterFatherFirstName(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.FatherFirstName.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterFatherMiddleName(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.FatherMiddleName.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterFatherLastName(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.FatherLastNam.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.MobileNo.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.Email.XPath"), data);
		return this;
	}
	
	public PanSignUpPage selectSourceOfincome(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.SourceOfincome.XPath"), data);
		return this;
	}
	
	public PanSignUpPage clikOnAddress() {
		clickByXpath(prop.getProperty("PanSignUpPage.Addres.XPath"));
		return this;
	}
	
	public PanSignUpPage enterDob(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.Dob.XPath"), data);
		return this;
	}
	
	
	public PanSignUpPage pageDown() {
		enterByXpath("//html/body", Keys.PAGE_DOWN);
		return this;
	}
	
		
	public PanSignUpPage enterResAddressl1(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.ResAddressl1.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterResAddressl2(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.ResAddressl2.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterResCity(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.ResCity.XPath"), data);
		return this;
	}
	
	public PanSignUpPage selectResstate(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.Resstate.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterResPincode(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.ResPincod.XPath"), data);
		return this;
	}
	
		
      public PanSignUpPage waitForPanPage(long time) {		
		waitProperty(time);
		return this;
		
	}
	
	public PanSignUpPage enterOffName(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.OffName.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterOffAddressl1(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.OffAddressl1.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterOffAddressl2(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.OffAddressl2.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterOffCity(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.OffCity.XPath"), data);
		return this;
	}
	
	public PanSignUpPage selectOffstate(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.Offstate.XPath"), data);
		return this;
	}
	
	public PanSignUpPage enterOffPincode(String data) {
		enterByXpath(prop.getProperty("PanSignUpPage.OffPincode.XPath"), data);
		return this;
	}
	
	public PanSignUpPage selectIndentityproof(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.Indentityproof.XPath"), data);
		return this;
	}
	
	public PanSignUpPage selectAddressproof(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.Addressproof.XPath"), data);
		return this;
	}
	
	
	public PanSignUpPage selectDobproof(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.Dobproof.XPath"), data);
		return this;
	}
	
	public PanSignUpPage selectAadharproof(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.Aadharproof.XPath"), data);
		return this;
	}
	
	public PanSignUpPage selectOffAddproof(String data) {
		selectValueByXpath(prop.getProperty("PanSignUpPage.OffAddproof.XPath"), data);
		return this;
	}
	
	public PanSignUpPage clickonTerms() {
		clickByXpath(prop.getProperty("PanSignUpPage.TermsAndCondition.XPath"));
		return this;
	}
	
	public PanSignUpPage clickOnNext() {
		clickByXpath(prop.getProperty("PanSignUpPage.Next.XPath"));
		return this;
	}


	
	
	
}
