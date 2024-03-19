package com.rwi.DriverSide.repository;

import com.rwi.DriverSide.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver,Integer> {
}
