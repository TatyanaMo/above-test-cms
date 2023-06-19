package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class ContactUsPage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@src='https://staging.above9.travel/img/trustpilot-light.svg']");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[@class='h-full flex items-center space-x-2 px-2 py-1 font-medium rounded appearance-none transition-colors focus:outline-none hover:bg-black hover:bg-opacity-10 focus:bg-black focus:bg-opacity-25 focus:text-white']");
    private final By LOG_IN_BUTTON = By.xpath(".//button[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By TITTLE_COOKIES_POLICY = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By HEADERS = By.xpath(".//h2[@class='text-xl lg:text-2xl font-medium']");
    private final By CONTACT_FORM = By.xpath(".//div[@class='pt-8 space-y-5']");
    private final By PLACEHOLDERS_TEXT = By.xpath(".//input[@type='text']");
    private final By PLACEHOLDERS_EMAIL = By.xpath(".//input[@type='email']");
    private final By TEXT_AREA = By.xpath(".//textarea[@class='appearance-none block leading-6 py-1 px-0 w-full h-32 border-b text-sm rounded-none transition bg-transparent border-gray-300 text-black placeholder-gray-500 placeholder-opacity-75 hover:border-orange-400 focus:border-orange-400 focus:outline-none']");
    private final By CHECKBOX = By.xpath(".//label[@class='flex direct-group']/input");
    private final By CHECKBOX_TEXT = By.xpath(".//label[@class='flex direct-group']/span");
    private final By SUBMIT_BUTTONS = By.xpath(".//span[@class='appearance-none relative touch-manipulation rounded-md md:rounded select-none transition block hover:shadow-xs']/button");
    private final By USEFUL_INFO_BLOCKS_HEADERS = By.xpath(".//div[@class='w-full lg:px-4 lg:w-1/3']/article/header/h3");
    private final By USEFUL_INFO_BLOCKS_CONTACTS = By.xpath(".//div[@class='w-full lg:px-4 lg:w-1/3']/article/div/p/a");
    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//li[@class='w-9 md:w-12']/img");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");

    private final By MODAL_WINDOW = By.xpath(".//div[@class='termly-styles-preferenceModal-76cbd2 t-preference-modal']");
    private final By MODAL_WINDOW_HEADER = By.xpath(".//div[@class='termly-styles-preferenceContainer-fb5a6d']/div/h2");
    private final By MODAL_WINDOW_TEXT = By.xpath(".//div[@class='termly-styles-preferenceContainer-fb5a6d']/div/p");
    private final By MODAL_WINDOW_COOKIES_TYPES = By.xpath(".//div[@class='termly-styles-root-d0bda1']");
    private final By COOKIE_LABELS = By.xpath(".//div[@class='termly-styles-cbLabel-2537e7']");
    private final By COOKIE_COUNTS = By.xpath(".//div[@class='termly-styles-cookieCount-2c45d5']");
    private final By COOKIE_DETAILS_LINKS = By.xpath(".//div[@class='termly-styles-detailsLink-306d76 t-detailsLink']");
    private final By COOKIE_TEXT= By.xpath(".//div[@class='termly-styles-body-aabd97']");
    private final By BACK_BUTTON = By.xpath(".//div[@class='termly-styles-backButton-1ea7f3 t-backButton']");
    private final By COOKIE_DETAILS_HEADER = By.xpath(".//div[@class='termly-styles-preferenceContainer-fb5a6d']/h2");
    private final By COOKIE_DETAILS_BODY = By.xpath(".//div[@class='termly-styles-container-adb668']");
    private final By COOKIE_DETAILS_TABLES_NAME = By.xpath(".//div[@class='termly-styles-container-adb668']/h3");
    private final By DECLINE_BUTTON = By.xpath(".//button[@class='termly-styles-module-root-f61419 termly-styles-module-primary-9738f2 termly-styles-module-solid-20a66a termly-styles-button-e6bc23 t-declineAllButton']");
    private final By ALLOW_BUTTON = By.xpath(".//button[@class='termly-styles-module-root-f61419 termly-styles-module-primary-9738f2 termly-styles-module-solid-20a66a termly-styles-button-e6bc23 t-allowAllButton']");
    private final By CLOSE_MODAL_WINDOW_BUTTON = By.xpath(".//div[@class='termly-styles-closeTag-c6ad69 t-closeModal']");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public ContactUsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public boolean isLogoAppearsInHeader() {
        LOGGER.info("Checking logo in header for contact us page");
        baseFunc.findElement(HEADER_LOGO);
        return true;
    }
    public boolean isReviewLinkAppearsInHeader() {
        LOGGER.info("Checking Trustpilot link in header for contact us page");
        String trustPilotUrl = baseFunc.findElement(REVIEW_HEADER_LINK).getAttribute("href");
        baseFunc.linksStatusCheck(trustPilotUrl);
        baseFunc.findElement(REVIEW_IMG).isDisplayed();
        return true;
    }
    public boolean isPhoneNumberLinkWorkInHeader() {
        LOGGER.info("Checking phone number in header for contact us page");
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        Assertions.assertTrue(phonesLInks.get(0).getAttribute("href").length()>0, "no phone number");
        return true;
    }
    public void openDropDown() {
        LOGGER.info("Checking presence of elements in all dropdown menus for contact us page");
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        menuButtons.get(0).click();
        Assertions.assertTrue(baseFunc.findElement(LOG_IN_BUTTON).isEnabled(), "button is disabled");
        Assertions.assertTrue(baseFunc.findElement(CREATE_PROFILE_BUTTON).isEnabled(), "button is disabled");

        menuButtons.get(1).click();
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS, 3);
        List<WebElement> currencies = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("USD", currencies.get(0).getText(),"wrong currency");
        Assertions.assertEquals("EUR", currencies.get(1).getText(),"wrong currency");
        Assertions.assertEquals("CAD", currencies.get(2).getText(),"wrong currency");
        Assertions.assertEquals("AUD", currencies.get(3).getText(),"wrong currency");
        Assertions.assertEquals("GBP", currencies.get(4).getText(),"wrong currency");

        menuButtons.get(2).click();
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS,3);
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
    public void getTittle() {
        LOGGER.info("Checking presence of tittle for contact us page");
        Assertions.assertTrue(baseFunc.findElement(TITTLE_COOKIES_POLICY).getText().length()>0,"No tittle on terms of use page");
    }
    public boolean isHeadersDisplayed () {
        LOGGER.info("Checking if header displayed for contact form for contact us page");
        List<WebElement> headers = baseFunc.list(HEADERS);
        for (WebElement header : headers) {
            Assertions.assertTrue(header.getText().length()>0, "No headers on Contact us page");
        }
        return true;
    }
    public boolean isPlaceholdersTextDisplayed () {
        LOGGER.info("Checking if placeholders displayed for contact form for contact us page");
        Assertions.assertTrue(baseFunc.findElement(CONTACT_FORM).isDisplayed(), "contact form not displayed in contact us page");
        List<WebElement> placeholders = baseFunc.list(PLACEHOLDERS_TEXT).subList(2,5);
        for ( WebElement placeholder : placeholders) {
            String name = placeholder.getAttribute("placeholder");
            Assertions.assertTrue(name.length()>0, "no name in placeholder field in contact us form");
        }
        String email = baseFunc.list(PLACEHOLDERS_EMAIL).get(2).getAttribute("placeholder");
        Assertions.assertTrue(email.length()>0, "no email name in placeholder field in contact us form");
        Assertions.assertTrue(baseFunc.findElement(TEXT_AREA).getAttribute("placeholder").length()>0, "no name of text area in contact us form");

        Assertions.assertTrue(baseFunc.findElement(CHECKBOX).isDisplayed(), "no checkbox in contact us form");
        Assertions.assertTrue(baseFunc.findElement(CHECKBOX_TEXT).getText().length()>0, "no text for checkbox in contact us form");
        return true;
    }
    public boolean isSubmitButtonEnabled () {
        LOGGER.info("Checking if submit button enabled for contact form for contact us page");
        Assertions.assertTrue(baseFunc.list(SUBMIT_BUTTONS).get(4).isEnabled(), "submit button is disabled in contact us form");
        return true;
    }
    public boolean isUsefulInfoBlockDisplayed () {
        LOGGER.info("Checking if useful info block displayed for contact form for contact us page");
        List<WebElement>infoBlocks = baseFunc.list(USEFUL_INFO_BLOCKS_HEADERS);
        for (WebElement infoBlock : infoBlocks) {
            Assertions.assertTrue(infoBlock.getText().length()>0, "No text header in useful information block in contact us page");
        }
        List<WebElement>infoBlockLinks = baseFunc.list(USEFUL_INFO_BLOCKS_CONTACTS);
        Assertions.assertTrue(infoBlockLinks.get(0).getText().length()>0, "no phone number in support info block");
        Assertions.assertTrue(infoBlockLinks.get(2).getText().length()>0, "no phone number in travel request info block");
        Assertions.assertTrue(infoBlockLinks.get(4).getText().length()>0, "no phone number in cooperation info block");

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

    public boolean isLinksWorks () {
        LOGGER.info("Links in footer return status 200 for contact us page");
        List<WebElement> menuItems = baseFunc.list(FOOTER_LINKS);
        for (WebElement item : menuItems) {
            String url = item.getAttribute("href");
            baseFunc.linksStatusCheck(url);
        }
        return true;
    }
    public boolean isPhoneNumberLinkWorkInFooter() {
        LOGGER.info("Phone number link in footer returns status 200 for contact us page");
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        Assertions.assertTrue(phonesLInks.get(1).getAttribute("href").length()>0, "no phone number");
        return true;
    }
    public boolean isEmailLinkWorkInFooter () {
        LOGGER.info("Email link in footer returns status 200 for contact us page");
        List<WebElement> email = baseFunc.list(EMAIL_LINK_IN_FOOTER);
        String link = email.get(1).getAttribute("href");
        if (link != null && !link.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link);
        }
        Assertions.assertTrue(email.get(1).getText().length()>0, "no phone number");
        return true;
    }
    public boolean isPaymentsDisplayed () {
        LOGGER.info("Checking if payment info displayed for contact us page");
        Assertions.assertTrue(baseFunc.findElement(PAYMENTS).getText().length()>0,"no payments on about us page");
        return true;
    }
    public boolean isPaymentMethodImageDisplayed () {
        LOGGER.info("Checking if partner list displayed for contact us page");
        List<WebElement> paymentsMethods = baseFunc.list(PAYMENTS_METHODS);
        for (WebElement paymentMethod : paymentsMethods) {
            paymentMethod.isDisplayed();
        }
        return true;
    }
    public boolean isPartnersDisplayed () {
        LOGGER.info("Checking if partner list displayed for contact us page");
        baseFunc.findElement(AIRLINES_PARTNERS).isDisplayed();
        return true;
    }
    public boolean isAllRightsTextDisplayed () {
        LOGGER.info("Checking if block about rights displayed for contact us page");
        Assertions.assertTrue(baseFunc.findElement(ALL_RIGHTS_TEXT).getText().length()>0, "no all right text on about us page");
        return true;
    }
    public void manageCookiesPreferencesModalOpen() {
        LOGGER.info("Opening manage cookies modal window");
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        menuButtons.get(2).click();
        WebElement manageCookiesPreferencesItem = baseFunc.list(DROP_DOWN_ELEMENTS).get(11);
        manageCookiesPreferencesItem.click();
    }
    public boolean isModalWindowDisplayedCorrect () {
        LOGGER.info("Checking is  manage cookies modal window displayed");
        baseFunc.waitElementToBeVisible(MODAL_WINDOW);
        baseFunc.switchTab(0);
        WebElement modalWindow = baseFunc.findElement(MODAL_WINDOW);
        if (modalWindow.isDisplayed()) {
            Assertions.assertTrue(baseFunc.findElement(MODAL_WINDOW_HEADER).getText().length()>0, "no header in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.findElement(MODAL_WINDOW_TEXT).getText().length()>0, "no text in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.list(MODAL_WINDOW_COOKIES_TYPES).size()>0, "no information about cookies in 'cookie preferences' modal window");
            List<WebElement> cookieLabels = baseFunc.list(COOKIE_LABELS);
            for (WebElement cookieLabel : cookieLabels) {
                Assertions.assertTrue(cookieLabel.getText().length()>0, "no cookie label in 'cookie preferences' modal window");
            }
            List<WebElement>cookieCounts = baseFunc.list(COOKIE_COUNTS);
            for (WebElement cookieCount : cookieCounts) {
            Assertions.assertTrue(cookieCount.getText().length()>0, "no cookie count in 'cookie preferences' modal window");
            }
            List<WebElement>cookieTexts = baseFunc.list(COOKIE_TEXT);
            for (WebElement cookieText : cookieTexts) {
                Assertions.assertTrue(cookieText.getText().length()>0, "no cookies description text in 'cookie preferences' modal window");
            }
            List<WebElement>cookiesTypes = baseFunc.list(MODAL_WINDOW_COOKIES_TYPES);
            for (WebElement cookieType : cookiesTypes) {
                baseFunc.findElement(COOKIE_DETAILS_LINKS).click();
                Assertions.assertTrue(baseFunc.findElement(COOKIE_DETAILS_HEADER).getText().length()>0, "no cookie header in detailed information in 'cookie preferences' modal window");
                List<WebElement> cookieTablesName = baseFunc.list(COOKIE_DETAILS_TABLES_NAME);
                for (WebElement cookieTableName : cookieTablesName) {
                    Assertions.assertTrue(cookieTableName.getText().length()>0, "no table name in detailed information in 'cookie preferences' modal window");
                }
                List<WebElement> cookieDetailsBodyInformation = baseFunc.list(COOKIE_DETAILS_BODY);
                for (WebElement cookieDetailBlock : cookieDetailsBodyInformation){
                   Assertions.assertTrue(cookieDetailBlock.isDisplayed(), "table not displayed in detailed information in 'cookie preferences' modal window");
                }
                baseFunc.findElement(BACK_BUTTON).click();
            }
            Assertions.assertTrue(baseFunc.findElement(DECLINE_BUTTON).isEnabled(), "decline btn is disabled in 'cookie preferences' modal window");
            Assertions.assertTrue(baseFunc.findElement(ALLOW_BUTTON).isEnabled(), "allow btn is disabled in 'cookie preferences' modal window");

        } else {
            System.out.println("'cookie preferences' modal window doesn't appears");
        }
        return true;
    }
    public void manageCookiesPreferencesModalClose () {
        LOGGER.info("Closing manage cookies modal window");
        baseFunc.findElement(CLOSE_MODAL_WINDOW_BUTTON).click();
    }
}
