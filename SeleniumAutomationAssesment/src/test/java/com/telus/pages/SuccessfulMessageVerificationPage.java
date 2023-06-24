package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.telus.objectrepository.ObjectRepository;

public class SuccessfulMessageVerificationPage {
	
	public WebDriver driver;

	public SuccessfulMessageVerificationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath=ObjectRepository.userNameValidationXPath)
	@CacheLookup
	WebElement userNameValidation;
	
	@FindBy(xpath=ObjectRepository.welcomeMsgXPath)
	@CacheLookup
	WebElement welcomeMsg;
	
	@FindBy(xpath=ObjectRepository.logOutLinkXPath)
	@CacheLookup
	WebElement logOutLink;
	
	public void validateUserName(String userName) {
		String splitUserName[] = userNameValidation.getText().split("Welcome");
		String actualUserName = splitUserName[1].trim();
		Assert.assertEquals(actualUserName, userName, "The Actual & the expected usernames are not same");
		Reporter.log("User Name displayed is "+actualUserName);
	}
	
	public void validateWelcomeMessage(String expWelcomeMessage) {
		String splitWelcomeMsg[] = welcomeMsg.getText().split("You are");
		String actualWelcomeMessage = splitWelcomeMsg[0].trim();
		Assert.assertEquals(actualWelcomeMessage, expWelcomeMessage, "The Actual & the expected welcome messages are not same");
		Reporter.log("Successful Welcome Message displayed is "+actualWelcomeMessage);
	}
	
	public void clickLogOutLink() {
		logOutLink.click();
		Reporter.log("Log Out link is clicked");
	}
}
