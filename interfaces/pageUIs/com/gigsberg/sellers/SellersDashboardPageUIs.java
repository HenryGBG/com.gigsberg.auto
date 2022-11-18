package pageUIs.com.gigsberg.sellers;

public class SellersDashboardPageUIs {

	public static final String NEW_LISTING_LINK = "xpath=//div[@class='header_top clearfix']/descendant::span";
	public static final String EVENT_NAME_XPATH = "xpath=//input[@id='popup_event_name']";
	public static final String NUMBER_TICKET_CHECKBOX = "xpath=//input[@name='seat_radio']/parent::li/label[text()='%s']";
	public static final String SPLIT_TYPE_XPATH = "xpath=//select[@name='listing_split_type_code']";
	public static final String TICKET_TYPE_CHECKBOX = "xpath=//label[text()='%s']/preceding-sibling::input";
	public static final String CATEGORY_DETAILS_XPATH = "xpath=//select[@id='category_id-block']";
	public static final String BLOCK_DETAILS_XPATH = "xpath=//select[@id='blocks']";
	public static final String YOUR_PRICE_CURRENCY_XPATH = "xpath=//select[@id='currency_id']";
	public static final String FACE_VALUE_CURRENCY_XPATH = "xpath=//select[@id='face_value_currency_id']";
	public static final String WEBSITE_PRICE_SELLER_TEXTBOX = "xpath=//input[@id='website_price1']";
	public static final String PRICE_PER_TICKET_TEXTBOX = "xpath=//input[@id='face_value1']";
	public static final String IS_SELLER_CONNECTED_GIGSBERG_CHECKBOX = "xpath=//label[@for='is_seller_connected_to_event1']";
	public static final String PUBLISH_TICKET_TOGGLE = "xpath=//div[@class='switcher']";
	public static final String ADD_LISTING_BUTTON = "xpath=//a[@class='btn_cont_step']";
	public static final String EVENT_LIST_WITH_DATE = "xpath=//li[@data-event_date_day='%s']";
	public static final String PROCEED_SELLER_TICKET_TEXTBOX = "xpath=//input[@id='price1']";
	public static final String DASHBOARD_MENU_XPATH = "xpath=//h1[text()='Most Viewed Events']";
	public static final String LISTING_MENU_XPATH = "xpath=//li[@class='nav_col2']/a[@href='/sellers/dashboard/listings']";
	public static final String LISTING_LABEL_XPATH = "xpath=//div[@class='recently_updated']/span";
	public static final String SALE_MENU_XPATH = "xpath=//a[@href='/sellers/dashboard/sales']";
	public static final String SALES_LABEL_XPATH = "xpath=//div[@class='recently_updated']/span";
	public static final String PAYMENTS_MENU_XPATH = "xpath=";
	public static final String PAYMENTS_LABEL_XPATH = null;

}
