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

public class TC_Concerts_Regression extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeClass
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
		Assert.assertEquals(homePage.getConcertSubTitle(), "Rock Tickets");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 03: Get Upcoming Concert List");
		homePage.getUpcomingConcertRock(driver);
	}

	@Test
	public void TC_02_Concerts_Pop(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Pop'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Pop");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle(), "Pop Tickets");
	}

	@Test
	public void TC_03_Concerts_RandB(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/R&B'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "R&B");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle(), "Pop Tickets");
	}

	@Test
	public void TC_04_Concerts_HardRockMetal(Method method) {
	}

	@Test
	public void TC_05_Concerts_Rap(Method method) {
	}

	@Test
	public void TC_06_Concerts_HipHopReggae(Method method) {
	}

	@Test
	public void TC_07_Concerts_Alternative_Indie(Method method) {
	}

	@Test
	public void TC_08_Concerts_All_Concerts(Method method) {
	}

}
