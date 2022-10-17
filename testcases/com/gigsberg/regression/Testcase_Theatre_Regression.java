package com.gigsberg.regression;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.PageGenerateManager;
import pageObjects.HomePageObject;
import reportConfig.ExtentTestManager;

public class Testcase_Theatre_Regression extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@AfterMethod(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void TC_01_Theatre_Comedy(Method method) {
		ExtentTestManager.startTest(method.getName(), "Theatre Items");
		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 01: Navigate to 'Theatre/Comedy'");
		homePage.hoverToMainCategory(driver, "Theatre");
		homePage.clickToSubCategory(driver, "Comedy");

		ExtentTestManager.getTest().log(Status.INFO,
				"Theatre - Step 02: Verify the sub-title 'Comedy Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Comedy Tickets"), "Comedy Tickets");

	}

	@Test
	public void TC_02_Theatre_Ballet_Dance(Method method) {
		ExtentTestManager.startTest(method.getName(), "Theatre Items");
		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 01: Navigate to 'Theatre/Ballet & Dance'");
		homePage.hoverToMainCategory(driver, "Theatre");
		homePage.clickToSubCategory(driver, "Ballet & Dance");

		ExtentTestManager.getTest().log(Status.INFO,
				"Theatre - Step 02: Verify the sub-title 'Ballet & Dance Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Ballet & Dance Tickets"), "Ballet & Dance Tickets");

	}

	@Test
	public void TC_03_Theatre_Classical(Method method) {
		ExtentTestManager.startTest(method.getName(), "Theatre Items");
		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 01: Navigate to 'Theatre/Classical'");
		homePage.hoverToMainCategory(driver, "Theatre");
		homePage.clickToSubCategory(driver, "Classical");

		ExtentTestManager.getTest().log(Status.INFO,
				"Theatre - Step 02: Verify the sub-title 'Classical Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Classical Tickets"), "Classical Tickets");
	}

	@Test
	public void TC_04_Theatre_Shows(Method method) {
		ExtentTestManager.startTest(method.getName(), "Theatre Items");
		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 01: Navigate to 'Theatre/Shows'");
		homePage.hoverToMainCategory(driver, "Theatre");
		homePage.clickToSubCategory(driver, "Shows");

		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 02: Verify the sub-title 'Shows Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Shows Tickets"), "Shows Tickets");
	}

	@Test
	public void TC_05_Theatre_Conferences_Speaking_Tour(Method method) {
		ExtentTestManager.startTest(method.getName(), "Theatre Items");
		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO,
				"Theatre - Step 01: Navigate to 'Theatre/Conferences And Speaking Tours'");
		homePage.hoverToMainCategory(driver, "Theatre");
		homePage.clickToSubCategory(driver, "Conferences And Speaking Tours");

		ExtentTestManager.getTest().log(Status.INFO,
				"Theatre - Step 02: Verify the sub-title 'Conferences And Speaking Tours Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Conferences And Speaking Tours Tickets"),
				"Conferences And Speaking Tours Tickets");
	}

	@Test
	public void TC_06_Theatre_All_Theatre(Method method) {
		ExtentTestManager.startTest(method.getName(), "Theatre Items");
		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Theatre - Step 01: Navigate to 'Theatre/All Theatre'");
		homePage.hoverToMainCategory(driver, "Theatre");
		homePage.clickToSubCategory(driver, "All Theatre");

		ExtentTestManager.getTest().log(Status.INFO,
				"Theatre - Step 02: Verify the sub-title 'Theatre Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Theatre Tickets"), "Theatre Tickets");
	}
}
