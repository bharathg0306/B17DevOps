package com.telus.objectrepository;

public class ObjectRepository {

	//Object Repository of ParaBank Website
	
	//Home Page OR
	public static final String registerLinkXPath = "//a[normalize-space()='Register']";
	
	//Sign Up Page OR
	public static final String firstNameTxtBoxXPath = "//input[@id='customer.firstName']";
	public static final String lastNameTxtBoxXPath = "//input[@id='customer.lastName']";
	public static final String addressTxtBoxXPath = "//input[@id='customer.address.street']";
	public static final String cityTxtBoxXPath = "//input[@id='customer.address.city']";
	public static final String stateTxtBoxXPath = "//input[@id='customer.address.state']";
	public static final String zipCodeTxtBoxXPath = "//input[@id='customer.address.zipCode']";
	public static final String phoneNumberTxtBoxXPath = "//input[@id='customer.phoneNumber']";
	public static final String ssnTxtBoxXPath = "//input[@id='customer.ssn']";
	public static final String userNameTxtBoxXPath = "//input[@id='customer.username']";
	public static final String passwordTxtBoxXPath = "//input[@id='customer.password']";
	public static final String confirmPasswordTxtBoxXPath = "//input[@id='repeatedPassword']";
	public static final String registerButtonXPath = "//input[@value='Register']";
	
	//Successful Message Verification Page OR
	public static final String userNameValidationXPath = "//h1[contains(text(), 'Welcome')]";
	public static final String welcomeMsgXPath = "//p[contains(text(),'Your account was created successfully.')]";
	public static final String logOutLinkXPath = "//a[normalize-space()='Log Out']";
	
}
