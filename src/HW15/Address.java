package HW15;

public class Address {
    private String streetAddress;
    private String city;
    private String zipCode;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String line1, String city, String zipCode, String state) {
        this.streetAddress = line1;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s %s", getStreetAddress(), getCity(), getState(), getZipCode());
    }
}

