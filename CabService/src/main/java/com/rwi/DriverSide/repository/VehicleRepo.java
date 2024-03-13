package com.rwi.DriverSide.repository;

import com.rwi.DriverSide.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}
