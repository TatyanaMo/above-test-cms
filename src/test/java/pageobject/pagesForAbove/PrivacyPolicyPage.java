package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;
import java.util.List;

import static pageobject.pagesForAbove.Locators.PrivacyPolicyPageLocators.*;

public class PrivacyPolicyPage {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;
    public PrivacyPolicyPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void logoInHeader() {
        LOGGER.info("Checking logo in header for Privacy policy page");
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
        LOGGER.info("Checking presence of tittle for privacy policy page");
        Assertions.assertTrue(baseFunc.getTextOfElement(TITTLE).length() > 0, "No tittle on terms of use page");
    }

    public boolean isTextDisplayed() {
        LOGGER.info("Checking presence of main text for privacy policy page");
        Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(TEXT_TITTLES) > 0, "No text tittle on terms of use page");
        Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(TEXT) > 0, "No text on terms of use page");
        Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(TEXT_LIST) > 0, "No text list on terms of use page");
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
        return true;
    }

    public boolean isFooterLinksOpen() {
        LOGGER.info("Checking if footer links successfully open except About us link");
        baseFunc.footerLinksOpenWithException(FOOTER_LINKS, 2, TITTLE);
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

    public void openCookiesPolicyPage() {
        LOGGER.info("Opening next page - Cookies policy");
        baseFunc.openNextPage(DROP_DOWN_BUTTONS, DROP_DOWN_ELEMENTS, 2,9);
    }
}
