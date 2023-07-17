package com.hotel.service;

import com.hotel.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    //create hotel
    Hotel saveHotel(Hotel hotel);

    //get all hotels
    List<Hotel> getHotels();

    //get hotel by id
    Hotel getHotelById(String id);
}
