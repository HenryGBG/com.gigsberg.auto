package com.gigsberg.regression;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.PageGenerateManager;
import pageObjects.HomePageObject;
import pageUIs.com.gigsberg.GlobalBaseUI;
import reportConfig.ExtentTestManager;

public class TC_01_Regression_Test extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void Concerts_TC01_Rock(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Rock'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Rock");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle(), "Rock Tickets");
	}

}
