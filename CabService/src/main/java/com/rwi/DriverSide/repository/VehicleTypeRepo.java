package com.rwi.DriverSide.repository;

import com.rwi.DriverSide.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepo extends JpaRepository<VehicleType, Integer> {
}
