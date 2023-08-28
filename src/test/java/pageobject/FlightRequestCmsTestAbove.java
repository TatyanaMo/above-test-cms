package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pagesForAbove.HomePage;

public class FlightRequestCmsTestAbove {
    public final String expectedDepartDate = "22-11-2023";
    public final String expectedReturnDate = "06-12-2023";
    int adultPassengerToSelect = 1;
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("web");

    @Test
    public void successfulFlightRequest() {
        LOGGER.info("This test make happy path of sending flight request");
        Passenger passenger = new Passenger("AutoTest Client", 25948715, "hesas73373@wireps.com", "VBS",
                "371", "RIX", "AboveTest");
        baseFunc.openHomePage();
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectFlightAndPassengerParameters(adultPassengerToSelect);
        homePage.fillInPassengerInfo(passenger);
        homePage.getAndSelectDepartAndReturnDates(expectedDepartDate, expectedReturnDate);
        homePage.selectAirportsAndCountryCodeFromSuggestionLists(passenger.getAirportFrom(), passenger.getAirportTo(), passenger);
        homePage.submitFlightRequest();
        homePage.isSuccessfulRequestMessageIsDisplayed();
        baseFunc.closeBrowser();
    }
}
