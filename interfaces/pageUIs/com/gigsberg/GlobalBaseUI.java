package pageUIs.com.gigsberg;

public class GlobalBaseUI {

	// Pattern Object
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_AREA = "xpath=//textarea[@id='%s']";
	public static final String DYNAMIC_MAIN_CATEGORY_BY_LABE = "xpath=//a[@class='header_dropdown_menu_item header_category' and text()='%s']";
	public static final String DYNAMIC_SUB_CATEGORY_BY_LABEL = "xpath=//a[@class='header_subcategory ' and text()='%s']";
	public static final String DYNAMIC_SUB_TITLE_BY_LABEL = "xpath=//h1[@class='concert_sub_title' and text()='%s']";
	public static final String UPCOMING_CONCERT_ROCK = "xpath=//span[@class='upcomimg_concert_text']";

}
//