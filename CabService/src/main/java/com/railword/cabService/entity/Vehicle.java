package com.railword.cabService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	private String vehicleId;
	private String location;
	@OneToOne
	private Driver driver;
	@ManyToOne
	private VehicleType vehicleType;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", location=" + location + ", driver=" + driver + ", vehicleType="
				+ vehicleType + "]";
	}

	public Vehicle(String vehicleId, String location, Driver driver, VehicleType vehicleType) {
		super();
		this.vehicleId = vehicleId;
		this.location = location;
		this.driver = driver;
		this.vehicleType = vehicleType;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
}
