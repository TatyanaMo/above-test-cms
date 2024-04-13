package pageobject.pagesForAbove.Locators;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@data-tid='banner-decline']");
    public static final By WIDGET_POP_UP = By.id("call-us-expanded");
    public static final By WIDGET_TEXT = By.xpath(".//span[@class='text-xs md:text-sm font-normal text-center']");
    public static final By WIDGET_PHONE = By.xpath(".//span[@class='text-orange-550 text-sm md:text-base font-medium']");
    public static final By WIDGET_CLOSE_BTN = By.xpath(".//button[@class='px-2 flex items-center justify-center']");
    public static final By WIDGET_CLOSED = By.xpath(".//button[@id='call-us']");
    public static final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    public static final By REVIEW_HEADER_LINK = By.id("profile-link");
    public static final By PHONE = By.xpath(".//a[@href ='tel:+1-855-777-6336']");
    public static final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    public static final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    public static final By MY_PROFILE_BUTTON = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    public static final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    public static final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    public static final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    public static final By INPUT_FIELDS_EMAIL = By.xpath(".//input[@type='email']");
    public static final By INPUT_FIELDS_PASSWORD = By.xpath(".//input[@type='password']");
    public static final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    public static final By REQUEST_FORM_POP_UP_MODAL = By.xpath(".//div[@aria-labelledby='upsell-title']");
    public static final By POP_UP_HEADER = By.id("upsell-title");
    public static final By POP_UP_TEXT = By.xpath(".//div[@class='space-y-4 text-lg']");
    public static final By POP_UP_PHONE_BUTTON = By.xpath(".//span[contains(@class,'md:rounded select-none transition inline-block hover:shadow-xs')]");
    public static final By CLOSE_MODAL_WINDOW_BUTTON = By.xpath(".//button[@class='px-2 flex items-center justify-center']");
    public static final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    public static final By CLOSE_BUTTONS = By.xpath(".//span[@class='absolute right-4 top-4 lg:right-0 lg:top-0']/button");
    public static final By SIGN_UP_MODAL_WINDOW = By.id("register-title");
    public static final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    public static final By HOME_PAGE_WELCOME_TEXT = By.xpath(".//div[@class='pt-9 md:pt-10 md:w-4/5']");

    public static final By HOW_IT_WORKS_MODAL = By.xpath(".//button[@data-toggle='modal']");
    public static final By HOW_IT_WORKS_TITLE = By.id("how-this-works-title");
    public static final By HOW_IT_WORKS_TEXT_ONE = By.xpath(".//ol[@class='space-y-6']");
    public static final By HOW_IT_WORKS_TEXT_TWO = By.xpath(".//ul[@class='pt-4 space-y-2']");

    public static final By REQUEST_FORM = By.xpath(".//div[@class='space-y-6']");
    public static final By REQUEST_FORM_INPUT_FIELDS = By.xpath(".//div[@class='w-full group is-invalid']");
    public static final By HOME_PAGE_TEXT_ONE = By.xpath(".//div[@class='pt-12 pb-4 space-y-6 w-3/4 simple-content']");
    public static final By CONTAINERS_TEXT = By.xpath(".//div[@class='container']");
    public static final By INSTRUCTIONS_BLOCK = By.xpath(".//div[@class='lg:-mx-8 lg:flex py-8 lg:py-0 space-y-4 lg:space-y-0']");
    public static final By HOME_PAGE_TEXT_THREE = By.xpath(".//div[@class='pb-1.5 flex flex-col lg:space-y-1']");
    public static final By INSTRUCTION = By.xpath(".//div[@class='w-4/5']");
    public static final By INSTRUCTION_STEPS = By.xpath(".//li[@class='md:w-1/2 lg:w-full md:px-3 md:py-2 lg:p-0 space-y-5']");
    public static final By TRUSTPILOT_REVIEW_BLOCK = By.xpath(".//div[@id='tp-widget-wrapper']");
    public static final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    public static final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    public static final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    public static final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    public static final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    public static final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    public static final By REQUEST_FORM_MENU = By.xpath(".//div[@class='fixed lg:absolute inset-0 lg:top-auto lg:" +
            "bottom-auto z-40 bg-white lg:bg-transparent lg:max-h-96 lg:left-0 lg:right-auto']");
    public static final By REQUEST_OPTIONS = By.xpath(".//span[@role='button']");
    public static final By FLIGHT_TYPE_SELECTED = By.xpath(".//span[@class='inline-flex items-center space-x-2 align-middle']");
    public static final By PASSENGERS_BLOCK = By.xpath(".//div[@class='flex items-center space-x-8']");
    public static final By PASSENGERS_COUNTER_BTNS = By.xpath(".//button[contains(@class, 'touch-manipulation flex-shrink-0 w-10 h-10 ')]");
    public static final By DATA_PASSENGER_MESSAGE = By.xpath(".//div[@class='px-5 py-3 leading-5 text-red-500']");
    public static final By PASSENGERS_CONFIRM_BTN = By.xpath(".//button[@data-close='data-close']");
    public static final By CURRENT_ADULT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='adults']");
    public static final By CURRENT_CHILD_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='children']");
    public static final By CURRENT_INFANT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='infants']");
    public static final By INPUT_FIELDS_REQUEST_FORM = By.xpath(".//input[contains(@class, 'rounded-none transition-colors bg-transparent border-b border-white')]");
    public static final By INPUT_FIELDS_REQUEST_FORM_SELECTORS = By.xpath(".//div[@aria-selected='true']");
    public static final By AIRPORTS_SUGGESTION = By.xpath(".//span[@class='-mr-2 flex-shrink-0 pl-2']");
    public static final By INPUT_FROM = By.xpath(".//input[@aria-label='From (city or airport)']");
    public static final By INPUT_TO = By.xpath(".//input[@aria-label='To (city or airport)']");
    public static final By ACTIVE_AIRPORTS_TO_LIST = By.xpath(".//div[contains(@class, 'is-parent choices__item')]");
    public static final By CHOICES_LIST_TO = By.xpath(".//div[@class = 'choices__list choices__list--dropdown is-active']");
    public static final By DATE_PICKERS = By.xpath(".//input[contains(@class, 'placeholder-opacity-75 focus:outline-none text-right cursor-pointer')]");
    public static final By MONTH_SELECTORS = By.xpath(".//select[@class='lightpick__select lightpick__select-months']/option");
    public static final By YEAR_SELECTORS = By.xpath(".//select[@class='lightpick__select lightpick__select-years']/option");
    public static final By DAYS_DATE_PICKER = By.xpath(".//div[@class='lightpick__days']");
    public static final By AVAILABLE_DAYS_DATE_PICKER = By.xpath(".//div[@class='lightpick__day is-available ']");
    public static final By DATE_PICKERS_OPENED = By.xpath(".//section[@class='lightpick lightpick--1-columns']");
    public static final By ADD_FLIGHT_BUTTON = By.xpath(".//button[@data-trip-add='data-trip-add']");
    public static final By REMOVE_FLIGHT_BUTTON = By.xpath(".//button[@ data-trip-remove='data-trip-remove']");
    public static final By AVAILABLE_DATES_RETURN = By.xpath(".//div[contains(@class, 'lightpick__day is-available')]");
    public static final By SUCCESSFUL_REQUEST_MODAL_WINDOW = By.xpath(".//div[@data-modal='request-success']");
    public static final By SUCCESSFUL_REQUEST_MODAL_WINDOW_TITTLE = By.id("request-success-title");
    public static final By SUCCESSFUL_REQUEST_MODAL_WINDOW_TEXT = By.xpath(".//div[@class='pt-6']/p");
}
