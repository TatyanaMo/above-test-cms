package pageobject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.web.client.RestTemplate;
import pageobject.pagesForAbove.HomePage;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBe;

public class BaseFunc {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private WebDriver browser;
    private WebDriverWait wait;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        browser = new ChromeDriver(options);
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        /*
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, Duration.ofSeconds(10));
         */
    }

    public HomePage openHomePage() {
        openUrl("staging.above9.travel/");
        return new HomePage(this);
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        browser.get(url);
    }

    public void switchIframe(By locator) {
        WebElement we = findElement(locator);
        browser.switchTo().frame(we);
    }

    public void switchIframeWe(WebElement we) {
        browser.switchTo().frame(we);
    }

    public void switchIframeIndex(int index) {
        browser.switchTo().frame(index);
    }

    public void switchToMainPage() {
        browser.switchTo().defaultContent();
    }

    public void switchTab(int tabIndex) {
        List<String> windowHandles = new ArrayList<>(browser.getWindowHandles());
        if (tabIndex >= 0 && tabIndex < windowHandles.size()) {
            browser.switchTo().window(windowHandles.get(tabIndex));
        } else {
            throw new IndexOutOfBoundsException("Invalid tab index: " + tabIndex);
        }
    }

    public void goBack() {
        browser.navigate().back();
    }

    public void closeTab() {
        browser.close();
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void click(WebElement we) {
        wait.until(ExpectedConditions.elementToBeClickable(we)).click();
    }

    public List<WebElement> list(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return browser.findElements(locator);
    }

    public void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }
    public void selectList (By locatorOne, int index, String value) {
        List<WebElement> selectFields = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locatorOne));
        WebElement selectField = selectFields.get(index);
        Select select = new Select(selectField);
        select.selectByValue(value);
    }

    public void selectByText(By locator, String text) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByVisibleText(text);
    }

    public void selectByText(By locator, int text) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByVisibleText(String.valueOf(text));
    }

    public void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
    public void type(By locator, String text) {
        WebElement input = findElement((locator));
        input.clear();
        input.sendKeys(text);
    }

    public void type(WebElement element, int text) {
        type(element, String.valueOf(text));
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public String getTextOfElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }

    public String getTextOfElement(WebElement we) {
        return we.getText();
    }

    public void waitElementPresented(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitForElementsCountAtLeast(By locator, int count) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, count));
    }

    public void waitForElementNotClickable(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void waitAllElementsToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void waitForDisplayedElement(WebElement we, String text) {
        wait.until(ExpectedConditions.attributeToBe(we, "class", text));
    }

    public void waitForText(By locator, String text) {
        wait.until(textToBe(locator, text));
    }

    public void linksStatusCheck(String string) {
        RestTemplate restTemplate = new RestTemplate();
        boolean response = restTemplate.getForEntity(string, String.class).getStatusCode().is2xxSuccessful();
    }

    public int getRandomIndex(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

    public void footerLinksOpen(By locatorOne, By locatorTwo) {
        List<WebElement> menuItems = browser.findElements(locatorOne);
        int numberLinks = menuItems.size();
        for (int i = 0; i < numberLinks; i++) {
            List<WebElement> updatedMenuItems = browser.findElements(locatorOne);
            WebElement item = updatedMenuItems.get(i);
            item.click();
            waitElementPresented(locatorTwo);
            if (browser.findElement(locatorTwo).isDisplayed()) {
                goBack();
                switchTab(0);
            } else {
                LOGGER.error("Page doesn't open from footer link");
            }
        }
    }

    public void footerLinksOpenWithException(By locatorOne, int index, By locatorTwo) {
        List<WebElement> menuItems = browser.findElements(locatorOne);
        int numberLinks = menuItems.size();
        for (int i = 0; i < numberLinks; i++) {
            if (i == index) {
                continue;
            }
            List<WebElement> updatedMenuItems = browser.findElements(locatorOne);
            WebElement item = updatedMenuItems.get(i);
            item.click();
            waitElementPresented(locatorTwo);
            if (browser.findElement(locatorTwo).isDisplayed()) {
                goBack();
                switchTab(0);
            } else {
                LOGGER.error("Page doesn't open from footer link");
            }
        }
    }

    public void checkLogInModalWindow(By locatorOne, By locatorTwo, By locatorThree, By locatorFour, By locatorFive, By locatorSix) {
        List<WebElement> menuButtons = list(locatorOne);
        menuButtons.get(0).click();
        findElement(locatorTwo).click();
        waitAllElementsToBeVisible(locatorThree);
        switchTab(0);
        findElement(locatorThree);
        List<WebElement> loginInputFields = list(locatorFour).subList(0, 1);
        list(locatorFive).get(2);
        list(locatorSix).subList(0, 1);
    }

    public void checkSignUpModalWindow(By locatorOne, By locatorTwo, By locatorThree, By locatorFour, By locatorFive, By locatorSix) {
        List<WebElement> menuButtons = list(locatorOne);
        menuButtons.get(0).click();
        findElement(locatorTwo).click();
        waitAllElementsToBeVisible(locatorThree);
        switchTab(0);
        findElement(locatorThree);
        list(locatorFour).subList(2, 6);
        list(locatorFive).subList(0, 1);
        list(locatorSix).get(2);
    }
    public void checkReviewLinkInHeader(By locatorOne, By locatorTwo, By locatorThree, By locatorFour) {
        linksStatusCheck(findElement(locatorOne).getAttribute("href"));
        findElement(locatorTwo).isDisplayed();
        click(locatorThree);
        switchTab(1);
        try {
            waitElementPresented(locatorFour);
            if (findElement(locatorFour).isDisplayed()) {
                closeTab();
                switchTab(0);
            } else {
                LOGGER.error("Trustpilot link doesn't open in new page properly");
            }
        } catch (NoSuchElementException e) {
            LOGGER.error("Trustpilot link doesn't open in new page properly", e);
        }
    }
    public void checkPhoneNumberLinkInHeader( By locator) {
        Assertions.assertTrue(list(locator).get(0).getAttribute("href").length() > 0, "no phone number");
    }
    public void openNextPage(By locatorOne, By locatorTwo,int indexOne, int indexTwo ) {
        click(list(locatorOne).get(indexOne));
        click(list(locatorTwo).get(indexTwo));
    }
    public boolean isPaymentsDisplayed(By locator) {
       return  getTextOfElement(locator).length() > 0;
    }
    public boolean isPaymentMethodImageDisplayed(By locator) {
        for (WebElement we : list(locator)) {
            we.isDisplayed();
        }
        return true;
    }
    public boolean isPartnersDisplayed(By locator) {
        findElement(locator).isDisplayed();
        return true;
    }
    public boolean isAllRightsTextDisplayed(By locator) {
        return getTextOfElement(locator).length() > 0;
    }
    public void closeBrowser() {
        if (browser !=null) {
            browser.quit();
        }
    }
    public int checkTextInAllElementsOfList(By locator) {
        List<WebElement>weList = list(locator);
        int totalLength = 0;
        for (WebElement we : weList) {
            totalLength += getTextOfElement(we).length();
        }
        return totalLength;
    }

    public void waitForElementsToBeAtLeast(By locator, int minCount) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, minCount - 1));
    }

    public void waitForElementAttributeToBe(By locator, String attribute, String value) {
        waitForElementsToBeAtLeast(locator, 2);
        wait.until(ExpectedConditions.attributeToBe(browser.findElements(locator).get(1), attribute, value));
    }
    public void waitForElementAttributeToBeNew(WebElement we, String attribute, String value) {
        wait.until(ExpectedConditions.attributeToBe(we, attribute, value));
    }
    public void waitElementToBeClickable(By locator) {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void pageRefresh() {
        browser.navigate().refresh();
    }
}
