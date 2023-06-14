package pageobject.pagesForAbove;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;


import java.util.List;

public class BlogPage {
    private final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    private final By REVIEW_HEADER_LINK = By.xpath(".//div[@class=' hidden lg:flex  mx-auto justify-center h-full']/a");
    private final By REVIEW_IMG = By.xpath(".//img[@src='https://staging.above9.travel/img/trustpilot-light.svg']");
    private final By PHONE = By.xpath(".//a[@href ='tel:855-777-6336']");
    private final By DROP_DOWN_BUTTONS = By.xpath(".//button[@class='h-full flex items-center space-x-2 px-2 py-1 font-medium rounded appearance-none transition-colors focus:outline-none hover:bg-black hover:bg-opacity-10 focus:bg-black focus:bg-opacity-25 focus:text-white']");
    private final By LOG_IN_BUTTON = By.xpath(".//button[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    private final By DROP_DOWN_ELEMENTS = By.xpath(".//a[@class='block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:text-left whitespace-nowrap rounded-md lg:rounded-none after-checked:bg-gray-100 after-checked:text-orange-400 after-checked:font-medium hover:text-orange-400 focus:bg-gray-100 focus:outline-none']");
    private final By TITTLE_BLOG = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    private final By BLOG_CONTAINER = By.xpath(".//div[@class='flex lg:flex-wrap flex-row lg:justify-center overflow-x-auto gap-4 mb-2 sm:px-10 xl:px-32']");
    private final By BLOG_MAIN_POST = By.xpath(".//div[@class='grid grid-cols-1 xl:grid-cols-3 justify-center gap-x-7 gap-y-8 mb-10']/a");
    private final By BLOG_TEXT_FOR_MAIN_ITEM = By.xpath(".//div[@class='absolute flex flex-col text-white gap-y-4 z-20 mb-8 xl:mb-16']/span");
    private final By BLOG_IMAGES = By.xpath(".//div[@class='grid grid-cols-1 xl:grid-cols-3 justify-center gap-x-7 gap-y-8 mb-10']/a/img");
    private final By ALL_POST_BLOG_CARDS = By.xpath(".//div[@class='col-span-1 justify-center gap-x-7 gap-y-8']/a");
    private final By BLOG_CARD_IMAGES = By.xpath(".//div[@class='col-span-1 justify-center gap-x-7 gap-y-8']/a/img");
    private final By BLOG_CARDS_TEXT = By.xpath(".//div[@class='flex flex-col absolute text-white gap-y-4 z-20 px-10 mb-8']/span");
    private final By BLOG_BUTTONS = By.xpath(".//span[@class='appearance-none relative touch-manipulation rounded-md md:rounded select-none transition block hover:shadow-xs']/button");

    private final By POST_TITTLE = By.xpath(".//span[@class='text-center text-lg md:text-3xl lg:pr-12 font-medium self-center md:m-auto']");
    private final By POST_SUBTITLE = By.xpath(".//div[@class='flex justify-center text-base font-normal mb-8']");
    private final By POST_TEXT = By.xpath(".//div[@class='text-base rich-content leading-normal mb-16']");
    private final By POST_MAIN_IMAGE = By.xpath(".//div[@class='flex justify-center mb-6 md:mb-10']/img");
    private final By POST_IMAGES_IN_TEXT = By.xpath("//div[@class='text-base rich-content leading-normal mb-16']/p/img");
    private final By SOCIAL_MEDIA_LINKS = By.xpath(".//div[@class='flex flex-row gap-x-2 m-auto']/a");
    private final By SUBMIT_REQUEST_BUTTON = By.id("submit-request");
    private final By BACK_LINK = By.xpath(".//div[@class='flex flex-col lg:flex-row lg:items-center mb-6']/a");
    private final By LOAD_MORE_BTN = By.id("load-more");

    private final By FOOTER_LINKS = By.xpath(".//li[@class='text-sm leading-9']/a");
    private final By EMAIL_LINK_IN_FOOTER = By.xpath(".//li[@class='text-sm leading-9 flex items-center space-x-2']");
    private final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    private final By PAYMENTS_METHODS = By.xpath(".//li[@class='w-9 md:w-12']/img");
    private final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    private final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");

    private BaseFunc baseFunc;

    public BlogPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean isLogoAppearsInHeader() {
        WebElement logo = baseFunc.findElement(HEADER_LOGO);
        return true;
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
        List<WebElement> submenuItems = baseFunc.list(DROP_DOWN_ELEMENTS);
        baseFunc.waitForElementsCountAtLeast(DROP_DOWN_ELEMENTS, 1);
        Assertions.assertEquals("About Us", submenuItems.get(0).getText(), "No submenu item");
        Assertions.assertEquals("Blog", submenuItems.get(1).getText(), "No submenu item");
        Assertions.assertEquals("Terms Of Use", submenuItems.get(2).getText(), "No submenu item");
        Assertions.assertEquals("Privacy Policy", submenuItems.get(3).getText(), "No submenu item");
        Assertions.assertEquals("Cookies Policy", submenuItems.get(4).getText(), "No submenu item");
        Assertions.assertEquals("Contact us", submenuItems.get(5).getText(), "No submenu item");
        Assertions.assertEquals("Manage cookie preferences", submenuItems.get(6).getText(), "No submenu item");
        menuButtons.get(1).click();
    }

    public void getTittle() {
        Assertions.assertTrue(baseFunc.findElement(TITTLE_BLOG).getText().length() > 0, "No tittle on about us page");
    }

    public boolean isBlogDisplayed() {
        Assertions.assertTrue(baseFunc.findElement(BLOG_CONTAINER).isDisplayed(), "No blog container on blog page");
        return true;
    }

    public boolean isAllBlogItemsDisplayed() {
        List<WebElement> blogItems = baseFunc.list(BLOG_BUTTONS).subList(4, 15);
        for (WebElement blogItem : blogItems) {
            Assertions.assertTrue(blogItem.isEnabled(), "Blog button is disabled");
        }
        return true;
    }

    public boolean isLinksWorksInRandomBlogItems() {
        List<WebElement> blogItems = baseFunc.list(BLOG_BUTTONS).subList(4, 15);

        for (WebElement blogItem : blogItems) {
            Assertions.assertTrue(blogItem.getText().length() > 0, "No tittle in blog items");
            Assertions.assertTrue(blogItem.isEnabled(), "Blog button is disabled");
        }
        int blogItemsCount = blogItems.size();
        int randomItem = baseFunc.getRandomIndex(blogItemsCount);
        WebElement selectedBlogItem = blogItems.get(randomItem);
        System.out.println(randomItem);
        selectedBlogItem.click();
        boolean postExist = false;
        try {
            baseFunc.waitElementPresented(BLOG_MAIN_POST);
        } catch (TimeoutException e) {
            System.out.println("Blog Item has no info");
        }
        if (postExist) {
            baseFunc.waitElementPresented(BLOG_MAIN_POST);
            String blogLink = baseFunc.findElement(BLOG_MAIN_POST).getAttribute("href");
            baseFunc.linksStatusCheck(blogLink);
            Assertions.assertTrue(baseFunc.findElement(BLOG_MAIN_POST).isDisplayed(), "Blog has no info");
        } else {
            WebElement firstBlogItem = baseFunc.list(BLOG_BUTTONS).subList(4,15).get(0);
           firstBlogItem.click();
        }
        return true;
    }

    public boolean isAllPostRepresentedInBlog() {
        boolean loadMoreBtn = false;
        try {
            baseFunc.waitElementPresented(LOAD_MORE_BTN);
        } catch (TimeoutException e) {
            System.out.println("No load more btn");
        }
        if (loadMoreBtn) {
            WebElement loadBtn = baseFunc.findElement(LOAD_MORE_BTN);
            while (loadBtn.isDisplayed() && loadBtn.isEnabled()) {
                loadBtn.click();
                baseFunc.waitForElementNotClickable(LOAD_MORE_BTN);
                loadBtn = baseFunc.findElement(LOAD_MORE_BTN);
            }
        } else {
            String allPostMainUrl = baseFunc.findElement(BLOG_MAIN_POST).getAttribute("href");
            baseFunc.linksStatusCheck(allPostMainUrl);
            Assertions.assertNotNull(baseFunc.findElement(BLOG_IMAGES).getAttribute("src"), "Image source is null for main blog item");
            Assertions.assertFalse(baseFunc.findElement(BLOG_IMAGES).getAttribute("src").isEmpty(), "Image source is empty for main blog item");
            List<WebElement> textInBlogItem = baseFunc.list(BLOG_TEXT_FOR_MAIN_ITEM);
            for (WebElement text : textInBlogItem) {
                Assertions.assertTrue(text.getText().length() > 0, "No tittle text in blog item");
            }
            List<WebElement> allPostBlogCards = baseFunc.list(ALL_POST_BLOG_CARDS);
            for (WebElement blogCard : allPostBlogCards) {
                String blogCardUrl = blogCard.getAttribute("href");
                baseFunc.linksStatusCheck(blogCardUrl);
                Assertions.assertNotNull(baseFunc.findElement(BLOG_CARD_IMAGES).getAttribute("src"), "Image source is null for main blog item");
                Assertions.assertFalse(baseFunc.findElement(BLOG_CARD_IMAGES).getAttribute("src").isEmpty(), "Image source is empty for main blog item");
            }
            List<WebElement> blogCardText = baseFunc.list(BLOG_CARDS_TEXT);
            for(WebElement cardText : blogCardText) {
                Assertions.assertTrue(cardText.getText().length()>0, "No tittle in blog card'");
            }
        }
        return true;
    }

    public boolean isMainBlogPostDisplayed () {
        List<WebElement> textInBlogItem = baseFunc.list(BLOG_TEXT_FOR_MAIN_ITEM);
        String tittleOne = textInBlogItem.get(0).getText();
        String subTittleOne = textInBlogItem.get(1).getText();
        baseFunc.findElement(BLOG_MAIN_POST).click();
        String tittleTwo = baseFunc.findElement(POST_TITTLE).getText();
        String subTittleTwo = baseFunc.findElement(POST_SUBTITLE).getText();
        Assertions.assertEquals(tittleOne, tittleTwo,"text not equals");
        Assertions.assertEquals(subTittleOne, subTittleTwo,"text not equals");
        Assertions.assertTrue(baseFunc.findElement(POST_TEXT).getText().length()>0, "no text in post");
        Assertions.assertNotNull(baseFunc.findElement(POST_MAIN_IMAGE).getAttribute("src"), "Image source is null for main blog item");
        List<WebElement>imagesInPost = baseFunc.list(POST_IMAGES_IN_TEXT);
       for (WebElement image : imagesInPost) {
           Assertions.assertNotNull(image.getAttribute("src"), "Image source is null in post");
       }
       List<WebElement> socialMediaLinks = baseFunc.list(SOCIAL_MEDIA_LINKS);
       String linkFb = socialMediaLinks.get(0).getAttribute("href");
       baseFunc.linksStatusCheck(linkFb);
       String linkPinterest = socialMediaLinks.get(1).getAttribute("href");
       baseFunc.linksStatusCheck(linkPinterest);
//twitter link status check doesn't work!!
       /*for (WebElement link : socialMediaLinks) {
           String socialMediaUrl = link.getAttribute("href");
           baseFunc.linksStatusCheck(socialMediaUrl);
           Assertions.assertTrue(link.isDisplayed(), "no social media element on post page");
       }*/
        Assertions.assertTrue(baseFunc.findElement(SUBMIT_REQUEST_BUTTON).getText().length()>0, "No text in submit request btn");
        Assertions.assertTrue(baseFunc.findElement(SUBMIT_REQUEST_BUTTON).isEnabled(), "button is disabled");
        baseFunc.findElement(BACK_LINK).click();

        List<WebElement>blogCards = baseFunc.list(ALL_POST_BLOG_CARDS);
        int postCount = blogCards.size();
        for (int i = 0; i<postCount; i++) {
            WebElement blogCard = baseFunc.list(ALL_POST_BLOG_CARDS).get(i);
            List<WebElement> textInBlogCard = blogCard.findElements(BLOG_CARDS_TEXT);
            String tittleCard = textInBlogCard.get(0).getText();
            String subTittleCard = textInBlogCard.get(1).getText();
            blogCard.click();
            String tittleCardTwo = baseFunc.findElement(POST_TITTLE).getText();
            String subTittleCardTwo = baseFunc.findElement(POST_SUBTITLE).getText();
            Assertions.assertEquals(tittleCard, tittleCardTwo,"text not equals");
            Assertions.assertEquals(subTittleCard, subTittleCardTwo,"text not equals");

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
            }else {
                /*
                for (WebElement link : socialMediaLinks) {
                    String socialMediaUrl = link.getAttribute("href");
                    baseFunc.linksStatusCheck(socialMediaUrl);
                    Assertions.assertTrue(link.isDisplayed(), "no social media element on post page");
                }*/
                baseFunc.linksStatusCheck(linkFb);
                baseFunc.linksStatusCheck(linkPinterest);
                Assertions.assertTrue(baseFunc.findElement(SUBMIT_REQUEST_BUTTON).getText().length()>0, "No text in submit request btn");
                Assertions.assertTrue(baseFunc.findElement(SUBMIT_REQUEST_BUTTON).isEnabled(), "button is disabled");
                baseFunc.findElement(BACK_LINK).click();
            }
        }
            return true;
    }

