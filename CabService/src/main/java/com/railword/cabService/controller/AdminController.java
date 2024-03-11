package com.railword.cabService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.railword.cabService.entity.Driver;
import com.railword.cabService.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/add")
	public Driver saveDriver(@RequestBody Driver driver) {
		return adminService.addDriver(driver);
	}

	@DeleteMapping("/{driverId}")
	public void deleteDriver(@RequestParam String driverId) {
		adminService.deleteDriver(driverId);
	}

	@GetMapping("/driverId")
	public Driver driverGetByID(@PathVariable("driverId") String DriverId) {
		return adminService.getDriverById(DriverId);
	}

	@GetMapping
	public List<Driver> getDriverAllDriver() {
		return adminService.getAllDriver();
	}

	@PutMapping("/{driverId}")
	public Driver updateDriver(@RequestBody String driverId, Driver driver) {
		return adminService.updateDriver(driverId, null);
	}
}
