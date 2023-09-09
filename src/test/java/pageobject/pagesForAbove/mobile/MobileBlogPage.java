package pageobject.pagesForAbove.mobile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class MobileBlogPage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    private final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    private final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    private final By BUTTON_CLOSE = By.xpath(".//button[@aria-label='Close']");
    private final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    private final By CLOSE_BUTTONS = By.xpath(".//span[@class='absolute right-4 top-4 lg:right-0 lg:top-0']/button");
    private final By SIGN_UP_MODAL_WINDOW = By.id("register-title");
    private final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By BLOG_CONTAINER = By.xpath(".//div[contains(@class, 'overflow-x-auto gap-4 mb-2 sm:px-10 xl:px-32')]");
    private final By BLOG_CONTAINER_ITEMS = By.xpath(".//div[@class='rounded shadow-black']");



    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public MobileBlogPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void logoInHeader() {
        LOGGER.info("Checking logo in header for blog page");
        baseFunc.checkLogoInHeader(HEADER_LOGO);
    }
    public boolean isDropDownMenuOpen() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        baseFunc.click(menuButtons.get(0));
        Assertions.assertTrue(baseFunc.findElement(LOG_IN_BUTTON).isEnabled(), "button is disabled");
        Assertions.assertTrue(baseFunc.findElement(CREATE_PROFILE_BUTTON).isEnabled(), "button is disabled");
        baseFunc.click(baseFunc.list(BUTTON_CLOSE).get(0));
        baseFunc.click(menuButtons.get(1));
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS, 5);
        List<WebElement> submenuItems = baseFunc.list(DROP_DOWN_ELEMENTS);
        Assertions.assertEquals("About Us", baseFunc.getTextOfElement(submenuItems.get(0)), "No submenu item");
        Assertions.assertEquals("Blog", baseFunc.getTextOfElement(submenuItems.get(1)), "No submenu item");
        Assertions.assertEquals("Terms Of Use", baseFunc.getTextOfElement(submenuItems.get(2)), "No submenu item");
        Assertions.assertEquals("Privacy Policy", baseFunc.getTextOfElement(submenuItems.get(3)), "No submenu item");
        Assertions.assertEquals("Cookies Policy", baseFunc.getTextOfElement(submenuItems.get(4)), "No submenu item");
        Assertions.assertEquals("Contact us", baseFunc.getTextOfElement(submenuItems.get(5)), "No submenu item");
        Assertions.assertEquals("Manage cookie preferences", baseFunc.getTextOfElement(submenuItems.get(6)), "No submenu item");
        baseFunc.click(baseFunc.list(BUTTON_CLOSE).get(1));
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
        Assertions.assertTrue(baseFunc.list(SUBMIT_BUTTONS).get(0).isEnabled(), "Sign in button is disabled in login modal window");
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(SUBMIT_BUTTONS).get(0)).length() > 0, "Sign in button hasn't name in login modal window");
        List<WebElement> buttons = baseFunc.list(MODAL_WINDOW_BUTTONS).subList(0, 1);
        for (WebElement button : buttons) {
            Assertions.assertTrue(button.isEnabled(), "Buttons is disabled in login modal window");
            Assertions.assertTrue(baseFunc.getTextOfElement(button).length() > 0, "Buttons haven't names in login modal window");
        }
        return true;
    }

    public void loginModalClose() {
        LOGGER.info("Closing Login modal window");
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(0));
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
        baseFunc.click(baseFunc.list(CLOSE_BUTTONS).get(1));
    }

    public void getTittle() {
        LOGGER.info("Checking presence of tittle for blog page");
        Assertions.assertTrue(baseFunc.getTextOfElement(TITTLE).length() > 0, "No tittle on about us page");
    }
    public boolean isBlogDisplayed() {
        LOGGER.info("Checking presence of blog element for blog page");
        Assertions.assertTrue(baseFunc.findElement(BLOG_CONTAINER).isDisplayed(), "No blog container on blog page");
        List<WebElement> blogItems = baseFunc.list(BLOG_CONTAINER_ITEMS);
        Assertions.assertTrue(blogItems.size() > 0, "No any blog items in carousel blog container");
        return true;
    }

}
