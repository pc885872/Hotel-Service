package com.hotel.controller;

import com.hotel.entities.Hotel;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping()
    public ResponseEntity<Hotel> save(@RequestBody Hotel hotel) {
        Hotel hotel1 = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    @GetMapping()
    public ResponseEntity<List<Hotel>> getHotels() {
        List<Hotel> hotels = hotelService.getHotels();
        return ResponseEntity.status(HttpStatus.OK).body(hotels);
    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
        Hotel hotel = hotelService.getHotelById(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }

}
