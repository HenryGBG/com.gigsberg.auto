package com.gigsberg.regression;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.PageGenerateManager;
import pageObjects.Gigbergs.FooterPageObject;
import pageObjects.Gigbergs.HomePageObject;
import pageUIs.com.gigsberg.FooterPageUIs;
import reportConfig.ExtentTestManager;

public class Testcase_Footer_Menu extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	FooterPageObject footerPage;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setup(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}

	@Test
	public void TC_01_Footer_Menu_Help_Centre(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'Help Centre' link on Footer");
		footerPage = homePage.clickToMenuByHref("faqs");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 02: Verify the title 'Help Centre' displayed ");
		Assert.assertEquals(footerPage.getFAQsPageTitle(), FooterPageUIs.HELP_CENTRE_LABEL_IN_ENGLISH);

	}

	@Test
	public void TC_02_Footer_Menu_Terms_Conditions(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'Terms & Conditions' link on Footer");
		footerPage = homePage.clickToMenuByHref("terms-and-conditions");

		ExtentTestManager.getTest().log(Status.INFO,
				"Footer - Step 02: Verify the title 'Terms & Conditions' displayed ");
		Assert.assertEquals(footerPage.getTermsConditionInEnglish(), FooterPageUIs.TERM_CONDITIONS_LABEL_IN_ENGLISH);

	}

	@Test
	public void TC_03_Footer_Menu_Contact_Us(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'Contact Us' link on Footer");
		footerPage = homePage.clickToMenuByHref("contact-us");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 02: Verify the title 'Contact Us' displayed ");
		Assert.assertEquals(footerPage.getContactUsInEnglish(), FooterPageUIs.CONTACT_US_LABEL_IN_ENGLISH);

	}

	@Test
	public void TC_04_Footer_Menu_Privacy_Policy(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'Privacy Policy' link on Footer");
		footerPage = homePage.clickToMenuByHref("privacy-policy");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 02: Verify the title 'Privacy Policy' displayed ");
		Assert.assertEquals(footerPage.getPrivacyPolicyInEnglish(), FooterPageUIs.PRIVACY_POLICY_LABEL_IN_ENGLISH);
	}

	@Test
	public void TC_05_Footer_Menu_About_Us(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'About Us' link on Footer");
		footerPage = homePage.clickToMenuByHref("about-us");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 02: Verify the title 'About Us' displayed ");
		Assert.assertEquals(footerPage.getAboutUsInEnglish(), FooterPageUIs.ABOUT_US_LABEL_IN_ENGLISH);
	}

	@Test
	public void TC_06_Footer_Menu_Student_Discount(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'Student Discount' link on Footer");
		footerPage = homePage.clickToMenuByHref("student-discount");

		ExtentTestManager.getTest().log(Status.INFO,
				"Footer - Step 02: Verify the title 'Student Discount' displayed ");
		Assert.assertEquals(footerPage.getStudentDiscountInEnglish(), FooterPageUIs.STUDENT_DISCOUNT_LABEL_IN_ENGLISH);
	}

	@Test
	public void TC_07_Footer_Menu_Blog(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'Blog' link on Footer");
		footerPage = homePage.clickToMenuByHref("https://bloggigsberg.wordpress.com/");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 02: Verify the title 'Blog' displayed ");
		Assert.assertEquals(footerPage.getStudentDiscountInEnglish(), FooterPageUIs.STUDENT_DISCOUNT_LABEL_IN_ENGLISH);
	}

	@Test
	public void TC_08_Footer_Menu_Distributor_Agreement(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO,
				"Footer - Step 01: Click to 'Distributor Agreement' link on Footer");
		footerPage = homePage.clickToMenuByHref("distributor-agreement");

		ExtentTestManager.getTest().log(Status.INFO,
				"Footer - Step 02: Verify the title 'Distributor Agreement' displayed ");
		Assert.assertEquals(footerPage.getDistributorAgreementInEnglish(),
				FooterPageUIs.DISTRIBUTOR_AGREEMENT_LABEL_IN_ENGLISH);
	}

	@Test
	public void TC_09_Footer_Menu_Event_Organizers(Method method) {
		ExtentTestManager.startTest(method.getName(), "Footer Menu");

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 00: Navigate to 'https://gigsberg.com/'");
		homePage = PageGenerateManager.getHomePage(driver);

		homePage.acceptGBGCookies();

		ExtentTestManager.getTest().log(Status.INFO, "Footer - Step 01: Click to 'Event Organizers' link on Footer");
		footerPage = homePage.clickToMenuByHref("event-organizers");

		ExtentTestManager.getTest().log(Status.INFO,
				"Footer - Step 02: Verify the title 'Event Organizers' displayed ");
		Assert.assertEquals(footerPage.getEventOrganizersEnglish(), FooterPageUIs.EVENT_ORGANIZERS_LABEL_IN_ENGLISH);
	}
}
