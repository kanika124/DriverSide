package com.rwi.DriverSide.entity;

import com.rwi.DriverSide.enumm.Booking;
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
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int driverId;
    private String name;
    private String mobileNo;
    private String licenseNo;
    @Enumerated(EnumType.STRING)
    private Booking booking;
    @OneToOne
    private Vehicle vehicle;
    private String password;

}
