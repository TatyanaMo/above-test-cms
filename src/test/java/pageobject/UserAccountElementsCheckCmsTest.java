package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pagesForAbove.HomePage;

public class UserAccountElementsCheckCmsTest {
    private final String URL = "http://staging.above9.travel/";
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void UserAccountElementsCheck() {
        Passenger passenger = new Passenger("AutoTest Client", 25948715, "hesas73373@wireps.com", "VBS",
                "371", "RIX", "AboveTest");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.isLogInModalWindowOpens();
        homePage.fillLogInForm(passenger);
        homePage.openUserProfilePage();
    }
}
