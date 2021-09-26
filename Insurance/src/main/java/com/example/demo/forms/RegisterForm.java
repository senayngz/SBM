package com.example.demo.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class RegisterForm {
	
	@NotBlank(message= "Boş bırakmayınız!")
	@Size(min=6, max=50, message= "İsminiz ve soyadınız 6 karakterden fazla olmalı!")
	private String fullName;
	
	@NotBlank(message= "Boş bırakmayınız!")
	@Size(min=10, max=10,message= "Başında 0 olmadan 10 haneli numaranızı giriniz!")
	private String phoneNo;
	
	@NotBlank(message= "Boş bırakmayınız!")
	private String plateNo;
	
	@NotBlank(message= "Boş bırakmayınız!")
	@Size(min=11, max=11, message= "TC kimlik numaranız 11 haneli olmalı!")
	private String TCKN;
	
	@NotBlank(message= "Boş bırakmayınız!")
	private String model, brand, chassisNo, engineNo, vehicleGrade, intendedUse;
	
	@NotNull(message= "Boş bırakmayınız!")
	private int disabled;
	
	@NotNull(message= "Boş bırakmayınız!")
	private int provinceNo;
	
	@NotNull(message= "Boş bırakmayınız!")
	private int scaleNo;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getTCKN() {
		return TCKN;
	}

	public void setTCKN(String tCKN) {
		TCKN = tCKN;
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

	public String getVehicleGrade() {
		return vehicleGrade;
	}

	public void setVehicleGrade(String vehicleGrade) {
		this.vehicleGrade = vehicleGrade;
	}

	public String getIntendedUse() {
		return intendedUse;
	}

	public void setIntendedUse(String intendedUse) {
		this.intendedUse = intendedUse;
	}

	public int getDisabled() {
		return disabled;
	}

	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}

	public int getProvinceNo() {
		return provinceNo;
	}

	public void setProvinceNo(int provinceNo) {
		this.provinceNo = provinceNo;
	}

	public int getScaleNo() {
		return scaleNo;
	}

	public void setScaleNo(int scaleNo) {
		this.scaleNo = scaleNo;
	}	
	
	
}
