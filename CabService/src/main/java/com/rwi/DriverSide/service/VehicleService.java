package com.rwi.DriverSide.service;


import com.rwi.DriverSide.entity.Vehicle;

public interface VehicleService {
    Vehicle addVehicle(Vehicle vehicle);
    Vehicle deleteVehicle(int VehicleId);

}
