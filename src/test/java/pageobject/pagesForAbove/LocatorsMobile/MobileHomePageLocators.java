package pageobject.pagesForAbove.LocatorsMobile;

import org.openqa.selenium.By;

public class MobileHomePageLocators {

    public static final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@data-tid='banner-accept']");
    public static final By REVIEW_HEADER_LINK = By.id("profile-link");
    public static final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    public static final By REVIEW_TRUSTPILOT_LINK = By.xpath(".//a[@class='mt-4 md:-ml-3 inline-block space-x-2 px-3 py-4 font-medium']");
    public static final By REVIEW_IMG = By.xpath(".//img[@class='-mt-1 w-20 md:w-28 h-6']");
    public static final By TRUSTPILOT_ABOVE_TITTLE = By.xpath(".//span[contains(@class, 'title_displayName__TtDDM')]");
    public static final By CLOSE_BUTTONS = By.xpath(".//button[@aria-label='Close']");
    public static final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    public static final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    public static final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    public static final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    public static final By IFRAME_FACEBOOK_IMAGE = By.xpath(".//img[@class='_a3jx img']");
    public static final By IFRAME_FACEBOOK_TITTLE = By.xpath(".//div[@class='_4ik4 _4ik5']/strong");
    public static final By IFRAME_FACEBOOK_TEXT = By.xpath(".//div[@class='_a2zt _a6s6 _4ik4 _4ik5']");
    public static final By IFRAME_FACEBOOK_MENU_ITEMS = By.xpath(".//div[@class='_a1ql']");
    public static final By IFRAME_FACEBOOK_OPEN = By.xpath(".//div[@class='_90st']");
    public static final By IFRAME_FACEBOOK_CLOSE_CHAT_BTN = By.xpath(".//div[@aria-label='close']");
    public static final By IFRAME_FACEBOOK_MORE_BTN = By.xpath(".//div[@aria-label='More']");
    public static final By IFRAME_FACEBOOK_START_CHAT_BTN = By.xpath(".//div[@class='_a2zm']");
    public static final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    public static final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    public static final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    public static final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    public static final By SIGN_UP_MODAL_WINDOW = By.id("register-title");
    public static final By HOME_PAGE_WELCOME_TEXT = By.xpath(".//div[@class='pt-4 md:pt-10 md:w-4/5']");
    public static final By CONTAINERS_TEXT = By.xpath(".//div[@class='container']");
    public static final By INSTRUCTIONS_BLOCK = By.xpath(".//div[@class='lg:-mx-8 lg:flex py-8 lg:py-0 space-y-4 lg:space-y-0']");
    public static final By HOME_PAGE_TEXT_THREE = By.xpath(".//div[@class='pb-1.5 flex flex-col lg:space-y-1']");
    public static final By REVIEW_HEADER = By.xpath(".//h2[@class='text-2xl lg:text-3xl uppercase font-medium']");
    public static final By REVIEW_CAROUSEL = By.xpath(".//div[contains(@class, 'relative overflow-hidden swiper-container swiper')]");
    public static final By INSTRUCTION = By.xpath(".//div[@class='w-4/5']");
    public static final By INSTRUCTION_STEPS = By.xpath(".//li[@class='md:w-1/2 lg:w-full md:px-3 md:py-2 lg:p-0 space-y-5']");
    public static final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    public static final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    public static final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    public static final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    public static final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    public static final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    public static final By REQUEST_FORM = By.id("mobile-request-toggle");
    public static final By REQUEST_FORM_MODAL = By.id("mobile-request-overlay");
    public static final By REQUEST_FORM_FLIGHT_INFORMATION_BLOCK = By.xpath(".//div[@title='Flight information']");
    public static final By REQUEST_FORM_FLIGHT_INFORMATION_TITTLE = By.xpath(".//div[contains(@class,'text-xs uppercase font-medium text-orange-200')]");
    public static final By FLIGHT_INFORMATION_BUTTONS = By.xpath(".//button[contains(@class,'leading-6 h-10 appearance-none flex items-center')]");
    public static final By FLIGHT_INFO_MODAL = By.xpath(".//div[contains(@class,'flex items-center justify-center h-full lg:block')]");
    public static final By FLIGHT_TYPES = By.xpath(".//span[@name='flightType']");
    public static final By FLIGHTS_FORM = By.xpath(".//div[@class='pb-5 space-y-3']");
    public static final By FLIGHTS_ITEMS = By.xpath(".//div[contains(@class,'px-4 py-3 bg-black bg-opacity-5 rounded-md transition-shadow')]");
    public static final By ADD_FLIGHT_BUTTON = By.xpath(".//button[contains(@class,'group appearance-none py-4 lg:py-3 flex items-center justify-center border space-x-2 text-base font-semibold lg:font-medium whitespace-nowrap transition rounded-md md:rounded disabled:cursor-default disabled:bg-gray-400 disabled:shadow-none ring-orange-300 ring-opacity-50 focus:outline-none focus:ring-4 w-full px-5 border-white ')]");
    public static final By DELETE_FLIGHT_ITEM_BUTTON = By.xpath(".//button[contains(@class,'-my-2.5 -mr-2.5 w-9 h-9 rounded-md transition-colors flex items-center justify-center focus:')]");
    public static final By PASSENGERS_TYPES = By.xpath(".//div[@class='w-1/2 leading-5']");
    public static final By PASSENGERS_COUNT_BUTTONS = By.xpath(".//button[contains(@class,'touch-manipulation flex-shrink-0 w-10 h-10 lg:w-8 lg:h-8')]");
    public static final By PASSENGERS_NUMBERS_SELECTED = By.xpath(".//input[@class='w-3 text-center focus:outline-none']");
    public static final By DONE_BUTTON = By.xpath(".//button[@data-close='data-close']");
    public static final By FLIGHT_CLASSES = By.xpath(".//span[@name='class']");
    public static final By PASSENGERS_BLOCK = By.xpath(".//div[@class='flex items-center space-x-8']");
    public static final By PASSENGERS_COUNTER_BTNS = By.xpath(".//button[contains(@class, 'touch-manipulation flex-shrink-0 w-10 h-10 ')]");
    public static final By CURRENT_ADULT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='adults']");
    public static final By CURRENT_CHILD_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='children']");
    public static final By CURRENT_INFANT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='infants']");
    public static final By DATA_PASSENGER_MESSAGE = By.xpath(".//div[@class='px-5 py-3 leading-5 text-red-500']");
    public static final By PASSENGERS_CONFIRM_BTN = By.xpath(".//button[@data-close='data-close']");
    public static final By NEXT_BUTTONS = By.xpath(".//button[@data-step-nav='next']");
    public static final By BACK_BUTTONS = By.xpath(".//button[@data-step-nav='prev']");
    public static final By FLIGHT_MODAL = By.xpath(".//div[@title='Flight 1']");
    public static final By ERROR_MESSAGES = By.xpath(".//div[contains(@class,'hidden group-invalid:block  pt-1  text-sm   text-red-800')]");
    public static final By DATES_LABELS = By.xpath(".//span[contains(@class,'absolute inset-y-0 flex items-center text-white')]");
    public static final By INPUT_FIELDS_REQUEST_FORM_SELECTORS = By.xpath(".//div[@aria-selected='true']");
    public static final By AIRPORTS_SUGGESTION = By.xpath(".//span[@class='-mr-2 flex-shrink-0 pl-2']");
    public static final By INPUT_FROM = By.xpath(".//input[@aria-label='From (city or airport)']");
    public static final By INPUT_TO = By.xpath(".//input[@aria-label='To (city or airport)']");
    public static final By ACTIVE_AIRPORTS_TO_LIST = By.xpath(".//div[contains(@class, 'is-parent choices__item')]");
    public static final By CHOICES_LIST_TO = By.xpath(".//div[@class = 'choices__list choices__list--dropdown is-active']");
    public static final By OPENED_SELECT_WINDOWS = By.xpath(".//div[contains(@class,'choices__list choices__list')]");

    public static final By DATE_PICKERS = By.xpath(".//input[@placeholder='mm/dd/yyyy']");
    public static final By MONTH_SELECTORS = By.xpath(".//select[@class='lightpick__select lightpick__select-months']/option");
    public static final By YEAR_SELECTORS = By.xpath(".//select[@class='lightpick__select lightpick__select-years']/option");
    public static final By DAYS_DATE_PICKER = By.xpath(".//div[@class='lightpick__days']");
    public static final By AVAILABLE_DAYS_DATE_PICKER = By.xpath(".//div[@class='lightpick__day is-available ']");
    public static final By AVAILABLE_DATES_RETURN = By.xpath(".//div[contains(@class, 'lightpick__day is-available')]");
    public static final By CLOSE_DATE_PICKER_BUTTON = By.xpath(".//button[@class='lightpick__close-action']");

    public static final By INPUT_FIELDS_REQUEST_FORM = By.xpath(".//input[contains(@class,'appearance-none block h-10 leading-8 px-0 py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-orange-200 ')]");
    public static final By CONTACT_INFORMATION_FORM = By.xpath(".//div[@class='container min-h-full flex flex-col']");
    public static final By CONTACT_FORM_TITTLE = By.xpath(".//h3[@class='text-xl font-medium']");
    public static final By ADDITIONAL_INFO_TEXT = By.xpath(".//div[@class='pt-5 px-4 simple-content']");
    public static final By PRIVACY_POLICY_LINK = By.xpath(".//a[@target='_blank']");
    public static final By SUCCESSFUL_REQUEST_MODAL_WINDOW_TITTLE = By.xpath(".//h2[@class='text-3xl font-medium']");
    public static final By SUCCESSFUL_REQUEST_MODAL_WINDOW_TEXT = By.xpath(".//p[@class='leading-5']");

    public static final By INPUT_FIELDS_EMAIL = By.xpath(".//input[@type='email']");
    public static final By INPUT_FIELDS_PASSWORD = By.xpath(".//input[@type='password']");
    public static final By MY_PROFILE_BUTTON = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
}
