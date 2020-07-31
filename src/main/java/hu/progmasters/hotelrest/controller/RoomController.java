package hu.progmasters.hotelrest.controller;

import hu.progmasters.hotelrest.domain.dto.RoomFormCommand;
import hu.progmasters.hotelrest.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody RoomFormCommand roomFormCommand) {
        roomService.create(roomFormCommand);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
