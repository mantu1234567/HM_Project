package com.geekster.Hotelmanagement_practies.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HotelRoom {
        @Id
        private Long roomId;

        private Integer roomNumber;

        @Enumerated(EnumType.STRING)
        private TYPE roomType;

        private Double roomPrice;
        private Boolean roomStatus;

}
