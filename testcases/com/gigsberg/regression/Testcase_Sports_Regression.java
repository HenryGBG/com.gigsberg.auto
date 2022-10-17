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

public class Testcase_Sports_Regression extends BaseTest {
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
	public void TC_01_Sports_Football(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Navigate to 'Voucher' link");

	}

	@Test
	public void TC_02_Sports_Rugby(Method method) {

	}

	@Test
	public void TC_03_Sports_Darts(Method method) {
	}

	@Test
	public void TC_04_Sports_Tennis(Method method) {
	}

	@Test
	public void TC_05_Sports_American_Football(Method method) {
	}

	@Test
	public void TC_06_Sports_WWE(Method method) {
	}

	@Test
	public void TC_07_Sports_LaLiga_Tickets(Method method) {
	}

	@Test
	public void TC_08_Sports_All_Sports(Method method) {
	}
}
