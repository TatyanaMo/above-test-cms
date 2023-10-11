package pageobject.pagesForAbove.LocatorsMobile;

import org.openqa.selenium.By;

public class MobileUserProfilePageLocators {

    public static final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    public static final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    public static final By MY_PROFILE_BUTTON = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    public static final By LOG_OUT_BUTTON = By.xpath(".//form[@action='https://staging.above9.travel/logout']");
    public static final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    public static final By CLOSE_BUTTONS = By.xpath(".//button[@aria-label='Close']");
    public static final By MY_PROFILE_TITTLE = By.xpath(".//h2[@class='text-xl lg:text-2xl font-medium']");
    public static final By MY_PROFILE_OPTIONS = By.xpath(".//li[@class='flex-shrink-0']");
    public static final By PERSONAL_INFO_BLOCK = By.xpath(".//div[@data-tab='personal-info']");
    public static final By PERSONAL_INFO_FIELDS_NAMES = By.xpath(".//legend[@class='text-xs text-gray-500 cursor-default']");
    public static final By PERSONAL_INFO_PLACEHOLDERS = By.xpath(".//input[contains(@class,'appearance-none block h-10 leading-8 px-0 py-1 w-full text-sm rounded-none')]");
    public static final By GENDER_RADIO_BUTTONS = By.xpath(".//input[@type='radio']");
    public static final By GENDER_RADIO_BUTTON_NAMES = By.xpath(".//span[@class='pl-3 font-medium leading-5 cursor-pointer after-disabled:cursor-default ']");
    public static final By CHOICES_FIELDS = By.xpath(".//div[@class='choices__inner']");
    public static final By DROPDOWN_LISTS = By.xpath(".//div[contains(@class,'choices__list choices__list--dropdown')]");
    public static final By CHOICES_LISTS = By.xpath(".//div[contains(@class,'choices__item choices__item--choice choices__item--selectable')]");
    public static final By CHOICES_LIST_CLOSE_BUTTON = By.xpath(".//button[contains(@class,'md:hidden text-black w-16 h-12 border-l rounded-r-md')]");
    public static final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    public static final By SECTIONS_TITTLE = By.xpath(".//h2[@class='text-base font-medium flex-grow flex items-center']");
    public static final By INFO_BLOCK_TEXT = By.xpath(".//div[@class='sticky top-8 bg-white border rounded p-6 leading-5 space-y-4 break-words']/p");
    public static final By INFO_BLOCK_SUB_TITTLES = By.xpath(".//p[@class='font-semibold']");
    public static final By INFO_BLOCK_CONTACT_LINKS = By.xpath(".//a[@class='text-orange-400 hover:underline hover:text-orange-500']");
    public static final By INFO_BLOCK_GENERAL_LINE_SECTION = By.xpath(".//ul[@class='pt-3 pl-3 space-y-1 break-all']");
    public static final By INFO_BLOCK_IMAGES = By.xpath(".//*[name()='svg' and contains(@class, 'w-4 h-4 text-orange-400')]");
    public static final By INFO_BLOCK_AGENT_SECTION = By.xpath(".//ul[@class='pt-3 pl-3 space-y-1']");
    public static final By USER_PROFILE_OPTIONS = By.xpath(".//a[@data-toggle='tab']");
    public static final By FLIGHT_COUNTER = By.xpath(".//b[contains(@class,'ml-0.5 px-2 leading-4 inline-block rounded-full')]");
    public static final By UPCOMING_FLIGHT_BLOCK = By.xpath(".//div[@data-tab='upcoming-flights']");
    public static final By BLOCK_ELEMENTS = By.xpath(".//button[@data-toggle='slide']");
    public static final By ALERT_MESSAGES = By.xpath(".//div[contains(@class,'border rounded bg-white flex items-center text-sm ')]");
    public static final By FLIGHTS_INFO_ROUTES = By.xpath(".//span[@class='block sm:inline']");
    public static final By FLIGHTS_OTHER_INFO = By.xpath(".//span[@class='flex items-center space-x-2 text-sm text-gray-500']/span");
    public static final By PURCHASE_HISTORY_BLOCK = By.xpath(".//div[@data-tab='purchase-history']");
    public static final By CO_TRAVELERS_BLOCK = By.xpath(".//div[@data-tab='co-travellers']");
    public static final By CO_TRAVELER_CARDS = By.xpath(".//div[@class='rounded-lg shadow-sides-bottom-black']");
    public static final By CO_TRAVELER_CARDS_TITTLE = By.xpath(".//h2[@class='text-base font-medium flex-grow flex items-center']/span");
    public static final By CO_TRAVELER_CARDS_DELETE_BUTTON = By.xpath(".//button[@aria-label='Delete']");
    public static final By CO_TRAVELER_CARDS_INPUT_FIELDS = By.xpath(".//div[@class='relative  min-h-10 group-invalid:pr-7 ']/input");
    public static final By ADD_CO_TRAVELER_BUTTON = By.xpath(".//button[contains(@class,' focus:outline-none focus:ring-2 focus:border-orange-300')]");
    public static final By INFO_TEXT = By.xpath(".//div[@class='flex items-center flex-grow break-words']/p");
    public static final By UNDO_BUTTONS = By.xpath(".//button[contains(@class,'hover:bg-orange-200 text-orange-500 hover:text-orange-600 rounded')]");
    public static final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    public static final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    public static final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    public static final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    public static final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    public static final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
}
