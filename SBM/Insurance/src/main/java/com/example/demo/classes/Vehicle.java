package com.example.demo.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")	
public class Vehicle {
	
	@Id
	private String plateNo;
	
	private String model, brand, chassisNo, engineNo, vehicleType, vehicleGrade, intendedUser;
	
	private int disabled;
	
	

	public Vehicle() {
		super();
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleGrade() {
		return vehicleGrade;
	}

	public void setVehicleGrade(String vehicleGrade) {
		this.vehicleGrade = vehicleGrade;
	}

	public String getIntendedUser() {
		return intendedUser;
	}

	public void setIntendedUser(String intendedUser) {
		this.intendedUser = intendedUser;
	}

	public int getDisabled() {
		return disabled;
	}

	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}

	@Override
	public String toString() {
		return "Vehicle [plateNo=" + plateNo + ", model=" + model + ", brand=" + brand + ", chassisNo=" + chassisNo
				+ ", engineNo=" + engineNo + ", vehicleType=" + vehicleType + ", vehicleGrade=" + vehicleGrade
				+ ", intendedUser=" + intendedUser + ", disabled=" + disabled + "]";
	}
	
	
	

}
