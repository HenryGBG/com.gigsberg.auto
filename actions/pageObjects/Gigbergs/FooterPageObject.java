package pageObjects.Gigbergs;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.com.gigsberg.FooterPageUIs;

public class FooterPageObject extends BasePage {

	WebDriver driver;

	public FooterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getFAQsPageTitle() {
		waitForElementVisible(driver, FooterPageUIs.FAQ_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.FAQ_TITLE_IN_ENGLISH);
	}

	public String getTermsConditionInEnglish() {
		waitForElementVisible(driver, FooterPageUIs.TERM_CONDITION_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.TERM_CONDITION_TITLE_IN_ENGLISH);
	}

	public String getContactUsInEnglish() {
		waitForElementVisible(driver, FooterPageUIs.CONTACT_US_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.CONTACT_US_TITLE_IN_ENGLISH);
	}

	public String getPrivacyPolicyInEnglish() {
		waitForElementVisible(driver, FooterPageUIs.PRIVACY_POLICY_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.PRIVACY_POLICY_TITLE_IN_ENGLISH);
	}

	public java.lang.String getAboutUsInEnglish() {
		waitForElementVisible(driver, FooterPageUIs.ABOUT_US_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.ABOUT_US_TITLE_IN_ENGLISH);
	}

	public String getStudentDiscountInEnglish() {
		waitForElementVisible(driver, FooterPageUIs.STUDENT_DISCOUNT_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.STUDENT_DISCOUNT_TITLE_IN_ENGLISH);
	}

	public String getDistributorAgreementInEnglish() {
		waitForElementVisible(driver, FooterPageUIs.DISTRIBUTOR_AGREEMENT_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.DISTRIBUTOR_AGREEMENT_TITLE_IN_ENGLISH);
	}

	public String getEventOrganizersEnglish() {
		waitForElementVisible(driver, FooterPageUIs.EVENT_ORGANIZERS_TITLE_IN_ENGLISH);
		return getElementText(driver, FooterPageUIs.EVENT_ORGANIZERS_TITLE_IN_ENGLISH);
	}

}
