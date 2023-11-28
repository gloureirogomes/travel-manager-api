package com.tma.travelmanagerapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {

    @NotNull
    @Id
    @Column(name="user_id")
    private UUID userId;

    @NotNull
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name="email")
    private String email;

    @NotNull
    @Column(name="password")
    private String password;

    @NotNull
    @Column(name="active")
    private boolean active;

    @NotNull
    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @NotNull
    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Embedded
    private Address address;

}
