package pageobject;

import com.sun.source.tree.BreakTree;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.core.SpringVersion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pageobject.pagesForAbove.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



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

    public void openUrl (String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        browser.get(url);
    }
    public void switchIframe (By locator) {
        WebElement iframeElement = browser.findElement(locator);
        browser.switchTo().frame(iframeElement);
    }
    public void switchIframeIndex (int index) {
        browser.switchTo().frame(index);
    }

    public void switchToMainPage () {
        browser.switchTo().defaultContent();
    }
    public void switchTab(int tabIndex) {
        List <String> windowHandles = new ArrayList<>(browser.getWindowHandles());
        if (tabIndex >= 0 && tabIndex < windowHandles.size()) {
            browser.switchTo().window(windowHandles.get(tabIndex));
        } else {
            throw new IndexOutOfBoundsException("Invalid tab index: " + tabIndex);
        }
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void click (WebElement we) {
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

    public void selectByText (By locator, String text) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByVisibleText(text);
    }
    public void type (WebElement element, String text) {
        //WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }
    //etot metod pozvolit int peredelatj v string i zaispoljzovatj osnovnoj metod
    public void type (WebElement element, int text) {
        type(element, String.valueOf(text));
    }

    public WebElement findElement (By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public String getTextOfElement (By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }

    public void waitElementPresented (By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void waitForElementsCountAtLeast(By locator, int count) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, count));
    }
    public void waitForElementNotClickable (By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    public void waitElementToBeVisible (By locator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void linksStatusCheck (String string)  {
        RestTemplate restTemplate = new RestTemplate();
        boolean response = restTemplate.getForEntity(string, String.class).getStatusCode().is2xxSuccessful();
    }

    public int getRandomIndex (int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

}
