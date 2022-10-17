package com.gigsberg.regression;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
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

	@AfterMethod(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void TC_01_Theatre_Comedy(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Navigate to 'Voucher' link");

	}

	@Test
	public void TC_02_Theatre_Ballet_Dance(Method method) {

	}

	@Test
	public void TC_03_Theatre_Classical(Method method) {
	}

	@Test
	public void TC_04_Theatre_Shows(Method method) {
	}

	@Test
	public void TC_05_Theatre_Conferences_Speaking_Tour(Method method) {
	}

	@Test
	public void TC_06_Theatre_All_Theatre(Method method) {
	}
}
