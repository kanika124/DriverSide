package com.railword.cabService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Slot {
	@Id
	private String slotId;
	private String date;
	@ManyToOne
	private Driver driver;
	private String startTime;
	private String endTime;

	public Slot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Slot(String slotId, String date, Driver driver, String startTime, String endTime) {
		super();
		this.slotId = slotId;
		this.date = date;
		this.driver = driver;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Slot [slotId=" + slotId + ", date=" + date + ", driver=" + driver + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
