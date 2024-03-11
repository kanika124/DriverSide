package com.railword.cabService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railword.cabService.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
