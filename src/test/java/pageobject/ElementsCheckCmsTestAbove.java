package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.pagesForAbove.*;

public class ElementsCheckCmsTestAbove {
    private final String URL = "http://staging.above9.travel/";
    int adultPassengerToSelect = 1;

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void ElementsCheck() {

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.isLogoAppearsInHeader();
        homePage.isReviewLinkAppearsInHeader();
        homePage.isPhoneNumberLinkWorkInHeader();
        homePage.isDropDownMenuOpen();
        homePage.isLogInModalWindowOpens();
        homePage.loginModalClose();
        homePage.isSignUpModalWindowOpen();
        homePage.signUpModalClose();
        homePage.isHomePageWelcomeTextAppears();
        homePage.isTextOneAppears();
        homePage.isTextTwoAppears();
        homePage.isTextThreeAppears();
        homePage.whyChooseAboveBlockCheck();
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
        homePage.isElementsInMultiCityFlightRequestFormDisplayed();
        homePage.isRequestFormAppears();
        homePage.selectFlightAndPassengerParameters(adultPassengerToSelect);
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
        aboutUsPage.getTittle();
        aboutUsPage.getMainText();
        aboutUsPage.isFooterLinksOpen();
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
        blogPage.isDropDownMenuOpen();
        blogPage.isLogInModalWindowOpens();
        blogPage.loginModalClose();
        blogPage.isSignUpModalWindowOpen();
        blogPage.signUpModalClose();
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
        termsOfUsePage.getTittle();
        termsOfUsePage.isTextDisplayed();
        termsOfUsePage.isFooterLinksOpen();
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
        privacyPolicyPage.isDropDownMenuOpen();
        privacyPolicyPage.isLogInModalWindowOpens();
        privacyPolicyPage.loginModalClose();
        privacyPolicyPage.isSignUpModalWindowOpen();
        privacyPolicyPage.signUpModalClose();
        privacyPolicyPage.getTittle();
        privacyPolicyPage.isTextDisplayed();
        privacyPolicyPage.isLinksWorksInText();
        privacyPolicyPage.isFooterLinksOpen();
        privacyPolicyPage.isPhoneNumberLinkWorkInFooter();
        privacyPolicyPage.isEmailLinkWorkInFooter();
        //privacyPolicyPage.switchAndCloseIframeFacebook();
        privacyPolicyPage.isPaymentsDisplayed();
        privacyPolicyPage.isPaymentMethodImageDisplayed();
        privacyPolicyPage.isPartnersDisplayed();
        privacyPolicyPage.isAllRightsTextDisplayed();
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
        cookiesPolicyPage.getTittle();
        cookiesPolicyPage.isTextDisplayed();
        cookiesPolicyPage.isFooterLinksOpen();
        cookiesPolicyPage.isPhoneNumberLinkWorkInFooter();
        cookiesPolicyPage.isEmailLinkWorkInFooter();
        cookiesPolicyPage.isPaymentsDisplayed();
        cookiesPolicyPage.isPaymentMethodImageDisplayed();
        cookiesPolicyPage.isPartnersDisplayed();
        cookiesPolicyPage.isAllRightsTextDisplayed();
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
        contactUsPage.closeBrowser();
    }
}

