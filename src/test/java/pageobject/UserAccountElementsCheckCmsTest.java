package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
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
        userProfilePage.isUpcomingFlightsBlockElementsDisplayed();
    }
}
