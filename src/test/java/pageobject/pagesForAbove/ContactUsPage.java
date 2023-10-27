package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;
import java.util.List;

import static pageobject.pagesForAbove.Locators.ContactUsPageLocators.*;
import static pageobject.pagesForAbove.Locators.PrivacyPolicyPageLocators.IFRAME_FACEBOOK_CLOSE_CHAT_BTN;

public class ContactUsPage {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;
    public ContactUsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void logoInHeader() {
        LOGGER.info("Checking logo in header for Contact us page");
        baseFunc.checkLogoInHeader(HEADER_LOGO);
    }

    public boolean isReviewLinkAppearsInHeader() {
        LOGGER.info("Checking Trustpilot link in header");
        baseFunc.switchIframeIndex(0);
        baseFunc.linksStatusCheck(baseFunc.findElement(REVIEW_HEADER_LINK).getAttribute("href"));
        baseFunc.switchToMainPage();
        return true;
    }

    public boolean isPhoneNumberLinkWorkInHeader() {
        LOGGER.info("Checking phone number in header");
        baseFunc.checkPhoneNumberLinkInHeader(PHONE);
        return true;
    }
    public void checkDropDownMenu() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        baseFunc.isDropDownMenuOpen(DROP_DOWN_BUTTONS,LOG_IN_BUTTON,CREATE_PROFILE_BUTTON,DROP_DOWN_ELEMENTS);
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
        LOGGER.info("Checking presence of tittle for contact us page");
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
        baseFunc.scrollToTheBottom();
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
