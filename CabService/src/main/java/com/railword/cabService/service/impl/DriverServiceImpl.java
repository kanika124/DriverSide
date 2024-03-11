package com.railword.cabService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railword.cabService.entity.Driver;
import com.railword.cabService.exception.ResourceNotFoundException;
import com.railword.cabService.repository.DriverRepository;
import com.railword.cabService.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverRepository driverRepository;

	@Override
	public Driver getDriver(String driverId, String password) {
		Driver driver = this.driverRepository.findById(driverId)
				.orElseThrow(() -> new ResourceNotFoundException("User not Found for this Driver Id"));
		String pass = driver.getPassword();
		if (pass == password) {
			return driver;
		}
		return null;
	}

}
