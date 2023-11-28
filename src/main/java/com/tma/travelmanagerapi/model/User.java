package com.tma.travelmanagerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private UUID userId;
    private String name;
    private String email;
    private String password;
    private boolean active;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private Address address;

}
