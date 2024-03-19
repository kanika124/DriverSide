package com.rwi.DriverSide.repository;

import com.rwi.DriverSide.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}
