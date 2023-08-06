package pageobject.model;

public class Passenger {
    private String name;
    private int phoneNumber;
    private String email;
    private String airportFrom;
    private String countryCode;
    private String airportTo;
    private String password;


    public Passenger(String name, int phoneNumber, String email, String airportFrom, String countryCode, String airportTo, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.airportFrom = airportFrom;
        this.countryCode = countryCode;
        this.airportTo = airportTo;
        this.password = password;

    }

    public String getName() {
        return name;
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

    public String getPassword() {
        return password;
    }
}
