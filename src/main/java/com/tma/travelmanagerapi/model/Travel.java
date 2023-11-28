package com.tma.travelmanagerapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="travels")
public class Travel {

    @NotNull
    @Id
    @Column(name="travel_id")
    private UUID  travelId;

    @NotNull
    @Column(name="order_code")
    private String orderCode;

    @NotNull
    @Column(name="amount")
    private BigDecimal amount;

    @NotNull
    @Column(name="start_date")
    private LocalDateTime startDate;

    @Column(name="end_date")
    private LocalDateTime endDate;

    @NotNull
    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private TravelType travelType;

    @NotNull
    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @NotNull
    @Column(name="created_at")
    private LocalDateTime createdAt;
}
