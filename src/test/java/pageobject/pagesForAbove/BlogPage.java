package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;
import java.util.List;

import static pageobject.pagesForAbove.Locators.BlogPageLocators.*;

public class BlogPage {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public BlogPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void logoInHeader() {
        LOGGER.info("Checking logo in header for blog page");
        baseFunc.checkLogoInHeader(HEADER_LOGO);
    }

    public boolean isReviewLinkAppearsInHeader() {
        LOGGER.info("Checking Trustpilot link in header");
        baseFunc.switchIframeIndex(0);
        baseFunc.linksStatusCheck(baseFunc.findElement(REVIEW_HEADER_LINK).getAttribute("href"));
        baseFunc.switchToMainPage();
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
        LOGGER.info("Checking if social media links return status 200 OK");
        List<WebElement> socialMediaLinks = baseFunc.list(SOCIAL_MEDIA_LINKS);
        for (int i = 0; i < socialMediaLinks.size(); i++) {
            if (i==2) {
                continue;
            }
            baseFunc.linksStatusCheck(socialMediaLinks.get(i).getAttribute("href"));
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
                LOGGER.info("Checking if social media links return status 200 OK");
                List<WebElement> socialMediaLinks = baseFunc.list(SOCIAL_MEDIA_LINKS);
                for (int j = 0; j < socialMediaLinks.size(); j++) {
                    if (j==2) {
                        continue;
                    }
                    baseFunc.linksStatusCheck(socialMediaLinks.get(j).getAttribute("href"));
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
        List<WebElement> footerLinks = baseFunc.list(FOOTER_LINKS);
        WebElement phoneLInks = footerLinks.get(3);
        Assertions.assertTrue(baseFunc.getTextOfElement(phoneLInks).length() > 0, "No phone number in footer");
        return true;
    }

    public boolean isEmailLinkWorkInFooter() {
        LOGGER.info("Email link in footer returns status 200 for homepage");
        List<WebElement> footerLinks = baseFunc.list(FOOTER_LINKS);
        String emailLink = footerLinks.get(4).getAttribute("href");
        if (emailLink != null && !emailLink.startsWith("mailto:")) {
            baseFunc.linksStatusCheck(emailLink);
        }
        Assertions.assertTrue(baseFunc.getTextOfElement(baseFunc.list(FOOTER_LINKS).get(4)).length() > 0, "No email in footer");
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
