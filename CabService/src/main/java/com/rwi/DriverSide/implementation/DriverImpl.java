package com.rwi.DriverSide.implementation;

import com.rwi.DriverSide.entity.Driver;
import com.rwi.DriverSide.repository.DriverRepo;
import com.rwi.DriverSide.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DriverImpl implements DriverService {
    @Autowired
    DriverRepo repo;
    @Override
    public Driver addDriver(Driver driver) {

        return repo.save(driver);
    }



    //    @Override
//    public Driver updateDriverById(int id, Driver updatedDriver) {
//        Driver existingdriver=repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Driver of this Id is not found :" + id));
//        repo.save(updatedDriver);
//        return ;
//    }
    @Override
    public Driver updateDriverMob(int id, String mobNo){
        Driver currDriver = repo.findById(id).get();
        currDriver.setMobileNo(mobNo);
        repo.save(currDriver);
        return currDriver;
    }

    @Override
    public Driver updatelicenseNo(int id, String licenseNo) {
       Driver driver= repo.findById(id).get();
       driver.setLicenseNo(licenseNo);
       repo.save(driver);
        return driver;
    }

    @Override
    public Driver getDriverById(int id) {
        Optional<Driver> optionalDriver =  repo.findById(id);
        return optionalDriver.get();
    }

    @Override
    public List<Driver> getAllDriver() {
        return repo.findAll();
    }

    @Override
    public Driver login(String driverId, String password) {
        return null;
    }

    @Override
    public Driver logins(String mobNo, String password) {
        return null;
    }

    @Override
    public String deleteDriverById(Driver driver) {
        int id=driver.getDriverId();
        if(id!=0){
            repo.delete(driver);
            return "driver deleted sucessfully";
        }
        return "driver not found";
    }
}
