package com.rwi.DriverSide.service;

import com.rwi.DriverSide.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle addVehicle(Vehicle vehicle);
    Vehicle getVehicleById(int id);
     List<Vehicle> getAllVehicle();
    String deleteVehicleById(int vehicleId);
    Vehicle updatePlateNo(int id, String vehiclePlateNo);

}
