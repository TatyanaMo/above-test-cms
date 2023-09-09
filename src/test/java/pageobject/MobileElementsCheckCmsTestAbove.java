package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.pagesForAbove.mobile.MobileAboutUsPage;
import pageobject.pagesForAbove.mobile.MobileBlogPage;
import pageobject.pagesForAbove.mobile.MobileHomePage;


public class MobileElementsCheckCmsTestAbove {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("mobile");
    int adultPassengerToSelect = 1;
    public final String expectedDepartDate = "22-11-2023";
    public final String expectedReturnDate = "06-12-2023";

    @Test
    public void MobileElementsCheck() {
        LOGGER.info("This test will be check all elements on each page for mobile version");

        baseFunc.openMobileHomePage();
        MobileHomePage mobileHomePage = new MobileHomePage(baseFunc);
        mobileHomePage.acceptCookies();
        mobileHomePage.logoInHeader();
        mobileHomePage.isTrustpilotLinkAppears();
        mobileHomePage.checkDropDownMenu();
//        mobileHomePage.isLogInModalWindowOpens();
//        mobileHomePage.loginModalClose();
//        mobileHomePage.isSignUpModalWindowOpen();
//        mobileHomePage.signUpModalClose();
//        mobileHomePage.isHomePageWelcomeTextAppears();
//        mobileHomePage.isTextOneAppears();
//        mobileHomePage.isTextTwoAppears();
//        mobileHomePage.whyChooseAboveBlockCheck();
//        mobileHomePage.reviewBlockCheck();
//        mobileHomePage.isInstructionBlockAppears();
//        mobileHomePage.isFooterLinksOpen();
//        mobileHomePage.isPhoneNumberLinkWorkInFooter();
//        mobileHomePage.isEmailLinkWorkInFooter();
//        mobileHomePage.isPaymentsDisplayed();
//        mobileHomePage.isPaymentMethodImageDisplayed();
//        mobileHomePage.isPartnersDisplayed();
//        mobileHomePage.isAllRightsTextDisplayed();
//        mobileHomePage.isRequestFormAppears();
//        mobileHomePage.isElementsInMultiCityFlightRequestFormDisplayed();
        mobileHomePage.openAboutUsPage();
        MobileAboutUsPage mobileAboutUsPage = new MobileAboutUsPage(baseFunc);
        mobileAboutUsPage.logoInHeader();
//        mobileAboutUsPage.checkDropDownMenu();
//        mobileAboutUsPage.isLogInModalWindowOpens();
//        mobileAboutUsPage.loginModalClose();
//        mobileAboutUsPage.isSignUpModalWindowOpen();
//        mobileAboutUsPage.signUpModalClose();
//        mobileAboutUsPage.getTittle();
//        mobileAboutUsPage.getMainText();
//        mobileAboutUsPage.isFooterLinksOpen();
//        mobileAboutUsPage.isPhoneNumberLinkWorkInFooter();
//        mobileAboutUsPage.isEmailLinkWorkInFooter();
//        mobileAboutUsPage.isPaymentsDisplayed();
//        mobileAboutUsPage.isPaymentMethodImageDisplayed();
//        mobileAboutUsPage.isPartnersDisplayed();
//        mobileAboutUsPage.isAllRightsTextDisplayed();
        mobileAboutUsPage.openBlogPage();
        MobileBlogPage mobileBlogPage = new MobileBlogPage(baseFunc);
        mobileBlogPage.logoInHeader();
        mobileBlogPage.isDropDownMenuOpen();
        mobileBlogPage.isLogInModalWindowOpens();
        mobileBlogPage.loginModalClose();
        mobileBlogPage.isSignUpModalWindowOpen();
        mobileBlogPage.signUpModalClose();
        mobileBlogPage.getTittle();
        mobileBlogPage.isBlogDisplayed();

    }
}
