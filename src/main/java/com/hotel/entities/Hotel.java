package com.hotel.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(value = "hotels")
@Data
public class Hotel {
    @Id
    private String hotelId;
    private String name;
    private String location;
    private String email;
    private String about;
    private List<Rating> ratings = new ArrayList<>();
}
