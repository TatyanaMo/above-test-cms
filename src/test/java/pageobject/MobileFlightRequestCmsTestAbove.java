package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.pagesForAbove.mobile.MobileHomePage;
import pageobject.model.Passenger;

public class MobileFlightRequestCmsTestAbove {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("mobile");
    int adultPassengerToSelect = 1;
    public final String expectedDepartDate = "10-10-2024";
    public final String expectedReturnDate = "06-11-2024";

    @Test
    public void successfulFlightRequest() {
        LOGGER.info("This test make happy path of sending flight request for mobile version");
        Passenger passenger = new Passenger("AT Client", 12345678, "a3478452@gmail.com", "VBS",
                "371", "RIX", "AboveTestAcc123@");

        baseFunc.openMobileHomePage();
        MobileHomePage mobileHomePage = new MobileHomePage(baseFunc);
        mobileHomePage.acceptCookies();
        mobileHomePage.selectFlightParameters();
        mobileHomePage.selectPassengerParameters(adultPassengerToSelect);
        mobileHomePage.selectAirportsFromSuggestionLists(passenger.getAirportFrom(), passenger.getAirportTo(), passenger);
        mobileHomePage.getAndSelectDepartAndReturnDates(expectedDepartDate, expectedReturnDate);
        mobileHomePage.fillInPassengerInfo(passenger);
        mobileHomePage.submitFlightRequest();
        mobileHomePage.isSuccessfulRequestMessageIsDisplayed();
        baseFunc.closeBrowser();
    }
}
