package com.railword.cabService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railword.cabService.entity.Driver;
import com.railword.cabService.entity.Slot;

@Service
public interface AdminService {

//	Adding Driver
	Driver addDriver(Driver driver);

//  Delete Driver
	void deleteDriver(String driverId);

//	Update Driver
	Driver updateDriver(String driverId, Driver driver);

//	Get driver by Id
	Driver getDriverById(String driverId);

//	Get All Driver
	List<Driver> getAllDriver();

//	Assigning Slot
	Slot assigningSlot(String driverId, Slot slot);
}
