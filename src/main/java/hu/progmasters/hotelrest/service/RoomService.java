package hu.progmasters.hotelrest.service;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.Room;
import hu.progmasters.hotelrest.domain.dto.RoomFormCommand;
import hu.progmasters.hotelrest.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RoomService {

    private RoomRepository roomRepository;
    private HotelService hotelService;

    @Autowired
    public RoomService(RoomRepository roomRepository, HotelService hotelService) {
        this.roomRepository = roomRepository;
        this.hotelService = hotelService;
    }

    public void create(RoomFormCommand roomFormCommand) {
        Hotel hotel = hotelService.findById(roomFormCommand.getHotelId());
        Room room = new Room(hotel, roomFormCommand);
        roomRepository.save(room);
    }
}
