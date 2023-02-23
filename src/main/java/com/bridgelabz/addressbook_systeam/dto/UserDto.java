package com.bridgelabz.addressbook_systeam.dto;

import com.bridgelabz.addressbook_systeam.model.Location;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

public @Data class UserDto {
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private  String place;
    private  String description;
    private double longitude;
    private double latitude;
//@ManyToOne(fetch = FetchType.EAGER,optional = false)
//@JoinColumn(name = "location_id")
//private Location location;

}
