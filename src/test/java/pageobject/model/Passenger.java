package pageobject.model;

public class Passenger {
    private String Name;
    private int phoneNumber;
    private String email;
    private String airportFrom;
    private String countryCode;
    private String airportTo;


    public Passenger(String name, int phoneNumber, String email, String airportFrom, String countryCode, String airportTo) {
        Name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.airportFrom = airportFrom;
        this.countryCode = countryCode;
        this.airportTo = airportTo;

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

    public String getCountryCode() {
        return countryCode;
    }

    public String getAirportTo() {
        return airportTo;
    }

}
