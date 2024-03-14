package com.rwi.DriverSide.controller;

public class VehicleController {
    @Autowired
    VehicleImpl vehicleImp;

    //addVehicle
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        return vehicleImp.addVehicle(vehicle);
    }
    @GetMapping("/{id}")
    public Driver getVehicleById(@PathVariable int id){
        return vehicleImp.getVehicleById(id);
    }

    //getAllVehicle
    @GetMapping
    public List<Driver> getAllVehicles(){
        return vehicleImp.getAllVehicle();
    }

    //deleteVehicle
    @DeleteMapping("/{driverId}")
    public String deleteVehicleById(@PathVariable Vehicle vehicle){
        return vehicleImp.deleteVehicleById(vehicle);
    }
}
