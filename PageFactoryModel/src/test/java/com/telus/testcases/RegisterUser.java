package com.telus.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.telus.pages.HomePage;
import com.telus.pages.RegisterDemoPage;
import com.telus.pages.TransactionVerificationPage;

public class RegisterUser {

	WebDriver driver;

	//Parameterizing the values
	String url = "https://nxtgenaiacademy.com/";
	String expFormTitle = "Register For Demo";
	String firstName = "BharathVasan";
	String lastName = "G";
	String gender = "Male";
	String streetAddress = "234";
	String apartmenttNum = "213/7";
	String city = "Dindigul";
	String postalCode = "500 012";
	String state = "Tamil Nadu";
	String country = "India";
	String emailId = "registerdemo@gmail.com";
	String dateOfDemo = "12/05/23";
	String hour = "10";
	String minutes = "30";
	String mobileNumber = "472813";
	String query = "End to End assigment";
	String expSuccessfulMsg = "Registration Form is Successfully Submitted.";

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

	@Test(priority=1, enabled = true)
	public void navigateToRegisterDemo() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		home.navigateToRegisterUser();

		Reporter.log("Navigated to Register Demo Page");
	}

	@Test(priority=2)
	public void registerUser() {
		RegisterDemoPage register = PageFactory.initElements(driver, RegisterDemoPage.class);
		register.regFormTitleValidation(expFormTitle);
		register.enterFirstName(firstName);
		register.enterLastName(lastName);
		register.selectGender(gender);
		register.enterStreetAddress(streetAddress);
		register.enterApartmenttNum(apartmenttNum);
		register.entercity(city);
		register.enterPostalCode(postalCode);
		register.enterState(state);
		register.selectCountry(country);
		register.enterEmailId(emailId);
		register.enterDateOfDemo(dateOfDemo);
		register.selectHour(hour);
		register.selectMinutes(minutes);
		register.enterMobileNumber(mobileNumber);
		register.selectTestNgChckBox();
		register.selectCoreJavaChckBox();
		register.enterQuery(query);
		register.enterTwoDigitVerification();
		register.clickSubmitBtn();
	}

	@Test(priority=3)
	public void transactionVerification() {
		TransactionVerificationPage transaction = PageFactory.initElements(driver, TransactionVerificationPage.class);
		transaction.successfulMsgValidation(expSuccessfulMsg);
		transaction.printTransactionNum();
	}

	@AfterSuite
	public void closeApplication() {
		//Close the browser driver
		driver.quit();

		Reporter.log("Application is closed sucessfully");
	}
}
