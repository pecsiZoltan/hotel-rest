package hu.progmasters.hotelrest.service;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.dto.HotelDetails;
import hu.progmasters.hotelrest.domain.dto.HotelFormCommand;
import hu.progmasters.hotelrest.domain.dto.HotelListItem;
import hu.progmasters.hotelrest.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<HotelListItem> findAll() {
        /*
        List<Hotel> all = hotelRepository.findAll();
        List<HotelListItem> hotelListItems = new ArrayList<>();
        for (Hotel hotel : all) {
            HotelListItem hotelListItem = new HotelListItem(hotel);
            hotelListItems.add(hotelListItem);
        }
        return hotelListItems;
         */

        // parallelStream - multithreading
        return hotelRepository
                .findAll()
                .stream()
                .map(HotelListItem::new)
                .collect(Collectors.toList());
    }

    public void create(HotelFormCommand hotelFormCommand) {
        hotelRepository.save(new Hotel(hotelFormCommand));
    }

    public Hotel findById(Long hotelId) {
        return hotelRepository
                .findById(hotelId)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find hotel with such ID: " + hotelId));
    }

    public HotelDetails findDetailsById(Long hotelId) {
        Hotel hotel = findById(hotelId);
        return new HotelDetails(hotel);
    }
}
