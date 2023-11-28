package com.tma.travelmanagerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private UUID addressId;
    private String street;
    private String city;
    private String neighborhood;
    private String zipCode;
    private String country;

}
