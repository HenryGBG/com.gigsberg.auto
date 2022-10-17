package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObject;

public class PageGenerateManager {

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

}
