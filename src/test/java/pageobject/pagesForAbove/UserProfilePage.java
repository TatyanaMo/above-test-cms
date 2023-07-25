package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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
    private final By PERSONAL_INFO_FIELDS_NAMES = By.xpath(".//legend[@class='text-xs text-gray-500 cursor-default']");
    private final By PERSONAL_INFO_PLACEHOLDERS = By.xpath(".//input[contains(@class,'appearance-none block h-10 leading-8 px-0 py-1 w-full text-sm rounded-none')]");
    private final By GENDER_RADIO_BUTTONS = By.xpath(".//input[@type='radio']");
    private final By GENDER_RADIO_BUTTON_NAMES = By.xpath(".//span[@class='pl-3 font-medium leading-5 cursor-pointer after-disabled:cursor-default ']");
    private final By CHOICES_FIELDS = By.xpath(".//div[@class='choices__inner']");
    private final By DROPDOWN_LISTS = By.xpath(".//div[contains(@class,'choices__list choices__list--dropdown')]");
    private final By CHOICES_LISTS = By.xpath(".//div[contains(@class,'choices__item choices__item--choice choices__item--selectable')]");




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

        return true;
    }
    public boolean isPersonalInfoBlockElementsDisplayed () {
        LOGGER.info("Check placeholders names and text in input fields in personal info block");
        Assertions.assertTrue(baseFunc.findElement(PERSONAL_INFO_BLOCK).isDisplayed(), "Personal info block not displayed in My profile page");
        List<WebElement> personalInfoFieldsName = baseFunc.list(PERSONAL_INFO_FIELDS_NAMES);
        for (WebElement name : personalInfoFieldsName) {
            Assertions.assertTrue(baseFunc.getTextOfElement(name).length() > 0, "No names in input fields in personal info block");
        }
        List<WebElement> personalInfoPlaceholders = baseFunc.list(PERSONAL_INFO_PLACEHOLDERS);
        for (int i =0; i < personalInfoPlaceholders.size(); i++) {
            if (i==5) {
                continue;
            }
            if (personalInfoPlaceholders.get(i).getAttribute("value").length()==0) {
                continue;
            }
            Assertions.assertTrue(personalInfoPlaceholders.get(i).getAttribute("placeholder").length() > 0 , "No default text in placeholders in personal info block");
            Assertions.assertTrue(personalInfoPlaceholders.get(i).getAttribute("value").length() > 0, "No entered text in input fields in personal info block");
        }
        LOGGER.info("Check gender radio buttons");
        List<WebElement> radioButtons = baseFunc.list(GENDER_RADIO_BUTTONS);
        for (WebElement radioButton : radioButtons) {
            Assertions.assertTrue(radioButton.isEnabled(), "Gender radio button is disabled in personal info block");
        }
        List<WebElement> buttonsNames = baseFunc.list(GENDER_RADIO_BUTTON_NAMES);
        for (WebElement buttonName :buttonsNames ) {
            Assertions.assertTrue(baseFunc.getTextOfElement(buttonName).length() > 0, "No buttons names for gender radio buttons in personal info block");
        }
        LOGGER.info("Check nationality and phone codes dropdown lists");
        List<WebElement> choicesOptions = baseFunc.list(CHOICES_FIELDS);
        baseFunc.click(choicesOptions.get(0));
        baseFunc.waitForElementAttributeToBeNew(baseFunc.list(DROPDOWN_LISTS).get(0), "class", "choices__list choices__list--dropdown is-active");
        List <WebElement> choicesLists = baseFunc.list(DROPDOWN_LISTS).get(0).findElements(CHOICES_LISTS);
        for (WebElement choiceList : choicesLists) {
            System.out.println(choiceList.getText());
        }
        return true;
    }
}
