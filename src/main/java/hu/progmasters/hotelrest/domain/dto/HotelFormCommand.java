package hu.progmasters.hotelrest.domain.dto;

import hu.progmasters.hotelrest.domain.HotelRating;

public class HotelFormCommand {
    private String name;
    private String description;
    private AddressFormCommand addressFormCommand;
    private HotelRating hotelRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressFormCommand getAddressFormCommand() {
        return addressFormCommand;
    }

    public void setAddressFormCommand(AddressFormCommand addressFormCommand) {
        this.addressFormCommand = addressFormCommand;
    }

    public HotelRating getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(HotelRating hotelRating) {
        this.hotelRating = hotelRating;
    }
}
