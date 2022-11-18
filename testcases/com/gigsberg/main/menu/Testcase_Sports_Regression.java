package com.gigsberg.main.menu;

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
import pageObjects.Gigbergs.HomePageObject;
import reportConfig.ExtentTestManager;

public class Testcase_Sports_Regression extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void TC_01_Sports_Football(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/Football'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "Football");

		ExtentTestManager.getTest().log(Status.INFO,
				"Sports - Step 02: Verify the sub-title 'Football Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Football Tickets"), "Football Tickets");
	}

	@Test
	public void TC_02_Sports_Rugby(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/Rugby'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "Rugby");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title 'Rugby Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Rugby Tickets"), "Rugby Tickets");
	}

	@Test
	public void TC_03_Sports_Darts(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/Darts'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "Darts");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title 'Darts Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Darts Tickets"), "Darts Tickets");
	}

	@Test
	public void TC_04_Sports_Tennis(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/Tennis'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "Tennis");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title 'Tennis Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Tennis Tickets"), "Tennis Tickets");
	}

	@Test
	public void TC_05_Sports_American_Football(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/American Football'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "American Football");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title 'American Football Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("American Football Tickets"), "American Football Tickets");
	}

	@Test
	public void TC_06_Sports_WWE(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/WWE'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "WWE");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'WWE Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("WWE Tickets"), "WWE Tickets");
	}

	@Test
	public void TC_07_Sports_LaLiga_Tickets(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/La Liga Tickets'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "La Liga Tickets");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title 'La Liga Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("La Liga Tickets"), "La Liga Tickets");
	}

	@Test
	public void TC_08_Sports_All_Sports(Method method) {
		ExtentTestManager.startTest(method.getName(), "Sports Items");
		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Sports - Step 01: Navigate to 'Sports/La Liga Tickets'");
		homePage.hoverToMainCategory(driver, "Sports");
		homePage.clickToSubCategory(driver, "All Sports");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title 'Sport Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Sport Tickets"), "Sport Tickets");
	}
}
