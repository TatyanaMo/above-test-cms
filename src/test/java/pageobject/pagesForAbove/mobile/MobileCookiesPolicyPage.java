package pageobject.pagesForAbove.mobile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class MobileCookiesPolicyPage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    private final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    private final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    private final By CLOSE_BUTTONS = By.xpath(".//span[contains(@class,'absolute right-4 top-4 lg:right-0 lg:top-0')]/button");
    private final By SIGN_UP_MODAL_WINDOW = By.id("register-title");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    private final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By TEXT = By.xpath(".//div[@data-custom-class='body']");
    private final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public MobileCookiesPolicyPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void logoInHeader() {
        LOGGER.info("Checking logo in header for Terms of use page");
        baseFunc.checkLogoInHeader(HEADER_LOGO);
    }
    public void checkDropDownMenu() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        baseFunc.isDropDownMenuOpenMobile(DROP_DOWN_BUTTONS, LOG_IN_BUTTON, CREATE_PROFILE_BUTTON, DROP_DOWN_ELEMENTS, CLOSE_BUTTONS);
    }
    public boolean isLogInModalWindowOpens() {
        LOGGER.info("Checking elements in Login modal window");
        baseFunc.checkLogInModalWindow(DROP_DOWN_BUTTONS, LOG_IN_BUTTON, LOG_IN_MODAL_WINDOW, MODAL_INPUT_FIELDS, SUBMIT_BUTTONS, MODAL_WINDOW_BUTTONS);
        Assertions.assertTrue(baseFunc.getTextOfElement(LOG_IN_MODAL_WINDOW).length() > 0, "No tittle in Login modal window");
        List<WebElement> loginInputFields = baseFunc.list(MODAL_INPUT_FIELDS).subList(0, 1);
        for (WebElement inputField : loginInputFields) {
            Assertions.assertTrue(inputField.getAttribute("placeholder").length() > 0, "no text in placeholders in login modal window");
        }
        Assertions.assertTrue(baseFunc.list(SUBMIT_BUTTONS).get(0).isEnabled(), "Sign in button is disabled in login modal window");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUBMIT_BUTTONS).get(0)).length() > 0, "Sign in button hasn't name in login modal window");
        List<WebElement> buttons = baseFunc.list(MODAL_WINDOW_BUTTONS).subList(0, 1);
        for (WebElement button : buttons) {
            Assertions.assertTrue(button.isEnabled(), "Buttons is disabled in login modal window");
            Assertions.assertTrue(baseFunc.getTextOfElement(button).length() > 0, "Buttons haven't names in login modal window");
        }
        return true;
    }

    public void loginModalClose() {
        LOGGER.info("Closing Login modal window");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(3));
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
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUBMIT_BUTTONS).get(1)).length() > 0, "Sign in button hasn't name in Sign up modal window");
        Assertions.assertTrue(baseFunc.list(MODAL_WINDOW_BUTTONS).get(2).isEnabled(), "Button is disabled in Sign up modal window");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(MODAL_WINDOW_BUTTONS).get(2)).length() > 0, "Button hasn't name in Sign up modal window");
        return true;
    }

    public void signUpModalClose() {
        LOGGER.info("Closing sign up modal window");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(4));
    }
    public void getTittle() {
        LOGGER.info("Checking presence of tittle for cookies policy page");
        Assertions.assertTrue(baseFunc.getTextOfElement(TITTLE).length() > 0, "No tittle on terms of use page");
    }

    public boolean isTextDisplayed() {
        LOGGER.info("Checking presence of main text for cookies policy page");
        String text = baseFunc.getTextOfElement(TEXT);
        Assertions.assertTrue(text.length() > 0, "no text on cookies policy page");
        return true;
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
        Assertions.assertTrue(baseFunc.getTextOfElement(phoneLInks).length() > 0, "No phone number in footer");
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
