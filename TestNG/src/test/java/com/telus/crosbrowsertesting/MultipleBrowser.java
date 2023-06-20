package com.telus.crosbrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class MultipleBrowser {

	WebDriver driver;

	@Parameters({"browser","url"})
	@BeforeClass
	public void launchApplication(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {
			//Set the system property for chrome driver
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

			//Creating instance of chrome driver
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			//Set the system property for firefox driver
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

			//Creating instance of firefox driver
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			//Set the system property for MS Edge driver
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");

			//Creating instance of MS Edge driver
			driver = new EdgeDriver();
		}
		else {
			//Set the system property for chrome driver
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

			//Creating instance of chrome driver
			driver = new ChromeDriver();
		}
		
		//page timeout - wait until all the objects in the page loaded completely
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//Implicit Wait - it will wait for all the findElement & findElements to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launching the application
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();

		Reporter.log("Application is launched successfully");
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		Reporter.log("Application is closed");
	}

}
