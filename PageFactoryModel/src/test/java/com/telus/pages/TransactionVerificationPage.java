package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TransactionVerificationPage {

	WebDriver driver;

	public TransactionVerificationPage (WebDriver driver) {
		this.driver=driver;
	}

	//Initialize webelements using @FindBy class
	@FindBy(xpath="//div[@class='elementor-widget-container']") WebElement text;

	/* String textMsg = text.getText();
	String message[] = textMsg.split("Verification");
	String successfulMsg[] = message[1].split("The"); */


	//Reusable methods
	public void successfulMsgValidation(String expSuccessfulMsg) {
		String textMsg = text.getText();
		String message[] = textMsg.split("Verification");
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
	}

	public void printTransactionNum() {
		String textMsg = text.getText();
		String message[] = textMsg.split("Verification");
		String successfulMsg[] = message[1].split("The");
		String transactionMsg[] = successfulMsg[1].trim().split(":");
		String transactionId = transactionMsg[1].trim();

		Reporter.log("The Transaction Id : " + transactionId);
	}

}
