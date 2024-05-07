package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pagesForAbove.HomePage;

public class FlightRequestCmsTestAbove {
    public final String expectedDepartDate = "10-10-2024";
    public final String expectedReturnDate = "06-11-2024";
    int adultPassengerToSelect = 1;
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc = new BaseFunc("web");

    @Test
    public void successfulFlightRequest() {
        LOGGER.info("This test make happy path of sending flight request");
        Passenger passenger = new Passenger("AT Client", 12345678, "a3478452@gmail.com", "VBS",
                "371", "RIX", "AboveTestAcc123@");
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
