package hu.progmasters.hotelrest.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Embedded
    private Address address;

    @Column("name")
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "stars")
    private HotelRating stars;

    @Column(name = "description",
            columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "hotel")
    private List<Room> roomList = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
