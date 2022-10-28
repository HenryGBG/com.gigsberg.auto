package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.Gigbergs.HomePageObject;
import pageObjects.GigsbergSellers.SellersLoginPageObject;

public class PageGenerateManager {

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static SellersLoginPageObject getSellerLoginPage(WebDriver driver) {
		return new SellersLoginPageObject(driver);
	}

}
