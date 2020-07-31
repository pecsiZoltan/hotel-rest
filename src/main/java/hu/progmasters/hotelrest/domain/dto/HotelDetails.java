package hu.progmasters.hotelrest.domain.dto;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.HotelRating;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelDetails {

    private long id;
    private AddressDetails addressDetails;
    private String name;
    private HotelRating stars;
    private String description;
    private List<RoomDetails> roomList = new ArrayList<>();

    public HotelDetails(Hotel hotel) {
        this.id = hotel.getId();
        this.name = hotel.getName();
        this.description = hotel.getDescription();
        this.stars = hotel.getStars();
        this.addressDetails = new AddressDetails(hotel.getAddress());
        this.roomList = hotel.getRoomList().stream()
                .map(room -> new RoomDetails(room))
                .collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelRating getStars() {
        return stars;
    }

    public void setStars(HotelRating stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RoomDetails> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<RoomDetails> roomList) {
        this.roomList = roomList;
    }
}
