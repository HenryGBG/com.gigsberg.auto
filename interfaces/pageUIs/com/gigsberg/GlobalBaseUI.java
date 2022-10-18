package pageUIs.com.gigsberg;

public class GlobalBaseUI {

	// Pattern Object
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_AREA = "xpath=//textarea[@id='%s']";
	public static final String DYNAMIC_MAIN_CATEGORY_BY_LABE = "xpath=//a[@class='header_dropdown_menu_item header_category' and text()='%s']";
	public static final String DYNAMIC_SUB_CATEGORY_BY_LABEL = "xpath=//a[@class='header_subcategory ' and text()='%s']";
	public static final String DYNAMIC_SUB_TITLE_BY_LABEL = "xpath=//h1[@class='concert_sub_title' and text()='%s']";
	public static final String UPCOMING_CONCERT_ROCK = "xpath=//span[@class='upcomimg_concert_text']";
	public static final String DYNAMIC_MENU_ON_FOOTER = "xpath=//a[@class='footer_menu_link' and @href='/%s']";
	public static final String ACCEPT_COOKIE_XPATH = "xpath=//a[@class='btn accept_cookies_btn']";
	public static final String REQUIRED_FILED_ERROR_MESSAGE = "Required field";
	public static final String LOGIN_LINK_XPATH = "xpath=//div[@class='header_buttons']/ul/li/span[@id='login_btn']";
	public static final String SIGN_UP_BUTTON_XPATH = "xpath=//span[@class='popup_link signup_link']";
	public static final String ERROR_MESSAGE_AT_EMAIL_TEXTBOX_XPATH = "xpath=//form[@id='register']//input[@id='password_reg']/following-sibling::div";
	public static final String ERROR_MESSAGE_AT_PASSWORD_TEXTBOX_XPATH = "xpath=//form[@id='register']//input[@id='password_reg']/following-sibling::div";
	public static final String ERROR_MESSAGE_AT_FULLNAME_TEXTBOX_XPATH = "xpath=//form[@id='register']//input[@id='fullname_reg']/following-sibling::div";
	public static final String SIGN_UP_BUTTON_AT_SIGNUP_FORM_XPATH = "xpath=//li[@id='register_continue']";

}
//