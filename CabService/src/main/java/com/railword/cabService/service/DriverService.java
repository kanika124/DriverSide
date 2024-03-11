package com.railword.cabService.service;

import com.railword.cabService.entity.Driver;

public interface DriverService {
//	Get Driver using Id & Password
	Driver getDriver(String driverId, String password);
}
