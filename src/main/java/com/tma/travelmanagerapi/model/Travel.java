package com.tma.travelmanagerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Travel {

    private UUID  travelId;
    private String orderCode;
    private BigDecimal amount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private TravelType travelType;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
}
