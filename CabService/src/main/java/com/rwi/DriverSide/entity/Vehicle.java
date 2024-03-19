package com.rwi.DriverSide.entity;

import com.rwi.DriverSide.enumm.BookingType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    @OneToOne
    private Driver driver;
    @Enumerated(EnumType.STRING)
    private BookingType bookingType;
    @ManyToOne
    private VehicleType vehicleType;
}
