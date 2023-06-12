package pageobject.model;

public class Passenger {
    private String Name;
    private int phoneNumber;
    private String email;
    private String airportFrom;
    private String airportTo;
    private String countryCode;


    public Passenger(String name, int phoneNumber, String email, String airportFrom, String airportTo, String countryCode) {
        Name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.countryCode = countryCode;

    }

    public String getName() {
        return Name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
