package com.example.demo.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrafPolicy")	
public class TrafPolicy{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int policyID;
	
	private String TCKN, plateNo;
	private int userID, prim;
	
	public TrafPolicy() {
		super();
	}
	
	
	public int getPolicyID() {
		return policyID;
	}
	public void setPolicyID(int policyID) {
		this.policyID = policyID;
	}
	public String getTCKN() {
		return TCKN;
	}
	public void setTCKN(String tCKN) {
		TCKN = tCKN;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getPrim() {
		return prim;
	}
	public void setPrim(int prim) {
		this.prim = prim;
	}
	@Override
	public String toString() {
		return "KaskoPolicy [policyID=" + policyID + ", TCKN=" + TCKN + ", plateNo=" + plateNo + ", userID=" + userID
				+ ", prim=" + prim + "]";
	}	

}
