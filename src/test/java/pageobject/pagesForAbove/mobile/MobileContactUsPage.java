package pageobject.pagesForAbove.mobile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class MobileContactUsPage {
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
    private final By HEADERS = By.xpath(".//h2[@class='text-xl lg:text-2xl font-medium']");
    private final By CONTACT_FORM = By.xpath(".//div[@class='pt-8 space-y-5']");
    private final By PLACEHOLDERS_TEXT = By.xpath(".//input[@type='text']");
    private final By PLACEHOLDERS_EMAIL = By.xpath(".//input[@type='email']");
    private final By TEXT_AREA = By.xpath(".//textarea[@data-validate='required']");
    private final By CHECKBOX = By.xpath(".//input[@type='checkbox']");
    private final By CHECKBOX_TEXT = By.xpath(".//span[@class='pl-3 cursor-pointer after-disabled:cursor-default leading-5']");
    private final By USEFUL_INFO_BLOCKS_HEADERS = By.xpath(".//h3[@class='text-2xl font-medium']");
    private final By USEFUL_INFO_BLOCKS_CONTACTS = By.xpath(".//div[@class='rich-content']/p/a");
    private final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    private final By MODAL_WINDOW = By.xpath(".//div[@class='termly-styles-preferenceModal-76cbd2 t-preference-modal']");
    private final By MODAL_WINDOW_HEADER = By.xpath(".//h2[@class='termly-styles-preferenceTitle-10161b']");
    private final By MODAL_WINDOW_TEXT = By.xpath(".//p[@class='termly-styles-description-8f0f46']");
    private final By MODAL_WINDOW_COOKIES_TYPES = By.xpath(".//div[@class='termly-styles-root-d0bda1']");
    private final By COOKIE_LABELS = By.xpath(".//div[@class='termly-styles-cbLabel-2537e7']");
    private final By COOKIE_COUNTS = By.xpath(".//div[@class='termly-styles-cookieCount-2c45d5']");
    private final By COOKIE_DETAILS_LINKS = By.xpath(".//div[@class='termly-styles-detailsLink-306d76 t-detailsLink']");
    private final By COOKIE_TEXT = By.xpath(".//div[@class='termly-styles-body-aabd97']");
    private final By BACK_BUTTON = By.xpath(".//div[@class='termly-styles-backButton-1ea7f3 t-backButton']");
    private final By COOKIE_DETAILS_HEADER = By.xpath(".//h2[@class='termly-styles-title-a6de89']");
    private final By COOKIE_DETAILS_BODY = By.xpath(".//div[@class='termly-styles-container-adb668']");
    private final By COOKIE_DETAILS_TABLES_NAME = By.xpath(".//div[@class='termly-styles-container-adb668']/h3");
    private final By DECLINE_BUTTON = By.xpath(".//button[contains(@class, 't-declineAllButton')]");
    private final By ALLOW_BUTTON = By.xpath(".//button[contains(@class, 't-allowAllButton')]");
    private final By CLOSE_MODAL_WINDOW_BUTTON = By.xpath(".//div[@class='termly-styles-closeTag-c6ad69 t-closeModal']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public MobileContactUsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
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
    public boolean isHeadersDisplayed() {
        LOGGER.info("Checking if header displayed for contact form for contact us page");
        Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(HEADERS) >0 ,  "No headers on Contact us page");
        return true;
    }

    public boolean isPlaceholdersTextDisplayed() {
        LOGGER.info("Checking if placeholders displayed for contact form for contact us page");
        Assertions.assertTrue(baseFunc.findElement(CONTACT_FORM).isDisplayed(), "contact form not displayed in contact us page");
        List<WebElement> placeholders = baseFunc.list(PLACEHOLDERS_TEXT).subList(2, 5);
        for (WebElement placeholder : placeholders) {
            String name = placeholder.getAttribute("placeholder");
            Assertions.assertTrue(name.length() > 0, "no name in placeholder field in contact us form");
        }
        String email = baseFunc.list(PLACEHOLDERS_EMAIL).get(2).getAttribute("placeholder");
        Assertions.assertTrue(email.length() > 0, "no email name in placeholder field in contact us form");
        Assertions.assertTrue(baseFunc.findElement(TEXT_AREA).getAttribute("placeholder").length() > 0, "no name of text area in contact us form");

        Assertions.assertTrue(baseFunc.findElement(CHECKBOX).isDisplayed(), "no checkbox in contact us form");
        Assertions.assertTrue(baseFunc.getTextOfElement(CHECKBOX_TEXT).length() > 0, "no text for checkbox in contact us form");
        return true;
    }

    public boolean isSubmitButtonEnabled() {
        LOGGER.info("Checking if submit button enabled for contact form for contact us page");
        Assertions.assertTrue(baseFunc.list(SUBMIT_BUTTONS).get(3).isEnabled(), "submit button is disabled in contact us form");
        return true;
    }

    public boolean isUsefulInfoBlockDisplayed() {
        LOGGER.info("Checking if useful info block displayed for contact form for contact us page");
        Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(USEFUL_INFO_BLOCKS_HEADERS) > 0, "No text header in useful information block in contact us page");
        List<WebElement> infoBlockLinks = baseFunc.list(USEFUL_INFO_BLOCKS_CONTACTS);
        Assertions.assertTrue(baseFunc.getTextOfElement(infoBlockLinks.get(0)).length() > 0, "no phone number in support info block");
        Assertions.assertTrue(baseFunc.getTextOfElement(infoBlockLinks.get(2)).length() > 0, "no phone number in travel request info block");
        Assertions.assertTrue(baseFunc.getTextOfElement(infoBlockLinks.get(4)).length() > 0, "no phone number in cooperation info block");

        String link1 = infoBlockLinks.get(1).getAttribute("href");
        if (link1 != null && !link1.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link1);
        }
        String link2 = infoBlockLinks.get(3).getAttribute("href");
        if (link1 != null && !link2.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link2);
        }
        String link3 = infoBlockLinks.get(5).getAttribute("href");
        if (link3 != null && !link1.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link3);
        }
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

    public void manageCookiesPreferencesModalOpen() {
        LOGGER.info("Opening manage cookies modal window");
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        baseFunc.click(menuButtons.get(2));
        WebElement manageCookiesPreferencesItem = baseFunc.list(DROP_DOWN_ELEMENTS).get(11);
        baseFunc.click(manageCookiesPreferencesItem);
    }
    public boolean isModalWindowDisplayedCorrect() {
        LOGGER.info("Checking is  manage cookies modal window displayed");
        baseFunc.waitElementToBeVisible(MODAL_WINDOW);
        baseFunc.switchTab(0);
        WebElement modalWindow = baseFunc.findElement(MODAL_WINDOW);
        if (modalWindow.isDisplayed()) {
            Assertions.assertTrue(baseFunc.getTextOfElement(MODAL_WINDOW_HEADER).length() > 0, "no header in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.getTextOfElement(MODAL_WINDOW_TEXT).length() > 0, "no text in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.list(MODAL_WINDOW_COOKIES_TYPES).size() > 0, "no information about cookies in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(COOKIE_LABELS) >0, "No cookie label in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(COOKIE_COUNTS) >0, "No cookie label in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(COOKIE_TEXT) >0, "No cookie label in 'cookie preferences' modal window");
            List<WebElement> cookiesTypes = baseFunc.list(MODAL_WINDOW_COOKIES_TYPES);
            for (WebElement cookieType : cookiesTypes) {
                baseFunc.click(COOKIE_DETAILS_LINKS);
                Assertions.assertTrue(baseFunc.getTextOfElement(COOKIE_DETAILS_HEADER).length() > 0, "no cookie header in detailed information in 'cookie preferences' modal window");
                List<WebElement> cookieTablesName = baseFunc.list(COOKIE_DETAILS_TABLES_NAME);
                for (WebElement cookieTableName : cookieTablesName) {
                    Assertions.assertTrue(baseFunc.getTextOfElement(cookieTableName).length() > 0, "no table name in detailed information in 'cookie preferences' modal window");
                }
                List<WebElement> cookieDetailsBodyInformation = baseFunc.list(COOKIE_DETAILS_BODY);
                for (WebElement cookieDetailBlock : cookieDetailsBodyInformation) {
                    Assertions.assertTrue(cookieDetailBlock.isDisplayed(), "table not displayed in detailed information in 'cookie preferences' modal window");
                }
                baseFunc.click(BACK_BUTTON);
            }
            Assertions.assertTrue(baseFunc.findElement(DECLINE_BUTTON).isEnabled(), "decline btn is disabled in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.findElement(ALLOW_BUTTON).isEnabled(), "allow btn is disabled in 'cookie preferences' modal window");

        } else {
            LOGGER.info("cookie preferences' modal window doesn't appears");
        }
        return true;
    }

    public void manageCookiesPreferencesModalClose() {
        LOGGER.info("Closing manage cookies modal window");
        baseFunc.click(CLOSE_MODAL_WINDOW_BUTTON);
    }
    public void closeBrowser () {
        baseFunc.closeBrowser();
    }
}
