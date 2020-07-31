package hu.progmasters.hotelrest.domain.dto;

import hu.progmasters.hotelrest.domain.Address;

public class AddressDetails {

    private String city;
    private String zip;
    private String street;


    public AddressDetails(Address address) {
        this.city = address.getCity();
        this.zip = address.getZipCode();
        this.street = address.getStreet();

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
