package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.mobile.MobileHomePage;


public class MobileElementsCheckCmsTestAbove {
    private final String URL = "https://staging.above9.travel/";
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("mobile");
    int adultPassengerToSelect = 1;

    @Test
    public void MobileElementsCheck() {
        LOGGER.info("This test will be check all elements on each page for mobile version");
        baseFunc.openUrl(URL);
        MobileHomePage mobileHomePage = new MobileHomePage(baseFunc);
        mobileHomePage.acceptCookies();
        mobileHomePage.mobileLogoInHeader();
        mobileHomePage.isTrustpilotLinkAppears();
        mobileHomePage.checkDropDownMenu();

    }
}
