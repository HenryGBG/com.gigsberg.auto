package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.com.gigsberg.GlobalBaseUI;

public class HomePageObject extends BasePage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void hoverToMainCategory(WebDriver driver, String mainCategory) {
		waitForElementVisible(driver, GlobalBaseUI.DYNAMIC_MAIN_CATEGORY_BY_LABE, mainCategory);
		hoverToElement(driver, GlobalBaseUI.DYNAMIC_MAIN_CATEGORY_BY_LABE, mainCategory);

	}

	public void clickToSubCategory(WebDriver driver, String subCategory) {
		waitForElementVisible(driver, GlobalBaseUI.DYNAMIC_SUB_CATEGORY_BY_LABEL, subCategory);
		clickToElement(driver, GlobalBaseUI.DYNAMIC_SUB_CATEGORY_BY_LABEL, subCategory);
	}

	public String getConcertSubTitle(String subCategory) {
		waitForElementVisible(driver, GlobalBaseUI.DYNAMIC_SUB_TITLE_BY_LABEL, subCategory);
		return getElementText(driver, GlobalBaseUI.DYNAMIC_SUB_TITLE_BY_LABEL, subCategory);
	}

	public void getUpcomingConcertRock(WebDriver driver) {
		getUpcomingConcert(driver, GlobalBaseUI.UPCOMING_CONCERT_ROCK);
	}

	public FooterPageObject clickToMenuByHref(String hrefMenu) {
		waitForElementVisible(driver, GlobalBaseUI.DYNAMIC_MENU_ON_FOOTER, hrefMenu);
		clickToElement(driver, GlobalBaseUI.DYNAMIC_MENU_ON_FOOTER, hrefMenu);
		return new FooterPageObject(driver);
	}

	public void acceptGBGCookies() {
		waitForElementVisible(driver, GlobalBaseUI.ACCEPT_COOKIE_XPATH);
		clickToElement(driver, GlobalBaseUI.ACCEPT_COOKIE_XPATH);
	}

	public void clickToLoginLink() {
		waitForElementVisible(driver, GlobalBaseUI.LOGIN_LINK_XPATH);
		clickToElement(driver, GlobalBaseUI.LOGIN_LINK_XPATH);
	}

	public void clickToSignUpButtonAtLoginForm() {
		waitForElementVisible(driver, GlobalBaseUI.SIGN_UP_BUTTON_XPATH);
		clickToElement(driver, GlobalBaseUI.SIGN_UP_BUTTON_XPATH);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(driver, GlobalBaseUI.ERROR_MESSAGE_AT_EMAIL_TEXTBOX_XPATH);
		return getElementText(driver, GlobalBaseUI.ERROR_MESSAGE_AT_EMAIL_TEXTBOX_XPATH);
	}

	public String getErrorMessageAtPasswordTextbox() {
		waitForElementVisible(driver, GlobalBaseUI.ERROR_MESSAGE_AT_PASSWORD_TEXTBOX_XPATH);
		return getElementText(driver, GlobalBaseUI.ERROR_MESSAGE_AT_PASSWORD_TEXTBOX_XPATH);
	}

	public String getErrorMessageAtFullnameTextbox() {
		waitForElementVisible(driver, GlobalBaseUI.ERROR_MESSAGE_AT_FULLNAME_TEXTBOX_XPATH);
		return getElementText(driver, GlobalBaseUI.ERROR_MESSAGE_AT_FULLNAME_TEXTBOX_XPATH);

	}

	public void clickToSignUpButtonAtSignUpForm() {
		waitForElementVisible(driver, GlobalBaseUI.SIGN_UP_BUTTON_AT_SIGNUP_FORM_XPATH);
		clickToElement(driver, GlobalBaseUI.SIGN_UP_BUTTON_AT_SIGNUP_FORM_XPATH);
	}
}
