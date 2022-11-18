package com.gigsberg.sellers;

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
import pageObjects.Gigbergs.HomePageObject;
import pageObjects.GigsbergSellers.SellersDashboardPageObject;
import pageObjects.GigsbergSellers.SellersLoginPageObject;
import pageUIs.com.gigsberg.sellers.SellersLoginPageUIs;
import reportConfig.ExtentTestManager;

public class Testcase_Sellers_Check_Menu extends BaseTest {
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
		sleepInSecond(1);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 02: Verify Dashboard page display");
		Assert.assertEquals(sellersDashboardPage.getDashboardLabel(), GlobalConstants.DASHBOARD_LABEL);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 03: Verify 'Listings' page display");
		sellersDashboardPage.clickToListingsMenu();
		Assert.assertEquals(sellersDashboardPage.getListingsPageLabel(), GlobalConstants.LISTINGS_LABEL);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 04: Verify 'Sales' page display");
		sellersDashboardPage.clickToSalesMenu();
		Assert.assertEquals(sellersDashboardPage.getSalesPageLabel(), GlobalConstants.SALE_LABEL);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 05: Verify 'Payments' page display");
		sellersDashboardPage.clickToPaymentMenu();
		Assert.assertEquals(sellersDashboardPage.getPaymentsLabel(), GlobalConstants.PAYMENT_LABEL);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 06: Verify 'Account Info' page display");
		sellersDashboardPage.clickToAccountInfoMenu();
		Assert.assertEquals(sellersDashboardPage.getAccountInfoLabel(), GlobalConstants.ACCOUNT_INFO_LABEL);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 07: Verify 'Addresses' page display");
		sellersDashboardPage.clickToAddressMenu();
		Assert.assertEquals(sellersDashboardPage.getAddressLabel(), GlobalConstants.ADDRESS_LABEL);

		ExtentTestManager.getTest().log(Status.INFO, "Voucher - Step 08: Verify 'Payment Account' page display");
		sellersDashboardPage.clickToPaymentAccountMenu();
		Assert.assertEquals(sellersDashboardPage.getPaymentAccountLabel(), GlobalConstants.PAYMENT_ACCOUNT_LABEL);
	}
}
