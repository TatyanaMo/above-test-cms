package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.mobile.MobileHomePage;


public class MobileElementsCheckCmsTestAbove {
    //private final String URL = "https://staging.above9.travel/";
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("mobile");
    int adultPassengerToSelect = 1;

    @Test
    public void MobileElementsCheck() {
        LOGGER.info("This test will be check all elements on each page for mobile version");
        baseFunc.openMobileHomePage();
        MobileHomePage mobileHomePage = new MobileHomePage(baseFunc);
        mobileHomePage.acceptCookies();
        mobileHomePage.logoInHeader();
        mobileHomePage.isTrustpilotLinkAppears();
        mobileHomePage.checkDropDownMenu();
        mobileHomePage.isLogInModalWindowOpens();
        mobileHomePage.loginModalClose();
        mobileHomePage.isSignUpModalWindowOpen();
        mobileHomePage.signUpModalClose();
        mobileHomePage.isHomePageWelcomeTextAppears();
        mobileHomePage.isTextOneAppears();
        mobileHomePage.isTextTwoAppears();
        mobileHomePage.whyChooseAboveBlockCheck();
        mobileHomePage.reviewBlockCheck();
        mobileHomePage.isInstructionBlockAppears();
        mobileHomePage.isFooterLinksOpen();
        mobileHomePage.isPhoneNumberLinkWorkInFooter();
        mobileHomePage.isEmailLinkWorkInFooter();
        mobileHomePage.isPaymentsDisplayed();
        mobileHomePage.isPaymentMethodImageDisplayed();
        mobileHomePage.isPartnersDisplayed();
        mobileHomePage.isAllRightsTextDisplayed();



    }
}
