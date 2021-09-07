package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.classes.RiskInfo;
import com.example.demo.classes.User;
import com.example.demo.classes.Vehicle;
import com.example.demo.dbAccess.RiskInfoRepo;
import com.example.demo.dbAccess.UserRepo;
import com.example.demo.dbAccess.VehicleRepo;

@Controller
public class InfoActivityController {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	VehicleRepo vehicleRepo;
	
	@Autowired
	RiskInfoRepo riskRepo;
	
	@RequestMapping("signUp")
	public String signUp() {
		return "signUp";
	}
	
	@RequestMapping("enroll")
	public String enroll(@RequestParam String fullName, @RequestParam String phoneNo, @RequestParam String TCKN, @RequestParam String plateNo,
			@RequestParam String model, @RequestParam String chassisNo, @RequestParam String engineNo, @RequestParam String vehicleType,
			@RequestParam int disabled, @RequestParam String vehicleGrade, @RequestParam String intendedUse, @RequestParam int provinceNo,
			@RequestParam int scaleNo, @RequestParam String brand) {
		
		if(userRepo.findByTCKN(TCKN) != null) {
			System.out.println("User kayıtlı!");
			return "home";
		}
		
		User user = new User();
		Vehicle vehicle = new Vehicle();
		RiskInfo riskInfo = new RiskInfo();
		
		
		user.setFullName(fullName);
		user.setPhoneNo(phoneNo);
		user.setTCKN(TCKN);
		user.setPlateNo(plateNo);
		
		vehicle.setBrand(brand);
		vehicle.setChassisNo(chassisNo);
		vehicle.setDisabled(disabled);
		vehicle.setEngineNo(engineNo);
		vehicle.setIntendedUse(intendedUse);
		vehicle.setVehicleType(vehicleType);
		vehicle.setVehicleGrade(vehicleGrade);
		vehicle.setProvinceNo(provinceNo);
		vehicle.setPlateNo(plateNo);
		vehicle.setModel(model);
		
		riskInfo.setPlateNo(plateNo);
		riskInfo.setScaleNo(scaleNo);
		
		vehicleRepo.save(vehicle);
		riskRepo.save(riskInfo);
		userRepo.save(user);
		
		
		
		return "home";
	}
	
	@RequestMapping("personalInfo")
	public String personalInfo() {
		return "signInForInfo";
	}
	
	@RequestMapping("information")
	public String information(@RequestParam String TCKN, Model model) {
		
		User user = userRepo.findByTCKN(TCKN);
		Vehicle vehicle = vehicleRepo.findByPlateNo(user.getPlateNo());
		RiskInfo riskInfo = riskRepo.findByPlateNo(user.getPlateNo());
		
		if(vehicle == null) return "signUp";
		
		else {
			
			model.addAttribute("user", user);
			model.addAttribute("vehicle", vehicle);
			model.addAttribute("riskInfo", riskInfo);
			
			return "information";		
			
		}			
	}
	
	
	@RequestMapping("update")
	public String update(@RequestParam String fullName, @RequestParam String phoneNo, @RequestParam String TCKN, @RequestParam String plateNo,
			@RequestParam String model, @RequestParam String chassisNo, @RequestParam String engineNo, @RequestParam String vehicleType,
			@RequestParam int disabled, @RequestParam String vehicleGrade, @RequestParam String intendedUse, @RequestParam int provinceNo,
			@RequestParam int scaleNo, @RequestParam String brand, Model m) {
		
		User user = userRepo.findByTCKN(TCKN);
		Vehicle vehicle = vehicleRepo.findByPlateNo(plateNo);
		RiskInfo riskInfo = riskRepo.findByPlateNo(plateNo);
		
		
		user.setFullName(fullName);
		user.setPhoneNo(phoneNo);
		user.setTCKN(TCKN);
		user.setPlateNo(plateNo);
		
		vehicle.setBrand(brand);
		vehicle.setChassisNo(chassisNo);
		vehicle.setDisabled(disabled);
		vehicle.setEngineNo(engineNo);
		vehicle.setIntendedUse(intendedUse);
		vehicle.setVehicleType(vehicleType);
		vehicle.setVehicleGrade(vehicleGrade);
		vehicle.setProvinceNo(provinceNo);
		vehicle.setPlateNo(plateNo);
		vehicle.setModel(model);
		
		riskInfo.setPlateNo(plateNo);
		riskInfo.setScaleNo(scaleNo);
		
		
			
			
		vehicleRepo.save(vehicle);
		
		
		riskRepo.save(riskInfo);
		
		userRepo.save(user);
				
		m.addAttribute("user", user);
		m.addAttribute("vehicle", vehicle);
		m.addAttribute("riskInfo", riskInfo);
		
		return "information";

		
	}
}
