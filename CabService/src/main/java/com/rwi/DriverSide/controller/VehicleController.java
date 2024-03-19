package com.rwi.DriverSide.controller;

import com.rwi.DriverSide.entity.Vehicle;
import com.rwi.DriverSide.implementation.VehicleImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    VehicleImpl vehicleImp;

    //addVehicle
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){

        return vehicleImp.addVehicle(vehicle);
    }
    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable int id){
        return vehicleImp.getVehicleById(id);
    }

    //getAllVehicle
    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleImp.getAllVehicle();
    }
    @PutMapping("/{id}/plateNo")
    public Vehicle updatePlateNo(@PathVariable int id,@RequestParam String vehiclePlateNo){
        return vehicleImp.updatePlateNo(id,vehiclePlateNo);
    }
    //deleteVehicle
    @DeleteMapping("/{driverId}")
    public String deleteVehicleById(@PathVariable int driverId){

        return vehicleImp.deleteVehicleById(driverId);
    }
}
