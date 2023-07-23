package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

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



    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public UserProfilePage (BaseFunc baseFunc) {
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
        Assertions.assertTrue(baseFunc.getTextOfElement(MY_PROFILE_TITTLE).length() >0 , "No tittle in My profile page");
        return true;
    }
    public boolean isMyProfileOptionsDisplayed() {
        LOGGER.info("Checking all options in My profile page");
        List<WebElement> options = baseFunc.list(MY_PROFILE_OPTIONS);
        for (WebElement option : options) {
            Assertions.assertEquals(4, options.size(), "Not all options displayed in My profile page");
            Assertions.assertTrue(baseFunc.getTextOfElement(option).length() >0 , "No text in my profile option");
        }
        LOGGER.info("Checking personal info block");
        Assertions.assertTrue(baseFunc.findElement(PERSONAL_INFO_BLOCK).isDisplayed(), "Personal info block not displayed in My profile page");

        return true;
    }
}
