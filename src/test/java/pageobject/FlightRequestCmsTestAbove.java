package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pagesForAbove.HomePage;

public class FlightRequestCmsTestAbove {
    private final String URL = "http://staging.above9.travel/";
    public final String expectedDepartDate = "01-08-2023";
    public final String expectedReturnDate = "06-09-2023";
    int adultPassengerToSelect = 1;

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulFlightRequest() {
        Passenger passenger = new Passenger("AT client", 28745640, "koltekiyde@gufum.com", "VBS",
                "371", "RIX");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.selectFlightAndPassengerParameters(adultPassengerToSelect);
        homePage.fillInPassengerInfo(passenger);
        homePage.getAndSelectDepartAndReturnDates(expectedDepartDate, expectedReturnDate);
        homePage.selectAirportsAndCountryCodeFromSuggestionLists(passenger.getAirportFrom(), passenger.getAirportTo(), passenger);
        homePage.submitFlightRequest();
        homePage.isSuccessfulRequestMessageIsDisplayed();
        baseFunc.closeBrowser();
    }
}
