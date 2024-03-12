package com.rwi.DriverSide.service;

import com.rwi.DriverSide.entity.Driver;
import com.rwi.DriverSide.repository.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DriverService {
    public Driver addDriver(Driver driver);

//    public Driver updateDriverById(int id,Driver updatedDriver);
    public Driver updateDriverMob(int id,String mobNo);
    public Driver updatelicenseNo(int id,String licenseNo);

    public Driver getDriverById(int id);
    public List<Driver> getAllDriver();

    public String deleteDriverById(Driver driver);

}
