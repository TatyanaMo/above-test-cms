package pageobject.pagesForAbove.mobile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;
import java.util.List;

import static pageobject.pagesForAbove.LocatorsMobile.MobileUserProfilePageLocators.*;

public class MobileUserProfilePage {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public MobileUserProfilePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void logoInHeader() {
        LOGGER.info("Checking logo in header for User profile page");
        baseFunc.checkLogoInHeader(HEADER_LOGO);
    }
    public void checkDropDownMenu() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        baseFunc.isDropDownMenuOpenMobile(DROP_DOWN_BUTTONS, MY_PROFILE_BUTTON, LOG_OUT_BUTTON, DROP_DOWN_ELEMENTS, CLOSE_BUTTONS);
    }

    public boolean isMyProfileTittleDisplayed() {
        LOGGER.info("Checking tittle in My profile page");
        Assertions.assertTrue(baseFunc.getTextOfElement(MY_PROFILE_TITTLE).length() > 0, "No tittle in My profile page");
        return true;
    }

    public boolean isMyProfileOptionsDisplayed() {
        LOGGER.info("Checking all options in My profile page");
        List<WebElement> options = baseFunc.list(MY_PROFILE_OPTIONS);
        for (WebElement option : options) {
            Assertions.assertEquals(4, options.size(), "Not all options displayed in My profile page");
            Assertions.assertTrue(baseFunc.getTextOfElement(option).length() > 0, "No text in my profile option");
        }

        return true;
    }
    public boolean isPersonalInfoBlockElementsDisplayed() {
        LOGGER.info("Check placeholders names and text in input fields in personal info block");
        WebElement personalInfoBlock = baseFunc.findElement(PERSONAL_INFO_BLOCK);
        Assertions.assertTrue(personalInfoBlock.isDisplayed(), "Personal info block not displayed in My profile page");
        Assertions.assertTrue(personalInfoBlock.findElement(SECTIONS_TITTLE).isDisplayed(), "Personal info block tittle not displayed in My profile page");
        List<WebElement> personalInfoFieldsName = personalInfoBlock.findElements(PERSONAL_INFO_FIELDS_NAMES);
        for (WebElement name : personalInfoFieldsName) {
            Assertions.assertTrue(baseFunc.getTextOfElement(name).length() > 0, "No names in input fields in personal info block");
        }
        List<WebElement> personalInfoPlaceholders = baseFunc.list(PERSONAL_INFO_PLACEHOLDERS);
        for (int i = 0; i < personalInfoPlaceholders.size(); i++) {
            if (i == 5) {
                continue;
            }
            if (personalInfoPlaceholders.get(i).getAttribute("value").length() == 0) {
                continue;
            }
            Assertions.assertTrue(personalInfoPlaceholders.get(i).getAttribute("placeholder").length() > 0, "No default text in placeholders in personal info block");
            Assertions.assertTrue(personalInfoPlaceholders.get(i).getAttribute("value").length() > 0, "No entered text in input fields in personal info block");
        }
        LOGGER.info("Check gender radio buttons");
        List<WebElement> radioButtons = personalInfoBlock.findElements(GENDER_RADIO_BUTTONS);
        for (WebElement radioButton : radioButtons) {
            Assertions.assertTrue(radioButton.isEnabled(), "Gender radio button is disabled in personal info block");
        }
        List<WebElement> buttonsNames = personalInfoBlock.findElements(GENDER_RADIO_BUTTON_NAMES);
        for (WebElement buttonName : buttonsNames) {
            Assertions.assertTrue(baseFunc.getTextOfElement(buttonName).length() > 0, "No buttons names for gender radio buttons in personal info block");
        }
        LOGGER.info("Check nationality dropdown lists");
        List<WebElement> choicesOptions = personalInfoBlock.findElements(CHOICES_FIELDS);
        baseFunc.click(choicesOptions.get(0));
        baseFunc.waitForElementAttributeToBeNew(personalInfoBlock.findElements(DROPDOWN_LISTS).get(0), "class", "choices__list choices__list--dropdown is-active");
        List<WebElement> choicesLists = personalInfoBlock.findElements(DROPDOWN_LISTS).get(0).findElements(CHOICES_LISTS);
        Assertions.assertTrue(choicesLists.size() > 0, "No nationalities in choices list in personal info block");
        baseFunc.scrollToTheBottom();
        baseFunc.click(baseFunc.list(CHOICES_LIST_CLOSE_BUTTON).get(0));
        LOGGER.info("Check country phone codes dropdown lists");
        baseFunc.click(choicesOptions.get(1));
        baseFunc.waitForElementAttributeToBeNew(personalInfoBlock.findElements(DROPDOWN_LISTS).get(1), "class", "choices__list choices__list--dropdown is-active");
        List<WebElement> choicesListsCodes = personalInfoBlock.findElements(DROPDOWN_LISTS).get(1).findElements(CHOICES_LISTS);
        Assertions.assertTrue(choicesListsCodes.size() > 0, "No country phone codes in choices list in personal info block");
        baseFunc.click(baseFunc.list(CHOICES_LIST_CLOSE_BUTTON).get(1));
        LOGGER.info("Check save button");
        Assertions.assertTrue(personalInfoBlock.findElement(SUBMIT_BUTTONS).isDisplayed() && personalInfoBlock.findElement(SUBMIT_BUTTONS).isEnabled(), "Save button is disabled in personal info block");
        return true;
    }
    public boolean isInfoBlockElementsDisplayed() {
        LOGGER.info("Check text in info block");
        Assertions.assertTrue(baseFunc.getTextOfElement(INFO_BLOCK_TEXT).length() > 0, "No text in info block in profile page");
        LOGGER.info("Check general line contact in info block");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(INFO_BLOCK_SUB_TITTLES).get(0)).length() > 0, "No tittle in general line section in info block");
        List<WebElement> generalLineImages = baseFunc.findElement(INFO_BLOCK_GENERAL_LINE_SECTION).findElements(INFO_BLOCK_IMAGES);
        for (WebElement image : generalLineImages) {
            Assertions.assertTrue(image.isDisplayed(), "No image in general line section in info block");
        }
        List<WebElement> generalLineLinks = baseFunc.findElement(INFO_BLOCK_GENERAL_LINE_SECTION).findElements(INFO_BLOCK_CONTACT_LINKS);
        Assertions.assertTrue(generalLineLinks.get(0).getAttribute("href").length() > 0, "No phone number in general line section in info block");
        String generalEmailLink = generalLineLinks.get(1).getAttribute("href");
        Assertions.assertTrue(baseFunc.getTextOfElement(generalLineLinks.get(1)).length() > 0, "No email in general line section in info block");
        if (generalEmailLink != null && !generalEmailLink.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(generalEmailLink);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(generalLineLinks.get(1)).length() > 0, "No email");
        LOGGER.info("Check agent contact in info block");
        try {
            Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(INFO_BLOCK_SUB_TITTLES).get(1)).length() > 0, "No tittle in agent section in info block");
            List<WebElement> agentImages = baseFunc.findElement(INFO_BLOCK_AGENT_SECTION).findElements(INFO_BLOCK_IMAGES);
            for (WebElement image : agentImages) {
                Assertions.assertTrue(image.isDisplayed(), "No image in agent section in info block");
            }
            List<WebElement> agentLinks = baseFunc.findElement(INFO_BLOCK_AGENT_SECTION).findElements(INFO_BLOCK_CONTACT_LINKS);
            Assertions.assertTrue(agentLinks.get(0).getAttribute("href").length() > 0, "No phone number in agent section in info block");
            String agentEmailLink = agentLinks.get(1).getAttribute("href");
            Assertions.assertTrue(baseFunc.getTextOfElement(agentLinks.get(1)).length() > 0, "No email in agent section in info block");
            if (agentEmailLink != null && !agentEmailLink.startsWith("mailto:")) {
                baseFunc.linksStatusCheck(agentEmailLink);
            }
            Assertions.assertTrue(baseFunc.getTextOfElement(agentLinks.get(1)).length() > 0, "No email");
        } catch (IndexOutOfBoundsException e) {
            LOGGER.info("No agent contact in info block for new client");
        }
        return true;
    }

    public void checkUpcomingFlightsBlock() {
        LOGGER.info("Check upcoming flight block");
        isBlockElementsDisplayed(USER_PROFILE_OPTIONS, 1, UPCOMING_FLIGHT_BLOCK, BLOCK_ELEMENTS,SECTIONS_TITTLE,FLIGHTS_INFO_ROUTES, FLIGHTS_OTHER_INFO, ALERT_MESSAGES);
        WebElement upcomingFlightBlock = baseFunc.findElement(UPCOMING_FLIGHT_BLOCK);
        List<WebElement> flightsList = upcomingFlightBlock.findElements(BLOCK_ELEMENTS);
        if (flightsList.size() > 0) {
            Assertions.assertTrue(baseFunc.getTextOfElement(FLIGHT_COUNTER).length() > 0, "No flight counter for upcoming flight");
        }
    }
    public void checkPurchaseHistoryBlockElementsDisplayed() {
        LOGGER.info("Check Purchase history block");
        isBlockElementsDisplayed(USER_PROFILE_OPTIONS, 2, PURCHASE_HISTORY_BLOCK,BLOCK_ELEMENTS, SECTIONS_TITTLE, FLIGHTS_INFO_ROUTES, FLIGHTS_OTHER_INFO, ALERT_MESSAGES);
    }

    public boolean isCoTravelersBlockElementsDisplayed() {
        LOGGER.info("Check Co-travelers block");
        baseFunc.click(baseFunc.list(USER_PROFILE_OPTIONS).get(3));
        baseFunc.waitForElementAttributeToBeNew(baseFunc.list(USER_PROFILE_OPTIONS).get(3), "class", "-mx-4" +
                " group relative px-4 py-2 font-medium hover:text-orange-400 focus:outline-none focus:text-orange-400 is-active:text-orange-400 is-active");
        WebElement coTravelersBlock = baseFunc.findElement(CO_TRAVELERS_BLOCK);
        List<WebElement> coTravelerCards = coTravelersBlock.findElements(CO_TRAVELER_CARDS);
        if (coTravelerCards.size() > 0) {
            for (WebElement card : coTravelerCards) {
                Assertions.assertTrue(baseFunc.getTextOfElement(card.findElement(CO_TRAVELER_CARDS_TITTLE)).length() > 0, "No co-traveler card tittle");
                Assertions.assertTrue(card.findElement(CO_TRAVELER_CARDS_DELETE_BUTTON).isDisplayed(), "No delete button in co-traveler card");
                List<WebElement> inputFields = card.findElements(CO_TRAVELER_CARDS_INPUT_FIELDS);
                Assertions.assertEquals(4, inputFields.size(), "No all input fields presented in co-traveler card");
                for (WebElement inputField :inputFields) {
                    Assertions.assertTrue(inputField.getAttribute("placeholder").length() > 0 , "No placeholder names for input fields in co-traveler card");

                    if (inputField.getAttribute("value").length() == 0) {
                        continue;
                    }
                    Assertions.assertTrue(inputField.getAttribute("value").length() > 0, "No entered text in input fields in co-traveler card");
                }
                LOGGER.info("Check gender radio buttons");
                List<WebElement> radioButtons = card.findElements(GENDER_RADIO_BUTTONS);
                for (WebElement radioButton : radioButtons) {
                    Assertions.assertTrue(radioButton.isEnabled(), "Gender radio button is disabled in co-travelers block");
                }
                List<WebElement> buttonsNames = card.findElements(GENDER_RADIO_BUTTON_NAMES);
                for (WebElement buttonName : buttonsNames) {
                    Assertions.assertTrue(baseFunc.getTextOfElement(buttonName).length() > 0, "No buttons names for gender radio buttons in co-travelers block");
                }
                LOGGER.info("Check nationality dropdown lists");
                WebElement choicesOption = card.findElement(CHOICES_FIELDS);
                baseFunc.click(choicesOption);
                baseFunc.waitForElementAttributeToBeNew(card.findElements(DROPDOWN_LISTS).get(0), "class", "choices__list choices__list--dropdown is-active");
                List<WebElement> choicesLists = card.findElements(DROPDOWN_LISTS).get(0).findElements(CHOICES_LISTS);
                Assertions.assertTrue(choicesLists.size() > 0, "No nationalities in choices list in co-travelers block");
                baseFunc.click(choicesOption);
            }
        } else {
            LOGGER.info("If no Co-Travelers cards, check the information text");
            try {
                WebElement alertMessage = coTravelersBlock.findElement(ALERT_MESSAGES);
                Assertions.assertTrue(baseFunc.getTextOfElement(alertMessage).length() > 0, "No alert message in empty co-traveler block");
            } catch(NoSuchElementException e) {
                LOGGER.info("No co-traveler cards");
            }
        }
        LOGGER.info("Check add co-traveler button");
        WebElement addCoTravelerButton = coTravelersBlock.findElement(ADD_CO_TRAVELER_BUTTON);
        baseFunc.click(addCoTravelerButton);
        List<WebElement> updatedCoTravelerCards = baseFunc.list(CO_TRAVELER_CARDS);
        Assertions.assertEquals(coTravelerCards.size()+1, updatedCoTravelerCards.size(), "New co-traveler card not added to co-travelers cards");
        int updatedCoTravelersList = updatedCoTravelerCards.size();
        int lastIndex = updatedCoTravelersList - 1;
        WebElement lastElement = updatedCoTravelerCards.get(lastIndex);
        baseFunc.click(lastElement.findElement(CO_TRAVELER_CARDS_DELETE_BUTTON));
        Assertions.assertTrue(baseFunc.getTextOfElement(coTravelersBlock.findElements(INFO_TEXT).get(lastIndex)).length() > 0 , "No info text about deleted co-traveler card");
        Assertions.assertTrue(coTravelersBlock.findElements(UNDO_BUTTONS).get(lastIndex).isDisplayed(), "No undo button for deleted co-traveler card");
        LOGGER.info("Check save button");
        Assertions.assertTrue(coTravelersBlock.findElement(SUBMIT_BUTTONS).isDisplayed() && coTravelersBlock.findElement(SUBMIT_BUTTONS).isEnabled(), "Save button is disabled in co-travelers block");
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


    public boolean isBlockElementsDisplayed(By LocatorOne, int index, By locatorTwo, By locatorThree, By locatorFour, By locatorFive, By locatorSix, By locatorSeven) {
        LOGGER.info("Check profile page block");
        baseFunc.click(baseFunc.list(LocatorOne).get(index));
        baseFunc.waitForElementAttributeToBeNew(baseFunc.list(LocatorOne).get(index), "class", "-mx-4" +
                " group relative px-4 py-2 font-medium rounded hover:text-orange-400 focus:outline-none focus:text-orange-400 is-active:text-orange-400 is-active");
        LOGGER.info("Check if list of elements is presented");
        WebElement block = baseFunc.findElement(locatorTwo);
        List<WebElement> elementsList = block.findElements(locatorThree);
        if (elementsList.size() > 0) {
            Assertions.assertTrue(block.findElement(locatorFour).isDisplayed(), "Block tittle not displayed in My profile page");
            for (WebElement element : elementsList) {
                Assertions.assertTrue(baseFunc.getTextOfElement(element.findElement(locatorFive)).length() > 0, "Routes of flights not displayed");
                Assertions.assertTrue(baseFunc.getTextOfElement(element.findElement(locatorSix)).length() > 0, "Details of flights not displayed");
            }
        } else {
            LOGGER.info("If elements list, check the information text");
            try {
                WebElement alertMessage = block.findElement(locatorSeven);
                Assertions.assertTrue(baseFunc.getTextOfElement(alertMessage).length() > 0, "No alert message in empty block");
            } catch (NoSuchElementException e) {
                LOGGER.info("No alert message");
            }
        }
        return true;
    }
    public void closeBrowser () {
        baseFunc.closeBrowser();
    }
}
