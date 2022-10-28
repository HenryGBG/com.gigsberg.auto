package pageObjects.GigsbergSellers;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.com.gigsberg.sellers.SellersLoginPageUIs;

public class SellersLoginPageObject extends BasePage {
	WebDriver driver;

	public SellersLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputSellersEmailAddress(String email) {
		waitForElementVisible(driver, SellersLoginPageUIs.SELLER_EMAIL_XPATH);
		sendkeyToElement(driver, SellersLoginPageUIs.SELLER_EMAIL_XPATH, email);
	}

	public void inputSellerPassword(String password) {
		waitForElementVisible(driver, SellersLoginPageUIs.SELLER_PASSWORD_XPATH);
		sendkeyToElement(driver, SellersLoginPageUIs.SELLER_PASSWORD_XPATH, password);
	}

	public SellersDashboardPageObject clickToLoginSellerButton() {
		waitForElementVisible(driver, SellersLoginPageUIs.SELLER_LOGIN_BUTTON_XPATH);
		clickToElement(driver, SellersLoginPageUIs.SELLER_LOGIN_BUTTON_XPATH);
		return new SellersDashboardPageObject(driver);
	}

}
