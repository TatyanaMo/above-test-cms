package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class CookiesPolicyPage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@src='https://staging.above9.travel/img/trustpilot-light.svg']");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[@class='h-full flex items-center space-x-2 px-2 py-1 font-medium rounded appearance-none transition-colors focus:outline-none hover:bg-black hover:bg-opacity-10 focus:bg-black focus:bg-opacity-25 focus:text-white']");
    private final By LOG_IN_BUTTON = By.xpath(".//button[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By TITTLE_COOKIES_POLICY = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By TEXT = By.xpath(".//div[@data-custom-class='body']");
    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//li[@class='w-9 md:w-12']/img");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public CookiesPolicyPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public boolean isLogoAppearsInHeader() {
        LOGGER.info("Checking logo in header for cookies policy page");
        baseFunc.findElement(HEADER_LOGO);
        return true;
    }
    public boolean isReviewLinkAppearsInHeader() {
        LOGGER.info("Checking Trustpilot link in header for cookies policy page");
        String trustPilotUrl = baseFunc.findElement(REVIEW_HEADER_LINK).getAttribute("href");
        baseFunc.linksStatusCheck(trustPilotUrl);
        baseFunc.findElement(REVIEW_IMG).isDisplayed();
        return true;
    }
    public boolean isPhoneNumberLinkWorkInHeader() {
        LOGGER.info("Checking phone number in header for cookies policy page");
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        Assertions.assertTrue(phonesLInks.get(0).getAttribute("href").length()>0, "no phone number");
        return true;
    }
    public void openDropDown() {
        LOGGER.info("Checking presence of elements in all dropdown menus for cookies policy page");
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
        LOGGER.info("Checking presence of tittle for cookies policy page");
        Assertions.assertTrue(baseFunc.findElement(TITTLE_COOKIES_POLICY).getText().length()>0,"No tittle on terms of use page");
    }

    public boolean isTextDisplayed () {
        LOGGER.info("Checking presence of main text for cookies policy page");
        String text = baseFunc.findElement(TEXT).getText();
            Assertions.assertTrue(text.length() > 0, "no text on cookies policy page");
        return true;
    }
    public boolean isLinksWorks () {
        LOGGER.info("Links in footer return status 200 for cookies policy page");
        List<WebElement> menuItems = baseFunc.list(FOOTER_LINKS);
        for (WebElement item : menuItems) {
            String url = item.getAttribute("href");
            baseFunc.linksStatusCheck(url);
        }
        return true;
    }
    public boolean isPhoneNumberLinkWorkInFooter() {
        LOGGER.info("Phone number link in footer returns status 200 for cookies policy page");
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        Assertions.assertTrue(phonesLInks.get(1).getAttribute("href").length()>0, "no phone number");
        return true;
    }
    public boolean isEmailLinkWorkInFooter () {
        LOGGER.info("Email link in footer returns status 200 for cookies policy page");
        List<WebElement> email = baseFunc.list(EMAIL_LINK_IN_FOOTER);
        String link = email.get(1).getAttribute("href");
        if (link != null && !link.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link);
        }
        Assertions.assertTrue(email.get(1).getText().length()>0, "no phone number");
        return true;
    }
    public boolean isPaymentsDisplayed () {
        LOGGER.info("Checking if payment info displayed for cookies policy page");
        Assertions.assertTrue(baseFunc.findElement(PAYMENTS).getText().length()>0,"no payments on about us page");
        return true;
    }
    public boolean isPaymentMethodImageDisplayed () {
        LOGGER.info("Checking if partner list displayed for cookies policy page");
        List<WebElement> paymentsMethods = baseFunc.list(PAYMENTS_METHODS);
        for (WebElement paymentMethod : paymentsMethods) {
            paymentMethod.isDisplayed();
        }
        return true;
    }
    public boolean isPartnersDisplayed () {
        LOGGER.info("Checking if partner list displayed for cookies policy page");
        baseFunc.findElement(AIRLINES_PARTNERS).isDisplayed();
        return true;
    }
    public boolean isAllRightsTextDisplayed () {
        LOGGER.info("Checking if block about rights displayed for cookies policy page");
        Assertions.assertTrue(baseFunc.findElement(ALL_RIGHTS_TEXT).getText().length()>0, "no all right text on about us page");
        return true;
    }
    public void contactUsPage () {
        LOGGER.info("Opening next page - Contact us Page");
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        menuButtons.get(2).click();
        WebElement contactUsItem = baseFunc.list(DROP_DOWN_ELEMENTS).get(10);
        contactUsItem.click();
    }
}
