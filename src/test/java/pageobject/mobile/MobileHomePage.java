package pageobject.mobile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class MobileHomePage {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@data-tid='banner-accept']");
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_TRUSTPILOT_LINK = By.xpath(".//a[@class='mt-4 md:-ml-3 inline-block space-x-2 px-3 py-4 font-medium']");
    private final By REVIEW_IMG = By.xpath(".//img[@class='-mt-1 w-20 md:w-28 h-6']");
    private final By TRUSTPILOT_ABOVE_TITTLE = By.xpath(".//span[contains(@class, 'title_displayName__TtDDM')]");
    private final By CLOSE_BUTTONS = By.xpath(".//button[@aria-label='Close']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    private final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By MY_PROFILE_BUTTON = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    private final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    private final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    private final By INPUT_FIELDS_EMAIL = By.xpath(".//input[@type='email']");
    private final By INPUT_FIELDS_PASSWORD = By.xpath(".//input[@type='password']");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");

    private final By SIGN_UP_MODAL_WINDOW = By.id("register-title");


    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public MobileHomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void acceptCookies() {
        LOGGER.info("Accepting cookies");
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public void mobileLogoInHeader() {
        LOGGER.info("Checking logo in header for homepage");
        baseFunc.checkLogoInHeader(HEADER_LOGO);
    }
    public boolean isTrustpilotLinkAppears() {
        LOGGER.info("Checking Trustpilot link under 'fill request form'");
        baseFunc.checkReviewLinkInHeader(REVIEW_TRUSTPILOT_LINK, REVIEW_IMG, REVIEW_TRUSTPILOT_LINK, TRUSTPILOT_ABOVE_TITTLE);
        return true;
    }
    public void checkDropDownMenu() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        baseFunc.isDropDownMenuOpenMobile(DROP_DOWN_BUTTONS,LOG_IN_BUTTON,CREATE_PROFILE_BUTTON,DROP_DOWN_ELEMENTS, CLOSE_BUTTONS);
    }

}
