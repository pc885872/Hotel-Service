package com.hotel.service.impl;

import com.hotel.entities.Hotel;
import com.hotel.exceptions.ResourceNotFound;
import com.hotel.repositories.HotelRepository;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        String userId  = UUID.randomUUID().toString();
        hotel.setHotelId(userId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Hotel not found for id on server !!"));
    }
}
