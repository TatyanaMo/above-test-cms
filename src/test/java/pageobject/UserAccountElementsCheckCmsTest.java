package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.model.PassengerNew;
import pageobject.pagesForAbove.HomePage;
import pageobject.pagesForAbove.UserProfilePage;

public class UserAccountElementsCheckCmsTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("web");

    @Test
    public void UserAccountElementsCheck() {
        LOGGER.info("This test will be check all elements on profile page for registered user");

        Passenger passenger = new Passenger("AutoTest Client", 26441747, "tanjatest2@inbox.lv", "VBS",
                "371", "RIX", "Above123qw");
        PassengerNew passengerNew = new PassengerNew("AutoTestNew Client",26441747,"a3478452@gmail.com",
                "371","newTestAcc2023DH@");
        baseFunc.openHomePage();
        HomePage homePage = new HomePage(baseFunc);
        homePage.isLogInModalWindowOpens();
        homePage.fillLogInForm(passengerNew);
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
        userProfilePage.isFooterLinksOpen();
        userProfilePage.isPhoneNumberLinkWorkInFooter();
        userProfilePage.isEmailLinkWorkInFooter();
        userProfilePage.isPaymentsDisplayed();
        userProfilePage.isPaymentMethodImageDisplayed();
        userProfilePage.isPartnersDisplayed();
        userProfilePage.isAllRightsTextDisplayed();
        userProfilePage.closeBrowser();
    }
}
