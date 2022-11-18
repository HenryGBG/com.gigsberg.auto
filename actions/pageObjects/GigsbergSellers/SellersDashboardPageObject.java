package pageObjects.GigsbergSellers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import commons.BasePage;
import pageUIs.com.gigsberg.sellers.SellersDashboardPageUIs;

public class SellersDashboardPageObject extends BasePage {
	WebDriver driver;

	public SellersDashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToNewListingLink() {
		waitForElementVisible(driver, SellersDashboardPageUIs.NEW_LISTING_LINK);
		clickToElement(driver, SellersDashboardPageUIs.NEW_LISTING_LINK);
	}

	public void inputToEventName(String eventName) {
		waitForElementVisible(driver, SellersDashboardPageUIs.EVENT_NAME_XPATH, eventName);
		sendkeyToElement(driver, SellersDashboardPageUIs.EVENT_NAME_XPATH, eventName);
	}

	public void clickToEventListWithDate(String eventDate) {
		waitForElementVisible(driver, SellersDashboardPageUIs.EVENT_LIST_WITH_DATE, eventDate);
		clickToElement(driver, SellersDashboardPageUIs.EVENT_LIST_WITH_DATE, eventDate);

	}

//	public void selectNumberTicket(String numberTicket) {
//		waitForElementVisible(driver, SellersDashboardPageUIs.NUMBER_TICKET_CHECKBOX);
//		clickToElement(driver, SellersDashboardPageUIs.NUMBER_TICKET_CHECKBOX, numberTicket);
//	}

	public void selectNumberTicket(String numberTicket) {
		waitForElementVisible(driver, SellersDashboardPageUIs.NUMBER_TICKET_CHECKBOX, numberTicket);
		clickToElement(driver, SellersDashboardPageUIs.NUMBER_TICKET_CHECKBOX, numberTicket);
	}

	public void selectSplitType(String splitType) {
		waitForElementVisible(driver, SellersDashboardPageUIs.SPLIT_TYPE_XPATH);
		selectItemInDefaultDropdown(driver, SellersDashboardPageUIs.SPLIT_TYPE_XPATH, splitType);
	}

	public void selectTicketType(String ticketType) {
		waitForElementVisible(driver, SellersDashboardPageUIs.TICKET_TYPE_CHECKBOX, ticketType);
		clickToElement(driver, SellersDashboardPageUIs.TICKET_TYPE_CHECKBOX, ticketType);
	}

	public void selectCategoryDetails(String categoryDetails) {
		waitForElementVisible(driver, SellersDashboardPageUIs.CATEGORY_DETAILS_XPATH, categoryDetails);
		selectItemInDefaultDropdown(driver, SellersDashboardPageUIs.CATEGORY_DETAILS_XPATH, categoryDetails);

	}

	public void selectBlockDetails(String blockDetails) {
		waitForElementVisible(driver, SellersDashboardPageUIs.BLOCK_DETAILS_XPATH, blockDetails);
		selectItemInDefaultDropdown(driver, SellersDashboardPageUIs.BLOCK_DETAILS_XPATH, blockDetails);
	}

	public void setYourPriceCurrency(String yourPriceCurrency) {
		waitForElementVisible(driver, SellersDashboardPageUIs.YOUR_PRICE_CURRENCY_XPATH, yourPriceCurrency);
		selectItemInDefaultDropdown(driver, SellersDashboardPageUIs.YOUR_PRICE_CURRENCY_XPATH, yourPriceCurrency);
	}

	public void setFaceValueCurrency(String faceValueCurrency) {
		waitForElementVisible(driver, SellersDashboardPageUIs.FACE_VALUE_CURRENCY_XPATH, faceValueCurrency);
		selectItemInDefaultDropdown(driver, SellersDashboardPageUIs.FACE_VALUE_CURRENCY_XPATH, faceValueCurrency);
	}

	public void inputWebsitePrice(String proceedToSeller) {
		waitForElementVisible(driver, SellersDashboardPageUIs.WEBSITE_PRICE_SELLER_TEXTBOX);
		sendkeyToElement(driver, SellersDashboardPageUIs.WEBSITE_PRICE_SELLER_TEXTBOX, proceedToSeller);

	}

