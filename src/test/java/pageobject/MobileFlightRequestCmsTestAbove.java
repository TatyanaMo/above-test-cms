package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.mobile.MobileHomePage;
import pageobject.model.Passenger;

public class MobileFlightRequestCmsTestAbove {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("mobile");
    int adultPassengerToSelect = 1;
    public final String expectedDepartDate = "22-11-2023";
    public final String expectedReturnDate = "06-12-2023";

    @Test
    public void successfulFlightRequest() {
        LOGGER.info("This test make happy path of sending flight request for mobile version");
        Passenger passenger = new Passenger("AutoTest Client", 20071634, "hesas73373@wireps.com", "VBS",
                "371", "RIX", "AboveTest");

        baseFunc.openMobileHomePage();
        MobileHomePage mobileHomePage = new MobileHomePage(baseFunc);
        mobileHomePage.acceptCookies();
        mobileHomePage.isRequestFormAppears();
        mobileHomePage.selectFlightParameters();
        mobileHomePage.selectPassengerParameters(adultPassengerToSelect);
        mobileHomePage.selectAirportsFromSuggestionLists(passenger.getAirportFrom(), passenger.getAirportTo(), passenger);
        mobileHomePage.getAndSelectDepartAndReturnDates(expectedDepartDate, expectedReturnDate);
        mobileHomePage.fillInPassengerInfo(passenger);
        mobileHomePage.submitFlightRequest();
        mobileHomePage.isSuccessfulRequestMessageIsDisplayed();
    }
}
