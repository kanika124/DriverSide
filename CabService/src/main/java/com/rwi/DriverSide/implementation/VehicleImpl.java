package com.rwi.DriverSide.implementation;

import com.rwi.DriverSide.entity.Vehicle;
import com.rwi.DriverSide.repository.VehicleRepo;
import com.rwi.DriverSide.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleImpl implements VehicleService {
    @Autowired
    VehicleRepo vehicleRepo;
    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    public Vehicle getAllVehicleById(){
        return null;
    }

    @Override
    public Vehicle deleteVehicle(int vehicleId) {
        return null;
    }
}
