package pageobject.pagesForAbove.mobile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class MobileUserProfilePage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    private final By MY_PROFILE_BUTTON = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By LOG_OUT_BUTTON = By.xpath(".//form[@action='https://staging.above9.travel/logout']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    private final By CLOSE_BUTTONS = By.xpath(".//button[@aria-label='Close']");
    private final By MY_PROFILE_TITTLE = By.xpath(".//h2[@class='text-xl lg:text-2xl font-medium']");
    private final By MY_PROFILE_OPTIONS = By.xpath(".//li[@class='flex-shrink-0']");


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
}
