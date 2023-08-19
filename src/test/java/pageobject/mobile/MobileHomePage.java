package pageobject.mobile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;
import java.util.List;

public class MobileHomePage {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@data-tid='banner-accept']");
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_TRUSTPILOT_LINK = By.xpath(".//a[@class='mt-4 md:-ml-3 inline-block space-x-2 px-3 py-4 font-medium']");
    private final By REVIEW_IMG = By.xpath(".//img[@class='-mt-1 w-20 md:w-28 h-6']");
    private final By TRUSTPILOT_ABOVE_TITTLE = By.xpath(".//span[contains(@class, 'title_displayName__TtDDM')]");
    private final By CLOSE_BUTTONS = By.xpath(".//button[@aria-label='Close']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    private final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    private final By IFRAME_FACEBOOK_IMAGE = By.xpath(".//img[@class='_a3jx img']");
    private final By IFRAME_FACEBOOK_TITTLE = By.xpath(".//div[@class='_4ik4 _4ik5']/strong");
    private final By IFRAME_FACEBOOK_TEXT = By.xpath(".//div[@class='_a2zt _a6s6 _4ik4 _4ik5']");
    private final By IFRAME_FACEBOOK_MENU_ITEMS = By.xpath(".//div[@class='_a1ql']");
    private final By IFRAME_FACEBOOK_CLOSE_CHAT_BTN = By.xpath(".//div[@aria-label='close']");
    private final By IFRAME_FACEBOOK_MORE_BTN = By.xpath(".//div[@aria-label='More']");
    private final By IFRAME_FACEBOOK_START_CHAT_BTN = By.xpath(".//div[@class='_a2zm']");
    private final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    private final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    private final By SIGN_UP_MODAL_WINDOW = By.id("register-title");
    private final By HOME_PAGE_WELCOME_TEXT = By.xpath(".//div[@class='pt-4 md:pt-10 md:w-4/5']");
    private final By SUBMITTING_TEXT = By.xpath(".//div[@class='pt-12 pb-4 space-y-6 w-3/4 simple-content']");
    private final By CONTAINERS_TEXT = By.xpath(".//div[@class='container']");
    private final By HOME_PAGE_TEXT_THREE = By.xpath(".//div[@class='pb-1.5 flex flex-col lg:space-y-1']");
    private final By REVIEW_HEADER = By.xpath(".//h2[@class='text-2xl lg:text-3xl uppercase font-medium']");
    private final By REVIEW_CAROUSEL = By.xpath(".//div[contains(@class, 'relative overflow-hidden swiper-container swiper')]");
    private final By INSTRUCTION = By.xpath(".//div[@class='w-4/5']");
    private final By INSTRUCTION_STEPS = By.xpath(".//li[@class='md:w-1/2 lg:w-full md:px-3 md:py-2 lg:p-0 space-y-5']");
    private final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    private final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public MobileHomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void acceptCookies() {
        LOGGER.info("Accepting cookies");
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public void logoInHeader() {
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
    public void switchToIframeFacebookButton() {
        LOGGER.info("Switching to Facebook iframe dialog in homepage");
        baseFunc.switchIframeIndex(0);
    }

    public boolean isIframeElementsDisplayed() {
        LOGGER.info("Checking elements in Facebook iframe dialog in homepage");
        baseFunc.waitElementToBeVisible(IFRAME_FACEBOOK_IMAGE);
        Assertions.assertTrue(baseFunc.findElement(IFRAME_FACEBOOK_IMAGE).isDisplayed(), "No Above logo in Facebook iframe");
        Assertions.assertTrue(baseFunc.getTextOfElement(IFRAME_FACEBOOK_TITTLE).length() > 0, "No tittle in Facebook iframe");
        Assertions.assertTrue(baseFunc.getTextOfElement(IFRAME_FACEBOOK_TEXT).length() > 0, "No text in Facebook iframe");
        baseFunc.click(IFRAME_FACEBOOK_MORE_BTN);
        Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(IFRAME_FACEBOOK_MENU_ITEMS) > 0, "No menu items in 'More' option in Facebook iframe");
        Assertions.assertTrue(baseFunc.findElement(IFRAME_FACEBOOK_START_CHAT_BTN).isEnabled(), "Start chat button is disabled in Facebook iframe");
        baseFunc.click(IFRAME_FACEBOOK_CLOSE_CHAT_BTN);
        baseFunc.switchToMainPage();
        return true;
    }
    public boolean isLogInModalWindowOpens() {
        LOGGER.info("Checking elements in Login modal window");
        baseFunc.checkLogInModalWindow(DROP_DOWN_BUTTONS, LOG_IN_BUTTON, LOG_IN_MODAL_WINDOW, MODAL_INPUT_FIELDS, SUBMIT_BUTTONS, MODAL_WINDOW_BUTTONS);
        Assertions.assertTrue(baseFunc.getTextOfElement(LOG_IN_MODAL_WINDOW).length() > 0, "No tittle in Login modal window");
        List<WebElement> loginInputFields = baseFunc.list(MODAL_INPUT_FIELDS).subList(0, 1);
        for (WebElement inputField : loginInputFields) {
            Assertions.assertTrue(inputField.getAttribute("placeholder").length() > 0, "no text in placeholders in login modal window");
        }
        Assertions.assertTrue(baseFunc.list(SUBMIT_BUTTONS).get(2).isEnabled(), "Sign in button is disabled in login modal window");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUBMIT_BUTTONS).get(2)).length() > 0, "Sign in haven't name in login modal window");
        List<WebElement> buttons = baseFunc.list(MODAL_WINDOW_BUTTONS).subList(0, 1);
        for (WebElement button : buttons) {
            Assertions.assertTrue(button.isEnabled(), "Buttons is disabled in login modal window");
            Assertions.assertTrue(baseFunc.getTextOfElement(button).length() > 0, "Buttons haven't names in login modal window");
        }
        return true;
    }
    public void loginModalClose() {
        LOGGER.info("Closing Login modal window");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(10));
    }
    public boolean isSignUpModalWindowOpen() {
        LOGGER.info("Checking elements in Sign up modal window");
        baseFunc.checkSignUpModalWindow(DROP_DOWN_BUTTONS, CREATE_PROFILE_BUTTON, SIGN_UP_MODAL_WINDOW, MODAL_INPUT_FIELDS, SUBMIT_BUTTONS, MODAL_WINDOW_BUTTONS);
        Assertions.assertTrue(baseFunc.getTextOfElement(SIGN_UP_MODAL_WINDOW).length() > 0, "No tittle in Sign up modal window");
        List<WebElement> signUpInputFields = baseFunc.list(MODAL_INPUT_FIELDS).subList(2, 6);
        for (WebElement inputField : signUpInputFields) {
            Assertions.assertTrue(inputField.getAttribute("placeholder").length() > 0, "no text in placeholders in Sign up modal window");
        }
        Assertions.assertTrue(baseFunc.list(SUBMIT_BUTTONS).get(1).isEnabled(), "Sign in button is disabled  in Sign up modal window");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUBMIT_BUTTONS).get(3)).length() > 0, "Sign in button hasn't name in Sign up modal window");
        Assertions.assertTrue(baseFunc.list(MODAL_WINDOW_BUTTONS).get(2).isEnabled(), "Button is disabled in Sign up modal window");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(MODAL_WINDOW_BUTTONS).get(2)).length() > 0, "Button hasn't name in Sign up modal window");
        return true;
    }

    public void signUpModalClose() {
        LOGGER.info("Closing sign up modal window");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(11));
    }

    public boolean isHomePageWelcomeTextAppears() {
        LOGGER.info("Checking if Welcome text on page for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(HOME_PAGE_WELCOME_TEXT).length() > 0, "No text here");
        return baseFunc.findElement(HOME_PAGE_WELCOME_TEXT).isDisplayed();
    }

    public boolean isTextOneAppears() {
        LOGGER.info("Checking if text displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(0)).length() > 0, "No text here");
        return baseFunc.list(CONTAINERS_TEXT).get(0).isDisplayed();
    }

    public boolean isTextTwoAppears() {
        LOGGER.info("Checking if text displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(HOME_PAGE_TEXT_THREE).get(0)).length() > 0, "No text 'why choose above'");
        return baseFunc.list(HOME_PAGE_TEXT_THREE).get(0).isDisplayed();
    }

    public void whyChooseAboveBlockCheck() {
        LOGGER.info("Checking if block Why choose Above displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(1)).length() > 0, "No text here");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(2)).length() > 0, "No text here");
    }

    public void reviewBlockCheck() {
        LOGGER.info("Checking if review block displayed for homepage");
        String reviewHeader = baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(3).findElements(REVIEW_HEADER).get(0));
        String reviewCarousel = baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(3).findElement(REVIEW_CAROUSEL));
        Assertions.assertTrue(reviewHeader.length() > 0, "No text here");
        Assertions.assertTrue(reviewCarousel.length() > 0, "No text in displayed review");
    }

    public boolean isInstructionBlockAppears() {
        LOGGER.info("Checking if instruction block displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(4)).length() > 0, "No text here");
        Assertions.assertTrue(baseFunc.getTextOfElement(INSTRUCTION).length() > 0, "No tittle in instruction block");
        List<WebElement> steps = baseFunc.list(INSTRUCTION_STEPS);
        int counter = 0;
        for (WebElement we : steps) {
            if (baseFunc.getTextOfElement(we).length() > 0) {
                counter++;
            }
        }
        return baseFunc.list(CONTAINERS_TEXT).get(4).isDisplayed();
    }
    public boolean isFooterLinksOpen() {
        LOGGER.info("Checking if footer links successfully open");
        baseFunc.footerLinksOpen(FOOTER_LINKS, TITTLE);
        return true;
    }

    public boolean isPhoneNumberLinkWorkInFooter() {
        LOGGER.info("Phone number displayed in footer");
        List<WebElement> footerLinks = baseFunc.list(FOOTER_LINKS);
        WebElement phoneLInks = footerLinks.get(3);
        Assertions.assertTrue(baseFunc.getTextOfElement(phoneLInks).length() > 0, "No phone number");
        return true;
    }

    public boolean isEmailLinkWorkInFooter() {
        LOGGER.info("Email link in footer returns status 200 for homepage");
        List<WebElement> footerLinks = baseFunc.list(FOOTER_LINKS);
        String emailLink = footerLinks.get(4).getAttribute("href");
        if (emailLink != null && !emailLink.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(emailLink);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(FOOTER_LINKS).get(4)).length() > 0, "No email in footer");
        return true;
    }
    public boolean isPaymentsDisplayed() {
        LOGGER.info("Checking if payment info displayed in footer");
        Assertions.assertTrue(baseFunc.isPaymentsDisplayed(PAYMENTS), "No payments in footer");
        return true;
    }

    public boolean isPaymentMethodImageDisplayed() {
        LOGGER.info("Checking if payment methods displayed in footer");
        return baseFunc.isPaymentMethodImageDisplayed(PAYMENTS_METHODS);
    }

    public boolean isPartnersDisplayed() {
        LOGGER.info("Checking if block about rights displayed in footer");
        return baseFunc.isPartnersDisplayed(AIRLINES_PARTNERS);
    }

    public boolean isAllRightsTextDisplayed() {
        LOGGER.info("Checking if block about rights displayed in footer");
        Assertions.assertTrue(baseFunc.isAllRightsTextDisplayed(ALL_RIGHTS_TEXT), "No all right text in footer");
        return true;
    }
}
