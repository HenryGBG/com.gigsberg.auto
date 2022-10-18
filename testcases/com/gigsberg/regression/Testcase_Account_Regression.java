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

public class Testcase_Account_Regression extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

	}

	@Test
	public void TC_01_Account_Sign_Up_With_Empty_Data(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Click to 'Log in' link");
		homePage.clickToLoginLink();
		homePage.clickToSignUpButtonAtLoginForm();
		homePage.clickToSignUpButtonAtSignUpForm();

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Verify the Error message displayed");
		Assert.assertEquals(homePage.getErrorMessageAtFullnameTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);
		Assert.assertEquals(homePage.getErrorMessageAtEmailTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);
		Assert.assertEquals(homePage.getErrorMessageAtPasswordTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);

	}

	@Test
	public void TC_02_Account__Sign_Up_With_Invalid_Fullname(Method method) {

	}

	@Test
	public void TC_03_Account_Sign_Up_With_Invalid_Email(Method method) {
	}

	@Test
	public void TC_04_Account_Sign_Up_With_Invalid_Password(Method method) {
	}

	@Test
	public void TC_05_Account_Sign_Up_With_Valid_Data(Method method) {
	}

	@Test
	public void TC_06_Account_Login_With_Empty_Data(Method method) {
	}

	@Test
	public void TC_07_Account_Login_With_Invalid_Email_Invalid_Password(Method method) {
	}

	@Test
	public void TC_08_Account_Login_With_Invalid_Email_Valid_Password(Method method) {
	}

	@Test
	public void TC_09_Account_Login_With_Valid_Email_Invalid_Password(Method method) {
	}

	@Test
	public void TC_10_Account_Login_With_Valid_Email_Valid_Password(Method method) {
	}
}
