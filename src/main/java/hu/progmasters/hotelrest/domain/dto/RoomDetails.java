package hu.progmasters.hotelrest.domain.dto;

import hu.progmasters.hotelrest.domain.Room;
import hu.progmasters.hotelrest.domain.RoomSize;

public class RoomDetails {

    private long id;
    private RoomSize size;
    private boolean isReserved;
    private int number;
    private double price;

    public RoomDetails(Room room) {
        this.id = room.getId();
        this.number = room.getNumber();
        this.price = room.getPrice();
        this.size = room.getSize();
        this.isReserved = room.isReserved();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RoomSize getSize() {
        return size;
    }

    public void setSize(RoomSize size) {
        this.size = size;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
