package com.tma.travelmanagerapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    @NotNull
    @Column(name="street")
    private String street;

    @NotNull
    @Column(name="city")
    private String city;

    @NotNull
    @Column(name="neighborhood")
    private String neighborhood;

    @NotNull
    @Column(name="zip_code")
    private String zipCode;

    @NotNull
    @Column(name="country")
    private String country;

}
