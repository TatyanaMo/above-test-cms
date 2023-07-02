package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class PrivacyPolicyPage {
    private final By FACEBOOK_IFRAME = By.xpath(".//div[@class='welcomePageModalSheetContent']");
    private final By FACEBOOK_BTN = By.xpath(".//iframe[@name='blank_f1ec71e7392dea8']");
    private final By IFRAME_HEADER = By.xpath(".//div[@class='_4ik4 _4ik5']");
    private final By IFRAME_TEXT = By.xpath(".//div[@class='_a2zt _a6s6 _4ik4 _4ik5']");
    private final By CLOSE_CHAT_BTN = By.xpath(".//div[@aria-label='close']");
    private final By START_CHAT_BTN = By.xpath(".//span[@class = 'continueText _4mr9 _6i6a']");

    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@src='https://staging.above9.travel/img/trustpilot-light.svg']");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[@class='h-full flex items-center space-x-2 px-2 py-1 font-medium rounded appearance-none transition-colors focus:outline-none hover:bg-black hover:bg-opacity-10 focus:bg-black focus:bg-opacity-25 focus:text-white']");
    private final By LOG_IN_BUTTON = By.xpath(".//button[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");

    private final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    private final By MODAL_INPUT_FIELDS = By.xpath(".//div[@class='space-y-4']/div/div/div/input");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By MODAL_WINDOW_BUTTONS = By.xpath(".//div[@class='pt-6 -mx-2 flex items-baseline flex-wrap justify-between']/span/button");
    private final By CLOSE_BUTTONS = By.xpath(".//span[@class='absolute right-4 top-4 lg:right-0 lg:top-0']/button");
    private final By SIGN_UP_MODAL_WINDOW = By.id("register-title");

    private final By TRUSTPILOT_ABOVE_TITTLE = By.xpath(".//span[@class='typography_display-s__qOjh6 typography_appearance-default__AAY17 title_displayName__TtDDM']");
    private final By TEXT_TITTLES = By.xpath(".//div[@class='py-16 container rich-content']/h2");
    private final By TEXT = By.xpath(".//div[@class='py-16 container rich-content']/p");
    private final By TEXT_LIST = By.xpath(".//div[@class='py-16 container rich-content']/ul");
    private final By LINKS_IN_TEXT = By.xpath(".//div[@class='py-16 container rich-content']/p/a");
    private final By LINKS_IN_LISTS = By.xpath(".//div[@class='py-16 container rich-content']/ul/li/a");
    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//li[@class='w-9 md:w-12']/img");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public PrivacyPolicyPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean isLogoAppearsInHeader() {
        LOGGER.info("Checking logo in header for privacy policy page");
        baseFunc.findElement(HEADER_LOGO);
        return true;
    }
    public boolean isReviewLinkAppearsInHeader() {
        LOGGER.info("Checking Trustpilot link in header for homepage");
        baseFunc.checkReviewLinkInHeader(REVIEW_HEADER_LINK,REVIEW_IMG,REVIEW_HEADER_LINK,TRUSTPILOT_ABOVE_TITTLE );
        return true;
    }
    public boolean isPhoneNumberLinkWorkInHeader() {
        LOGGER.info("Checking phone number in header");
        baseFunc.checkPhoneNumberLinkInHeader(PHONE);
        return true;
    }
    public boolean isDropDownMenuOpen() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        baseFunc.click(menuButtons.get(0));
        Assertions.assertTrue(baseFunc.findElement(LOG_IN_BUTTON).isEnabled(), "button is disabled");
        Assertions.assertTrue(baseFunc.findElement(CREATE_PROFILE_BUTTON).isEnabled(), "button is disabled");

        menuButtons.get(1).click();
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS, 5);
        List<WebElement> currencies = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("USD", baseFunc.getTextOfElement(currencies.get(0)), "wrong currency");
        Assertions.assertEquals("EUR", baseFunc.getTextOfElement(currencies.get(1)), "wrong currency");
        Assertions.assertEquals("CAD", baseFunc.getTextOfElement(currencies.get(2)), "wrong currency");
        Assertions.assertEquals("AUD", baseFunc.getTextOfElement(currencies.get(3)), "wrong currency");
        Assertions.assertEquals("GBP", baseFunc.getTextOfElement(currencies.get(4)), "wrong currency");

        baseFunc.click(menuButtons.get(2));
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS, 5);
        List<WebElement> submenuItems = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("About Us", baseFunc.getTextOfElement(submenuItems.get(5)), "No submenu item");
        Assertions.assertEquals("Blog", baseFunc.getTextOfElement(submenuItems.get(6)), "No submenu item");
        Assertions.assertEquals("Terms Of Use", baseFunc.getTextOfElement(submenuItems.get(7)), "No submenu item");
        Assertions.assertEquals("Privacy Policy", baseFunc.getTextOfElement(submenuItems.get(8)), "No submenu item");
        Assertions.assertEquals("Cookies Policy", baseFunc.getTextOfElement(submenuItems.get(9)), "No submenu item");
        Assertions.assertEquals("Contact us", baseFunc.getTextOfElement(submenuItems.get(10)), "No submenu item");
        Assertions.assertEquals("Manage cookie preferences", baseFunc.getTextOfElement(submenuItems.get(11)), "No submenu item");
        baseFunc.click(menuButtons.get(2));
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
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(0));
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
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUBMIT_BUTTONS).get(1)).length() > 0, "Sign in button hasn't name in login modal window");
        Assertions.assertTrue(baseFunc.list(MODAL_WINDOW_BUTTONS).get(2).isEnabled(), "Button is disabled in Sign up modal window");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(MODAL_WINDOW_BUTTONS).get(2)).length() > 0, "Button hasn't name in Sign up modal window");
        return true;
    }

    public void signUpModalClose() {
        LOGGER.info("Closing sign up modal window");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(1));
    }

    public void getTittle() {
        LOGGER.info("Checking presence of tittle for privacy policy page");
        Assertions.assertTrue(baseFunc.getTextOfElement(TITTLE).length() > 0, "No tittle on terms of use page");
    }

    public boolean isTextDisplayed() {
        LOGGER.info("Checking presence of main text for privacy policy page");
        List<WebElement> tittles = baseFunc.list(TEXT_TITTLES);
        List<WebElement> texts = baseFunc.list(TEXT);
        List<WebElement> lists = baseFunc.list(TEXT_LIST);
        for (WebElement tittle : tittles) {
            Assertions.assertTrue(baseFunc.getTextOfElement(tittle).length() > 0, "no text tittle on terms of use page");
        }
        for (WebElement text : texts) {
            Assertions.assertTrue(baseFunc.getTextOfElement(text).length() > 0, "no text on terms of use page");
        }
        for (WebElement list : lists) {
            Assertions.assertTrue(baseFunc.getTextOfElement(list).length() > 0, "no text list on terms of use page");
        }
        return true;
    }

    public boolean isLinksWorksInText() {
        LOGGER.info("Ckecking if links on page in text return status 200 for privacy policy page");
        List<WebElement> textLinks = baseFunc.list(LINKS_IN_TEXT);
        for (WebElement textLink : textLinks) {
            String textLinkHref = textLink.getAttribute("href");
            if (textLinkHref != null && !textLinkHref.startsWith("mailto:")) {
                baseFunc.linksStatusCheck(textLinkHref);
            }
        }
        List<WebElement> listLinks = baseFunc.list(LINKS_IN_LISTS);
        for (WebElement listLink : listLinks) {
            String listLinkHref = listLink.getAttribute("href");
            if (listLinkHref != null && !listLinkHref.startsWith("mailto:")) {
                baseFunc.linksStatusCheck(listLinkHref);
            }
        }
        return true;
    }
    public void switchAndCloseIframeFacebook() {
        LOGGER.info("Switching to and closing Facebook iframe dialog in privacy policy page");
        baseFunc.switchIframeIndex(0);
        baseFunc.click(CLOSE_CHAT_BTN);
        baseFunc.switchToMainPage();
    }

    public boolean isFooterLinksOpen() {
        LOGGER.info("Checking if footer links successfully open except About us link");
        baseFunc.footerLinksOpenWithException(FOOTER_LINKS, 2, TITTLE);
        return true;
    }
    public boolean isPhoneNumberLinkWorkInFooter() {
        LOGGER.info("Phone number displayed in footer");
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        Assertions.assertTrue(phonesLInks.get(1).getAttribute("href").length() > 0, "no phone number");
        return true;
    }
    public boolean isEmailLinkWorkInFooter() {
        LOGGER.info("Email link in footer returns status 200 for privacy policy page");
        List<WebElement> email = baseFunc.list(EMAIL_LINK_IN_FOOTER);
        String link = email.get(1).getAttribute("href");
        if (link != null && !link.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(email.get(1)).length() > 0, "no phone number");
        return true;
    }
    public boolean isPaymentsDisplayed() {
        LOGGER.info("Checking if payment info displayed in footer");
        Assertions.assertTrue(baseFunc.isPaymentsDisplayed(PAYMENTS),"No payments in footer" );
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
    public void openCookiesPolicyPage() {
        LOGGER.info("Opening next page - Cookies policy");
        baseFunc.openNextPage(DROP_DOWN_BUTTONS,DROP_DOWN_ELEMENTS, 2 );
    }
}
