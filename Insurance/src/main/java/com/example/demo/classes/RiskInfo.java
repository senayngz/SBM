package com.example.demo.classes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RiskInfo")	
public class RiskInfo {
	
	@Id
	private String plateNo;
	
	@Column(insertable = false)
	private String registrationDate;
	
	private int scaleNo;
	

	public RiskInfo() {
		super();
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}


	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getScaleNo() {
		return scaleNo;
	}

	public void setScaleNo(int scaleNo) {
		this.scaleNo = scaleNo;
	}

	@Override
	public String toString() {
		return "RiskInfo [plateNo=" + plateNo  +  ", registrationDate=" + registrationDate + ", scale=" + scaleNo + "]";
	}
	
	
	

}
