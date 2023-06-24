package com.telus.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.telus.pages.HomePage;
import com.telus.pages.SignUpPage;
import com.telus.pages.SuccessfulMessageVerificationPage;

public class RegisterUser {

	WebDriver driver;

	//Parameterizing the values
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	String firstName = "BharathVasan";
	String lastName = "G";
	String address = "200, Consilium Place";
	String city = "Toronto";
	String state = "Ontario";
	String zipCode = "M1H3E4";
	String phoneNumber = "6842289647";
	String ssn = "M178541";
	String userName = "testnew290";
	String password = "newpassword@";
	String expWelcomeMessage = "Your account was created successfully.";

	@BeforeSuite
	public void launchApplication() {
		//Set the system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of chrome driver
		driver = new ChromeDriver();

		//Launching the application
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();

		Reporter.log("Application is launched sucessfully");
	}


	@Test(priority=1)
	public void clickRegisterUser() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickRegisterLink();
	}

	@Test(priority=2)
	public void registerUser() {
		SignUpPage register = PageFactory.initElements(driver, SignUpPage.class);
		register.enterFirstName(firstName);
		register.enterLastName(lastName);
		register.enterAddress(address);
		register.enterCity(city);
		register.enterState(state);
		register.enterZipCode(zipCode);
		register.enterPhoneNumber(phoneNumber);
		register.enterSSN(ssn);
		register.enterUserName(userName);
		register.enterPassword(password);
		register.enterConfirmPassword(password);
		register.clickRegisterButton();
	}

	@Test(priority=3)
	public void successfulMessageVerification() {
		SuccessfulMessageVerificationPage verification = PageFactory.initElements(driver, SuccessfulMessageVerificationPage.class);
		verification.validateUserName(userName);
		verification.validateWelcomeMessage(expWelcomeMessage);
		verification.clickLogOutLink();
	}

	@AfterSuite
	public void closeApplication() {
		//Close the browser driver
		driver.quit();

		Reporter.log("Application is closed sucessfully");
	}
}
