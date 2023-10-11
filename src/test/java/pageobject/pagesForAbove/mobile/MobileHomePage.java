package pageobject.pagesForAbove.mobile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;
import pageobject.model.Passenger;
import pageobject.model.PassengerNew;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static pageobject.pagesForAbove.LocatorsMobile.MobileHomePageLocators.*;

public class MobileHomePage {

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
        baseFunc.linksStatusCheck(baseFunc.findElement(REVIEW_HEADER_LINK).getAttribute("href"));
        //baseFunc.checkReviewLinkInHeader(REVIEW_TRUSTPILOT_LINK, REVIEW_IMG, REVIEW_TRUSTPILOT_LINK, TRUSTPILOT_ABOVE_TITTLE);
        return true;
    }

    public void checkDropDownMenu() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        baseFunc.isDropDownMenuOpenMobile(DROP_DOWN_BUTTONS, LOG_IN_BUTTON, CREATE_PROFILE_BUTTON, DROP_DOWN_ELEMENTS, CLOSE_BUTTONS);
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
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUBMIT_BUTTONS).get(2)).length() > 0, "Sign in button hasn't name in login modal window");
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

    public boolean isRequestFormAppears() {
        LOGGER.info("Checking if request form displayed for homepage");
        baseFunc.click(REQUEST_FORM);
        baseFunc.waitForElementAttributeToBeNew(baseFunc.findElement(REQUEST_FORM_MODAL), "class", "lg:hidden fixed z-40 inset-0 transition-height duration-500 overflow-hidden");
        WebElement flightInfoBlock = baseFunc.findElement(REQUEST_FORM_FLIGHT_INFORMATION_BLOCK);
        Assertions.assertTrue(flightInfoBlock.isDisplayed(), "Flight information block not displayed in request form modal window");
        WebElement tittle = flightInfoBlock.findElement(REQUEST_FORM_FLIGHT_INFORMATION_TITTLE);
        Assertions.assertTrue(tittle.getText().length() > 0, "No tittle for flight info block in flight request");
        LOGGER.info("Check if flight information form displayed");
        List<WebElement> flightInfoButtons = flightInfoBlock.findElements(FLIGHT_INFORMATION_BUTTONS);
        for (WebElement button : flightInfoButtons) {
            Assertions.assertTrue(button.getText().length() > 0, "No default text in flight info options in flight request form");
        }
        LOGGER.info("Check flight type option");
        baseFunc.click(flightInfoButtons.get(0));
        WebElement flightTypesModal = baseFunc.list(FLIGHT_INFO_MODAL).get(3);
        List<WebElement> flightTypes = flightTypesModal.findElements(FLIGHT_TYPES);
        Assertions.assertTrue(flightTypes.size() > 0, "No flight types in opened modal window");
        for (WebElement type : flightTypes) {
            Assertions.assertTrue(type.getText().length() > 0, "No flight types in opened modal window");
        }
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(4));
        LOGGER.info("Check passengers option");
        baseFunc.click(flightInfoButtons.get(1));
        WebElement passengersModal = baseFunc.list(FLIGHT_INFO_MODAL).get(4);
        Assertions.assertTrue(passengersModal.getText().length() > 0, "No tittle for opened passenger details modal window");
        List<WebElement> passengersTypes = passengersModal.findElements(PASSENGERS_TYPES);
        Assertions.assertTrue(passengersTypes.size() > 0, "No passengers types in opened modal window");
        for (WebElement type : passengersTypes) {
            Assertions.assertTrue(type.getText().length() > 0, " No text for passenger type");
        }
        LOGGER.info("Check count passengers buttons and numbers of selected passengers");
        List<WebElement> countButtons = passengersModal.findElements(PASSENGERS_COUNT_BUTTONS);
        Assertions.assertEquals(6, countButtons.size(), "Not all count buttons for passengers number in opened modal window");
        for (WebElement button : countButtons) {
            Assertions.assertTrue(button.isEnabled(), "Count button for passengers number is disabled in opened modal window");
        }
        List<WebElement> passengersNumberSelected = passengersModal.findElements(PASSENGERS_NUMBERS_SELECTED);
        for (WebElement number : passengersNumberSelected) {
            Assertions.assertTrue(number.getAttribute("value").length() > 0, "No number for passenger selected");
        }
        LOGGER.info("Check 'Done' button");
        WebElement doneButton = passengersModal.findElement(DONE_BUTTON);
        Assertions.assertTrue(doneButton.isEnabled(), "Button 'done' is disabled in opened modal window");
        Assertions.assertTrue(doneButton.getText().length() > 0, "No name for 'done' button is disabled in opened modal window");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(5));

        LOGGER.info("Check flight classes option");
        baseFunc.click(flightInfoButtons.get(2));
        WebElement classesModal = baseFunc.list(FLIGHT_INFO_MODAL).get(5);
        List<WebElement> flightClasses = classesModal.findElements(FLIGHT_CLASSES);
        Assertions.assertTrue(flightClasses.size() > 0, "No flight classes in opened modal window");
        for (WebElement flightClass : flightClasses) {
            Assertions.assertTrue(baseFunc.getTextOfElement(flightClass).length() > 0, "No text for flight class in opened modal window");
        }
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(6));
        LOGGER.info("Check flight details options");
        baseFunc.click(baseFunc.list(NEXT_BUTTONS).get(0));
        WebElement flightItem = baseFunc.findElement(FLIGHT_MODAL);
        LOGGER.info("Check if error messages displayed for not filled input fields");
        baseFunc.click(baseFunc.list(NEXT_BUTTONS).get(1));
        List<WebElement> errorMessages = flightItem.findElements(ERROR_MESSAGES);
        for (WebElement message : errorMessages) {
            String errorText = message.getText();
            if (!errorText.isEmpty()) {
                Assertions.assertTrue(errorText.length() > 0, "No error message for empty input field in flight one modal window");
            }
        }
        LOGGER.info("Check placeholders for input fields");
        List<WebElement> datesLabels = flightItem.findElements(DATES_LABELS);
        for (WebElement date : datesLabels) {
            Assertions.assertTrue(date.getText().length() > 0, "No label for dates placeholders");
        }
        List<WebElement> flightRoutesLabels = flightItem.findElements(INPUT_FIELDS_REQUEST_FORM_SELECTORS);
        for (WebElement flightLabel : flightRoutesLabels) {
            Assertions.assertTrue(flightLabel.getText().length() > 0, "No label for flight routes placeholders");
        }
        baseFunc.click(baseFunc.list(BACK_BUTTONS).get(0));
        return true;
    }

    public boolean isElementsInMultiCityFlightRequestFormDisplayed() {
        LOGGER.info("Select Multi city flight type for flight request");
        WebElement flightInfoBlock = baseFunc.findElement(REQUEST_FORM_FLIGHT_INFORMATION_BLOCK);
        List<WebElement> flightInfoButtons = flightInfoBlock.findElements(FLIGHT_INFORMATION_BUTTONS);
        baseFunc.click(flightInfoButtons.get(0));
        WebElement flightTypesModal = baseFunc.list(FLIGHT_INFO_MODAL).get(3);
        List<WebElement> flightTypes = flightTypesModal.findElements(FLIGHT_TYPES);
        baseFunc.click(flightTypes.get(2));
        baseFunc.click(baseFunc.list(NEXT_BUTTONS).get(0));
        LOGGER.info("Check flights items for multi city request");
        WebElement flightsForm = baseFunc.list(FLIGHTS_FORM).get(1);
        List<WebElement> flightItems = flightsForm.findElements(FLIGHTS_ITEMS);
        Assertions.assertEquals(flightItems.size(), 2, "Two flights not displayed for multi city request");
        baseFunc.scrollToTheBottom();
        LOGGER.info("Add flight item for multi city request");
        Assertions.assertTrue(baseFunc.list(ADD_FLIGHT_BUTTON).get(0).isEnabled(), "Add flight button is disabled for multi city");
        baseFunc.scrollToTheBottom();
        baseFunc.click(baseFunc.list(ADD_FLIGHT_BUTTON).get(0));
        List<WebElement> updatedFlightItems = flightsForm.findElements(FLIGHTS_ITEMS);
        Assertions.assertEquals(updatedFlightItems.size(), 3, "No flight item added for multi city request");
        LOGGER.info("Check placeholders for input fields for multi city request");
        for (WebElement updatedFlightItem : updatedFlightItems) {
            List<WebElement> flightRoutesLabels = updatedFlightItem.findElements(INPUT_FIELDS_REQUEST_FORM_SELECTORS);
            for (WebElement flightLabel : flightRoutesLabels) {
                Assertions.assertTrue(flightLabel.getText().length() > 0, "No label for flight routes placeholders for multi city request");
            }
            WebElement datesLabel = updatedFlightItem.findElement(DATES_LABELS);
            Assertions.assertTrue(datesLabel.getText().length() > 0, "No label for dates placeholders for multi city request");
        }
        baseFunc.scrollToTheBottom();
        baseFunc.click(baseFunc.list(NEXT_BUTTONS).get(1));
        for (WebElement updatedFlightItem : updatedFlightItems) {
            List<WebElement> errorMessages = updatedFlightItem.findElements(ERROR_MESSAGES);
            for (WebElement message : errorMessages) {
                String errorText = message.getText();
                if (!errorText.isEmpty()) {
                    Assertions.assertTrue(errorText.length() > 0, "No error message for empty input field for multi city request");
                }
            }
        }
        baseFunc.click(baseFunc.list(DELETE_FLIGHT_ITEM_BUTTON).get(2));
        List<WebElement> newUpdatedFlightItems = flightsForm.findElements(FLIGHTS_ITEMS);
        Assertions.assertEquals(newUpdatedFlightItems.size(), 2, "New added flight item not deleted for multi city request");
        LOGGER.info("Check if error messages displayed for not filled input fields for multi city request");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(3));
        return true;
    }

    public void selectFlightParameters() {
        LOGGER.info("Open flight request form");
        baseFunc.click(REQUEST_FORM);
        baseFunc.waitForElementAttributeToBeNew(baseFunc.findElement(REQUEST_FORM_MODAL), "class", "lg:hidden fixed z-40 inset-0 transition-height duration-500 overflow-hidden");
        LOGGER.info("Select random flight type for flight request: Return or One Way");
        WebElement flightInfoBlock = baseFunc.findElement(REQUEST_FORM_FLIGHT_INFORMATION_BLOCK);
        List<WebElement> flightInfoButtons = flightInfoBlock.findElements(FLIGHT_INFORMATION_BUTTONS);
        baseFunc.click(flightInfoButtons.get(0));
        WebElement flightTypesModal = baseFunc.list(FLIGHT_INFO_MODAL).get(3);
        List<WebElement> flightTypes = flightTypesModal.findElements(FLIGHT_TYPES);
        int randomIndexType = baseFunc.getRandomIndex(2);  // multi city not select!!
        WebElement selectedFlightType = flightTypes.get(randomIndexType);
        baseFunc.click(selectedFlightType);
        LOGGER.info("Select random flight class for flight request");
        baseFunc.click(flightInfoButtons.get(2));
        WebElement classesModal = baseFunc.list(FLIGHT_INFO_MODAL).get(5);
        List<WebElement> flightClasses = classesModal.findElements(FLIGHT_CLASSES);
        int randomIndexClass = baseFunc.getRandomIndex(flightClasses.size());
        WebElement selectedFlightClass = flightClasses.get(randomIndexClass);
        baseFunc.click(selectedFlightClass);
    }

    public void selectPassengerParameters(int adultPassengerToSelect) {
        LOGGER.info("Select numbers of passengers for flight request");
        WebElement flightInfoBlock = baseFunc.findElement(REQUEST_FORM_FLIGHT_INFORMATION_BLOCK);
        List<WebElement> flightInfoButtons = flightInfoBlock.findElements(FLIGHT_INFORMATION_BUTTONS);
        baseFunc.click(flightInfoButtons.get(1));
        List<WebElement> passengersCounterBlock = baseFunc.list(PASSENGERS_BLOCK);
        List<WebElement> activePassengerBlock = passengersCounterBlock.subList(0, 3);
        for (WebElement passengersType : activePassengerBlock) {
            Assertions.assertTrue(passengersType.isDisplayed(), "Passengers type not displayed");
            Assertions.assertTrue(baseFunc.getTextOfElement(passengersType).length() > 0, "Passengers type not displayed");
        }
        List<WebElement> passengersButtons = baseFunc.list(PASSENGERS_COUNTER_BTNS);
        List<WebElement> activePassengerButtons = passengersButtons.subList(0, 6);
        for (WebElement button : activePassengerButtons) {
            Assertions.assertTrue(button.isEnabled(), "Counter button disabled");
        }
        int desiredAdultPassengerCount = adultPassengerToSelect;
        int desiredChildPassengerCount = 2 * desiredAdultPassengerCount;
        int desiredInfantPassengerCount = desiredAdultPassengerCount;
        int maxTotalPassengersCount = desiredAdultPassengerCount + desiredChildPassengerCount + desiredInfantPassengerCount;
        LOGGER.info("Select number of adult passengers");
        WebElement adultsCountElement = baseFunc.list(CURRENT_ADULT_PASSENGER_NUMBER).get(0);
        int currentAdultCount = Integer.parseInt(adultsCountElement.getAttribute("value"));
        while (currentAdultCount < desiredAdultPassengerCount) {
            baseFunc.click(activePassengerButtons.get(1));
            currentAdultCount++;
        }
        LOGGER.info("Select number of child passengers");
        WebElement childCountElement = baseFunc.list(CURRENT_CHILD_PASSENGER_NUMBER).get(1);
        int currentChildCount = Integer.parseInt(childCountElement.getAttribute("value"));
        while (currentChildCount < desiredChildPassengerCount) {
            baseFunc.click(activePassengerButtons.get(3));
            currentChildCount++;
        }
        LOGGER.info("Select number of infant passengers");
        WebElement infantCountElement = baseFunc.list(CURRENT_INFANT_PASSENGER_NUMBER).get(1);
        int currentInfantCount = Integer.parseInt(infantCountElement.getAttribute("value"));
        while (currentInfantCount < desiredInfantPassengerCount) {
            baseFunc.click(activePassengerButtons.get(5));
            currentInfantCount++;
        }
        if (maxTotalPassengersCount > 9) {
            LOGGER.info("Passenger more than 9 message: " + " " + baseFunc.getTextOfElement(DATA_PASSENGER_MESSAGE));
        }
        if (baseFunc.getTextOfElement(DATA_PASSENGER_MESSAGE).length() > 0) {
            LOGGER.info("Passenger message: " + " " + baseFunc.getTextOfElement(DATA_PASSENGER_MESSAGE));
        }
        Assertions.assertEquals(desiredAdultPassengerCount, currentAdultCount, "Number of adults not equal");
        Assertions.assertEquals(desiredChildPassengerCount, currentChildCount, "Number of children not equal");
        Assertions.assertEquals(desiredInfantPassengerCount, currentInfantCount, "Number of children not equal");
        baseFunc.click(baseFunc.list(PASSENGERS_CONFIRM_BTN).get(0));

        baseFunc.click(baseFunc.list(NEXT_BUTTONS).get(0));
    }

    public void selectAirportsFromSuggestionLists(String locationFrom, String locationTo, Passenger passenger) {
        LOGGER.info("Selecting airports " + locationFrom + " from suggestion lists");
        WebElement inputAirportFrom = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(0);
        baseFunc.click(inputAirportFrom);
        baseFunc.waitForElementAttributeToBeNew(baseFunc.list(OPENED_SELECT_WINDOWS).get(1), "class", "choices__list choices__list--dropdown is-active");
        WebElement inputFrom = baseFunc.list(INPUT_FROM).get(0);
        baseFunc.click(inputFrom);
        baseFunc.type(inputFrom, passenger.getAirportFrom());
        List<WebElement> suggestionsFrom = baseFunc.list(AIRPORTS_SUGGESTION);
        baseFunc.waitElementPresented(AIRPORTS_SUGGESTION);
        boolean isFoundFrom = false;
        for (WebElement we : suggestionsFrom) {
            System.out.println(we.getText());
            if (baseFunc.getTextOfElement(we).equals(locationFrom)) {
                we.click();
                isFoundFrom = true;
                break;
            }
        }
        Assertions.assertTrue(isFoundFrom, "Location " + locationFrom + " can't be found in a suggestion list");

        LOGGER.info("Selecting airports " + locationTo + " from suggestion lists");
        baseFunc.waitForElementAttributeToBeNew(baseFunc.list(OPENED_SELECT_WINDOWS).get(1), "class", "choices__list choices__list--dropdown hidden");
        WebElement inputAirportTo = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(2);
        baseFunc.click(inputAirportTo);
        baseFunc.waitForElementAttributeToBeNew(baseFunc.list(OPENED_SELECT_WINDOWS).get(3), "class", "choices__list choices__list--dropdown is-active");
        WebElement inputTo = baseFunc.list(INPUT_TO).get(0);
        baseFunc.click(inputTo);
        baseFunc.type(inputTo, passenger.getAirportTo());
        baseFunc.waitElementPresented(AIRPORTS_SUGGESTION);
        baseFunc.waitForElementAttributeToBe(ACTIVE_AIRPORTS_TO_LIST, "data-value", locationTo);
        WebElement activeAirportsList = baseFunc.findElement(CHOICES_LIST_TO);
        List<WebElement> suggestionsTo = activeAirportsList.findElements(AIRPORTS_SUGGESTION);
        boolean isFoundTo = false;
        for (WebElement we : suggestionsTo) {
            System.out.println(we.getText());
            if (baseFunc.getTextOfElement(we).equals(locationTo)) {
                we.click();
                isFoundTo = true;
                break;
            }
        }
        Assertions.assertTrue(isFoundTo, "Location " + locationTo + " can't be found in a suggestion list");
    }

    public void getAndSelectDepartAndReturnDates(String expectedDepartDate, String expectedReturnDate) {
        LOGGER.info("Find depart date picker");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate expectedLocalDepartDate = LocalDate.parse(expectedDepartDate, dtf);
        LocalDate expectedLocalReturnDate = LocalDate.parse(expectedReturnDate, dtf);
        int expectedDepartDay = expectedLocalDepartDate.getDayOfMonth();
        int expectedDepartMonth = expectedLocalDepartDate.getMonthValue();
        int expectedDepartYear = expectedLocalDepartDate.getYear();

        baseFunc.click(baseFunc.list(DATE_PICKERS).get(0));
        LOGGER.info("Selecting depart date from date picker equals to " + expectedDepartDate);
        LOGGER.info("Selecting month from date picker equals to " + expectedDepartMonth);
        List<WebElement> months = baseFunc.list(MONTH_SELECTORS);
        baseFunc.click(months.get(expectedDepartMonth - 1));
        LOGGER.info("Selecting depart year from date picker equals to " + expectedDepartYear);
        List<WebElement> years = baseFunc.list(YEAR_SELECTORS);
        for (WebElement yearToSelect : years) {
            if (baseFunc.getTextOfElement(yearToSelect).equals(String.valueOf(expectedDepartYear))) {
                baseFunc.click(yearToSelect);
                break;
            }
        }
        LOGGER.info("Selecting depart day from date picker equals to " + expectedDepartDay);
        try {
            WebElement departDays = baseFunc.list(DAYS_DATE_PICKER).get(0);
            List<WebElement> availableDaysToSelect = departDays.findElements(AVAILABLE_DAYS_DATE_PICKER);
            for (WebElement day : availableDaysToSelect) {
                if (baseFunc.getTextOfElement(day).equals(String.valueOf(expectedDepartDay))) {
                    baseFunc.click(day);
                    break;
                }
            }
        } catch (Exception e) {
            LOGGER.info("Invalid date!" + ":" + expectedDepartDay + " " + expectedDepartMonth);
        }
        baseFunc.click(CLOSE_DATE_PICKER_BUTTON);

        LOGGER.info("Selecting return date from date picker equals to " + expectedReturnDate);
        int expectedReturnDay = expectedLocalReturnDate.getDayOfMonth();
        int expectedReturnMonth = expectedLocalReturnDate.getMonthValue();
        try {
            baseFunc.click(baseFunc.list(DATE_PICKERS).get(1));
            try {
                if (expectedReturnMonth == expectedDepartMonth) {
                    WebElement returnDays = baseFunc.findElement(DAYS_DATE_PICKER);
                    List<WebElement> availableDaysToSelect = returnDays.findElements(AVAILABLE_DATES_RETURN);
                    for (WebElement day : availableDaysToSelect) {
                        if (baseFunc.getTextOfElement(day).equals(String.valueOf(expectedReturnDay))) {
                            baseFunc.click(day);
                            break;
                        }
                    }
                    baseFunc.click(CLOSE_DATE_PICKER_BUTTON);
                }
                if (expectedReturnMonth != expectedDepartMonth) {
                    List<WebElement> returnMonths = baseFunc.list(MONTH_SELECTORS);
                    baseFunc.click(returnMonths.get(expectedReturnMonth - 1));
                    WebElement returnDaysOtherMonth = baseFunc.findElement(DAYS_DATE_PICKER);
                    List<WebElement> availableDaysToSelect = returnDaysOtherMonth.findElements(AVAILABLE_DATES_RETURN);
                    for (WebElement day : availableDaysToSelect) {
                        if (baseFunc.getTextOfElement(day).equals(String.valueOf(expectedReturnDay))) {
                            baseFunc.click(day);
                            break;
                        }
                    }
                    baseFunc.click(CLOSE_DATE_PICKER_BUTTON);
                }
            } catch (Exception e) {
                LOGGER.info("Invalid date!" + ":" + expectedReturnDay + " " + expectedReturnMonth);
            }
            baseFunc.click(CLOSE_DATE_PICKER_BUTTON);
        } catch (Exception e) {
            baseFunc.click(baseFunc.list(NEXT_BUTTONS).get(1));
        }
    }

    public void fillInPassengerInfo(Passenger passenger) {
        LOGGER.info("Check text in contact information form");
        baseFunc.waitElementPresented(CONTACT_FORM_TITTLE);
        WebElement contactForm = baseFunc.findElement(CONTACT_INFORMATION_FORM);
        LOGGER.info("Check if error message displayed for not filled input fields");
        baseFunc.scrollToTheBottom();
        baseFunc.click(baseFunc.list(SUBMIT_BUTTONS).get(0));
        List<WebElement> errorMessages = contactForm.findElements(ERROR_MESSAGES);
        for (WebElement message : errorMessages) {
            String errorText = message.getText();
            if (!errorText.isEmpty()) {
                Assertions.assertTrue(errorText.length() > 0, "No error message for empty input field in contact information form");
            }
        }
        LOGGER.info("Filling passenger info in request form");
        List<WebElement> placeholderLabels = baseFunc.list(INPUT_FIELDS_REQUEST_FORM);
        for (WebElement label : placeholderLabels) {
            Assertions.assertTrue(label.getAttribute("placeholder").length() > 0, "No label for placeholder");
        }
        WebElement inputName = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(0);
        WebElement inputPhone = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(1);
        WebElement inputEmail = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(2);
        baseFunc.type(inputName, passenger.getName());
        baseFunc.type(inputPhone, passenger.getPhoneNumber());
        baseFunc.type(inputEmail, passenger.getEmail());
        baseFunc.scrollToTheBottom();
        LOGGER.info("Check if buttons is enabled");
        Assertions.assertTrue(contactForm.findElements(BACK_BUTTONS).get(1).isEnabled(), "Button 'Back' is disabled in contact information form");
        Assertions.assertTrue(contactForm.findElements(SUBMIT_BUTTONS).get(0).isEnabled(), "Button 'Back' is disabled in contact information form");
        LOGGER.info("Check info text in the bottom of page");
        Assertions.assertTrue(baseFunc.getTextOfElement(contactForm.findElement(ADDITIONAL_INFO_TEXT)).length() > 0, "No additional text in the bottom of page");
        LOGGER.info("Check if Privacy policy links works");
        baseFunc.click(contactForm.findElement(PRIVACY_POLICY_LINK));
        baseFunc.switchTab(1);
        baseFunc.waitElementPresented(TITTLE);
        Assertions.assertTrue(baseFunc.getTextOfElement(TITTLE).length() > 0, "No tittle for opened page");
        baseFunc.closeTab();
        baseFunc.switchTab(0);
        baseFunc.scrollToTheBottom();
        LOGGER.info("Submit request");
    }

    public void submitFlightRequest() {
        LOGGER.info("Submit flight request");
        baseFunc.click(baseFunc.list(SUBMIT_BUTTONS).get(0));
    }

    public boolean isSuccessfulRequestMessageIsDisplayed() {
        baseFunc.waitElementToBeVisible(SUCCESSFUL_REQUEST_MODAL_WINDOW_TITTLE);
        Assertions.assertTrue(baseFunc.getTextOfElement(SUCCESSFUL_REQUEST_MODAL_WINDOW_TITTLE).length() > 0, "No tittle in successful request message");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUCCESSFUL_REQUEST_MODAL_WINDOW_TEXT).get(1)).length() > 0, "No text in successful request message");
        return true;
    }

    public void openAboutUsPage() {
        LOGGER.info("Opening next page - About us");
        baseFunc.openNextPage(DROP_DOWN_BUTTONS, DROP_DOWN_ELEMENTS, 2, 5);
    }

    public void fillLogInForm(PassengerNew passengerNew) {
        LOGGER.info("Filling user data in Log in form");
        WebElement emailInputField = baseFunc.list(INPUT_FIELDS_EMAIL).get(0);
        WebElement passwordInputField = baseFunc.list(INPUT_FIELDS_PASSWORD).get(0);
        baseFunc.type(emailInputField, passengerNew.getEmail());
        baseFunc.type(passwordInputField, passengerNew.getPassword());
        baseFunc.click(baseFunc.list(SUBMIT_BUTTONS).get(2));
    }
    public void openUserProfilePage() {
        LOGGER.info("Open user profile");
        baseFunc.pageRefresh();
        baseFunc.waitElementToBeClickable(DROP_DOWN_BUTTONS);
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        baseFunc.click(menuButtons.get(0));
        baseFunc.waitForElementAttributeToBeNew(menuButtons.get(0),"data-dropdown","opened");
        List<WebElement> profileMenu =baseFunc.list(MY_PROFILE_BUTTON);
        baseFunc.click(profileMenu.get(0));
    }
}
