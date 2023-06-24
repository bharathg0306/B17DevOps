package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.telus.objectrepository.ObjectRepository;

public class SignUpPage {

	public WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	//Initialize the webelements locators values using FINDBY class
	@FindBy(xpath=ObjectRepository.firstNameTxtBoxXPath)
	@CacheLookup
	WebElement firstNameTxtBox;

	@FindBy(xpath=ObjectRepository.lastNameTxtBoxXPath)
	@CacheLookup
	WebElement lastNameTxtBox;

	@FindBy(xpath=ObjectRepository.addressTxtBoxXPath)
	@CacheLookup
	WebElement addressTxtBox;

	@FindBy(xpath=ObjectRepository.cityTxtBoxXPath)
	@CacheLookup
	WebElement cityTxtBox;

	@FindBy(xpath=ObjectRepository.stateTxtBoxXPath)
	@CacheLookup
	WebElement stateTxtBox;

	@FindBy(xpath=ObjectRepository.zipCodeTxtBoxXPath)
	@CacheLookup
	WebElement zipCodeTxtBox;

	@FindBy(xpath=ObjectRepository.phoneNumberTxtBoxXPath)
	@CacheLookup
	WebElement phoneNumberTxtBox;

	@FindBy(xpath=ObjectRepository.ssnTxtBoxXPath)
	@CacheLookup
	WebElement ssnTxtBox;

	@FindBy(xpath=ObjectRepository.userNameTxtBoxXPath)
	@CacheLookup
	WebElement userNameTxtBox;

	@FindBy(xpath=ObjectRepository.passwordTxtBoxXPath)
	@CacheLookup
	WebElement passwordTxtBox;

	@FindBy(xpath=ObjectRepository.confirmPasswordTxtBoxXPath)
	@CacheLookup
	WebElement confirmPasswordTxtBox;

	@FindBy(xpath=ObjectRepository.registerButtonXPath)
	@CacheLookup
	WebElement registerButton;

	public void enterFirstName(String firstName) {
		firstNameTxtBox.sendKeys(firstName);
		Reporter.log("First Name entered is "+firstName);
	}

	public void enterLastName(String lastName) {
		lastNameTxtBox.sendKeys(lastName);
		Reporter.log("Last Name entered is "+lastName);
	}

	public void enterAddress(String address) {
		addressTxtBox.sendKeys(address);
		Reporter.log("Address entered is "+address);
	}

	public void enterCity(String city) {
		cityTxtBox.sendKeys(city);
		Reporter.log("City entered is "+city);
	}

	public void enterState(String state) {
		stateTxtBox.sendKeys(state);
		Reporter.log("State entered is "+state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeTxtBox.sendKeys(zipCode);
		Reporter.log("Zip Code entered is "+zipCode);
	}

	public void enterPhoneNumber(String phoneNumber) {
		phoneNumberTxtBox.sendKeys(phoneNumber);
		Reporter.log("Phone Number entered is "+phoneNumber);
	}

	public void enterSSN(String ssn) {
		ssnTxtBox.sendKeys(ssn);
		Reporter.log("SSN entered is "+ssn);
	}

	public void enterUserName(String userName) {
		userNameTxtBox.sendKeys(userName);
		Reporter.log("User Name entered is "+userName);
	}

	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}

	public void enterConfirmPassword(String password) {
		confirmPasswordTxtBox.sendKeys(password);
	}

	public void clickRegisterButton() {
		registerButton.click();
		Reporter.log("Register button is clicked");
	}

}
