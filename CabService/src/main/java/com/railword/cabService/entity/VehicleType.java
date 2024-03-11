package com.railword.cabService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VehicleType {
	@Id
	private String vehicleTypeId;
	private String vehicleName;

	@Override
	public String toString() {
		return "VehicleType [vehicleTypeId=" + vehicleTypeId + ", vehicleName=" + vehicleName + "]";
	}

	public VehicleType(String vehicleTypeId, String vehicleName) {
		super();
		this.vehicleTypeId = vehicleTypeId;
		this.vehicleName = vehicleName;
	}

	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(String vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
