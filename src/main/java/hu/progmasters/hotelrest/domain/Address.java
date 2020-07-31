package hu.progmasters.hotelrest.domain;

import hu.progmasters.hotelrest.domain.dto.AddressFormCommand;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "city")
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "street")
    private String street;

    public Address() {
    }

    public Address(AddressFormCommand addressFormCommand) {
        this.city = addressFormCommand.getCity();
        this.zipCode = addressFormCommand.getZip();
        this.street = addressFormCommand.getStreet();
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
