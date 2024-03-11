package com.railword.cabService.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.railword.cabService.entity.Driver;
import com.railword.cabService.entity.Slot;
import com.railword.cabService.repository.DriverRepository;
import com.railword.cabService.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Autowired
	DriverRepository driverRepository;

	@Override
	public Driver addDriver(Driver driver) {
		return driverRepository.save(driver);
	}

	@Override
	public void deleteDriver(String driverId) {
		driverRepository.deleteById(driverId);
	}

	@Override
	public Driver getDriverById(String driverId) {
		Optional<Driver> driver = driverRepository.findById(driverId);
		return driver.get();
	}

	@Override
	public List<Driver> getAllDriver() {
		return driverRepository.findAll();
	}

	@Override
	public Slot assigningSlot(String driverId, Slot slot) {
		return null;
	}

	@Override
	public Driver updateDriver(String driverId, Driver driver) {
		Driver existDriver = driverRepository.findById(driverId).orElseThrow();
		existDriver.setDriverId(driver.getDriverId());
		existDriver.setName(driver.getName());
		existDriver.setVehicle(driver.getVehicle());
		existDriver.setMobileNo(driver.getMobileNo());
		existDriver.setLicenseNo(driver.getLicenseNo());

		Driver updateDriver = driverRepository.save(existDriver);
		return updateDriver;
	}

}
