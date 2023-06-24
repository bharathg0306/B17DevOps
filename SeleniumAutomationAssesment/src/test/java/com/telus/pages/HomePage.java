package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.telus.objectrepository.ObjectRepository;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Initialize the webelements locators values using FINDBY class
	@FindBy(xpath=ObjectRepository.registerLinkXPath)
	@CacheLookup
	WebElement registerLink;
	
	public void clickRegisterLink() {
		registerLink.click();
		Reporter.log("Register Link is clicked");
	}

}
