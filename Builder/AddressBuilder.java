package Creational.Builder;

public class AddressBuilder {
    private String street;
    private String city;
    private String countryName;
    private String state;
    private int pinCode;

    public AddressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public AddressBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public AddressBuilder setPinCode(int pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    public Address build(){
        return new Address(street,city,countryName,state,pinCode);
    }
}
