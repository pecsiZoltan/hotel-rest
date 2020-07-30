package hu.progmasters.hotelrest.domain.dto;

import hu.progmasters.hotelrest.domain.Hotel;

public class HotelListItem {

    private long id;
    private String name;
    private String stars;

    public HotelListItem(Hotel hotel) {
        this.id = hotel.getId();
        this.name = hotel.getName();
        this.stars = hotel.getStars().toString();
    }
}
