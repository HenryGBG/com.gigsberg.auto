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

public class Testcase_Footer_Menu extends BaseTest {
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
	public void TC_01_Footer_Menu_Help_Centre(Method method) {
		ExtentTestManager.startTest(method.getName(), "Buy a voucher");

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Navigate to 'Voucher' link");

	}

	@Test
	public void TC_02_Footer_Menu_Terms_Conditions(Method method) {

	}

	@Test
	public void TC_03_Footer_Menu_Contact_Us(Method method) {
	}

	@Test
	public void TC_04_Footer_Menu_Privacy_Policy(Method method) {
	}

	@Test
	public void TC_05_Footer_Menu_About_Us(Method method) {
	}

	@Test
	public void TC_06_Footer_Menu_Student_Discount(Method method) {
	}

	@Test
	public void TC_07_Footer_Menu_Blog(Method method) {
	}

	@Test
	public void TC_08_Footer_Menu_Distributor_Agreement(Method method) {
	}

	@Test
	public void TC_09_Footer_Menu_Event_Organizers(Method method) {
	}
}
