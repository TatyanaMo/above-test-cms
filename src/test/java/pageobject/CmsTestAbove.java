package pageobject;

import io.netty.util.collection.IntObjectMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pagesForAbove.*;

public class CmsTestAbove {
    private final String URL = "http://staging.above9.travel/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "CPT";
    private final String COUNTRY_CODE = "371";
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void ElementsCheck () {
        int adultPassengerToSelect = 2;

        Passenger passenger = new Passenger("Test",28745640, "tanjatest2@inbox.lv", "RIX", "CPT", "372");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();

        homePage.isLogoAppearsInHeader();
        homePage.isReviewLinkAppearsInHeader();
        homePage.isPhoneNumberLinkWorkInHeader();
        homePage.openDropDown();
        homePage.isHomePageWelcomeTextAppears();
        homePage.isRequestFormAppears();
        homePage.isTextOneAppears();
        homePage.isTextTwoAppears();
        homePage.isTextThreeAppears();
        homePage.WhyChooseAboveBlockCheck();
        homePage.isInstructionBlockAppears();
        homePage.reviewBlockCheck();
        homePage.isLinksWorks();
        homePage.isPhoneNumberLinkWorkInFooter();
        homePage.isEmailLinkWorkInFooter();
        homePage.isPaymentsDisplayed();
        homePage.isPaymentMethodImageDisplayed();
        homePage.isPartnersDisplayed();
        homePage.isAllRightsTextDisplayed();
        //homePage.IframeFacebookCheck();
        homePage.fillFlightRequestForm(adultPassengerToSelect);
        //homePage.fillInPassengerInfo(passenger);
        //homePage.selectAirportsAndCountryCodeFromSuggestionLists(FROM_AIRPORT, TO_AIRPORT, COUNTRY_CODE, passenger);
        homePage.openAboutUsPage();

        AboutUsPage aboutUsPage = new AboutUsPage(baseFunc);
        aboutUsPage.isLogoAppearsInHeader();
        aboutUsPage.isReviewLinkAppearsInHeader();
        aboutUsPage.isPhoneNumberLinkWorkInHeader();
        aboutUsPage.openDropDown();
        aboutUsPage.getTittle();
        aboutUsPage.getMainText();
        aboutUsPage.isLinksWorks();
        aboutUsPage.isPhoneNumberLinkWorkInFooter();
        aboutUsPage.isEmailLinkWorkInFooter();
        aboutUsPage.isPaymentsDisplayed();
        aboutUsPage.isPaymentMethodImageDisplayed();
        aboutUsPage.isPartnersDisplayed();
        aboutUsPage.isAllRightsTextDisplayed();
        aboutUsPage.openBlogPage();

        BlogPage blogPage = new BlogPage(baseFunc);
        blogPage.isLogoAppearsInHeader();
        blogPage.isReviewLinkAppearsInHeader();
        blogPage.openDropDown();
        blogPage.getTittle();
        blogPage.isBlogDisplayed();
        blogPage.isAllBlogItemsDisplayed();
        blogPage.isLinksWorksInRandomBlogItems();
        blogPage.isAllPostRepresentedInBlog();
        blogPage.isMainBlogPostDisplayed();
        blogPage.isLinksWorks();
        blogPage.isPhoneNumberLinkWorkInFooter();
        blogPage.isEmailLinkWorkInFooter();
        blogPage.isPaymentsDisplayed();
        blogPage.isPaymentMethodImageDisplayed();
        blogPage.isPartnersDisplayed();
        blogPage.isAllRightsTextDisplayed();
        blogPage.openTermsOfUsePage();

        TermsOfUsePage termsOfUsePage = new TermsOfUsePage(baseFunc);
        termsOfUsePage.isLogoAppearsInHeader();
        termsOfUsePage.isReviewLinkAppearsInHeader();
        termsOfUsePage.isPhoneNumberLinkWorkInHeader();
        termsOfUsePage.openDropDown();
        termsOfUsePage.getTittle();
        termsOfUsePage.isTextDisplayed();
        termsOfUsePage.isLinksWorks();
        termsOfUsePage.isPhoneNumberLinkWorkInFooter();
        termsOfUsePage.isEmailLinkWorkInFooter();
        termsOfUsePage.isPaymentsDisplayed();
        termsOfUsePage.isPaymentMethodImageDisplayed();
        termsOfUsePage.isPartnersDisplayed();
        termsOfUsePage.isAllRightsTextDisplayed();
        termsOfUsePage.openPrivacyPolicyPage();

        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(baseFunc);
        privacyPolicyPage.isLogoAppearsInHeader();
        privacyPolicyPage.isReviewLinkAppearsInHeader();
        privacyPolicyPage.isPhoneNumberLinkWorkInHeader();
        privacyPolicyPage.openDropDown();
        privacyPolicyPage.getTittle();
        privacyPolicyPage.isTextDisplayed();
        //privacyPolicyPage.isLinksWorksInText();
        privacyPolicyPage.isLinksWorks();
        privacyPolicyPage.isPhoneNumberLinkWorkInFooter();
        privacyPolicyPage.isEmailLinkWorkInFooter();
        privacyPolicyPage.isPaymentsDisplayed();
        privacyPolicyPage.isPaymentMethodImageDisplayed();
        privacyPolicyPage.isPartnersDisplayed();
        privacyPolicyPage.isAllRightsTextDisplayed();
        //privacyPolicyPage.IframeFacebookClose();
        privacyPolicyPage.openCookiesPolicyPage();

        CookiesPolicyPage cookiesPolicyPage = new CookiesPolicyPage(baseFunc);
        cookiesPolicyPage.isLogoAppearsInHeader();
        cookiesPolicyPage.isReviewLinkAppearsInHeader();
        cookiesPolicyPage.isPhoneNumberLinkWorkInHeader();
        cookiesPolicyPage.openDropDown();
        cookiesPolicyPage.getTittle();
        cookiesPolicyPage.isTextDisplayed();
        cookiesPolicyPage.isLinksWorks();
        cookiesPolicyPage.isPhoneNumberLinkWorkInFooter();
        cookiesPolicyPage.isEmailLinkWorkInFooter();
        cookiesPolicyPage.isPaymentsDisplayed();
        cookiesPolicyPage.isPaymentMethodImageDisplayed();
        cookiesPolicyPage.isPartnersDisplayed();
        cookiesPolicyPage.isAllRightsTextDisplayed();
        cookiesPolicyPage.contactUsPage();

        ContactUsPage contactUsPage = new ContactUsPage(baseFunc);
        contactUsPage.isLogoAppearsInHeader();
        contactUsPage.isReviewLinkAppearsInHeader();
        contactUsPage.isPhoneNumberLinkWorkInHeader();
        contactUsPage.openDropDown();
        contactUsPage.getTittle();
        contactUsPage.isHeadersDisplayed();
        contactUsPage.isPlaceholdersTextDisplayed();
        contactUsPage.isSubmitButtonEnabled();
        contactUsPage.isUsefulInfoBlockDisplayed();
        contactUsPage.isLinksWorks();
        contactUsPage.isPhoneNumberLinkWorkInFooter();
        contactUsPage.isEmailLinkWorkInFooter();
        contactUsPage.isPaymentsDisplayed();
        contactUsPage.isPaymentMethodImageDisplayed();
        contactUsPage.isPartnersDisplayed();
        contactUsPage.isAllRightsTextDisplayed();
        contactUsPage.manageCookiesPreferencesModalOpen();
        contactUsPage.isModalWindowDisplayedCorrect();
        contactUsPage.manageCookiesPreferencesModalClose();


    }
}
