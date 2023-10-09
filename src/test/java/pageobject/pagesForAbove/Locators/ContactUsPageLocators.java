package pageobject.pagesForAbove.Locators;
import org.openqa.selenium.By;

public class ContactUsPageLocators {

    public static final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    public static final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    public static final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    public static final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    public static final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    public static final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    public static final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    public static final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    public static final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    public static final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    public static final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    public static final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    public static final By CLOSE_BUTTONS = By.xpath(".//span[@class='absolute right-4 top-4 lg:right-0 lg:top-0']/button");
    public static final By SIGN_UP_MODAL_WINDOW = By.id("register-title");
    public static final By HEADERS = By.xpath(".//h2[@class='text-xl lg:text-2xl font-medium']");
    public static final By CONTACT_FORM = By.xpath(".//div[@class='pt-8 space-y-5']");
    public static final By PLACEHOLDERS_TEXT = By.xpath(".//input[@type='text']");
    public static final By PLACEHOLDERS_EMAIL = By.xpath(".//input[@type='email']");
    public static final By TEXT_AREA = By.xpath(".//textarea[@data-validate='required']");
    public static final By CHECKBOX = By.xpath(".//input[@type='checkbox']");
    public static final By CHECKBOX_TEXT = By.xpath(".//span[@class='pl-3 cursor-pointer after-disabled:cursor-default leading-5']");
    public static final By USEFUL_INFO_BLOCKS_HEADERS = By.xpath(".//h3[@class='text-2xl font-medium']");
    public static final By USEFUL_INFO_BLOCKS_CONTACTS = By.xpath(".//div[@class='rich-content']/p/a");
    public static final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    public static final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    public static final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    public static final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    public static final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    public static final By MODAL_WINDOW = By.xpath(".//div[@class='termly-styles-preferenceModal-76cbd2 t-preference-modal']");
    public static final By MODAL_WINDOW_HEADER = By.xpath(".//h2[@class='termly-styles-preferenceTitle-10161b']");
    public static final By MODAL_WINDOW_TEXT = By.xpath(".//p[@class='termly-styles-description-8f0f46']");
    public static final By MODAL_WINDOW_COOKIES_TYPES = By.xpath(".//div[@class='termly-styles-root-d0bda1']");
    public static final By COOKIE_LABELS = By.xpath(".//div[@class='termly-styles-cbLabel-2537e7']");
    public static final By COOKIE_COUNTS = By.xpath(".//div[@class='termly-styles-cookieCount-2c45d5']");
    public static final By COOKIE_DETAILS_LINKS = By.xpath(".//div[@class='termly-styles-detailsLink-306d76 t-detailsLink']");
    public static final By COOKIE_TEXT = By.xpath(".//div[@class='termly-styles-body-aabd97']");
    public static final By BACK_BUTTON = By.xpath(".//div[@class='termly-styles-backButton-1ea7f3 t-backButton']");
    public static final By COOKIE_DETAILS_HEADER = By.xpath(".//h2[@class='termly-styles-title-a6de89']");
    public static final By COOKIE_DETAILS_BODY = By.xpath(".//div[@class='termly-styles-container-adb668']");
    public static final By COOKIE_DETAILS_TABLES_NAME = By.xpath(".//div[@class='termly-styles-container-adb668']/h3");
    public static final By DECLINE_BUTTON = By.xpath(".//button[contains(@class, 't-declineAllButton')]");
    public static final By ALLOW_BUTTON = By.xpath(".//button[contains(@class, 't-allowAllButton')]");
    public static final By CLOSE_MODAL_WINDOW_BUTTON = By.xpath(".//div[@class='termly-styles-closeTag-c6ad69 t-closeModal']");
}
