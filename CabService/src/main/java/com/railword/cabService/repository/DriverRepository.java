package com.railword.cabService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railword.cabService.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, String> {

}
