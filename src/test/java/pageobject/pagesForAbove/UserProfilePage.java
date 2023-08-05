package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserProfilePage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@class='-mt-1 w-20 md:w-28 h-6']");
    private final By TRUSTPILOT_ABOVE_TITTLE = By.xpath(".//span[contains(@class, 'title_displayName__TtDDM')]");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    private final By MY_PROFILE_BUTTON = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By LOG_OUT_BUTTON = By.xpath(".//form[@action='https://staging.above9.travel/logout']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    private final By MY_PROFILE_TITTLE = By.xpath(".//h2[@class='text-xl lg:text-2xl font-medium']");
    private final By MY_PROFILE_OPTIONS = By.xpath(".//li[@class='flex-shrink-0']");
    private final By PERSONAL_INFO_BLOCK = By.xpath(".//div[@data-tab='personal-info']");
    private final By PERSONAL_INFO_FIELDS_NAMES = By.xpath(".//legend[@class='text-xs text-gray-500 cursor-default']");
    private final By PERSONAL_INFO_PLACEHOLDERS = By.xpath(".//input[contains(@class,'appearance-none block h-10 leading-8 px-0 py-1 w-full text-sm rounded-none')]");
    private final By GENDER_RADIO_BUTTONS = By.xpath(".//input[@type='radio']");
    private final By GENDER_RADIO_BUTTON_NAMES = By.xpath(".//span[@class='pl-3 font-medium leading-5 cursor-pointer after-disabled:cursor-default ']");
    private final By CHOICES_FIELDS = By.xpath(".//div[@class='choices__inner']");
    private final By DROPDOWN_LISTS = By.xpath(".//div[contains(@class,'choices__list choices__list--dropdown')]");
    private final By CHOICES_LISTS = By.xpath(".//div[contains(@class,'choices__item choices__item--choice choices__item--selectable')]");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By SIDE_INFO_BLOCK_TEXT = By.xpath(".//div[@class='sticky top-8 bg-white border rounded p-6 leading-5 space-y-4 break-words']/p");
    private final By SIDE_INFO_BLOCK_SUB_TITTLES = By.xpath(".//p[@class='font-semibold']");
    private final By SIDE_INFO_BLOCK_CONTACT_LINKS = By.xpath(".//a[@class='text-orange-400 hover:underline hover:text-orange-500']");
    private final By SIDE_INFO_BLOCK_GENERAL_LINE_SECTION = By.xpath(".//ul[@class='pt-3 pl-3 space-y-1 break-all']");
    private final By SIDE_INFO_BLOCK_IMAGES = By.xpath(".//*[name()='svg' and contains(@class, 'w-4 h-4 text-orange-400')]");
    private final By SIDE_INFO_BLOCK_AGENT_SECTION = By.xpath(".//ul[@class='pt-3 pl-3 space-y-1']");
    private final By USER_PROFILE_OPTIONS = By.xpath(".//a[@data-toggle='tab']");
    private final By FLIGHT_COUNTER = By.xpath(".//b[contains(@class,'ml-0.5 px-2 leading-4 inline-block rounded-full')]");
    private final By UPCOMING_FLIGHT_BLOCK = By.xpath(".//div[@data-tab='upcoming-flights']");
    private final By BLOCK_ELEMENTS = By.xpath(".//button[@data-toggle='slide']");
    private final By ALERT_MESSAGES = By.xpath(".//div[contains(@class,'border rounded bg-white flex items-center text-sm ')]");
    private final By SECTIONS_TITTLE = By.xpath(".//h2[@class='text-base font-medium flex-grow flex items-center']");
    private final By FLIGHTS_INFO_ROUTES = By.xpath(".//span[@class='block sm:inline']");
    private final By FLIGHTS_OTHER_INFO = By.xpath(".//span[@class='flex items-center space-x-2 text-sm text-gray-500']/span");
    private final By PURCHASE_HISTORY_BLOCK = By.xpath(".//div[@data-tab='purchase-history']");
    private final By CO_TRAVELERS_BLOCK = By.xpath(".//div[@data-tab='co-travellers']");
    private final By CO_TRAVELER_CARDS = By.xpath(".//div[@class='rounded-lg shadow-sides-bottom-black']");
    private final By CO_TRAVELER_CARDS_TITTLE = By.xpath(".//h2[@class='text-base font-medium flex-grow flex items-center']/span");
    private final By CO_TRAVELER_CARDS_DELETE_BUTTON = By.xpath(".//button[@aria-label='Delete']");
    private final By CO_TRAVELER_CARDS_INPUT_FIELDS = By.xpath(".//div[@class='relative  min-h-10 group-invalid:pr-7 ']/input");
    private final By ADD_CO_TRAVELER_BUTTON = By.xpath(".//button[contains(@class,' focus:outline-none focus:ring-2 focus:border-orange-300')]");
    private final By INFO_TEXT = By.xpath(".//div[@class='flex items-center flex-grow break-words']/p");
    private final By UNDO_BUTTONS = By.xpath(".//button[contains(@class,'hover:bg-orange-200 text-orange-500 hover:text-orange-600 rounded')]");
    private final By IFRAME_FACEBOOK_CLOSE_CHAT_BTN = By.xpath(".//div[@aria-label='close']");
    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    private final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");


    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public UserProfilePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void logoInHeader() {
        LOGGER.info("Checking logo in header for User profile page");
        baseFunc.checkLogoInHeader(HEADER_LOGO);
    }

    public boolean isReviewLinkAppearsInHeader() {
        LOGGER.info("Checking Trustpilot link in header for User profile page");
        baseFunc.checkReviewLinkInHeader(REVIEW_HEADER_LINK, REVIEW_IMG, REVIEW_HEADER_LINK, TRUSTPILOT_ABOVE_TITTLE);
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
        Assertions.assertTrue(baseFunc.findElement(MY_PROFILE_BUTTON).isEnabled(), "button is disabled");
        Assertions.assertTrue(baseFunc.findElement(LOG_OUT_BUTTON).isEnabled(), "button is disabled");
        menuButtons.get(1).click();
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS, 5);
        List<WebElement> currencies = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("USD", baseFunc.getTextOfElement(currencies.get(1)), "wrong currency");
        Assertions.assertEquals("EUR", baseFunc.getTextOfElement(currencies.get(2)), "wrong currency");
        Assertions.assertEquals("CAD", baseFunc.getTextOfElement(currencies.get(3)), "wrong currency");
        Assertions.assertEquals("AUD", baseFunc.getTextOfElement(currencies.get(4)), "wrong currency");
        Assertions.assertEquals("GBP", baseFunc.getTextOfElement(currencies.get(5)), "wrong currency");
        baseFunc.click(menuButtons.get(2));
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS, 5);
        List<WebElement> submenuItems = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("About Us", baseFunc.getTextOfElement(submenuItems.get(6)), "No submenu item");
        Assertions.assertEquals("Blog", baseFunc.getTextOfElement(submenuItems.get(7)), "No submenu item");
        Assertions.assertEquals("Terms Of Use", baseFunc.getTextOfElement(submenuItems.get(8)), "No submenu item");
        Assertions.assertEquals("Privacy Policy", baseFunc.getTextOfElement(submenuItems.get(9)), "No submenu item");
        Assertions.assertEquals("Cookies Policy", baseFunc.getTextOfElement(submenuItems.get(10)), "No submenu item");
        Assertions.assertEquals("Contact us", baseFunc.getTextOfElement(submenuItems.get(11)), "No submenu item");
        Assertions.assertEquals("Manage cookie preferences", baseFunc.getTextOfElement(submenuItems.get(12)), "No submenu item");
        baseFunc.click(menuButtons.get(2));
        return true;
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
        LOGGER.info("Check country phone codes dropdown lists");
        baseFunc.click(choicesOptions.get(1));
        baseFunc.waitForElementAttributeToBeNew(personalInfoBlock.findElements(DROPDOWN_LISTS).get(1), "class", "choices__list choices__list--dropdown is-active");
        List<WebElement> choicesListsCodes = personalInfoBlock.findElements(DROPDOWN_LISTS).get(1).findElements(CHOICES_LISTS);
        Assertions.assertTrue(choicesListsCodes.size() > 0, "No country phone codes in choices list in personal info block");
        baseFunc.click(choicesOptions.get(1));
        LOGGER.info("Check save button");
        Assertions.assertTrue(personalInfoBlock.findElement(SUBMIT_BUTTONS).isDisplayed() && personalInfoBlock.findElement(SUBMIT_BUTTONS).isEnabled(), "Save button is disabled in personal info block");
        return true;
    }

    public boolean isSideInfoBlockElementsDisplayed() {
        LOGGER.info("Check text in side info block");
        Assertions.assertTrue(baseFunc.getTextOfElement(SIDE_INFO_BLOCK_TEXT).length() > 0, "No text in side info block in profile page");
        LOGGER.info("Check general line contact in side info block");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SIDE_INFO_BLOCK_SUB_TITTLES).get(0)).length() > 0, "No tittle in general line section in side info block");
        List<WebElement> generalLineImages = baseFunc.findElement(SIDE_INFO_BLOCK_GENERAL_LINE_SECTION).findElements(SIDE_INFO_BLOCK_IMAGES);
        for (WebElement image : generalLineImages) {
            Assertions.assertTrue(image.isDisplayed(), "No image in general line section in side info block");
        }
        List<WebElement> generalLineLinks = baseFunc.findElement(SIDE_INFO_BLOCK_GENERAL_LINE_SECTION).findElements(SIDE_INFO_BLOCK_CONTACT_LINKS);
        Assertions.assertTrue(generalLineLinks.get(0).getAttribute("href").length() > 0, "No phone number in general line section in side info block");
        String generalEmailLink = generalLineLinks.get(1).getAttribute("href");
        Assertions.assertTrue(baseFunc.getTextOfElement(generalLineLinks.get(1)).length() > 0, "No email in general line section in side info block");
        if (generalEmailLink != null && !generalEmailLink.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(generalEmailLink);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(generalLineLinks.get(1)).length() > 0, "No email");
        LOGGER.info("Check agent contact in side info block");
        try {
            Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SIDE_INFO_BLOCK_SUB_TITTLES).get(1)).length() > 0, "No tittle in agent section in side info block");
            List<WebElement> agentImages = baseFunc.findElement(SIDE_INFO_BLOCK_AGENT_SECTION).findElements(SIDE_INFO_BLOCK_IMAGES);
            for (WebElement image : agentImages) {
                Assertions.assertTrue(image.isDisplayed(), "No image in agent section in side info block");
            }
            List<WebElement> agentLinks = baseFunc.findElement(SIDE_INFO_BLOCK_AGENT_SECTION).findElements(SIDE_INFO_BLOCK_CONTACT_LINKS);
            Assertions.assertTrue(agentLinks.get(0).getAttribute("href").length() > 0, "No phone number in agent section in side info block");
            String agentEmailLink = agentLinks.get(1).getAttribute("href");
            Assertions.assertTrue(baseFunc.getTextOfElement(agentLinks.get(1)).length() > 0, "No email in agent section in side info block");
            if (agentEmailLink != null && !agentEmailLink.startsWith("mailto:")) {
                baseFunc.linksStatusCheck(agentEmailLink);
            }
            Assertions.assertTrue(baseFunc.getTextOfElement(agentLinks.get(1)).length() > 0, "No email");
        } catch (IndexOutOfBoundsException e) {
            LOGGER.info("No agent contact in side info block for new client");
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
    public void closeIframe() {
        LOGGER.info("Close Facebook iframe dialog");
        baseFunc.switchIframeIndex(0);
        baseFunc.click(IFRAME_FACEBOOK_CLOSE_CHAT_BTN);
        baseFunc.switchToMainPage();

    }
    public boolean isFooterLinksOpen() {
        LOGGER.info("Checking if footer links successfully open");
        baseFunc.footerLinksOpen(FOOTER_LINKS, TITTLE);
        return true;
    }

    public boolean isPhoneNumberLinkWorkInFooter() {
        LOGGER.info("Phone number displayed in footer");
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        Assertions.assertTrue(phonesLInks.get(1).getAttribute("href").length() > 0, "No phone number");
        return true;
    }

    public boolean isEmailLinkWorkInFooter() {
        LOGGER.info("Email link in footer returns status 200 for homepage");
        List<WebElement> email = baseFunc.list(EMAIL_LINK_IN_FOOTER);
        String link = email.get(1).getAttribute("href");
        if (link != null && !link.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(email.get(1)).length() > 0, "No email");
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

}
