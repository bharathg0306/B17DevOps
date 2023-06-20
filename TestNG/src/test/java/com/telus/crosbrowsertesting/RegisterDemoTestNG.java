package com.telus.crosbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterDemoTestNG extends MultipleBrowser {

	//Parameterizing the values
	String firstName = "BharathVasan";
	String lastName = "G";
	String gender = "Male";
	String streetAddress = "234";
	String apartmenttNo = "213/7";
	String city = "Dindigul";
	String postalCode = "500 012";
	String state = "Tamil Nadu";
	String country = "India";
	String email = "registerdemo@gmail.com";
	String dateOfDemo = "12/05/23";
	String hour = "10";
	String minutes = "30";
	String mobileNumber = "472813";
	String query = "End to End assigment";
	String expSuccessfulMsg = "Registration Form is Successfully Submitted.";

	@Test(priority=1)
	public void navigateToRegisterDemoPage() {
		Actions action = new Actions(driver);

		//Hover to Demo Sites web element
		WebElement demoSites = driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(demoSites).perform();

		//Hover to Practice Automation
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		//Click on "Demo Site – Registration Form" link
		WebElement regFormLink = driver.findElement(By.partialLinkText("Registration Form"));
		regFormLink.click();

		Reporter.log("Register Demo Page is displayed");
	}

	@Test(priority=2)
	public void registerUser() {

		//Validating whether the tile displayed is "Register For Demo"
		WebElement regFormTitle = driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3"));
		String actFormTitle = regFormTitle.getText();		
		String expFormTitle = "Register For Demo";

		if(actFormTitle.equals(expFormTitle)) {
			Reporter.log("The Actual & Expected Registration Form Titles are same");
			Reporter.log("The Registration Form Tile displayed is " + actFormTitle);
		}
		else {
			Reporter.log("The Actual & Expected Registration Form Titles are not same");
			Reporter.log("The Actual Registration Form Tile displayed is " + actFormTitle);
			Reporter.log("The Expected Registration Form Tile is " + expFormTitle);
		}

		//Filling the form
		//First name text box -- Validate whether it is displayed or not and enter the value
		WebElement firstNameTxtBox = driver.findElement(By.id("vfb-5"));
		if(firstNameTxtBox.isDisplayed()) {
			Reporter.log("First Name Text Box is displayed");
			firstNameTxtBox.sendKeys(firstName);
			Reporter.log("First Name entered in the text box is "+ firstName);
		}
		else {
			Reporter.log("First Name Text Box is not displayed");
		}

		//Last name text box -- Validate whether it is displayed or not and enter the value
		WebElement lastNameTxtBox = driver.findElement(By.id("vfb-7"));
		if(lastNameTxtBox.isDisplayed()) {
			Reporter.log("Last Name Text Box is displayed");
			lastNameTxtBox.sendKeys(lastName);
			Reporter.log("Last Name entered in the text box is "+ lastName);
		}
		else {
			Reporter.log("Last Name Text Box is not displayed");
		}

		//Gender radio button using if else if method
		if(gender.equals("Male")) {
			WebElement maleRadioBtn = driver.findElement(By.id("vfb-31-1"));
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
			WebElement femaleRadioBtn = driver.findElement(By.id("vfb-31-2"));
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
			WebElement otherRadioBtn = driver.findElement(By.id("vfb-31-3"));
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

		//Street address text box -- Validate whether it is displayed or not and enter the value
		WebElement streetAddressTxtBox = driver.findElement(By.id("vfb-13-address"));
		if(streetAddressTxtBox.isDisplayed()) {
			Reporter.log("Street Adress Text Box is displayed");
			streetAddressTxtBox.sendKeys(streetAddress);
			Reporter.log("Street Adress entered in the text box is "+ streetAddress);
		}
		else {
			Reporter.log("Street Adress Text Box is not displayed");
		}

		//Apartment,Suite,Bldg Text Box -- Validate whether it is displayed or not and enter the value
		WebElement aptNoTxtBox = driver.findElement(By.id("vfb-13-address-2"));
		if(aptNoTxtBox.isDisplayed()) {
			Reporter.log("Apt, Suite, Bldg. Text Box is displayed");
			aptNoTxtBox.sendKeys(apartmenttNo);
			Reporter.log("Apt, Suite, Bldg. No. entered in the text box is "+ apartmenttNo);
		}
		else {
			Reporter.log("Apt, Suite, Bldg. Text Box is not displayed");
		}

		//City text box -- Validate whether it is displayed or not and enter the value
		WebElement cityTxtBox = driver.findElement(By.id("vfb-13-city"));
		if(cityTxtBox.isDisplayed()) {
			Reporter.log("City Text Box is displayed");
			cityTxtBox.sendKeys(city);
			Reporter.log("City entered in the text box is "+ city);
		}
		else {
			Reporter.log("City Text Box is not displayed");
		}

		//Postal/Zip Code text box -- Validate whether it is displayed or not and enter the value
		WebElement postalCodeTxtBox = driver.findElement(By.id("vfb-13-zip"));
		if(postalCodeTxtBox.isDisplayed()) {
			Reporter.log("Postal/Zip Code Text Box is displayed");
			postalCodeTxtBox.sendKeys(postalCode);
			Reporter.log("Postal/Zip Code entered in the text box is "+ postalCode);
		}
		else {
			Reporter.log("Postal/Zip Code Text Box is not displayed");
		}

		//State/province/region text box -- Validate whether it is displayed or not and enter the value
		WebElement stateTxtBox = driver.findElement(By.id("vfb-13-state"));
		if(stateTxtBox.isDisplayed()) {
			Reporter.log("State Text Box is displayed");
			stateTxtBox.sendKeys(state);
			Reporter.log("State entered in the text box is "+ state);
		}
		else {
			Reporter.log("State Text Box is not displayed");
		}

		//Country DropDown -- Validate whether it is displayed or not and selecting the value
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		if(countryDropDown.isDisplayed()) {
			Reporter.log("Country Drop Down is displayed");
			Select cDropDown = new Select(countryDropDown);
			cDropDown.selectByVisibleText(country);
			Reporter.log("Country selected from the drop down is "+ country);
		}
		else {
			Reporter.log("Country Drop Down is not displayed");
		}

		//Email text box -- Validate whether it is displayed or not and enter the value
		WebElement emailTxtBox = driver.findElement(By.id("vfb-14"));
		if(emailTxtBox.isDisplayed()) {
			Reporter.log("Email Text Box is displayed");
			emailTxtBox.sendKeys(email);
			Reporter.log("Email entered in the text box is "+ email);
		}
		else {
			Reporter.log("Email Text Box is not displayed");
		}

		//Date of Demo Text box -- Validate whether it is displayed or not and enter the value
		WebElement dateOfDemoTxtBox = driver.findElement(By.id("vfb-18"));
		if(dateOfDemoTxtBox.isDisplayed()) {
			Reporter.log("Date of Demo Text Box is displayed");
			dateOfDemoTxtBox.sendKeys(dateOfDemo);
			Reporter.log("Date of Demo entered in the text box is "+ dateOfDemo);
		}
		else {
			Reporter.log("Date of Demo Text Box is not displayed");
		}

		//Convenient Hour Drop Down -- Validate whether it is displayed or not and selecting the value
		WebElement convenientHour = driver.findElement(By.id("vfb-16-hour"));
		if(convenientHour.isDisplayed()) {
			Reporter.log("Convenient Hour Drop Down is displayed");
			Select myhours = new Select(convenientHour);
			myhours.selectByVisibleText(hour);
			Reporter.log("Convenient Hour selected from the drop down is "+ hour);	
		}
		else {
			Reporter.log("Convenient Hour Drop Down is not displayed");
		}

		//Convenient Minute Drop Down -- Validate whether it is displayed or not and selecting the value
		WebElement convenientMinute = driver.findElement(By.id("vfb-16-min"));
		if(convenientMinute.isDisplayed()) {
			Reporter.log("Convenient Minutes Drop Down is displayed");
			Select myMinutes = new Select(convenientMinute);
			myMinutes.selectByVisibleText(minutes);
			Reporter.log("Convenient Minutes selected from the drop down is "+ minutes);	
		}
		else {
			Reporter.log("Convenient Minutes Drop Down is not displayed");
		} 

		Reporter.log("Convenient Time selected from the drop down is "+ hour + "hours and "+ minutes + "minutes");

		//Mobile Number Text Box -- Validate whether it is displayed or not and enter the value
		WebElement mobileNoTxtBox = driver.findElement(By.id("vfb-19"));
		if(mobileNoTxtBox.isDisplayed()) {
			Reporter.log("Mobile Number Text Box is displayed");
			mobileNoTxtBox.sendKeys(mobileNumber);
			Reporter.log("Mobile Number entered in the text box is "+ mobileNumber);
		}
		else {
			Reporter.log("Mobile Number Text Box is not displayed");
		}

		//Courses Interested Checkboxes
		//TestNg Check Box
		WebElement testNgChkBox = driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]"));

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

		//Core Java Check Box 
		WebElement coreJavaChkBox = driver.findElement(By.id("vfb-20-3"));

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

		//Enter your query Text Box -- Validate whether it is displayed or not and enter the value
		WebElement enterQuery = driver.findElement(By.id("vfb-23"));
		if(enterQuery.isDisplayed()) {
			Reporter.log("Enter Your Query Text Box is displayed");
			enterQuery.sendKeys(query);
			Reporter.log("Query entered in the text box is "+ query);
		}
		else {
			Reporter.log("Enter Your Query Text Box is not displayed");
		}

		//Verification Text Box -- Validate whether it is displayed or not and enter the dynamic value
		WebElement verificationTxtBox = driver.findElement(By.id("vfb-3"));		
		if(verificationTxtBox.isDisplayed()) {
			Reporter.log("Verification Text Box is displayed");
			//Retrieving the value and splitting it
			String exampletwoDigits[] = driver.findElement(By.xpath("//*[contains(text(),'Example:')]")).getText().split(":");
			String twoDigits = exampletwoDigits[1].trim();
			verificationTxtBox.sendKeys(twoDigits);
			Reporter.log("Two digits entered in the text box is "+ twoDigits);
		}
		else {
			Reporter.log("Verification Text Box is not displayed");
		}

		//Submit Button -- Validate whether it is enabled or not and Click on Submit Button
		WebElement submitBtn = driver.findElement(By.id("vfb-4"));
		if(submitBtn.isEnabled()) {
			Reporter.log("Submit Button is enabled");
			submitBtn.click();
		}
		else {
			Reporter.log("Submit Button is disabled");
		}

		Reporter.log("User is Registered succesfully");
	}

	@Test(priority=3)
	public void validateSuccessfulMsg() {
		//Validating the successful message
		String text = driver.findElement(By.xpath("//div[@class='elementor-widget-container']")).getText();
		String message[] = text.split("Verification");
		String successfulMsg[] = message[1].split("The");
		String actSuccessfulMsg = successfulMsg[0].trim();

		if(actSuccessfulMsg.equals(expSuccessfulMsg)) {
			Reporter.log("The Actual and Expected Successful Messages are same");
			Reporter.log("The Actual Successful Message is " + actSuccessfulMsg);
		}
		else {
			Reporter.log("The Actual and Expected Successful Messages are not same");
			Reporter.log("The Actual Successful Message is " + actSuccessfulMsg);
			Reporter.log("The Expected Successful Message is " + expSuccessfulMsg);
		}

		//Display the transaction number in the output
		String transactionMsg[] = successfulMsg[1].trim().split(":");
		String transactionId = transactionMsg[1].trim();

		Reporter.log("The Transaction Id : " + transactionId);

		Reporter.log("Successful Message is Validated");
	}
}
