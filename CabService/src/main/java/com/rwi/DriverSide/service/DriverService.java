package com.rwi.DriverSide.service;

import com.rwi.DriverSide.entity.Driver;
import org.springframework.http.HttpStatus;


import java.util.List;

public interface DriverService {
     Driver addDriver(Driver driver);

//    public Driver updateDriverById(int id,Driver updatedDriver);
     Driver updateDriverMob(int id,String mobNo);
     Driver updatelicenseNo(int id,String licenseNo);

     Driver getDriverById(int id);
     List<Driver> getAllDriver();
     Driver login(String driverId,String password);
     Driver logins(String mobNo,String password);
     String deleteDriverById(Driver driver);

}
