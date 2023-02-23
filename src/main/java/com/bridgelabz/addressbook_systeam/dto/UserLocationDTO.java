package com.bridgelabz.addressbook_systeam.dto;

import lombok.Data;

public @Data class UserLocationDTO {
    private long id;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
