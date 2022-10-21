package com.gigsberg.regression;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerateManager;
import pageObjects.HomePageObject;
import pageUIs.com.gigsberg.GlobalBaseUI;
import reportConfig.ExtentTestManager;

public class Testcase_Account_Regression extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
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
		sleepInSecond(1);

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 02: Verify the Error message at Fullname, Email, Password textbox displayed");
		Assert.assertEquals(homePage.getErrorMessageAtFullnameTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);
		Assert.assertEquals(homePage.getErrorMessageAtEmailTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);
		Assert.assertEquals(homePage.getErrorMessageAtPasswordTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);

	}

	@Test
	public void TC_02_Account_Sign_Up_With_Invalid_Fullname(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();
		homePage.clickToSignUpButtonAtLoginForm();

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 03: Input to invalid Fullname, valid Email, valid Password");
		homePage.inputToFullnameTextbox("123456");
		homePage.inputToEmailTextbox(GlobalConstants.VALID_EMAIL);
		homePage.inputToPasswordTextbox(GlobalConstants.VALID_PASSWORD);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 04: Click to 'Sign Up' button");
		homePage.clickToSignUpButtonAtSignUpForm();
		sleepInSecond(1);

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 05: Verify the Error message at Fullname Textbox displayed");
		Assert.assertEquals(homePage.getErrorMessageAtFullnameTextbox(),
				GlobalBaseUI.ERROR_MESSAGE_AT_FULLNAME_TEXTBOX);

	}

	@Test
	public void TC_03_Account_Sign_Up_With_Invalid_Email(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();
		homePage.clickToSignUpButtonAtLoginForm();

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 03: Input to valid Fullname, invalid Email, valid Password");

		homePage.inputToFullnameTextbox(GlobalConstants.FULLNAME);
		homePage.inputToEmailTextbox("invalid_email");
		homePage.inputToPasswordTextbox(GlobalConstants.VALID_PASSWORD);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 04: Click to 'Sign Up' button");
		homePage.clickToSignUpButtonAtSignUpForm();
		sleepInSecond(1);

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 05: Verify the Error message at Email Textbox displayed");
		Assert.assertEquals(homePage.getErrorMessageAtEmailTextbox(),
				GlobalBaseUI.MESSAGE_WRONG_EMAIL_AT_EMAIL_TEXTBOX);
	}

	@Test
	public void TC_04_Account_Sign_Up_With_Invalid_Password(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();
		homePage.clickToSignUpButtonAtLoginForm();

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 03: Input to valid Fullname, valid Email, invalid Password");

		homePage.inputToFullnameTextbox(GlobalConstants.FULLNAME);
		homePage.inputToEmailTextbox(GlobalConstants.VALID_EMAIL);
		homePage.inputToPasswordTextbox("123456");

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 04: Click to 'Sign Up' button");
		homePage.clickToSignUpButtonAtSignUpForm();
		sleepInSecond(1);

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 05: Verify the Error message at Password Textbox displayed");
		Assert.assertEquals(homePage.getErrorMessageAtEmailTextbox(), GlobalBaseUI.ERROR_MESSAGE_AT_PASSWORD_TEXTBOX);
	}

	@Test
	public void TC_05_Account_Sign_Up_With_Valid_Data(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();
		homePage.clickToSignUpButtonAtLoginForm();

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 03: Input to valid Fullname, valid Email, valid Password");

		homePage.inputToFullnameTextbox(GlobalConstants.FULLNAME);
		homePage.inputToEmailTextbox(generateFakeNumber() + GlobalConstants.VALID_EMAIL);
		homePage.inputToPasswordTextbox(GlobalConstants.VALID_PASSWORD);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 04: Click to 'Sign Up' button");
		homePage.clickToSignUpButtonAtSignUpForm();
		sleepInSecond(1);

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 05: Verify the Fullname displayed at Account header");
		Assert.assertTrue(homePage.getFullnameDisplay(GlobalConstants.FULLNAME));

	}

	@Test
	public void TC_06_Account_Sign_Up_With_Existing_Data(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();
		homePage.clickToSignUpButtonAtLoginForm();

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 03: Input to valid Fullname, valid Email, valid Password");

		homePage.inputToFullnameTextbox(GlobalConstants.FULLNAME);
		homePage.inputToEmailTextbox(GlobalConstants.VALID_EMAIL);
		homePage.inputToPasswordTextbox(GlobalConstants.VALID_PASSWORD);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 04: Click to 'Sign Up' button");
		homePage.clickToSignUpButtonAtSignUpForm();
		sleepInSecond(1);

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 05: Verify the Fullname displayed at Account header");
		Assert.assertEquals(homePage.getExistingErrorMessageAtEmailTextbox(),
				GlobalBaseUI.EXISTING_ERROR_MESSAGE_AT_EMAIL_TEXTBOX);

	}

	@Test
	public void TC_07_Account_Login_With_Empty_Data(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 03: Input Email + Password");
		homePage.inputToTextboxByID(driver, "login_email", "");

		homePage.inputToTextboxByID(driver, "login_password", "");

		homePage.clickToLoginBubton();

		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Verify the Required message displayed ");
		Assert.assertEquals(homePage.getErrorMessageAtEmailAtLoginForm(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);
		Assert.assertEquals(homePage.getErrorMessageAtPasswordatLoginForm(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);

	}

//	@Test
	public void TC_08_Account_Login_With_Invalid_Email_Invalid_Password(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 03: Input Email + Password");
		homePage.inputToTextboxByID(driver, "login_email", "testing");

		homePage.inputToTextboxByID(driver, "login_password", "132456");

		homePage.clickToLoginBubton();

		ExtentTestManager.getTest().log(Status.INFO,
				"Login - Step 04: Verify the 'Wrong email format' message, 'Wrong email or password' message displayed ");
		Assert.assertEquals(homePage.getErrorMessageAtEmailAtLoginForm(),
				GlobalBaseUI.MESSAGE_WRONG_EMAIL_AT_EMAIL_TEXTBOX);
		Assert.assertEquals(homePage.getErrorMessageAtPasswordatLoginForm(),
				GlobalBaseUI.MESSAGE_WRONG_EMAIL_PASSWORD_TEXTBOX);

	}

	@Test
	public void TC_09_Account_Login_With_Invalid_Email_Valid_Password(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 03: Input Email + Password");
		homePage.inputToTextboxByID(driver, "login_email", "testing");

		homePage.inputToTextboxByID(driver, "login_password", GlobalConstants.VALID_PASSWORD);

		homePage.clickToLoginBubton();

		ExtentTestManager.getTest().log(Status.INFO,
				"Login - Step 04: Verify the 'Wrong email format' message, 'Wrong email or password' message displayed ");
		Assert.assertEquals(homePage.getErrorMessageAtEmailAtLoginForm(),
				GlobalBaseUI.MESSAGE_WRONG_EMAIL_AT_EMAIL_TEXTBOX);
	}

	@Test
	public void TC_10_Account_Login_With_Valid_Email_Invalid_Password(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 03: Input Email + Password");
		homePage.inputToTextboxByID(driver, "login_email", GlobalConstants.VALID_EMAIL);

		homePage.inputToTextboxByID(driver, "login_password", "123456");

		homePage.clickToLoginBubton();
		ExtentTestManager.getTest().log(Status.INFO,
				"Login - Step 04: Verify the 'Wrong email format' message, 'Wrong email or password' message displayed ");
		Assert.assertEquals(homePage.getErrorMessageAtPasswordatLoginForm(),
				GlobalBaseUI.MESSAGE_WRONG_EMAIL_PASSWORD_TEXTBOX);

	}

	@Test
	public void TC_11_Account_Login_With_Valid_Email_Valid_Password(Method method) {
		ExtentTestManager.startTest(method.getName(), "Account");
		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 01: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Click to 'Log in' link");
		homePage.clickToLoginLink();

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 03: Input Email + Password");
		homePage.inputToTextboxByID(driver, "login_email", GlobalConstants.VALID_EMAIL);

		homePage.inputToTextboxByID(driver, "login_password", GlobalConstants.VALID_PASSWORD);

		homePage.clickToLoginBubton();

		ExtentTestManager.getTest().log(Status.INFO,
				"Account - Step 05: Verify the Fullname displayed at Account header");
		Assert.assertTrue(homePage.getFullnameDisplay(GlobalConstants.FULLNAME));
	}
}
