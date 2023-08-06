package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.model.PassengerNew;
import pageobject.pagesForAbove.HomePage;
import pageobject.pagesForAbove.UserProfilePage;

public class UserAccountElementsCheckCmsTest {
    private final String URL = "http://staging.above9.travel/";
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void UserAccountElementsCheck() {
        Passenger passenger = new Passenger("AutoTest Client", 25948715, "tanjatest2@inbox.lv", "VBS",
                "371", "RIX", "Above123qw");
        PassengerNew passengerNew = new PassengerNew("AutoTestNew Client",25948715,"a3478452@gmail.com",
                "371","newTestAcc2023DH@");
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.isLogInModalWindowOpens();
        homePage.fillLogInForm(passenger);
        homePage.openUserProfilePage();

        UserProfilePage userProfilePage = new UserProfilePage(baseFunc);
        userProfilePage.logoInHeader();
        userProfilePage.isReviewLinkAppearsInHeader();
        userProfilePage.isPhoneNumberLinkWorkInHeader();
        userProfilePage.isDropDownMenuOpen();
        userProfilePage.isMyProfileTittleDisplayed();
        userProfilePage.isMyProfileOptionsDisplayed();
        userProfilePage.isPersonalInfoBlockElementsDisplayed();
        userProfilePage.isSideInfoBlockElementsDisplayed();
        userProfilePage.checkUpcomingFlightsBlock();
        userProfilePage.checkPurchaseHistoryBlockElementsDisplayed();
        userProfilePage.isCoTravelersBlockElementsDisplayed();
        userProfilePage.closeIframe();
        userProfilePage.isFooterLinksOpen();
        userProfilePage.isPhoneNumberLinkWorkInFooter();
        userProfilePage.isEmailLinkWorkInFooter();
        userProfilePage.isPaymentsDisplayed();
        userProfilePage.isPaymentMethodImageDisplayed();
        userProfilePage.isPartnersDisplayed();
        userProfilePage.isAllRightsTextDisplayed();
    }
}
