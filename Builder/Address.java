package Creational.Builder;

public class Address {
    private String street;
    private String city;
    private String countryName;
    private String state;
    private int pinCode;

    public Address(String street,String city,String countryName,String state,int pinCode){
        this.street=street;
        this.city=city;
        this.countryName=countryName;
        this.state=state;
        this.pinCode=pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", countryName='" + countryName + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