	public void inputPricePerTicket(String pricePerTicket) {
		waitForElementVisible(driver, SellersDashboardPageUIs.PRICE_PER_TICKET_TEXTBOX);
		sendkeyToElementByJS(driver, SellersDashboardPageUIs.PRICE_PER_TICKET_TEXTBOX, pricePerTicket);
//		sendkeyToElement(driver, SellersDashboardPageUIs.PRICE_PER_TICKET_TEXTBOX, pricePerTicket);
	}

	public void clickToIsSellerConectedGigsberg() {
		waitForElementVisible(driver, SellersDashboardPageUIs.IS_SELLER_CONNECTED_GIGSBERG_CHECKBOX);
		clickToElement(driver, SellersDashboardPageUIs.IS_SELLER_CONNECTED_GIGSBERG_CHECKBOX);
	}

	public void turnOffPublishTicket() {
		waitForElementVisible(driver, SellersDashboardPageUIs.PUBLISH_TICKET_TOGGLE);
		clickToElement(driver, SellersDashboardPageUIs.PUBLISH_TICKET_TOGGLE);
	}

	public void clickToAddListingButton() {
		waitForElementVisible(driver, SellersDashboardPageUIs.ADD_LISTING_BUTTON);
		clickToElement(driver, SellersDashboardPageUIs.ADD_LISTING_BUTTON);

	}

	public void inputToProceedSeller(String proceedSeller) {
		waitForElementVisible(driver, SellersDashboardPageUIs.PROCEED_SELLER_TICKET_TEXTBOX);
		sendkeyToElementByJS(driver, SellersDashboardPageUIs.PROCEED_SELLER_TICKET_TEXTBOX, proceedSeller);
	}

	public String getDashboardLabel() {
		waitForElementVisible(driver, SellersDashboardPageUIs.DASHBOARD_MENU_XPATH);
		return getElementText(driver, SellersDashboardPageUIs.DASHBOARD_MENU_XPATH);
	}

	public void clickToListingsMenu() {
		waitForElementVisible(driver, SellersDashboardPageUIs.LISTING_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.LISTING_MENU_XPATH);
	}

	public String getListingsPageLabel() {
		waitForElementVisible(driver, SellersDashboardPageUIs.LISTING_LABEL_XPATH);
		return getElementText(driver, SellersDashboardPageUIs.LISTING_LABEL_XPATH);
	}

	public void clickToSalesMenu() {
		waitForElementVisible(driver, SellersDashboardPageUIs.SALE_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.SALE_MENU_XPATH);

	}

	public String getSalesPageLabel() {
		waitForElementVisible(driver, SellersDashboardPageUIs.SALES_LABEL_XPATH);
		return getElementText(driver, SellersDashboardPageUIs.SALES_LABEL_XPATH);
	}

	public void clickToPaymentMenu() {
		waitForElementVisible(driver, SellersDashboardPageUIs.PAYMENTS_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.PAYMENTS_MENU_XPATH);
	}

	public String getPaymentsLabel() {
		waitForElementVisible(driver, SellersDashboardPageUIs.PAYMENTS_LABEL_XPATH);
		return getElementText(driver, SellersDashboardPageUIs.PAYMENTS_LABEL_XPATH);
	}

	public void clickToAccountInfoMenu() {
		waitForElementVisible(driver, SellersDashboardPageUIs.ACCOUNT_INFO_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.ACCOUNT_INFO_MENU_XPATH);
	}

	public String getAccountInfoLabel() {
		waitForElementVisible(driver, SellersDashboardPageUIs.ACCOUNT_INFO_LABEL_XPATH);
		return getElementText(driver, SellersDashboardPageUIs.ACCOUNT_INFO_LABEL_XPATH);
	}

	public void clickToAddressMenu() {
		waitForElementVisible(driver, SellersDashboardPageUIs.ADDRESS_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.ADDRESS_MENU_XPATH);
	}

	public java.lang.String getAddressLabel() {
		waitForElementVisible(driver, SellersDashboardPageUIs.ADDRESS_INFO_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.ADDRESS_INFO_MENU_XPATH);
	}

	public void clickToPaymentAccountMenu() {
		waitForElementVisible(driver, SellersDashboardPageUIs.PAYMENT_ACCOUNT_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.PAYMENT_ACCOUNT_MENU_XPATH);
	}

	public java.lang.String getPaymentAccountLabel() {
		waitForElementVisible(driver, SellersDashboardPageUIs.PAYMENT_ACCOUNT_MENU_XPATH);
		clickToElement(driver, SellersDashboardPageUIs.PAYMENT_ACCOUNT_MENU_XPATH);
	}

}
