package pageobject;

import io.netty.util.collection.IntObjectMap;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pagesForAbove.AboutUsPage;
import pageobject.pagesForAbove.BlogPage;
import pageobject.pagesForAbove.HomePage;

public class CmsTestAbove {
    private final String URL = "http://staging.above9.travel/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "CPT";
    private final String COUNTRY_CODE = "371";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void ElementsCheck () {
        int adultPassengerToSelect = 2;

        Passenger passenger = new Passenger("Test",28745640, "tanjatest2@inbox.lv", "RIX", "CPT", "372");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();

        Assertions.assertTrue(homePage.isLogoAppearsInHeader(), "No logo");
        Assertions.assertTrue(homePage.isReviewLinkAppearsInHeader(), "No review link");
        Assertions.assertTrue(homePage.isPhoneNumberLinkWorkInHeader(),"Link does not return 200 OK");

        homePage.openDropDown();

        Assertions.assertTrue(homePage.isHomePageWelcomeTextAppears(), "No welcome text on home page");
        Assertions.assertTrue(homePage.isRequestFormAppears(),"No request form");
        Assertions.assertTrue(homePage.isTextOneAppears(), "no text");
        Assertions.assertTrue(homePage.isTextTwoAppears(),"No text");
        Assertions.assertTrue(homePage.isTextThreeAppears(), "No text");

        homePage.WhyChooseAboveBlockCheck();

        Assertions.assertTrue(homePage.isInstructionTittleAppears(), "no block");

        homePage.reviewBlockCheck();

        Assertions.assertTrue(homePage.isLinksWorks(), "Link does not return 200 OK");
        Assertions.assertTrue(homePage.isPhoneNumberLinkWorkInFooter(), "Link does not return 200 OK");
        Assertions.assertTrue(homePage.isEmailLinkWorkInFooter(), "Link does not return 200 OK");
        homePage.payments();
        Assertions.assertTrue(homePage.isPaymentMethodImageDisplayed(), "payment method images not displayed");
        Assertions.assertTrue(homePage.isPartnersDisplayed(), "No partners list in footer");
        homePage.allRightsText();
        //homePage.IframeFacebookCheck();
        homePage.fillFlightRequestForm(adultPassengerToSelect);
        //homePage.fillInPassengerInfo(passenger);
        //homePage.selectAirportsAndCountryCodeFromSuggestionLists(FROM_AIRPORT, TO_AIRPORT, COUNTRY_CODE, passenger);
        homePage.openAboutUsPage();

        AboutUsPage aboutUsPage = new AboutUsPage(baseFunc);
        Assertions.assertTrue(aboutUsPage.isLogoAppearsInHeader(), "No logo on about us page");
        Assertions.assertTrue(aboutUsPage.isReviewLinkAppearsInHeader(), "No review link");
        Assertions.assertTrue(aboutUsPage.isPhoneNumberLinkWorkInHeader(),"Link does not return 200 OK");

        aboutUsPage.openDropDown();

        aboutUsPage.getTittle();
        aboutUsPage.getMainText();

        Assertions.assertTrue(aboutUsPage.isLinksWorks(), "Link does not return 200 OK");
        Assertions.assertTrue(aboutUsPage.isPhoneNumberLinkWorkInFooter(), "Link does not return 200 OK");
        Assertions.assertTrue(aboutUsPage.isEmailLinkWorkInFooter(), "Link does not return 200 OK");
        aboutUsPage.payments();
        Assertions.assertTrue(aboutUsPage.isPaymentMethodImageDisplayed(), "payment method images not displayed");
        Assertions.assertTrue(aboutUsPage.isPartnersDisplayed(), "No partners list in footer");
        aboutUsPage.allRightsText();
        aboutUsPage.openBlogPage();

        BlogPage blogPage = new BlogPage(baseFunc);
        Assertions.assertTrue(blogPage.isLogoAppearsInHeader(), "No logo on about us page");
        Assertions.assertTrue(blogPage.isReviewLinkAppearsInHeader(), "No review link");
        Assertions.assertTrue(blogPage.isPhoneNumberLinkWorkInHeader(),"Link does not return 200 OK");
        blogPage.openDropDown();

        blogPage.getTittle();
        Assertions.assertTrue(blogPage.isBlogDisplayed(),"No blog container on blog page");
        blogPage.isAllBlogItemsDisplayed();
        blogPage.isLinksWorksInRandomBlogItems();
        blogPage.isAllPostRepresentedInBlog();
        blogPage.isMainBlogPostDisplayed();
        Assertions.assertTrue(blogPage.isLinksWorks(), "Link does not return 200 OK");
        Assertions.assertTrue(blogPage.isPhoneNumberLinkWorkInFooter(), "Link does not return 200 OK");
        Assertions.assertTrue(blogPage.isEmailLinkWorkInFooter(), "Link does not return 200 OK");
        blogPage.payments();
        Assertions.assertTrue(blogPage.isPaymentMethodImageDisplayed(), "payment method images not displayed");
        Assertions.assertTrue(blogPage.isPartnersDisplayed(), "No partners list in footer");
        blogPage.allRightsText();
        blogPage.openTermOfUsePage();

    }
}
