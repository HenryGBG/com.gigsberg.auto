package template;

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
import pageUIs.com.gigsberg.GlobalBaseUI;
import reportConfig.ExtentTestManager;

public class TC_01_Regression_Test extends BaseTest {
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

		ExtentTestManager.getTest().log(Status.INFO, "Account - Step 02: Verify the Error message displayed");
		Assert.assertEquals(homePage.getErrorMessageAtEmailTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);
		Assert.assertEquals(homePage.getErrorMessageAtPasswordTextbox(), GlobalBaseUI.REQUIRED_FILED_ERROR_MESSAGE);

	}

}