package pageobject.pagesForAbove;

import com.sun.source.tree.AssertTree;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.http.HttpStatus;
import pageobject.BaseFunc;
import pageobject.model.Passenger;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@data-tid='banner-decline']");

    private final By IFRAME_FACEBOOK_IMAGE = By.xpath(".//div[@class='welcomePageModalSheetContent']/div/div/img");
    private final By IFRAME_FACEBOOK_TITTLE = By.xpath(".//div[@class='_4ik4 _4ik5']/strong");
    private final By IFRAME_FACEBOOK_TEXT = By.xpath(".//div[@class='_a2zt _a6s6 _4ik4 _4ik5']");
    private final By IFRAME_FACEBOOK_MENU_ITEMS = By.xpath(".//div[@class='x1uvtmcs x4k7w5x x1h91t0o x1beo9mf " +
            "xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1n2onr6 x1qrby5j x1jfb8zj']/div/div/div");
    private final By IFRAME_FACEBOOK_CLOSE_CHAT_BTN = By.xpath(".//div[@aria-label='close']");
    private final By IFRAME_BOTTOM_TEXT = By.xpath(".//span[@class='_9zb3']/span");
    private final By IFRAME_FACEBOOK_MORE_BTN = By.xpath(".//div[@aria-label='More']");
    private final By IFRAME_FACEBOOK_START_CHAT_BTN = By.xpath(".//div[@class='_a2zm']");

    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@src='https://staging.above9.travel/img/trustpilot-light.svg']");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[@class='h-full flex items-center space-x-2 px-2 " +
            "py-1 font-medium rounded appearance-none transition-colors focus:outline-none hover:bg-black hover:bg-opacity-10 focus:bg-black focus:bg-opacity-25 focus:text-white']");
    private final By LOG_IN_BUTTON = By.xpath(".//button[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full " +
            "text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");

    private final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    private final By MODAL_INPUT_FIELDS = By.xpath(".//div[@class='space-y-4']/div/div/div/input");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By MODAL_WINDOW_BUTTONS = By.xpath(".//div[@class='pt-6 -mx-2 flex items-baseline flex-wrap justify-between']/span/button");
    private final By CLOSE_BUTTONS = By.xpath(".//span[@class='absolute right-4 top-4 lg:right-0 lg:top-0']/button");
    private final By SIGN_UP_MODAL_WINDOW = By.id("register-title");

    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full " +
            "text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:" +
            "text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By HOME_PAGE_WELCOME_TEXT = By.xpath(".//div[@class='pt-4 md:pt-10 md:w-4/5']");
    private final By REQUEST_FORM = By.xpath(".//div[@class='space-y-6']");
    private final By REQUEST_FORM_INPUT_FIELDS = By.xpath(".//div[@class='w-full group is-invalid']");

    private final By HOME_PAGE_TEXT_ONE = By.xpath(".//div[@class='pt-12 pb-4 space-y-6 w-3/4 simple-content']");
    private final By CONTAINERS_TEXT = By.xpath(".//div[@class='container']");
    private final By HOME_PAGE_TEXT_THREE = By.xpath(".//div[@class='pb-1.5 flex flex-col lg:space-y-1']");
    private final By INSTRUCTION = By.xpath(".//div[@class='w-4/5']");
    private final By REVIEW_HEADER = By.xpath(".//h2[@class='text-2xl lg:text-3xl uppercase font-medium']");
    private final By REVIEW_CAROUSEL = By.xpath(".//div[@class='relative overflow-hidden swiper-container " +
            "swiper-container-initialized swiper-container-horizontal']");
    private final By CAROUSEL_BTN_PREV = By.xpath(".//div[@class='swiper-button-prev m-0 w-10 h-10 static " +
            "flex items-center justify-center transition ring-orange-400 ring-opacity-50 bg-none bg-orange-400 hover:" +
            "bg-white focus:bg-white rounded hover:shadow focus:outline-none focus:ring-4']");
    private final By CAROUSEL_BTN_NEXT = By.xpath(".//div[@class='swiper-button-next m-0 w-10 h-10 static " +
            "flex items-center justify-center transition ring-orange-400 ring-opacity-50 bg-none bg-orange-400 hover:" +
            "bg-white focus:bg-white rounded hover:shadow focus:outline-none focus:ring-4']");
    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//li[@class='w-9 md:w-12']/img");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    private final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By TRUSTPILOT_ABOVE_TITTLE = By.xpath(".//span[@class='typography_display-s__qOjh6 typogr" +
            "aphy_appearance-default__AAY17 title_displayName__TtDDM']");

    private final By REQUEST_FORM_MENU = By.xpath(".//div[@class='fixed lg:absolute inset-0 lg:top-auto lg:" +
            "bottom-auto z-40 bg-white lg:bg-transparent lg:max-h-96 lg:left-0 lg:right-auto']");
    private final By REQUEST_OPTIONS = By.xpath(".//span[@role='button']");
    private final By FLIGHT_TYPE_SELECTED = By.xpath(".//button[@data-dropdown='closed']/span");
    private final By PASSENGERS_BLOCK = By.xpath(".//div[@class='flex items-center space-x-8']");
    private final By PASSENGERS_COUNTER_BTNS = By.xpath(".//button[@class='touch-manipulation flex-shrink-0" +
            " w-10 h-10 lg:w-8 lg:h-8 inline-flex items-center justify-center appearance-none transition ring-gray-400 " +
            "bg-gray-200 text-gray-600 rounded hover:bg-gray-300 hover:text-gray-800 focus:outline-none focus:ring-2']");
    private final By DATA_PASSENGER_MESSAGE = By.xpath(".//div[@class='px-5 py-3 leading-5 text-red-500']");
    private final By PASSENGERS_CONFIRM_BTN = By.xpath(".//button[@class='group appearance-none py-4 lg:py-" +
            "3 flex items-center justify-center border space-x-2 text-base font-semibold lg:font-medium whitespace-nowrap " +
            "transition rounded-md md:rounded disabled:cursor-default disabled:bg-gray-400 disabled:shadow-none ring-orange-300 ring-opacity-50 focus:outline-none focus:ring-4 w-full px-5 border-gray-200 text-black hover:bg-gray-200 hover:text-black focus:text-black focus:bg-gray-200 focus:border-gray-300']");
    private final By CURRENT_ADULT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='adults']");
    private final By CURRENT_CHILD_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='children']");
    private final By CURRENT_INFANT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='infants']");
    private final By INPUT_FIELDS_REQUEST_FORM = By.xpath(".//input[@class='appearance-none block h-10 lead" +
            "ing-8 px-0 py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-white text-white " +
            "placeholder-white hover:border-orange-400 focus:border-orange-400 placeholder-opacity-75 focus:outline-none']");
    private final By INPUT_FIELDS_REQUEST_FORM_SELECTORS = By.xpath(".//div[@aria-selected='true']");
    private final By AIRPORTS_SUGGESTION = By.xpath(".//span[@class='-mr-2 flex-shrink-0 pl-2']");
    private final By INPUT_FROM = By.xpath(".//input[@aria-label='From (city or airport)']");
    private final By INPUT_TO = By.xpath(".//input[@aria-label='To (city or airport)']");
    private final By INPUT_COUNTRY_CODE = By.xpath(".//input[@aria-label='false']");
    private final By PHONE_CODES = By.xpath(".//div[@class='choices__item choices__item--choice choices__item--selectable is-highlighted']");

    private final By DATE_PICKERS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0 py-1" +
            " w-full text-sm rounded-none transition-colors bg-transparent  border-white text-white placeholder-white " +
            "hover:border-orange-400 focus:border-orange-400 placeholder-opacity-75 focus:outline-none text-right cursor-pointer']");
    private final By DATE_PICKER_PREVIOUS_BUTTON = By.xpath(".//button[@class='lightpick__previous-action']");
    private final By DATE_PICKER_NEXT_BUTTON = By.xpath(".//button[@class='lightpick__next-action']");
    private final By MONTH = By.xpath(".//select[@class='lightpick__select lightpick__select-months']");
    private final By MONTH_SELECTORS = By.xpath(".//select[@class='lightpick__select lightpick__select-months']/option");
    private final By YEAR = By.xpath(".//select[@class='lightpick__select lightpick__select-years']");
    private final By YEAR_SELECTORS = By.xpath(".//select[@class='lightpick__select lightpick__select-years']/option");
    private final By DAYS_DATE_PICKER = By.xpath(".//div[@class='lightpick__days']");
    private final By AVAILABLE_DAYS_DATE_PICKER = By.xpath(".//div[@class='lightpick__day is-available ']");
    private final By AVAILABLE_DAYS_DATE_PICKER_RETURN = By.xpath(".//div[@class='lightpick__day is-available']");
    private final By DATE_PICKERS_OPENED = By.xpath(".//section[@class='lightpick lightpick--1-columns']");
    private final By ADD_FLIGHT_BUTTON = By.xpath(".//button[@data-trip-add='data-trip-add']");
    private final By REMOVE_FLIGHT_BUTTON = By.xpath(".//button[@ data-trip-remove='data-trip-remove']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        LOGGER.info("Accepting cookies");
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public boolean isLogoAppearsInHeader() {
        LOGGER.info("Checking logo in header for homepage");
        WebElement logo = baseFunc.findElement(HEADER_LOGO);
        Assertions.assertTrue(logo.isDisplayed(), "No logo on homepage");
        return true;
    }

    public void switchToIframeFacebookButton() {
        LOGGER.info("Switching to Facebook iframe dialog in homepage");
        baseFunc.switchIframeIndex(0);
    }

    public boolean isIframeElementsDisplayed() {
        LOGGER.info("Checking elements in Facebook iframe dialog in homepage");
        Assertions.assertTrue(baseFunc.findElement(IFRAME_FACEBOOK_IMAGE).isDisplayed(), "No Above logo in Facebook iframe");
        Assertions.assertTrue(baseFunc.getTextOfElement(IFRAME_FACEBOOK_TITTLE).length() > 0, "No tittle in Facebook iframe");
        Assertions.assertTrue(baseFunc.getTextOfElement(IFRAME_FACEBOOK_TEXT).length() > 0, "No text in Facebook iframe");
        baseFunc.click(IFRAME_FACEBOOK_MORE_BTN);
        List<WebElement> menuItems = baseFunc.list(IFRAME_FACEBOOK_MENU_ITEMS);
        for (WebElement item : menuItems) {
            Assertions.assertTrue(baseFunc.getTextOfElement(item).length() > 0, "No menu items in 'More' option in Facebook iframe");
        }
        Assertions.assertTrue(baseFunc.findElement(IFRAME_FACEBOOK_START_CHAT_BTN).isEnabled(), "Start chat button is disabled in Facebook iframe");
        //Assertions.assertTrue(baseFunc.getTextOfElement(IFRAME_BOTTOM_TEXT).length() > 0, "No bottom text in Facebook iframe");
        baseFunc.click(IFRAME_FACEBOOK_CLOSE_CHAT_BTN);
        baseFunc.switchToMainPage();
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
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(1));
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
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(2));
    }

    public boolean isHomePageWelcomeTextAppears() {
        LOGGER.info("Checking if Welcome text on page for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(HOME_PAGE_WELCOME_TEXT).length() > 0, "No text here");
        return baseFunc.findElement(HOME_PAGE_WELCOME_TEXT).isDisplayed();
    }

    public boolean isRequestFormAppears() {
        LOGGER.info("Checking if request form displayed for homepage");
        Assertions.assertTrue(baseFunc.findElement(REQUEST_FORM).isDisplayed(), "request form not displayed on homepage");
        baseFunc.click(baseFunc.list(SUBMIT_BUTTONS).get(1));
        List<WebElement> inputFields = baseFunc.list(REQUEST_FORM_INPUT_FIELDS);
        for (WebElement input : inputFields) {
            Assertions.assertTrue(baseFunc.getTextOfElement(input).length() > 0, "no default text in placeholders in request form");
            Assertions.assertTrue(baseFunc.getTextOfElement(input).contains("This field is required."), "No error text in placeholders in request form ");
        }
        return true;
    }

    public boolean isTextOneAppears() {
        LOGGER.info("Checking if text displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(HOME_PAGE_TEXT_ONE).length() > 0, "No text here");
        return baseFunc.findElement(HOME_PAGE_TEXT_ONE).isDisplayed();
    }

    public boolean isTextTwoAppears() {
        LOGGER.info("Checking if text displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(0)).length() > 0, "No text here");
        return baseFunc.list(CONTAINERS_TEXT).get(0).isDisplayed();
    }

    public boolean isTextThreeAppears() {
        LOGGER.info("Checking if text displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(HOME_PAGE_TEXT_THREE).get(0)).length() > 0, "No text here'");
        return baseFunc.list(HOME_PAGE_TEXT_THREE).get(0).isDisplayed();
    }

    public void WhyChooseAboveBlockCheck() {
        LOGGER.info("Checking if block Why choose Above displayed for homepage");
        Integer elements = baseFunc.list(CONTAINERS_TEXT).size();
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(1)).length() > 0, "No text here");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(2)).length() > 0, "No text here");
    }

    public void reviewBlockCheck() {
        LOGGER.info("Checking if review block displayed for homepage");
        String reviewHeader = baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(3).findElements(REVIEW_HEADER).get(0));
        String reviewCarousel = baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(3).findElement(REVIEW_CAROUSEL));
        Assertions.assertTrue(reviewHeader.length() > 0, "No text here");
        Assertions.assertTrue(reviewCarousel.length() > 0, "No text here");
        WebElement nextBtn = baseFunc.list(CONTAINERS_TEXT).get(3).findElement(CAROUSEL_BTN_NEXT);
        baseFunc.click(nextBtn);
        WebElement prevBtn = baseFunc.list(CONTAINERS_TEXT).get(3).findElement(CAROUSEL_BTN_PREV);
        baseFunc.click(prevBtn);

        Assertions.assertTrue(prevBtn.isEnabled(), "Prev carousel button is disabled");
        Assertions.assertTrue(nextBtn.isEnabled(), "Next carousel button is disabled");

    }

    public boolean isInstructionBlockAppears() {
        LOGGER.info("Checking if instruction block displayed for homepage");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(CONTAINERS_TEXT).get(4)).length() > 0, "No text here");
        List<WebElement> steps = baseFunc.list(INSTRUCTION);
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
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        Assertions.assertTrue(phonesLInks.get(1).getAttribute("href").length() > 0, "no phone number");
        return true;
    }
    public boolean isEmailLinkWorkInFooter() {
        LOGGER.info("Email link in footer returns status 200 for homepage");
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

    public void fillFlightRequestForm(int adultPassengerToSelect) {
        LOGGER.info("Select random flight type for flight request: Return or One Way");
        List<WebElement> allDropDownMenus = baseFunc.list(DROP_DOWN_BUTTONS);
        baseFunc.click(allDropDownMenus.get(3));
        baseFunc.findElement(REQUEST_FORM_MENU);
        List<WebElement> allRequestOptions = baseFunc.list(REQUEST_OPTIONS);
        List<WebElement> flightTypes = allRequestOptions.subList(5, 8);
        for (WebElement flightType : flightTypes) {
            Assertions.assertTrue(baseFunc.getTextOfElement(flightType).length() > 0, "flight types not displayed");
        }
        int randomIndexType = baseFunc.getRandomIndex(2);  // multi city not select!!
        WebElement selectedFlightType = flightTypes.get(randomIndexType);
        baseFunc.click(selectedFlightType);

        LOGGER.info("Select numbers of passengers for flight request");
        allDropDownMenus.get(4).click();
        baseFunc.findElement(REQUEST_FORM_MENU);
        List<WebElement> passengersCounterBlock = baseFunc.list(PASSENGERS_BLOCK);
        List<WebElement> activePassengerBlock = passengersCounterBlock.subList(3, 6);
        for (WebElement passengersType : activePassengerBlock) {
            Assertions.assertTrue(passengersType.isDisplayed(), "passengers type not displayed");
            Assertions.assertTrue(baseFunc.getTextOfElement(passengersType).length() > 0, "passengers type not displayed");
        }
        List<WebElement> passengersButtons = baseFunc.list(PASSENGERS_COUNTER_BTNS);
        List<WebElement> activePassengerButtons = passengersButtons.subList(6, 12);
        for (WebElement button : activePassengerButtons) {
            Assertions.assertTrue(button.isEnabled(), "counter button disabled");
        }

        int desiredAdultPassengerCount = adultPassengerToSelect;
        int desiredChildPassengerCount = 2 * desiredAdultPassengerCount;
        int desiredInfantPassengerCount = desiredAdultPassengerCount;
        int maxTotalPassengersCount = desiredAdultPassengerCount + desiredChildPassengerCount + desiredInfantPassengerCount;

        LOGGER.info("Select number of adult passengers");
        WebElement adultsCountElement = baseFunc.list(CURRENT_ADULT_PASSENGER_NUMBER).get(1);
        int currentAdultCount = Integer.parseInt(adultsCountElement.getAttribute("value"));
        while (currentAdultCount < desiredAdultPassengerCount) {
            baseFunc.click( activePassengerButtons.get(1));
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

        Assertions.assertEquals(desiredAdultPassengerCount, currentAdultCount, "number of adults not equal");
        Assertions.assertEquals(desiredChildPassengerCount, currentChildCount, "number of children not equal");
        Assertions.assertEquals(desiredInfantPassengerCount, currentInfantCount, "number of children not equal");

        baseFunc.click(baseFunc.list(PASSENGERS_CONFIRM_BTN).get(1));

        LOGGER.info("Select random flight class for flight request");
        baseFunc.click(allDropDownMenus.get(5));
        baseFunc.findElement(REQUEST_FORM_MENU);
        List<WebElement> classTypes = allRequestOptions.subList(8, 10);
        for (WebElement classType : classTypes) {
            Assertions.assertTrue(baseFunc.getTextOfElement(classType).length() > 0, "flight class not displayed");
        }
        int randomIndexClass = baseFunc.getRandomIndex(classTypes.size());
        WebElement selectedFlightClass = classTypes.get(randomIndexClass);
        baseFunc.click(selectedFlightClass);
    }

    public void fillInPassengerInfo(Passenger passenger) {
        LOGGER.info("Filling passenger info in request form");
        WebElement inputName = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(0);
        WebElement inputPhone = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(1);
        WebElement inputEmail = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(2);
        baseFunc.type(inputName, passenger.getName());
        baseFunc.type(inputPhone, passenger.getPhoneNumber());
        baseFunc.type(inputEmail, passenger.getEmail());
    }

    public void selectAirportsAndCountryCodeFromSuggestionLists(String locationFrom, String countryCode, String locationTo, Passenger passenger) {
        LOGGER.info("Selecting airports " + locationFrom + " from suggestion lists");
        WebElement inputAirportFrom = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(4);
        baseFunc.click(inputAirportFrom);
        WebElement inputFrom = baseFunc.list(INPUT_FROM).get(1);
        baseFunc.click(inputFrom);
        baseFunc.type(inputFrom, passenger.getAirportFrom());
        List<WebElement> suggestionsFrom = baseFunc.list(AIRPORTS_SUGGESTION);
        baseFunc.waitElementPresented(AIRPORTS_SUGGESTION);
        boolean isFoundFrom = false;
        for (WebElement we : suggestionsFrom) {
            if (baseFunc.getTextOfElement(we).equals(locationFrom)) {
                we.click();
                isFoundFrom = true;
                break;
            }
        }
        Assertions.assertTrue(isFoundFrom, "Location " + locationFrom + " can't be found in a suggestion list");

        LOGGER.info("Selecting country code " + countryCode + " from suggestion lists");
        WebElement inputCountryCode = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(7);
        baseFunc.click(inputCountryCode);
        WebElement inputCode = baseFunc.list(INPUT_COUNTRY_CODE).get(1);
        baseFunc.click(inputCode);
        baseFunc.type(inputCode, passenger.getCountryCode());
        WebElement suggestionsCode = baseFunc.list(PHONE_CODES).get(1);
        baseFunc.waitElementPresented(PHONE_CODES);
        boolean isFoundCode = false;
        if (baseFunc.getTextOfElement(suggestionsCode).equals(countryCode)) {
            baseFunc.click(suggestionsCode);
            isFoundCode = true;
        }
        //Assertions.assertTrue(isFoundCode, "Country phone code " + countryCode + " can't be found in a suggestion list");

        LOGGER.info("Selecting airports " + locationTo + " from suggestion lists");
        WebElement inputAirportTo = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(6);
        baseFunc.click(inputAirportTo);
        WebElement inputTo = baseFunc.list(INPUT_TO).get(1);
        baseFunc.click(inputTo);
        baseFunc.type(inputTo, passenger.getAirportTo());
        List<WebElement> suggestionsTo = baseFunc.list(AIRPORTS_SUGGESTION);
        baseFunc.waitElementPresented(AIRPORTS_SUGGESTION);
        boolean isFoundTo = false;
        for (WebElement we : suggestionsTo) {
            if (baseFunc.getTextOfElement(we).equals(locationTo)) {
                baseFunc.click(we);
                isFoundTo = true;
                break;
            }
        }
        //Assertions.assertTrue(isFoundTo, "Location " + locationTo + " can't be found in a suggestion list");
    }

    public void getAndSelectDepartAndReturnDates(String expectedDepartDate) {
        LOGGER.info("Find depart date picker");
        baseFunc.click(baseFunc.list(DATE_PICKERS).get(0));
        LOGGER.info("Selecting depart date from date picker equals to " + expectedDepartDate);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate expectedLocalDepartDate = LocalDate.parse(expectedDepartDate, dtf);
        LocalDate expectedLocalReturnDate = expectedLocalDepartDate.plusDays(5);

        int expectedDepartDay = expectedLocalDepartDate.getDayOfMonth();
        int expectedDepartMonth = expectedLocalDepartDate.getMonthValue();
        int expectedDepartYear = expectedLocalDepartDate.getYear();
        int expectedReturnDay = expectedLocalReturnDate.getDayOfMonth();
        int expectedReturnMonth = expectedLocalReturnDate.getMonthValue();
        int expectedReturnYear = expectedLocalReturnDate.getYear();

        LOGGER.info("Selecting month from date picker equals to " + expectedDepartMonth);
        //WebElement departMonth = baseFunc.findElement(MONTH);
        List<WebElement> months = baseFunc.list(MONTH_SELECTORS);
        baseFunc.click(months.get(expectedDepartMonth - 1));

        LOGGER.info("Selecting return year from date picker equals to " + expectedDepartYear);
        //WebElement departYear = baseFunc.findElement(YEAR);
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
            List<WebElement> availableDaysToSelect = baseFunc.list(AVAILABLE_DAYS_DATE_PICKER);
            for (WebElement day : availableDaysToSelect) {
                if (baseFunc.getTextOfElement(day).equals(String.valueOf(expectedDepartDay))) {
                    baseFunc.click(day);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid date!" + ":" + expectedDepartDay + " " + expectedDepartMonth);
        }
        LOGGER.info("Selecting return date from date picker equals to " + expectedLocalReturnDate);
        if (baseFunc.getTextOfElement(baseFunc.list(FLIGHT_TYPE_SELECTED).get(6)).equals("Round trip")) {
            try {
                //WebElement returnDays = baseFunc.list(DAYS_DATE_PICKER).get(1);
                //List<WebElement> availableDaysToSelect = returnDays.findElements(AVAILABLE_DAYS_DATE_PICKER_RETURN);
                List<WebElement> availableDaysToSelect = baseFunc.list(AVAILABLE_DAYS_DATE_PICKER_RETURN);
                for (WebElement returnDay : availableDaysToSelect) {
                    if (baseFunc.getTextOfElement(returnDay).equals(String.valueOf(expectedReturnDay))) {
                        baseFunc.click(returnDay);
                        break;
                    }
                }
            } catch (Exception e) {
                LOGGER.info("Invalid date!" + ":" + expectedReturnDay + " " + expectedReturnMonth);
            }
        }
        //baseFunc.click(baseFunc.list(SUBMIT_BUTTONS).get(1));
    }
    public void openAboutUsPage() {
        LOGGER.info("Opening next page - About us");
        baseFunc.openNextPage(DROP_DOWN_BUTTONS,DROP_DOWN_ELEMENTS, 2 );
    }

    public void selectMultiCityFlight() {
        LOGGER.info("Select Multi city flight type for flight request");
        List<WebElement> allDropDownMenus = baseFunc.list(DROP_DOWN_BUTTONS);
        baseFunc.click(allDropDownMenus.get(3));
        baseFunc.findElement(REQUEST_FORM_MENU);
        List<WebElement> allRequestOptions = baseFunc.list(REQUEST_OPTIONS);
        List<WebElement> flightTypes = allRequestOptions.subList(5, 8);
        for (WebElement flightType : flightTypes) {
            if(baseFunc.getTextOfElement(flightType).equals("Multi city")) {
                baseFunc.click(flightType);
                break;
            }
        }
        LOGGER.info("Checking if multi city request form displayed for homepage");
        Assertions.assertTrue(baseFunc.findElement(REQUEST_FORM).isDisplayed(), "request form not displayed on homepage");
        baseFunc.click(baseFunc.list(SUBMIT_BUTTONS).get(1));
        LOGGER.info("Checking text in input fields in request form");
        List<WebElement> inputFields = baseFunc.list(REQUEST_FORM_INPUT_FIELDS);
        for (WebElement input : inputFields) {
            Assertions.assertTrue(baseFunc.getTextOfElement(input).length() > 0, "no default text in placeholders in request form");
            Assertions.assertTrue(baseFunc.getTextOfElement(input).contains("This field is required."), "No error text in placeholders in request form ");
        }
        LOGGER.info("Checking if depart calendar opens in request form");
        List<WebElement> datePickersMultiCity = baseFunc.list(DATE_PICKERS);
        baseFunc.click(datePickersMultiCity.get(0));
        WebElement calendarOpened = baseFunc.findElement(DATE_PICKERS_OPENED);
        Assertions.assertTrue(calendarOpened.isDisplayed(), "calendar for depart date not displayed");
        baseFunc.click(allDropDownMenus.get(3));
        baseFunc.switchIframeIndex(0);
        baseFunc.click(IFRAME_FACEBOOK_CLOSE_CHAT_BTN);
        baseFunc.switchToMainPage();
        LOGGER.info("Checking add flight and remove flight buttons enabled in request form");
        Assertions.assertTrue(baseFunc.list(ADD_FLIGHT_BUTTON).get(2).isEnabled(), "Add flight button is disabled in multi city flight request");
        baseFunc.click(baseFunc.list(ADD_FLIGHT_BUTTON).get(2));
        Assertions.assertTrue(baseFunc.list(REMOVE_FLIGHT_BUTTON).get(2).isEnabled(), "Remove flight button is disabled in multi city flight request");
        baseFunc.click(baseFunc.list(REMOVE_FLIGHT_BUTTON).get(2));
    }
}
