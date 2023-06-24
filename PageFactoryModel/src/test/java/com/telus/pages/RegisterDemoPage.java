package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class RegisterDemoPage {

	WebDriver driver;

	public RegisterDemoPage (WebDriver driver) {
		this.driver=driver;
	}

	//Initialize webelements using @FindBy class
	@FindBy(xpath="//*[@id=\"item-vfb-1\"]/div/h3") WebElement regFormTitle;

	@FindBy(id="vfb-5") WebElement firstNameTxtBox;

	@FindBy(id="vfb-7") WebElement lastNameTxtBox;

	@FindBy(id="vfb-31-1") WebElement maleRadioBtn;

	@FindBy(id="vfb-31-2") WebElement femaleRadioBtn;

	@FindBy(id="vfb-31-3") WebElement otherRadioBtn;

	@FindBy(id="vfb-13-address") WebElement streetAddressTxtBox;

	@FindBy(id="vfb-13-address-2") WebElement aptNumTxtBox;

	@FindBy(id="vfb-13-city") WebElement cityTxtBox;

	@FindBy(id="vfb-13-zip") WebElement postalCodeTxtBox;

	@FindBy(id="vfb-13-state") WebElement stateTxtBox;

	@FindBy(id="vfb-13-country") WebElement countryDropDown;

	@FindBy(id="vfb-14") WebElement emailTxtBox;

	@FindBy(id="vfb-18") WebElement dateOfDemoTxtBox;

	@FindBy(id="vfb-16-hour") WebElement convenientHour;

	@FindBy(id="vfb-16-min") WebElement convenientMinute;

	@FindBy(id="vfb-19") WebElement mobileNoTxtBox;

	@FindBy(xpath="//*[@id=\"vfb-20-2\"]") WebElement testNgChkBox;

	@FindBy(id="vfb-20-3") WebElement coreJavaChkBox;

	@FindBy(id="vfb-23") WebElement enterQuery;

	@FindBy(id="vfb-3")	WebElement verificationTxtBox;

	@FindBy(xpath="//*[contains(text(),'Example:')]") WebElement exampletwoDigits;

	@FindBy(id="vfb-4")	WebElement submitBtn;



	//Reusable methods
	public void regFormTitleValidation(String expFormTitle) {
		//Validating whether the tile displayed is "Register For Demo"
		String actFormTitle = regFormTitle.getText();		

		if(actFormTitle.equals(expFormTitle)) {
			Reporter.log("The Actual & Expected Registration Form Titles are same");
			Reporter.log("The Registration Form Tile displayed is " + actFormTitle);
		}
		else {
			Reporter.log("The Actual & Expected Registration Form Titles are not same");
			Reporter.log("The Actual Registration Form Tile displayed is " + actFormTitle);
			Reporter.log("The Expected Registration Form Tile is " + expFormTitle);
		}
	}

	public void enterFirstName(String firstName) {
		//First name text box -- Validate whether it is displayed or not and enter the value
		if(firstNameTxtBox.isDisplayed()) {
			Reporter.log("First Name Text Box is displayed");
			firstNameTxtBox.sendKeys(firstName);
			Reporter.log("First Name entered in the text box is "+ firstName);
		}
		else {
			Reporter.log("First Name Text Box is not displayed");
		}
	}

	public void enterLastName(String lastName) {
		//Last name text box -- Validate whether it is displayed or not and enter the value
		if(lastNameTxtBox.isDisplayed()) {
			Reporter.log("Last Name Text Box is displayed");
			lastNameTxtBox.sendKeys(lastName);
			Reporter.log("Last Name entered in the text box is "+ lastName);
		}
		else {
			Reporter.log("Last Name Text Box is not displayed");
		}
	}

	public void selectGender(String gender) {
		//Gender radio button using if else if method
		if(gender.equals("Male")) {
			if(maleRadioBtn.isSelected()) {
				Reporter.log("Male Radio Button is selected");						
			}
			else {
				Reporter.log("Male Radio Button is not selected");
				maleRadioBtn.click();
			}

			//Validating whether male radio button is selected or not
			if(maleRadioBtn.isSelected()) {
				Reporter.log("Male Radio Button is selected");						
			}
			else {
				Reporter.log("Male Radio Button is not selected");
			}
		}
		else if(gender.equals("Female")) {
			if(femaleRadioBtn.isSelected()) {
				Reporter.log("Female Radio Button is selected");						
			}
			else {
				Reporter.log("Female Radio Button is not selected");
				femaleRadioBtn.click();
			}

			//Validating whether female radio button is selected or not
			if(femaleRadioBtn.isSelected()) {
				Reporter.log("Female Radio Button is selected");						
			}
			else {
				Reporter.log("Female Radio Button is not selected");
			}
		}
		else {
			if(otherRadioBtn.isSelected()) {
				Reporter.log("Other Radio Button is selected");						
			}
			else {
				Reporter.log("Other Radio Button is not selected");
				otherRadioBtn.click();
			}

			//Validating whether other radio button is selected or not
			if(otherRadioBtn.isSelected()) {
				Reporter.log("Other Radio Button is selected");						
			}
			else {
				Reporter.log("Other Radio Button is not selected");
			}
		}
	}

	public void enterStreetAddress(String streetAddress) {
		//Street address text box -- Validate whether it is displayed or not and enter the value
		if(streetAddressTxtBox.isDisplayed()) {
			Reporter.log("Street Adress Text Box is displayed");
			streetAddressTxtBox.sendKeys(streetAddress);
			Reporter.log("Street Adress entered in the text box is "+ streetAddress);
		}
		else {
			Reporter.log("Street Adress Text Box is not displayed");
		}
	}

	public void enterApartmenttNum(String apartmenttNum) {
		//Apartment,Suite,Bldg Text Box -- Validate whether it is displayed or not and enter the value
		if(aptNumTxtBox.isDisplayed()) {
			Reporter.log("Apt, Suite, Bldg. Text Box is displayed");
			aptNumTxtBox.sendKeys(apartmenttNum);
			Reporter.log("Apt, Suite, Bldg. No. entered in the text box is "+ apartmenttNum);
		}
		else {
			Reporter.log("Apt, Suite, Bldg. Text Box is not displayed");
		}
	}

	public void entercity(String city) {
		//City text box -- Validate whether it is displayed or not and enter the value
		if(cityTxtBox.isDisplayed()) {
			Reporter.log("City Text Box is displayed");
			cityTxtBox.sendKeys(city);
			Reporter.log("City entered in the text box is "+ city);
		}
		else {
			Reporter.log("City Text Box is not displayed");
		}
	}

	public void enterPostalCode(String postalCode) {
		//Postal/Zip Code text box -- Validate whether it is displayed or not and enter the value
		if(postalCodeTxtBox.isDisplayed()) {
			Reporter.log("Postal/Zip Code Text Box is displayed");
			postalCodeTxtBox.sendKeys(postalCode);
			Reporter.log("Postal/Zip Code entered in the text box is "+ postalCode);
		}
		else {
			Reporter.log("Postal/Zip Code Text Box is not displayed");
		}
	}

	public void enterState(String state) {
		//State/province/region text box -- Validate whether it is displayed or not and enter the value
		if(stateTxtBox.isDisplayed()) {
			Reporter.log("State Text Box is displayed");
			stateTxtBox.sendKeys(state);
			Reporter.log("State entered in the text box is "+ state);
		}
		else {
			Reporter.log("State Text Box is not displayed");
		}
	}

	public void selectCountry(String country) {
		//Country DropDown -- Validate whether it is displayed or not and selecting the value
		if(countryDropDown.isDisplayed()) {
			Reporter.log("Country Drop Down is displayed");
			Select cDropDown = new Select(countryDropDown);
			cDropDown.selectByVisibleText(country);
			Reporter.log("Country selected from the drop down is "+ country);
		}
		else {
			Reporter.log("Country Drop Down is not displayed");
		}
	}

	public void enterEmailId(String emailId) {
		//Email text box -- Validate whether it is displayed or not and enter the value
		if(emailTxtBox.isDisplayed()) {
			Reporter.log("Email Text Box is displayed");
			emailTxtBox.sendKeys(emailId);
			Reporter.log("Email entered in the text box is "+ emailId);
		}
		else {
			Reporter.log("Email Text Box is not displayed");
		}
	}

	public void enterDateOfDemo(String dateOfDemo) {
		//Date of Demo Text box -- Validate whether it is displayed or not and enter the value
		if(dateOfDemoTxtBox.isDisplayed()) {
			Reporter.log("Date of Demo Text Box is displayed");
			dateOfDemoTxtBox.sendKeys(dateOfDemo);
			Reporter.log("Date of Demo entered in the text box is "+ dateOfDemo);
		}
		else {
			Reporter.log("Date of Demo Text Box is not displayed");
		}
	}

	public void selectHour(String hour) {
		//Convenient Hour Drop Down -- Validate whether it is displayed or not and selecting the value
		if(convenientHour.isDisplayed()) {
			Reporter.log("Convenient Hour Drop Down is displayed");
			Select myhours = new Select(convenientHour);
			myhours.selectByVisibleText(hour);
			Reporter.log("Convenient Hour selected from the drop down is "+ hour);	
		}
		else {
			Reporter.log("Convenient Hour Drop Down is not displayed");
		}
	}

	public void selectMinutes(String minutes) {
		//Convenient Minute Drop Down -- Validate whether it is displayed or not and selecting the value
		if(convenientMinute.isDisplayed()) {
			Reporter.log("Convenient Minutes Drop Down is displayed");
			Select myMinutes = new Select(convenientMinute);
			myMinutes.selectByVisibleText(minutes);
			Reporter.log("Convenient Minutes selected from the drop down is "+ minutes);	
		}
		else {
			Reporter.log("Convenient Minutes Drop Down is not displayed");
		} 
	}

	public void enterMobileNumber(String mobileNumber) {
		//Mobile Number Text Box -- Validate whether it is displayed or not and enter the value
		if(mobileNoTxtBox.isDisplayed()) {
			Reporter.log("Mobile Number Text Box is displayed");
			mobileNoTxtBox.sendKeys(mobileNumber);
			Reporter.log("Mobile Number entered in the text box is "+ mobileNumber);
		}
		else {
			Reporter.log("Mobile Number Text Box is not displayed");
		}
	}

	public void selectTestNgChckBox() {
		//Validating whether testng checkbox is selected or not and selecting it if not selected
		if(testNgChkBox.isSelected()) {
			Reporter.log("TestNG checkbox is selected");
		}
		else {
			Reporter.log("TestNG checkbox is not selected");
			//Selecting the TestNg checkbox
			testNgChkBox.click();
		}

		//Validating whether testng checkbox is selected or not
		if(testNgChkBox.isSelected()) {
			Reporter.log("TestNG checkbox is selected");
		}
		else {
			Reporter.log("TestNG checkbox is not selected");
		}
	}

	public void selectCoreJavaChckBox() {
		//Validating whether Core Java checkbox is selected or not and selecting it if not selected
		if(coreJavaChkBox.isSelected()) {
			Reporter.log("Core Java checkbox is selected");
		}
		else {
			Reporter.log("Core Java checkbox is not selected");
			//Selecting the Core Java checkbox
			coreJavaChkBox.click();
		}

		//Validating whether Core Java checkbox is selected or not
		if(coreJavaChkBox.isSelected()) {
			Reporter.log("Core Java checkbox is selected");
		}
		else {
			Reporter.log("Core Java checkbox is not selected");
		}
	}

	public void enterQuery(String query) {
		//Enter your query Text Box -- Validate whether it is displayed or not and enter the value
		if(enterQuery.isDisplayed()) {
			Reporter.log("Enter Your Query Text Box is displayed");
			enterQuery.sendKeys(query);
			Reporter.log("Query entered in the text box is "+ query);
		}
		else {
			Reporter.log("Enter Your Query Text Box is not displayed");
		}
	}

	public void enterTwoDigitVerification() {
		//Verification Text Box -- Validate whether it is displayed or not and enter the dynamic value
		if(verificationTxtBox.isDisplayed()) {
			Reporter.log("Verification Text Box is displayed");
			//Retrieving the value and splitting it
			String twoDigitsVal[] = exampletwoDigits.getText().split(":");
			String twoDigits = twoDigitsVal[1].trim();
			verificationTxtBox.sendKeys(twoDigits);
			Reporter.log("Two digits entered in the text box is "+ twoDigits);
		}
		else {
			Reporter.log("Verification Text Box is not displayed");
		}
	}

	public void clickSubmitBtn() {
		//Submit Button -- Validate whether it is enabled or not and Click on Submit Button
		if(submitBtn.isEnabled()) {
			Reporter.log("Submit Button is enabled");
			submitBtn.click();
		}
		else {
			Reporter.log("Submit Button is disabled");
		}
	}



}
