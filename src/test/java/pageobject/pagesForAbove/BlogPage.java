package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;
import java.util.List;

public class BlogPage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@src='https://staging.above9.travel/img/trustpilot-light.svg']");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    private final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");

    private final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    private final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    private final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    private final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    private final By CLOSE_BUTTONS = By.xpath(".//span[@class='absolute right-4 top-4 lg:right-0 lg:top-0']/button");
    private final By SIGN_UP_MODAL_WINDOW = By.id("register-title");

    private final By TRUSTPILOT_ABOVE_TITTLE = By.xpath(".//span[contains(@class, 'title_displayName__TtDDM')]");
    private final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By BLOG_CONTAINER = By.xpath(".//div[contains(@class, 'overflow-x-auto gap-4 mb-2 sm:px-10 xl:px-32')]");
    private final By BLOG_MAIN_POST = By.xpath(".//a[@class='flex col-span-1 xl:col-span-3 relative justify-center items-end']");
    private final By BLOG_TEXT_FOR_MAIN_POST = By.xpath(".//div[@class='absolute flex flex-col text-white " +
            "gap-y-4 z-20 mb-8 xl:mb-16']/span");
    private final By BLOG_TEXT_FOR_ALL_CARDS = By.xpath(".//span[contains(@class, 'self-center')]");
    private final By BLOG_IMAGES = By.xpath(".//img[@class='h-52 w-full md:h-72 xl:h-100 object-cover rounded-lg']");
    private final By ALL_POST_BLOG_CARDS = By.xpath(".//div[@class='col-span-1 justify-center gap-x-7 gap-y-8']/a");
    private final By BLOG_CARD_IMAGES = By.xpath(".//img[@class='absolute h-52 w-full md:h-72 rounded-lg object-cover']");
    private final By BLOG_CARDS_TEXT = By.xpath(".//div[@class='flex flex-col absolute text-white gap-y-4 " +
            "z-20 px-10 mb-8']/span");
    private final By BLOG_BUTTONS = By.xpath(".//button[@data-blog-tag='data-blog-tag']");

    private final By POST_TITTLE = By.xpath(".//span[contains(@class, 'text-center text-lg md:text-3xl lg:pr-12')]");
    private final By POST_SUBTITLE = By.xpath(".//div[@class='flex justify-center text-base font-normal mb-8']");
    private final By POST_TEXT = By.xpath(".//div[@class='text-base rich-content leading-normal mb-16']");
    private final By POST_MAIN_IMAGE = By.xpath(".//img[@class='max-h-100 w-full object-cover rounded-lg']");
    private final By POST_IMAGES_IN_TEXT = By.xpath(".//img[contains(@alt, 'Photo by')]");
    private final By SOCIAL_MEDIA_LINKS = By.xpath(".//div[@class='flex flex-row gap-x-2 m-auto']/a");
    private final By FB_PAGE_COOKIES_ACCEPT_FORM_TITTLE = By.id("consent_cookies_title");
    private final By PINTEREST_PAGE_SIGN_UP_FORM_TITTLE = By.xpath(".//div[@class='zI7 iyn Hsu']/h1");
    private final By TWITTER_PAGE_SIGN_UP_FORM_TITTLE = By.xpath(".//h1[@data-testid='ocfSettingsListPrimaryText']");
    private final By SUBMIT_REQUEST_BUTTON = By.id("submit-request");
    private final By BACK_LINK = By.xpath(".//div[@class='flex flex-col lg:flex-row lg:items-center mb-6']/a");
    private final By LOAD_MORE_BTN = By.id("load-more");

    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public BlogPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean isLogoAppearsInHeader() {
        LOGGER.info("Checking logo in header for blog page");
        WebElement logo = baseFunc.findElement(HEADER_LOGO);
        return true;
    }

    public boolean isReviewLinkAppearsInHeader() {
        LOGGER.info("Checking Trustpilot link in header for homepage");
        baseFunc.checkReviewLinkInHeader(REVIEW_HEADER_LINK, REVIEW_IMG, REVIEW_HEADER_LINK, TRUSTPILOT_ABOVE_TITTLE);
        return true;
    }

    public boolean isDropDownMenuOpen() {
        LOGGER.info("Checking presence of elements in all dropdown menu");
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        baseFunc.click(menuButtons.get(0));
        Assertions.assertTrue(baseFunc.findElement(LOG_IN_BUTTON).isEnabled(), "button is disabled");
        Assertions.assertTrue(baseFunc.findElement(CREATE_PROFILE_BUTTON).isEnabled(), "button is disabled");
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
        baseFunc.click(menuButtons.get(1));
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
        return true;
    }

    public boolean isAllBlogItemsDisplayed() {
        LOGGER.info("Checking if all blog items displayed for blog page");
        List<WebElement> blogItems = baseFunc.list(BLOG_BUTTONS);
        for (WebElement blogItem : blogItems) {
            Assertions.assertTrue(blogItem.isEnabled(), "Blog item is disabled");
        }
        return true;
    }

    public boolean isLinksWorksInRandomBlogItems() {
        LOGGER.info("Checking if random selected blog card opens for blog page");
        List<WebElement> blogItems = baseFunc.list(BLOG_BUTTONS);
        for (WebElement blogItem : blogItems) {
            Assertions.assertTrue(baseFunc.getTextOfElement(blogItem).length() > 0, "No tittle in blog items");
            Assertions.assertTrue(blogItem.isEnabled(), "Blog button is disabled");
        }
        int blogItemsCount = blogItems.size();
        int randomItem = baseFunc.getRandomIndex(blogItemsCount);
        WebElement selectedBlogItem = blogItems.get(randomItem);
        LOGGER.info("Random selected blog card index is: " + randomItem);
        baseFunc.click(selectedBlogItem);
        boolean postExist = false;
        try {
            baseFunc.waitElementPresented(BLOG_MAIN_POST);
        } catch (TimeoutException e) {
            LOGGER.info("Blog Item has no info");
        }
        if (postExist) {
            baseFunc.waitElementPresented(BLOG_MAIN_POST);
            String blogLink = baseFunc.findElement(BLOG_MAIN_POST).getAttribute("href");
            baseFunc.linksStatusCheck(blogLink);
            Assertions.assertTrue(baseFunc.findElement(BLOG_MAIN_POST).isDisplayed(), "Blog has no info");
        } else {
            WebElement firstBlogItem = baseFunc.list(BLOG_BUTTONS).get(0);
            baseFunc.click(firstBlogItem);
        }
        return true;
    }

    public boolean isAllPostRepresentedInBlog() {
        LOGGER.info("Checking if all blog cards possible to open for blog page and checking all blog cards displayed");
        boolean loadMoreBtn = false;
        try {
            baseFunc.waitElementPresented(LOAD_MORE_BTN);
        } catch (TimeoutException e) {
            LOGGER.info("No load more btn");
        }
        if (loadMoreBtn) {
            WebElement loadBtn = baseFunc.findElement(LOAD_MORE_BTN);
            while (loadBtn.isDisplayed() && loadBtn.isEnabled()) {
                baseFunc.click(loadBtn);
                baseFunc.waitForElementNotClickable(LOAD_MORE_BTN);
                loadBtn = baseFunc.findElement(LOAD_MORE_BTN);
            }
        } else {
            String allPostMainUrl = baseFunc.findElement(BLOG_MAIN_POST).getAttribute("href");
            baseFunc.linksStatusCheck(allPostMainUrl);
            Assertions.assertNotNull(baseFunc.findElement(BLOG_IMAGES).getAttribute("src"), "Image source is null for main blog item");
            Assertions.assertFalse(baseFunc.findElement(BLOG_IMAGES).getAttribute("src").isEmpty(), "Image source is empty for main blog item");
            //Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(BLOG_TEXT_FOR_MAIN_POST) > 0, "No tittle text in blog item");
            List<WebElement> allPostBlogCards = baseFunc.list(ALL_POST_BLOG_CARDS);
            for (WebElement blogCard : allPostBlogCards) {
                String blogCardUrl = blogCard.getAttribute("href");
                baseFunc.linksStatusCheck(blogCardUrl);
                Assertions.assertNotNull(baseFunc.findElement(BLOG_CARD_IMAGES).getAttribute("src"), "Image source is null for main blog item");
                Assertions.assertFalse(baseFunc.findElement(BLOG_CARD_IMAGES).getAttribute("src").isEmpty(), "Image source is empty for main blog item");
            }
            Assertions.assertTrue(baseFunc.checkTextInAllElementsOfList(BLOG_TEXT_FOR_ALL_CARDS) > 0, "No tittle in blog card");
        }
        return true;
    }

    public boolean isMainBlogPostDisplayed() {
        LOGGER.info("Checking if main blog post and blog cards possible to open for blog page");
        List<WebElement> textInBlogItem = baseFunc.list(BLOG_TEXT_FOR_ALL_CARDS);
        String tittleOne = baseFunc.getTextOfElement(textInBlogItem.get(0));
        String subTittleOne = baseFunc.getTextOfElement(textInBlogItem.get(1));
        baseFunc.click(BLOG_MAIN_POST);
        String tittleTwo = baseFunc.getTextOfElement(POST_TITTLE);
        String subTittleTwo = baseFunc.getTextOfElement(POST_SUBTITLE);
        Assertions.assertEquals(tittleOne, tittleTwo, "text not equals");
        Assertions.assertEquals(subTittleOne, subTittleTwo, "text not equals");
        Assertions.assertTrue(baseFunc.getTextOfElement(POST_TEXT).length() > 0, "no text in post");
        Assertions.assertNotNull(baseFunc.findElement(POST_MAIN_IMAGE).getAttribute("src"), "Image source is null for main blog item");
        List<WebElement> imagesInPost = baseFunc.list(POST_IMAGES_IN_TEXT);
        for (WebElement image : imagesInPost) {
            Assertions.assertNotNull(image.getAttribute("src"), "Image source is null in post");
        }
        List<WebElement> socialMediaLinks = baseFunc.list(SOCIAL_MEDIA_LINKS);
        baseFunc.click(socialMediaLinks.get(0));
        baseFunc.switchTab(1);
        try {
            baseFunc.waitElementPresented(FB_PAGE_COOKIES_ACCEPT_FORM_TITTLE);
            if (baseFunc.getTextOfElement(FB_PAGE_COOKIES_ACCEPT_FORM_TITTLE).length() > 0) {
                baseFunc.closeTab();
                baseFunc.switchTab(0);
            } else {
                LOGGER.error("Facebook link doesn't open in new page properly from blog");
            }
        } catch (NoSuchElementException e) {
            LOGGER.error("Facebook link doesn't open in new page properly from blog", e);
        }
        baseFunc.click(socialMediaLinks.get(1));
        baseFunc.switchTab(1);
        try {
            baseFunc.waitElementPresented(PINTEREST_PAGE_SIGN_UP_FORM_TITTLE);
            if (baseFunc.getTextOfElement(PINTEREST_PAGE_SIGN_UP_FORM_TITTLE).length() > 0) {
                baseFunc.closeTab();
                baseFunc.switchTab(0);
            } else {
                LOGGER.error("Pinterest link doesn't open in new page properly from blog");
            }
        } catch (NoSuchElementException e) {
            LOGGER.error("Pinterest link doesn't open in new page properly from blog", e);
        }
        baseFunc.click(socialMediaLinks.get(2));
        baseFunc.switchTab(1);
        try {
            baseFunc.waitElementPresented(TWITTER_PAGE_SIGN_UP_FORM_TITTLE);
            if (baseFunc.getTextOfElement(TWITTER_PAGE_SIGN_UP_FORM_TITTLE).length() > 0) {
                baseFunc.closeTab();
                baseFunc.switchTab(0);
            } else {
                LOGGER.error("Twitter link doesn't open in new page properly from blog");
            }
        } catch (NoSuchElementException e) {
            LOGGER.error("Twitter link doesn't open in new page properly from blog", e);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(SUBMIT_REQUEST_BUTTON).length() > 0, "No text in submit request btn");
        Assertions.assertTrue(baseFunc.findElement(SUBMIT_REQUEST_BUTTON).isEnabled(), "button is disabled");
        baseFunc.click(BACK_LINK);
        return true;
    }

    public boolean isBlogCardsDisplayed() {
        List<WebElement> blogCards = baseFunc.list(ALL_POST_BLOG_CARDS);
        int postCount = blogCards.size();
        for (int i = 0; i < postCount; i++) {
            WebElement blogCard = baseFunc.list(ALL_POST_BLOG_CARDS).get(i);
            List<WebElement> textInBlogCard = blogCard.findElements(BLOG_TEXT_FOR_ALL_CARDS);
            String tittleCard = baseFunc.getTextOfElement(textInBlogCard.get(0));
            String subTittleCard = baseFunc.getTextOfElement(textInBlogCard.get(1));
            baseFunc.click(blogCard);
            String tittleCardTwo = baseFunc.getTextOfElement(POST_TITTLE);
            String subTittleCardTwo = baseFunc.getTextOfElement(POST_SUBTITLE);
            Assertions.assertEquals(tittleCard, tittleCardTwo, "text not equals");
            Assertions.assertEquals(subTittleCard, subTittleCardTwo, "text not equals");

            boolean imagesPresent = false;
            try {
                baseFunc.waitElementPresented(POST_IMAGES_IN_TEXT);
            } catch (TimeoutException e) {
                System.out.println("Image not found or not visible in blog post");
            }
            if (imagesPresent) {
                List<WebElement> images = baseFunc.list(POST_IMAGES_IN_TEXT);
                for (WebElement image : images) {
                    Assertions.assertTrue(image.isDisplayed(), "Image not visible in post");
                }
            } else {
                List<WebElement> socialMediaLinks = baseFunc.list(SOCIAL_MEDIA_LINKS);
                baseFunc.click(socialMediaLinks.get(0));
                baseFunc.switchTab(1);
                try {
                    baseFunc.waitElementPresented(FB_PAGE_COOKIES_ACCEPT_FORM_TITTLE);
                    if (baseFunc.getTextOfElement(FB_PAGE_COOKIES_ACCEPT_FORM_TITTLE).length() > 0) {
                        baseFunc.closeTab();
                        baseFunc.switchTab(0);
                    } else {
                        LOGGER.error("Facebook link doesn't open in new page properly from blog");
                    }
                } catch (NoSuchElementException e) {
                    LOGGER.error("Facebook link doesn't open in new page properly from blog", e);
                }
                baseFunc.click(socialMediaLinks.get(1));
                baseFunc.switchTab(1);
                try {
                    baseFunc.waitElementPresented(PINTEREST_PAGE_SIGN_UP_FORM_TITTLE);
                    if (baseFunc.getTextOfElement(PINTEREST_PAGE_SIGN_UP_FORM_TITTLE).length() > 0) {
                        baseFunc.closeTab();
                        baseFunc.switchTab(0);
                    } else {
                        LOGGER.error("Pinterest link doesn't open in new page properly from blog");
                    }
                } catch (NoSuchElementException e) {
                    LOGGER.error("Pinterest link doesn't open in new page properly from blog", e);
                }
                baseFunc.click(socialMediaLinks.get(2));
                baseFunc.switchTab(1);
                try {
                    baseFunc.waitElementPresented(TWITTER_PAGE_SIGN_UP_FORM_TITTLE);
                    if (baseFunc.getTextOfElement(TWITTER_PAGE_SIGN_UP_FORM_TITTLE).length() > 0) {
                        baseFunc.closeTab();
                        baseFunc.switchTab(0);
                    } else {
                        LOGGER.error("Twitter link doesn't open in new page properly from blog");
                    }
                } catch (NoSuchElementException e) {
                    LOGGER.error("Twitter link doesn't open in new page properly from blog", e);
                }
                Assertions.assertTrue(baseFunc.getTextOfElement(SUBMIT_REQUEST_BUTTON).length() > 0, "No text in submit request btn");
                Assertions.assertTrue(baseFunc.findElement(SUBMIT_REQUEST_BUTTON).isEnabled(), "button is disabled");
                baseFunc.click(BACK_LINK);
            }
        }
        return true;
    }

    public boolean isFooterLinksOpen() {
        LOGGER.info("Checking if footer links successfully open");
        baseFunc.footerLinksOpen(FOOTER_LINKS, TITTLE);
        return true;
    }

    public boolean isPhoneNumberLinkWorkInFooter() {
        LOGGER.info("Phone number displayed in footer");
        WebElement phoneLInks = baseFunc.findElement(PHONE);
        Assertions.assertTrue(phoneLInks.getAttribute("href").length() > 0, "No phone number");
        return true;
    }

    public boolean isEmailLinkWorkInFooter() {
        LOGGER.info("Email link in footer returns status 200 for blog page");
        List<WebElement> email = baseFunc.list(EMAIL_LINK_IN_FOOTER);
        String link = email.get(1).getAttribute("href");
        if (link != null && !link.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(link);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(email.get(1)).length() > 0, "No phone number");
        return true;
    }

    public boolean isPaymentsDisplayed() {
        LOGGER.info("Checking if payment info displayed in footer");
        Assertions.assertTrue(baseFunc.isPaymentsDisplayed(PAYMENTS), "No payments in footer");
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

    public void openTermsOfUsePage() {
        LOGGER.info("Opening next page - Terms of use");
        baseFunc.openNextPage(DROP_DOWN_BUTTONS, DROP_DOWN_ELEMENTS, 1,2);
    }

}
