package com.example.demo.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int 	ID;
	
	private String fullName, phoneNo, plateNo, TCKN, password, username;
	
	
	

	public User() {
		super();
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public String toString() {
		return "User [ID=" + ID + ", fullName=" + fullName + ", phoneNo=" + phoneNo + ", plateNo=" + plateNo + ", TCKN="
				+ TCKN + ", password=" + password + ", username=" + username + "]";
	}
	
	
	

}
