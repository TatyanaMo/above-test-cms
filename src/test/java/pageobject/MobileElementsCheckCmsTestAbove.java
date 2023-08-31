package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.mobile.MobileHomePage;
import pageobject.model.Passenger;


public class MobileElementsCheckCmsTestAbove {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("mobile");
    int adultPassengerToSelect = 1;
    public final String expectedDepartDate = "22-11-2023";
    public final String expectedReturnDate = "06-12-2023";

    @Test
    public void MobileElementsCheck() {
        LOGGER.info("This test will be check all elements on each page for mobile version");
        Passenger passenger = new Passenger("AutoTest Client", 25948715, "hesas73373@wireps.com", "VBS",
                "371", "RIX", "AboveTest");
        baseFunc.openMobileHomePage();
        MobileHomePage mobileHomePage = new MobileHomePage(baseFunc);
        mobileHomePage.acceptCookies();
        mobileHomePage.logoInHeader();
        //mobileHomePage.isTrustpilotLinkAppears();
        //mobileHomePage.checkDropDownMenu();
        //mobileHomePage.isLogInModalWindowOpens();
        //mobileHomePage.loginModalClose();
        //mobileHomePage.isSignUpModalWindowOpen();
        //mobileHomePage.signUpModalClose();
        mobileHomePage.isHomePageWelcomeTextAppears();
        mobileHomePage.isTextOneAppears();
        mobileHomePage.isTextTwoAppears();
        mobileHomePage.whyChooseAboveBlockCheck();
        mobileHomePage.reviewBlockCheck();
        mobileHomePage.isInstructionBlockAppears();
        //mobileHomePage.isFooterLinksOpen();
        mobileHomePage.isPhoneNumberLinkWorkInFooter();
        mobileHomePage.isEmailLinkWorkInFooter();
        mobileHomePage.isPaymentsDisplayed();
        mobileHomePage.isPaymentMethodImageDisplayed();
        mobileHomePage.isPartnersDisplayed();
        mobileHomePage.isAllRightsTextDisplayed();
        mobileHomePage.isRequestFormAppears();
        mobileHomePage.selectFlightParameters();
        mobileHomePage.selectAirportsAndCountryCodeFromSuggestionLists(passenger.getAirportFrom(), passenger.getAirportTo(), passenger);
        mobileHomePage.getAndSelectDepartAndReturnDates(expectedDepartDate, expectedReturnDate);
        mobileHomePage.fillInPassengerInfo(passenger);


    }
}
