package com.gigsberg.sellers;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.PageGenerateManager;
import pageObjects.Gigbergs.HomePageObject;
import pageObjects.GigsbergSellers.SellersDashboardPageObject;
import pageObjects.GigsbergSellers.SellersLoginPageObject;
import pageUIs.com.gigsberg.sellers.SellersLoginPageUIs;
import reportConfig.ExtentTestManager;

public class Testcase_Sellers_New_Listing extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	SellersLoginPageObject sellersLoginPage;
	SellersDashboardPageObject sellersDashboardPage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void Voucher_TC001_Buy_With_Empty_Data(Method method) {
		ExtentTestManager.startTest(method.getName(), "My Gigsberg PRO Account");
		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 01: Navigate to 'Gigsberg Pro'");
		sellersLoginPage = PageGenerateManager.getSellerLoginPage(driver);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 02: Login as Sellers");
		sellersLoginPage.inputSellersEmailAddress(SellersLoginPageUIs.SELLERS_EMAIL);
		sellersLoginPage.inputSellerPassword(SellersLoginPageUIs.SELLER_PASSWORD);
		sellersDashboardPage = sellersLoginPage.clickToLoginSellerButton();
		sleepInSecond(2);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 03: Navigate to 'Gigsberg Pro'");
		sellersDashboardPage.clickToNewListingLink();
		sellersDashboardPage.inputToEventName("nightwish");
		sellersDashboardPage.clickToEventListWithDate("21");

		// Ticket details form
		sellersDashboardPage.selectNumberTicket("3");
		sellersDashboardPage.selectSplitType("None");
		sellersDashboardPage.selectTicketType("Paper Ticket");
		sellersDashboardPage.selectCategoryDetails("Floor");
		sleepInSecond(1);
		sellersDashboardPage.selectBlockDetails("Standing Area");

		sellersDashboardPage.setYourPriceCurrency("Euro €");
		sellersDashboardPage.setFaceValueCurrency("Euro €");
		sellersDashboardPage.inputToProceedSeller("2000");
		sellersDashboardPage.inputWebsitePrice("2000");
		sellersDashboardPage.inputPricePerTicket("2000");

		// Additional relevant information
//		sellersDashboardPage.showHideRestrictions();
//		sellersDashboardPage.clickToIsSellerConectedGigsberg();
//		sellersDashboardPage.turnOffPublishTicket();
//		sellersDashboardPage.clickToAddListingButton();
	}

}
