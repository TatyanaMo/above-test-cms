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
    private final String FROM_AIRPORT = "RIC";
    private final String TO_AIRPORT = "RIX";
    private final String SECOND_FROM_AIRPORT_MULTI_CITY = "BCN";
    private final String SECOND_TO_AIRPORT_MULTI_CITY =  "BCD";
    private final String COUNTRY_CODE = "372";
    public final String expectedDepartDate = "01-08-2023";


    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void ElementsCheck() {
        int adultPassengerToSelect = 1;

        Passenger passenger = new Passenger("Test", 28745640, "tanjatest2@inbox.lv", "RIC",
                "RIX", "372", "BCN", "BCD");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();

        homePage.isLogoAppearsInHeader();
        homePage.isReviewLinkAppearsInHeader();
        homePage.isPhoneNumberLinkWorkInHeader();
        homePage.isDropDownMenuOpen();
        homePage.selectMultiCityFlight();
        /*
        homePage.isLogInModalWindowOpens();
        homePage.loginModalClose();
        homePage.isSignUpModalWindowOpen();
        homePage.signUpModalClose();
        homePage.isHomePageWelcomeTextAppears();
        homePage.isTextOneAppears();
        homePage.isTextTwoAppears();
        homePage.isTextThreeAppears();
        homePage.WhyChooseAboveBlockCheck();
        homePage.isInstructionBlockAppears();
        homePage.reviewBlockCheck();
        homePage.switchToIframeFacebookButton();
        homePage.isIframeElementsDisplayed();
        homePage.isFooterLinksOpen();
        homePage.isPhoneNumberLinkWorkInFooter();
        homePage.isEmailLinkWorkInFooter();
        homePage.isPaymentsDisplayed();
        homePage.isPaymentMethodImageDisplayed();
        homePage.isPartnersDisplayed();
        homePage.isAllRightsTextDisplayed();
        homePage.isRequestFormAppears();
        homePage.fillFlightRequestForm(adultPassengerToSelect);
        homePage.selectAirportsAndCountryCodeFromSuggestionLists(FROM_AIRPORT, TO_AIRPORT, COUNTRY_CODE, passenger);
        homePage.fillInPassengerInfo(passenger);
        homePage.getAndSelectDepartAndReturnDates(expectedDepartDate);
         */
        homePage.openAboutUsPage();

        AboutUsPage aboutUsPage = new AboutUsPage(baseFunc);

        aboutUsPage.isLogoAppearsInHeader();
        aboutUsPage.isReviewLinkAppearsInHeader();
        aboutUsPage.isPhoneNumberLinkWorkInHeader();
        aboutUsPage.isDropDownMenuOpen();
        aboutUsPage.isLogInModalWindowOpens();
        aboutUsPage.loginModalClose();
        aboutUsPage.isSignUpModalWindowOpen();
        aboutUsPage.signUpModalClose();
        /*
        aboutUsPage.getTittle();
        aboutUsPage.getMainText();
        aboutUsPage.isFooterLinksOpen();
        aboutUsPage.isPhoneNumberLinkWorkInFooter();
        aboutUsPage.isEmailLinkWorkInFooter();
        aboutUsPage.isPaymentsDisplayed();
        aboutUsPage.isPaymentMethodImageDisplayed();
        aboutUsPage.isPartnersDisplayed();
        aboutUsPage.isAllRightsTextDisplayed();
         */
        aboutUsPage.openBlogPage();

        BlogPage blogPage = new BlogPage(baseFunc);
        blogPage.isLogoAppearsInHeader();
        blogPage.isReviewLinkAppearsInHeader();
        blogPage.isDropDownMenuOpen();
        blogPage.isLogInModalWindowOpens();
        blogPage.loginModalClose();
        blogPage.isSignUpModalWindowOpen();
        blogPage.signUpModalClose();
        /*
        blogPage.getTittle();
        blogPage.isBlogDisplayed();
        blogPage.isAllBlogItemsDisplayed();
        blogPage.isLinksWorksInRandomBlogItems();
        blogPage.isAllPostRepresentedInBlog();
        blogPage.isMainBlogPostDisplayed();
        blogPage.isBlogCardsDisplayed();
        blogPage.isFooterLinksOpen();
        blogPage.isPhoneNumberLinkWorkInFooter();
        blogPage.isEmailLinkWorkInFooter();
        blogPage.isPaymentsDisplayed();
        blogPage.isPaymentMethodImageDisplayed();
        blogPage.isPartnersDisplayed();
        blogPage.isAllRightsTextDisplayed();
         */
        blogPage.openTermsOfUsePage();

        TermsOfUsePage termsOfUsePage = new TermsOfUsePage(baseFunc);
        termsOfUsePage.isLogoAppearsInHeader();
        termsOfUsePage.isReviewLinkAppearsInHeader();
        termsOfUsePage.isPhoneNumberLinkWorkInHeader();
        termsOfUsePage.isDropDownMenuOpen();
        termsOfUsePage.isLogInModalWindowOpens();
        termsOfUsePage.loginModalClose();
        termsOfUsePage.isSignUpModalWindowOpen();
        termsOfUsePage.signUpModalClose();
        /*
        termsOfUsePage.getTittle();
        termsOfUsePage.isTextDisplayed();
        termsOfUsePage.isFooterLinksOpen();
        termsOfUsePage.isPhoneNumberLinkWorkInFooter();
        termsOfUsePage.isEmailLinkWorkInFooter();
        termsOfUsePage.isPaymentsDisplayed();
        termsOfUsePage.isPaymentMethodImageDisplayed();
        termsOfUsePage.isPartnersDisplayed();
        termsOfUsePage.isAllRightsTextDisplayed();
         */
        termsOfUsePage.openPrivacyPolicyPage();

        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(baseFunc);
        privacyPolicyPage.isLogoAppearsInHeader();
        privacyPolicyPage.isReviewLinkAppearsInHeader();
        privacyPolicyPage.isPhoneNumberLinkWorkInHeader();
        privacyPolicyPage.isDropDownMenuOpen();
        privacyPolicyPage.isLogInModalWindowOpens();
        privacyPolicyPage.loginModalClose();
        privacyPolicyPage.isSignUpModalWindowOpen();
        privacyPolicyPage.signUpModalClose();
        /*
        privacyPolicyPage.getTittle();
        privacyPolicyPage.isTextDisplayed();
        privacyPolicyPage.isLinksWorksInText();
        privacyPolicyPage.switchAndCloseIframeFacebook();
        privacyPolicyPage.isFooterLinksOpen();
        privacyPolicyPage.isPhoneNumberLinkWorkInFooter();
        privacyPolicyPage.isEmailLinkWorkInFooter();
        privacyPolicyPage.isPaymentsDisplayed();
        privacyPolicyPage.isPaymentMethodImageDisplayed();
        privacyPolicyPage.isPartnersDisplayed();
        privacyPolicyPage.isAllRightsTextDisplayed();
         */
        privacyPolicyPage.openCookiesPolicyPage();

        CookiesPolicyPage cookiesPolicyPage = new CookiesPolicyPage(baseFunc);
        cookiesPolicyPage.isLogoAppearsInHeader();
        cookiesPolicyPage.isReviewLinkAppearsInHeader();
        cookiesPolicyPage.isPhoneNumberLinkWorkInHeader();
        cookiesPolicyPage.isDropDownMenuOpen();
        cookiesPolicyPage.isLogInModalWindowOpens();
        cookiesPolicyPage.loginModalClose();
        cookiesPolicyPage.isSignUpModalWindowOpen();
        cookiesPolicyPage.signUpModalClose();
        /*
        cookiesPolicyPage.getTittle();
        cookiesPolicyPage.isTextDisplayed();
        cookiesPolicyPage.isFooterLinksOpen();
        cookiesPolicyPage.isPhoneNumberLinkWorkInFooter();
        cookiesPolicyPage.isEmailLinkWorkInFooter();
        cookiesPolicyPage.isPaymentsDisplayed();
        cookiesPolicyPage.isPaymentMethodImageDisplayed();
        cookiesPolicyPage.isPartnersDisplayed();
        cookiesPolicyPage.isAllRightsTextDisplayed();
         */
        cookiesPolicyPage.openContactUsPage();

        ContactUsPage contactUsPage = new ContactUsPage(baseFunc);
        contactUsPage.isLogoAppearsInHeader();
        contactUsPage.isReviewLinkAppearsInHeader();
        contactUsPage.isPhoneNumberLinkWorkInHeader();
        contactUsPage.isDropDownMenuOpen();
        contactUsPage.isLogInModalWindowOpens();
        contactUsPage.loginModalClose();
        contactUsPage.isSignUpModalWindowOpen();
        contactUsPage.signUpModalClose();
       /*
        contactUsPage.getTittle();
        contactUsPage.isHeadersDisplayed();
        contactUsPage.isPlaceholdersTextDisplayed();
        contactUsPage.isSubmitButtonEnabled();
        contactUsPage.isUsefulInfoBlockDisplayed();
        contactUsPage.isFooterLinksOpen();
        contactUsPage.isPhoneNumberLinkWorkInFooter();
        contactUsPage.isEmailLinkWorkInFooter();
        contactUsPage.isPaymentsDisplayed();
        contactUsPage.isPaymentMethodImageDisplayed();
        contactUsPage.isPartnersDisplayed();
        contactUsPage.isAllRightsTextDisplayed();
        contactUsPage.manageCookiesPreferencesModalOpen();
        contactUsPage.isModalWindowDisplayedCorrect();
        contactUsPage.manageCookiesPreferencesModalClose();
        */
    }

}

