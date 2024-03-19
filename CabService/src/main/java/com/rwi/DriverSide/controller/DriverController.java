package com.rwi.DriverSide.controller;

import com.rwi.DriverSide.entity.Driver;
import com.rwi.DriverSide.implementation.DriverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverImpl driverImp;

    //addDriver
    @PostMapping
    public Driver addDriver(@RequestBody Driver driver){
        return driverImp.addDriver(driver);
    }

    //updateDriverMobNo
    @PutMapping("/{id}/mobile")
    public Driver updateDriverMob(@PathVariable int id,@RequestParam("mobNo") String mobNo){
        return driverImp.updateDriverMob(id,mobNo);
    }

    //updateDriverLicenseNo
    @PutMapping("/{id}/license")
    public Driver updateLicenseNo(@PathVariable int id,@RequestParam String licenseNo){
        return driverImp.updatelicenseNo(id,licenseNo);
    }

    //getDriverById
    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable int id){
        return driverImp.getDriverById(id);
    }

    //getAllDriver
    @GetMapping
    public List<Driver> getAllDrivers(){
        return driverImp.getAllDriver();
    }

    //deleteDriver
    @DeleteMapping("/{driverId}")
    public String deleteDriverById(@PathVariable Driver driver){
        return driverImp.deleteDriverById(driver);
    }
}
