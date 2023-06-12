package pageobject.pagesForAbove;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.http.HttpStatus;
import pageobject.BaseFunc;
import pageobject.model.Passenger;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@data-tid='banner-decline']");
    private final By FACEBOOK_MODAL = By.xpath(".//div[@class = 'welcomePageModalSheetContent']");
    private final By FACEBOOK_BTN = By.id("facebook");
    private final By IFRAME_HEADER = By.xpath(".//div[@class='_4ik4 _4ik5']");
    private final By IFRAME_TEXT = By.xpath(".//div[@class='_a2zt _a6s6 _4ik4 _4ik5']");
    private final By CLOSE_CHAT_BTN = By.xpath(".//div[@aria-label='close']");
    private final By START_CHAT_BTN = By.xpath(".//div[@class='_a2zm']");
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@src='https://staging.above9.travel/img/trustpilot-light.svg']");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[@class='h-full flex items-center space-x-2 px-2 py-1 font-medium rounded appearance-none transition-colors focus:outline-none hover:bg-black hover:bg-opacity-10 focus:bg-black focus:bg-opacity-25 focus:text-white']");
    private final By LOG_IN_BUTTON = By.xpath(".//button[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By HOME_PAGE_WELCOME_TEXT = By.xpath(".//div[@class='pt-4 md:pt-10 md:w-4/5']");
    private final By REQUEST_FORM = By.xpath(".//div[@class='space-y-6']");
    private final By HOME_PAGE_TEXT_ONE = By.xpath(".//div[@class='pt-12 pb-4 space-y-6 w-3/4 simple-content']");
    private final By CONTAINERS_TEXT = By.xpath(".//div[@class='container']");
    private final By HOME_PAGE_TEXT_THREE = By.xpath(".//div[@class='pb-1.5 flex flex-col lg:space-y-1']");
    private final By INSTRUCTION = By.xpath(".//div[@class='w-4/5']");
    private final By REVIEW_HEADER = By.xpath(".//h2[@class='text-2xl lg:text-3xl uppercase font-medium']");
    private final By REVIEW_CAROUSEL = By.xpath(".//div[@class='relative overflow-hidden swiper-container swiper-container-initialized swiper-container-horizontal']");
    private final By CAROUSEL_BTN_PREV = By.xpath(".//div[@class='swiper-button-prev m-0 w-10 h-10 static flex items-center justify-center transition ring-orange-400 ring-opacity-50 bg-none bg-orange-400 hover:bg-white focus:bg-white rounded hover:shadow focus:outline-none focus:ring-4']");
    private final By CAROUSEL_BTN_NEXT = By.xpath(".//div[@class='swiper-button-next m-0 w-10 h-10 static flex items-center justify-center transition ring-orange-400 ring-opacity-50 bg-none bg-orange-400 hover:bg-white focus:bg-white rounded hover:shadow focus:outline-none focus:ring-4']");
    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//li[@class='w-9 md:w-12']/img");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");

    private final By REQUEST_FORM_MENU = By.xpath(".//div[@class='fixed lg:absolute inset-0 lg:top-auto lg:bottom-auto z-40 bg-white lg:bg-transparent lg:max-h-96 lg:left-0 lg:right-auto']");
    private final By REQUEST_OPTIONS = By.xpath(".//span[@role='button']");
    private final By PASSENGERS_BLOCK = By.xpath(".//div[@class='flex items-center space-x-8']");
    private final By PASSENGERS_COUNTER_BTNS = By.xpath(".//button[@class='touch-manipulation flex-shrink-0 w-10 h-10 lg:w-8 lg:h-8 inline-flex items-center justify-center appearance-none transition ring-gray-400 bg-gray-200 text-gray-600 rounded hover:bg-gray-300 hover:text-gray-800 focus:outline-none focus:ring-2']");
    private final By DATA_PASSENGER_MESSAGE = By.xpath(".//div[@class='px-5 py-3 leading-5 text-red-500']");
    private final By PASSENGERS_CONFIRM_BTN = By.xpath(".//button[@class='group appearance-none py-4 lg:py-3 flex items-center justify-center border space-x-2 text-base font-semibold lg:font-medium whitespace-nowrap transition rounded-md md:rounded disabled:cursor-default disabled:bg-gray-400 disabled:shadow-none ring-orange-300 ring-opacity-50 focus:outline-none focus:ring-4 w-full px-5 border-gray-200 text-black hover:bg-gray-200 hover:text-black focus:text-black focus:bg-gray-200 focus:border-gray-300']");
    private final By CURRENT_ADULT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='adults']");
    private final By CURRENT_CHILD_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='children']");
    private final By CURRENT_INFANT_PASSENGER_NUMBER = By.xpath(".//input[@data-passengers-output='infants']");
    private final By INPUT_FIELDS_REQUEST_FORM = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0 py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-white text-white placeholder-white hover:border-orange-400 focus:border-orange-400 placeholder-opacity-75 focus:outline-none']");
    private final By INPUT_FIELDS_REQUEST_FORM_SELECTORS = By.xpath(".//div[@aria-selected='true']");
    private final By AIRPORTS_FROM_SUGGESTION = By.xpath(".//span[@class='-mr-2 flex-shrink-0 pl-2']");
    private final By INPUT_FROM = By.xpath(".//input[@aria-label='From (city or airport)']");
    private final By INPUT_TO = By.xpath(".//input[@aria-label='To (city or airport)']");
    private final By INPUT_COUNTRY_CODE = By.xpath(".//input[@aria-label='false']");
    private final By PHONES_CODES_SUGGESTION = By.xpath(".//div[@class='choices__item choices__item--choice choices__item--selectable']");
    private final By PHONE_CODES = By.xpath(".//div[@class='choices__item choices__item--choice choices__item--selectable is-highlighted']");
    private final By LISTS = By.xpath(".//div[@role='listbox']");
    private final By AIRPORT_TO = By.xpath(".//div[@class='is-parent choices__item choices__item--choice choices__item--selectable is-highlighted']");

    private final By BUTTONS = By.xpath(".//div[@class='px-3 w-1/4']");


    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies () {
        baseFunc.findElement(ACCEPT_COOKIES_BTN).click();
    }
    public boolean isLogoAppearsInHeader() {
        WebElement logo = baseFunc.findElement(HEADER_LOGO);
        return true;
    }
    public void IframeFacebookCheck () {
        baseFunc.switchIframe(0);
        baseFunc.waitElementPresented(FACEBOOK_MODAL);
        baseFunc.switchToMainPage();
        Assertions.assertTrue(baseFunc.findElement(IFRAME_HEADER).getText().length()>0 , "No text here'");
        Assertions.assertTrue(baseFunc.findElement(IFRAME_TEXT).getText().length()>0, "No text here");
        Assertions.assertTrue(baseFunc.findElement(START_CHAT_BTN).isEnabled(), "button is disabled");
        baseFunc.findElement(CLOSE_CHAT_BTN).click();
        baseFunc.switchToMainPage();
    }
    public boolean isReviewLinkAppearsInHeader() {
        String trustPilotUrl = baseFunc.findElement(REVIEW_HEADER_LINK).getAttribute("href");
        baseFunc.linksStatusCheck(trustPilotUrl);
        baseFunc.findElement(REVIEW_IMG).isDisplayed();
        return true;
    }
    public boolean isPhoneNumberLinkWorkInHeader() {
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        phonesLInks.get(0).getAttribute("href");
        return true;
    }
    public void openDropDown() {
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        menuButtons.get(0).click();
        Assertions.assertTrue(baseFunc.findElement(LOG_IN_BUTTON).isEnabled(), "button is disabled");
        Assertions.assertTrue(baseFunc.findElement(CREATE_PROFILE_BUTTON).isEnabled(), "button is disabled");

        menuButtons.get(1).click();
        List<WebElement> currencies = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("USD", currencies.get(0).getText(),"wrong currency");
        Assertions.assertEquals("EUR", currencies.get(1).getText(),"wrong currency");
        Assertions.assertEquals("CAD", currencies.get(2).getText(),"wrong currency");
        Assertions.assertEquals("AUD", currencies.get(3).getText(),"wrong currency");
        Assertions.assertEquals("GBP", currencies.get(4).getText(),"wrong currency");

        menuButtons.get(2).click();
        List<WebElement> submenuItems = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("About Us", submenuItems.get(5).getText(),"No submenu item");
        Assertions.assertEquals("Blog", submenuItems.get(6).getText(),"No submenu item");
        Assertions.assertEquals("Terms Of Use", submenuItems.get(7).getText(),"No submenu item");
        Assertions.assertEquals("Privacy Policy", submenuItems.get(8).getText(),"No submenu item");
        Assertions.assertEquals("Cookies Policy", submenuItems.get(9).getText(),"No submenu item");
        Assertions.assertEquals("Contact us", submenuItems.get(10).getText(),"No submenu item");
        Assertions.assertEquals("Manage cookie preferences", submenuItems.get(11).getText(),"No submenu item");
        menuButtons.get(2).click();
    }
    public boolean isHomePageWelcomeTextAppears () {
        Assertions.assertTrue(baseFunc.findElement(HOME_PAGE_WELCOME_TEXT).getText().length()>0, "No text here");
        return baseFunc.findElement(HOME_PAGE_WELCOME_TEXT).isDisplayed();
    }
    public boolean isRequestFormAppears () {
        return baseFunc.findElement(REQUEST_FORM).isDisplayed();
    }
    public boolean isTextOneAppears () {
        Assertions.assertTrue(baseFunc.findElement(HOME_PAGE_TEXT_ONE).getText().length()>0, "No text here");
        return baseFunc.findElement(HOME_PAGE_TEXT_ONE).isDisplayed();
    }
    public boolean isTextTwoAppears () {
        Assertions.assertTrue(baseFunc.list(CONTAINERS_TEXT).get(0).getText().length()>0, "No text here");
        return baseFunc.list(CONTAINERS_TEXT).get(0).isDisplayed();
    }
    public boolean isTextThreeAppears () {
        Assertions.assertTrue(baseFunc.list(HOME_PAGE_TEXT_THREE).get(0).getText().length()>0, "No text here'");
        return baseFunc.list(HOME_PAGE_TEXT_THREE).get(0).isDisplayed();
    }
    public void WhyChooseAboveBlockCheck () {
        Integer elements = baseFunc.list(CONTAINERS_TEXT).size();
        Assertions.assertTrue(baseFunc.list(CONTAINERS_TEXT).get(1).getText().length()>0, "No text here");
        Assertions.assertTrue(baseFunc.list(CONTAINERS_TEXT).get(2).getText().length()>0, "No text here");
    }
    public void reviewBlockCheck () {
        String reviewHeader = baseFunc.list(CONTAINERS_TEXT).get(3).findElements(REVIEW_HEADER).get(0).getText();
        String reviewCarousel = baseFunc.list(CONTAINERS_TEXT).get(3).findElement(REVIEW_CAROUSEL).getText();
        Assertions.assertTrue(reviewHeader.length()>0, "No text here");
        Assertions.assertTrue(reviewCarousel.length()>0, "No text here");
        //System.out.println(reviewCarousel);
        WebElement nextBtn = baseFunc.list(CONTAINERS_TEXT).get(3).findElement(CAROUSEL_BTN_NEXT);
        nextBtn.click();
        WebElement prevBtn = baseFunc.list(CONTAINERS_TEXT).get(3).findElement(CAROUSEL_BTN_PREV);
        prevBtn.click();

        Assertions.assertTrue(prevBtn.isEnabled(), "Prev carousel button is disabled");
        Assertions.assertTrue(nextBtn.isEnabled(), "Next carousel button is disabled");

    }
    public boolean isInstructionTittleAppears () {
        Assertions.assertTrue(baseFunc.list(CONTAINERS_TEXT).get(4).getText().length()>0, "No text here");
        List<WebElement> steps =  baseFunc.list(INSTRUCTION);
        int counter = 0;
        for (WebElement we : steps) {
            if (we.getText().length()>0) {
                counter++;
            }
        }
        return baseFunc.list(CONTAINERS_TEXT).get(4).isDisplayed();
    }
    public boolean isLinksWorks () {
        List<WebElement> menuItems = baseFunc.list(FOOTER_LINKS);
        for (WebElement item : menuItems) {
            String url = item.getAttribute("href");
            baseFunc.linksStatusCheck(url);
        }
        return true;
    }
    public boolean isPhoneNumberLinkWorkInFooter() {
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        phonesLInks.get(1).getAttribute("href");
        return true;
    }
    public boolean isEmailLinkWorkInFooter () {
        List<WebElement> email = baseFunc.list(EMAIL_LINK_IN_FOOTER);
        email.get(1).getAttribute("href");
        return true;
    }
    public void payments () {
        Assertions.assertTrue(baseFunc.findElement(PAYMENTS).getText().length()>0,"no payments on homepage");
    }
    public boolean isPaymentMethodImageDisplayed () {
        List<WebElement> paymentsMethods = baseFunc.list(PAYMENTS_METHODS);
        for (WebElement paymentMethod : paymentsMethods) {
            paymentMethod.isDisplayed();
        }
        return true;
    }
    public boolean isPartnersDisplayed () {
        baseFunc.findElement(AIRLINES_PARTNERS).isDisplayed();
        return true;
    }
    public void allRightsText () {
        Assertions.assertTrue(baseFunc.findElement(ALL_RIGHTS_TEXT).getText().length()>0, "no all right text on homepage");
    }

    public void fillFlightRequestForm (int adultPassengerToSelect) {
        List<WebElement> allDropDownMenus = baseFunc.list(DROP_DOWN_BUTTONS);
        allDropDownMenus.get(3).click();
        baseFunc.findElement(REQUEST_FORM_MENU);
        List<WebElement> allRequestOptions = baseFunc.list(REQUEST_OPTIONS);
        List<WebElement> flightTypes = allRequestOptions.subList(5,8);
        for (WebElement flightType : flightTypes) {
            Assertions.assertTrue(flightType.getText().length()>0, "flight types not displayed");
        }
        int randomIndexType = baseFunc.getRandomIndex(2);  // multi city not select!!
        WebElement selectedFlightType = flightTypes.get(randomIndexType);
        selectedFlightType.click();
        System.out.println("selected index" + " " + randomIndexType);

        allDropDownMenus.get(4).click();
        baseFunc.findElement(REQUEST_FORM_MENU);
        List<WebElement> passengersCounterBlock = baseFunc.list(PASSENGERS_BLOCK);
        List<WebElement> activePassengerBlock = passengersCounterBlock.subList(3,6);
        for (WebElement passengersType : activePassengerBlock) {
            Assertions.assertTrue(passengersType.isDisplayed(), "passengers type not displayed");
            Assertions.assertTrue(passengersType.getText().length()>0, "passengers type not displayed");
        }
        List<WebElement> passengersButtons = baseFunc.list(PASSENGERS_COUNTER_BTNS);
        List<WebElement> activePassengerButtons = passengersButtons.subList(6,12);
        for (WebElement button : activePassengerButtons) {
            Assertions.assertTrue(button.isEnabled(), "counter button disabled");
        }

        int desiredAdultPassengerCount = adultPassengerToSelect;
        int desiredChildPassengerCount = 2 * desiredAdultPassengerCount;
        int desiredInfantPassengerCount = desiredAdultPassengerCount;
        int maxTotalPassengersCount = desiredAdultPassengerCount + desiredChildPassengerCount + desiredInfantPassengerCount;

        WebElement adultsCountElement = baseFunc.list(CURRENT_ADULT_PASSENGER_NUMBER).get(1);
        int currentAdultCount = Integer.parseInt(adultsCountElement.getAttribute("value"));
        System.out.println(currentAdultCount);
        while (currentAdultCount < desiredAdultPassengerCount) {
            activePassengerButtons.get(1).click();
            currentAdultCount++;
        }

        WebElement childCountElement = baseFunc.list(CURRENT_CHILD_PASSENGER_NUMBER).get(1);
        int currentChildCount = Integer.parseInt(childCountElement.getAttribute("value"));
        System.out.println(currentChildCount);
        while (currentChildCount < desiredChildPassengerCount) {
            activePassengerButtons.get(3).click();
            currentChildCount++;
        }

        WebElement infantCountElement = baseFunc.list(CURRENT_INFANT_PASSENGER_NUMBER).get(1);
        int currentInfantCount = Integer.parseInt(infantCountElement.getAttribute("value"));
        System.out.println(currentInfantCount);
        while (currentInfantCount< desiredInfantPassengerCount) {
            activePassengerButtons.get(5).click();
            currentInfantCount++;
        }
        if (maxTotalPassengersCount > 9) {
            System.out.println(baseFunc.findElement(DATA_PASSENGER_MESSAGE).getText());
        }
        if (baseFunc.findElement(DATA_PASSENGER_MESSAGE).getText().length()>0 ) {
            System.out.println(baseFunc.findElement(DATA_PASSENGER_MESSAGE).getText());
        }

        Assertions.assertEquals(desiredAdultPassengerCount, currentAdultCount, "number of adults not equal");
        Assertions.assertEquals(desiredChildPassengerCount, currentChildCount, "number of children not equal");
        Assertions.assertEquals(desiredInfantPassengerCount, currentInfantCount, "number of children not equal");

        baseFunc.list(PASSENGERS_CONFIRM_BTN).get(1).click();


        allDropDownMenus.get(5).click();
        baseFunc.findElement(REQUEST_FORM_MENU);
        List<WebElement> classTypes = allRequestOptions.subList(8,10);
        for (WebElement classType : classTypes) {
            Assertions.assertTrue(classType.getText().length()>0, "flight class not displayed");
        }
        int randomIndexClass = baseFunc.getRandomIndex(classTypes.size());
        WebElement selectedFlightClass = classTypes.get(randomIndexClass);
        selectedFlightClass.click();
        System.out.println("selected index" + " " + randomIndexClass);
    }

    public void fillInPassengerInfo(Passenger passenger) {

        WebElement inputName = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(0);
        WebElement inputPhone = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(1);
        WebElement inputEmail = baseFunc.list(INPUT_FIELDS_REQUEST_FORM).get(2);
        baseFunc.type(inputName, passenger.getName());
        baseFunc.type(inputPhone, passenger.getPhoneNumber());
        baseFunc.type(inputEmail, passenger.getEmail());
    }
    public void selectAirportsAndCountryCodeFromSuggestionLists (String locationFrom, String locationTo,String countryCode, Passenger passenger) {
        WebElement inputAirportFrom = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(4);
        inputAirportFrom.click();
        WebElement inputFrom = baseFunc.list(INPUT_FROM).get(1);
        inputFrom.click();
        baseFunc.type(inputFrom, passenger.getAirportFrom());
        List<WebElement>suggestionsFrom = baseFunc.list(AIRPORTS_FROM_SUGGESTION);
        baseFunc.waitElementPresented(AIRPORTS_FROM_SUGGESTION);
        //baseFunc.waitForElementsCountAtLeast(AIRPORTS_SUGGESTION,1);
        boolean isFoundFrom = false;
        for (WebElement we : suggestionsFrom) {
            if (we.getText().equals(locationFrom)) {
                we.click();
                isFoundFrom= true;
                break;
            }
        }
        Assertions.assertTrue(isFoundFrom, "Location " + locationFrom + " can't be found in a suggestion list");

        WebElement inputCountryCode = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(7);
        inputCountryCode.click();
        WebElement inputCode = baseFunc.list(INPUT_COUNTRY_CODE).get(1);
        inputCode.click();
        baseFunc.type(inputCode, passenger.getCountryCode());
        WebElement suggestionsCode = baseFunc.list(PHONE_CODES).get(1);
        baseFunc.waitElementPresented(PHONES_CODES_SUGGESTION);
        if (suggestionsCode.getText().equals(countryCode)) {
            suggestionsCode.click();
        }
        //Assertions.assertTrue(suggestionsCode.getText().equals(countryCode), "Country code not found in suggestion list" );

        WebElement inputAirportTo = baseFunc.list(INPUT_FIELDS_REQUEST_FORM_SELECTORS).get(6);
        inputAirportTo.click();
        WebElement inputTo = baseFunc.list(INPUT_TO).get(1);
        baseFunc.type(inputTo, passenger.getAirportTo());
        WebElement airportToList = baseFunc.list(LISTS).get(4);
        WebElement airportToSelect = baseFunc.findElement(AIRPORT_TO);
        if (airportToSelect.getAttribute("data-value").equals(locationTo)) {
            airportToSelect.click();
        }

        WebElement submitButton = baseFunc.list(BUTTONS).get(7);
        submitButton.click();
    }

    public void openAboutUsPage () {
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        menuButtons.get(2).click();
        WebElement aboutUsMenuItem = baseFunc.list(DROP_DOWN_ELEMENTS).get(5);
        aboutUsMenuItem.click();
    }
}
