package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.BaseFunc;
import pageobject.model.Passenger;
import pageobject.model.PassengerNew;
import pageobject.pagesForAbove.mobile.MobileHomePage;
import pageobject.pagesForAbove.mobile.MobileUserProfilePage;

public class MobileUserAccountElementCheckCmsTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("mobile");

    @Test
    public void MobileUserAccountElementsCheck() {
        LOGGER.info("This test will be check all elements on profile page for registered user for mobile version");

        Passenger passenger = new Passenger("AutoTest Client", 25948715, "tanjatest2@inbox.lv", "VBS",
                "371", "RIX", "Above123qw");
        PassengerNew passengerNew = new PassengerNew("AutoTestNew Client",25948715,"a3478452@gmail.com",
                "371","newTestAcc2023DH@");

        baseFunc.openMobileHomePage();
        MobileHomePage mobileHomePage = new MobileHomePage(baseFunc);
        mobileHomePage.acceptCookies();
        mobileHomePage.isLogInModalWindowOpens();
        mobileHomePage.fillLogInForm(passengerNew);
        mobileHomePage.openUserProfilePage();
        MobileUserProfilePage mobileUserProfilePage = new MobileUserProfilePage(baseFunc);
        mobileUserProfilePage.logoInHeader();
        mobileUserProfilePage.checkDropDownMenu();
        mobileUserProfilePage.isMyProfileTittleDisplayed();
        mobileUserProfilePage.isMyProfileOptionsDisplayed();

    }
}
