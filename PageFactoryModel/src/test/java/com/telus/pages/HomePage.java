package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;

	public HomePage (WebDriver driver) {
		this.driver=driver;
	}

	//Initialize webelements using @FindBy class
	@FindBy(xpath="(//a[contains(text(),'Demo Sites')])[2]") WebElement demoSites;

	@FindBy(xpath="(//a[contains(text(),'Practice Automation')])[2]") WebElement practiceAutomation;

	@FindBy(xpath="(//a[contains(text(),'Demo Site – Registration Form')])[2]") WebElement regFormLink;


	//Reusable methods
	public void navigateToRegisterUser() {
		Actions action = new Actions(driver);
		action.moveToElement(demoSites).perform();
		action.moveToElement(practiceAutomation).perform();
		regFormLink.click();
	}
}
