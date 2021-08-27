package com.example.demo.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RiskInfo")	
public class RiskInfo {
	
	@Id
	private String plateNo;
	
	private String prevAgency, prevPolicy, registrationDate;
	
	private int scale;
	

	public RiskInfo() {
		super();
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getPrevAgency() {
		return prevAgency;
	}

	public void setPrevAgency(String prevAgency) {
		this.prevAgency = prevAgency;
	}

	public String getPrevPolicy() {
		return prevPolicy;
	}

	public void setPrevPolicy(String prevPolicy) {
		this.prevPolicy = prevPolicy;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	@Override
	public String toString() {
		return "RiskInfo [plateNo=" + plateNo + ", prevAgency=" + prevAgency + ", prevPolicy=" + prevPolicy
				+ ", registrationDate=" + registrationDate + ", scale=" + scale + "]";
	}
	
	
	

}
