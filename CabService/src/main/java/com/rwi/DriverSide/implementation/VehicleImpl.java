package com.rwi.DriverSide.implementation;

import com.rwi.DriverSide.entity.Driver;
import com.rwi.DriverSide.entity.Vehicle;
import com.rwi.DriverSide.repository.VehicleRepo;
import com.rwi.DriverSide.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleImpl implements VehicleService {
    @Autowired
    VehicleRepo vehicleRepo;
    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);

    }
    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleRepo.findAll();
    }
    @Override
    public Vehicle getVehicleById(int id) {
        Optional<Vehicle> optionalVehicle =  vehicleRepo.findById(id);
        return optionalVehicle.orElseThrow(() -> new RuntimeException("iss id se koi vahan nhi h"));
    }
        @Override
        public Vehicle updatePlateNo(int id, String vehiclePlateNo) {
            Vehicle vehicle= vehicleRepo.findById(id).get();
            vehicle.setVehiclePlateNo(vehiclePlateNo);
            return vehicleRepo.save(vehicle);
    }

        @Override
        public String deleteVehicleById(int vehicleId) {
            if(vehicleId != 0){
                vehicleRepo.deleteById(vehicleId);
                return "vehicle deleted successfully";
            }
            return "vehicle not found";
        }
}
