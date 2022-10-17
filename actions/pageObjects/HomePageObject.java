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

}
