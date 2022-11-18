package template;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.PageGenerateManager;
import pageObjects.Gigbergs.HomePageObject;
import reportConfig.ExtentTestManager;

public class TC_01_Regression_Test extends BaseTest {

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
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Rock'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Rock");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Rock Tickets"), "Rock Tickets");

	}

	@Test
	public void Concerts_TC01_Rock(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Rock'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Rock");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Rock Tickets"), "Rock Tickets");
	}

	@Test
	public void Concerts_TC02_Rock(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/Pop'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "Pop");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Pop Tickets"), "Pop Tickets");
	}

	@Test
	public void Concerts_TC03_Rock(Method method) {
		ExtentTestManager.startTest(method.getName(), "Concerts main menu");
		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 00: Navigate to 'Homepage'");
		homePage = PageGenerateManager.getHomePage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 01: Navigate to 'Concerts/R&B'");
		homePage.hoverToMainCategory(driver, "Concerts");
		homePage.clickToSubCategory(driver, "R&B");

		ExtentTestManager.getTest().log(Status.INFO, "Concerts - Step 02: Verify the sub-title 'Rock Tickets' display");
		Assert.assertEquals(homePage.getConcertSubTitle("Pop Tickets"), "Pop Tickets");
	}

}
