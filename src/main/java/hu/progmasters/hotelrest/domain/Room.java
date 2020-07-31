package hu.progmasters.hotelrest.domain;

import hu.progmasters.hotelrest.domain.dto.RoomFormCommand;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    @NotNull
    private Hotel hotel;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "size")
    @NotNull
    private RoomSize size;

    @Column(name = "is_reserved")
    private boolean isReserved = false;

    @Column(name = "number")
    @Min(0)
    @Max(10_000)
    private int number;

    @Column(name = "price")
    @Min(0)
    private double price;

    public Room() {
    }

    public Room(Hotel hotel, RoomFormCommand roomFormCommand) {
        this.hotel = hotel;
        this.number = roomFormCommand.getNumber();
        this.price = roomFormCommand.getPrice();
        this.size = roomFormCommand.getRoomSize();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
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
