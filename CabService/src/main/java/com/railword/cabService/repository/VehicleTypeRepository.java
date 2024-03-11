package com.railword.cabService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railword.cabService.entity.VehicleType;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, String> {

}