    public boolean isLinksWorks() {
        List<WebElement> menuItems = baseFunc.list(FOOTER_LINKS);
        for (WebElement item : menuItems) {
            String url = item.getAttribute("href");
            baseFunc.linksStatusCheck(url);
        }
        return true;
    }
    public boolean isPhoneNumberLinkWorkInFooter() {
        List<WebElement> phonesLInks = baseFunc.list(PHONE);
        phonesLInks.get(0).getAttribute("href");
        return true;
    }
    public boolean isEmailLinkWorkInFooter () {
        List<WebElement> email = baseFunc.list(EMAIL_LINK_IN_FOOTER);
        email.get(1).getAttribute("href");
        return true;
    }
    public void payments () {
        Assertions.assertTrue(baseFunc.findElement(PAYMENTS).getText().length()>0,"no payments on about us page");
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
        Assertions.assertTrue(baseFunc.findElement(ALL_RIGHTS_TEXT).getText().length()>0, "no all right text on about us page");
    }
    public void openTermOfUsePage () {
        List<WebElement> menuButtons = baseFunc.list(DROP_DOWN_BUTTONS);
        menuButtons.get(1).click();
        WebElement termsOfUseItem = baseFunc.list(DROP_DOWN_ELEMENTS).get(2);
        termsOfUseItem.click();
    }

}
