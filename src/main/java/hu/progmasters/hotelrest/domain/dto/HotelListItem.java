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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }
}
