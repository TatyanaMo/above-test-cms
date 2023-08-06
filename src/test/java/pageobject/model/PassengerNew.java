package pageobject.model;

public class PassengerNew {
    private String name;
    private int phoneNumber;
    private String email;
    private String countryCode;
    private String password;

    public PassengerNew(String name, int phoneNumber, String email, String countryCode, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.countryCode = countryCode;
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

    public String getCountryCode() {
        return countryCode;
    }

    public String getPassword() {
        return password;
    }
}
