package com.railword.cabService.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Driver {
	@Id
	private String driverId;
	private String name;
	@OneToOne
	private Vehicle vehicle;
	private String mobileNo;
	private String licenseNo;
	private boolean status;
	@OneToMany(mappedBy = "Driver", cascade = CascadeType.ALL, orphanRemoval = true)
	private Slot slot;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Driver(String driverId, String name, Vehicle vehicle, String mobileNo, String licenseNo, boolean status,
			Slot slot, String password) {
		super();
		this.driverId = driverId;
		this.name = name;
		this.vehicle = vehicle;
		this.mobileNo = mobileNo;
		this.licenseNo = licenseNo;
		this.status = status;
		this.slot = slot;
		this.password = password;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", name=" + name + ", vehicle=" + vehicle + ", mobileNo=" + mobileNo
				+ ", licenseNo=" + licenseNo + ", status=" + status + ", slot=" + slot + "]";
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}
}
