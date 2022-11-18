package com.gigsberg.main.menu;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.PageGenerateManager;
import pageObjects.Gigbergs.HomePageObject;
import reportConfig.ExtentTestManager;

public class Testcase_Concerts_Regression extends BaseTest {

	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void TC_01_Concerts_Rock(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts Items");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Rock'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Rock");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Rock Tickets"), "Rock Tickets");

//		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 03: Get Upcoming Concert List");
//		homePage.getUpcomingConcertRock(driver);
	}

	@Test
	public void TC_02_Concerts_Pop(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Pop'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Pop");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Pop Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Pop Tickets"), "Pop Tickets");
	}

	@Test
	public void TC_03_Concerts_R_and_B(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/R&B'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "R&B");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'R&B Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("R&B Tickets"), "R&B Tickets");

	}

	@Test
	public void TC_04_Concerts_HardRockMetal(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Hard Rock Metal'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Hard Rock Metal");
		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title  'Hard Rock Metal Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Hard Rock Metal Tickets"), "Hard Rock Metal Tickets");

	}

	@Test
	public void TC_05_Concerts_Rap(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Rap'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Rap");
		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title  'Hard Rock Metal Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Rap Tickets"), "Rap Tickets");
	}

	@Test
	public void TC_06_Concerts_HipHopReggae(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Hip Hop Reggae'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Hip Hop Reggae");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title  'Hip Hop Reggae Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Rap Hip Hop Reggae Tickets"), "Rap Hip Hop Reggae Tickets");
	}

	@Test
	public void TC_07_Concerts_Alternative_Indie(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Alternative & Indie'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Alternative & Indie");

		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title  'Alternative & Indie Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Alternative & Indie Tickets"), "Alternative & Indie Tickets");
	}

	@Test
	public void TC_08_Concerts_All_Concerts(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/All Concerts'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "All Concerts");
		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title  'Concert Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Concert Tickets"), "Concert Tickets");
	}

	@Test
	public void TC_09_Concerts_Rock_And_Pop(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Rock & Pop'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Rock & Pop");
		ExtentTestManager.getTest().log(Status.INFO,
				"Concerts - Step 02: Verify the sub-title  'Rock & Pop Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Rock & Pop Tickets"), "Rock & Pop Tickets");

	}
}
