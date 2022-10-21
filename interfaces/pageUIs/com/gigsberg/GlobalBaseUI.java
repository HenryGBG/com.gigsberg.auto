package pageUIs.com.gigsberg;

public class GlobalBaseUI {

	// Dynamic Pattern Object
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_AREA = "xpath=//textarea[@id='%s']";
	public static final String DYNAMIC_MAIN_CATEGORY_BY_LABE = "xpath=//a[@class='header_dropdown_menu_item header_category' and text()='%s']";
	public static final String DYNAMIC_SUB_CATEGORY_BY_LABEL = "xpath=//a[@class='header_subcategory ' and text()='%s']";
	public static final String DYNAMIC_SUB_TITLE_BY_LABEL = "xpath=//h1[@class='concert_sub_title' and text()='%s']";
	public static final String DYNAMIC_MENU_ON_FOOTER = "xpath=//a[@class='footer_menu_link' and @href='/%s']";
	public static final String ERROR_MESSAGE_TEXTBOX = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_DROPDOWN_BY_NAME = "xpath=//select[@name='%s']";
	public static final String DYNAMIC_RADIO_BUTTON_BY_VALUE = "xpath=//label[text()='%s']/preceding-sibling::input";
	public static final String DYNAMIC_CHECKBOX_BY_LABEL = "xpath=//label[contains(text(),'%s')]/following-sibling::input";

	// Xpath Homepage
	public static final String ACCEPT_COOKIE_XPATH = "xpath=//a[@class='btn accept_cookies_btn']";
	public static final String FULLNAME_TEXTBOX_XPATH = "xpath=//input[@id='fullname_reg']";
	public static final String UPCOMING_CONCERT_ROCK = "xpath=//span[@class='upcomimg_concert_text']";
	public static final String EMAIL_TEXTBOX_XPATH = "xpath=//input[@id='email_reg']";
	public static final String PASSWORD_TEXTBOX_XPATH = "xpath=//input[@id='password_reg']";

	// Error message
	public static final String REQUIRED_FILED_ERROR_MESSAGE = "Required field";
	public static final String ERROR_MESSAGE_AT_FULLNAME_TEXTBOX = "Must contain only letters";
	public static final String MESSAGE_WRONG_EMAIL_AT_EMAIL_TEXTBOX = "Wrong email format";
	public static final String ERROR_MESSAGE_AT_PASSWORD_TEXTBOX = "Invalid password format, please see instructions below.";
	public static final String EXISTING_ERROR_MESSAGE_AT_EMAIL_TEXTBOX = "Email already exists";

	// Login Form
	public static final String LOGIN_LINK_XPATH = "xpath=//div[@class='header_buttons']/ul/li/span[@id='login_btn']";
	public static final String SIGN_UP_BUTTON_XPATH = "xpath=//span[@class='popup_link signup_link']";
	public static final String ERROR_MESSAGE_AT_EMAIL_TEXTBOX_XPATH = "xpath=//form[@id='register']//input[@id='email_reg']/following-sibling::div";
	public static final String ERROR_MESSAGE_AT_PASSWORD_TEXTBOX_XPATH = "xpath=//form[@id='register']//input[@id='password_reg']/following-sibling::div";
	public static final String ERROR_MESSAGE_AT_FULLNAME_TEXTBOX_XPATH = "xpath=//form[@id='register']//input[@id='fullname_reg']/following-sibling::div";
	public static final String SIGN_UP_BUTTON_AT_SIGNUP_FORM_XPATH = "xpath=//li[@id='register_continue']";
	public static final String FULLNAME_AT_ACCOUNT_HEADER = "xpath=//ul[@id='control_header']/li[@id='account_header']/a[text()='%s']";
	public static final String EXISTING_ERROR_MESSAGE_AT_EMAIL_XPATH = "xpath=//form[@id='register']/ul/div[@class='form_error']";
	public static final String LOGIN_BUTTON_XPATH = "xpath=//button[@id='signin_continue']";
	public static final String ERROR_MESSAGE_EMAIL_AT_LOGIN_FORM_XPATH = "xpath=//form[@id='signin']//input[@id='login_email']/following-sibling::div";
	public static final String ERROR_MESSAGE_PASSWORD_AT_LOGIN_FORM_XPATH = "xpath=//form[@id='signin']//input[@id='login_password']/following-sibling::div";
	public static final String MESSAGE_WRONG_EMAIL_PASSWORD_TEXTBOX = "Wrong email or password";

}
