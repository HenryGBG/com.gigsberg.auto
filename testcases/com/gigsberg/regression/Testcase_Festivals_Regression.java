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

public class Testcase_Festivals_Regression extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void TC_01_Festivals_United_Kingdom(Method method) {
		ExtentTestManager.startTest(method.getName(), "Festivals Items");
		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 01: Navigate to 'Festivals/United Kingdom'");
		homePage.hoverToMainCategory(driver, "Festivals");
		homePage.clickToSubCategory(driver, "United Kingdom");

		ExtentTestManager.getTest().log(Status.INFO,
				"Festivals - Step 02: Verify the sub-title 'United Kingdom Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("UK Festivals Tickets"), "UK Festivals Tickets");

	}

	@Test
	public void TC_02_Festivals_International_Festivals(Method method) {
		ExtentTestManager.startTest(method.getName(), "Festivals Items");
		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO,
				"Festivals - Step 01: Navigate to 'Festivals/International Festivals'");
		homePage.hoverToMainCategory(driver, "Festivals");
		homePage.clickToSubCategory(driver, "International Festivals");

		ExtentTestManager.getTest().log(Status.INFO,
				"Festivals - Step 02: Verify the sub-title 'International Festivals Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("International Festivals Tickets"),
				"International Festivals Tickets");

	}

	@Test
	public void TC_03_Festivals_Spain(Method method) {
		ExtentTestManager.startTest(method.getName(), "Festivals Items");
		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 01: Navigate to 'Festivals/Spain'");
		homePage.hoverToMainCategory(driver, "Festivals");
		homePage.clickToSubCategory(driver, "Spain");

		ExtentTestManager.getTest().log(Status.INFO,
				"Festivals - Step 02: Verify the sub-title 'Spain Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Festivals in Spain Tickets"), "Festivals in Spain Tickets");
	}

	@Test
	public void TC_04_Festivals_Australia(Method method) {
		ExtentTestManager.startTest(method.getName(), "Festivals Items");
		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 01: Navigate to 'Festivals/Australia'");
		homePage.hoverToMainCategory(driver, "Festivals");
		homePage.clickToSubCategory(driver, "Australia");

		ExtentTestManager.getTest().log(Status.INFO,
				"Festivals - Step 02: Verify the sub-title 'Spain Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Festivals in Australia"), "Festivals in Australia");
	}

	@Test
	public void TC_05_Festivals_Netherlands(Method method) {
		ExtentTestManager.startTest(method.getName(), "Festivals Items");
		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 01: Navigate to 'Festivals/Netherlands'");
		homePage.hoverToMainCategory(driver, "Festivals");
		homePage.clickToSubCategory(driver, "Netherlands");

		ExtentTestManager.getTest().log(Status.INFO,
				"Festivals - Step 02: Verify the sub-title 'Netherlands Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Festivals in Netherlands Tickets"),
				"Festivals in Netherlands Tickets");
	}

	@Test
	public void TC_06_Festivals_All_Festivals(Method method) {
		ExtentTestManager.startTest(method.getName(), "Festivals Items");
		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Festivals - Step 01: Navigate to 'Festivals/All Festivals'");
		homePage.hoverToMainCategory(driver, "Festivals");
		homePage.clickToSubCategory(driver, "All Festivals");
		ExtentTestManager.getTest().log(Status.INFO,
				"Festivals - Step 02: Verify the sub-title 'All Festivals Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Festival Tickets"), "Festival Tickets");
	}
}
