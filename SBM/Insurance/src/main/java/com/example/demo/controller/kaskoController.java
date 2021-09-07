package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.classes.KaskoPolicy;
import com.example.demo.classes.User;
import com.example.demo.classes.Vehicle;
import com.example.demo.dbAccess.KaskoPolicyRepo;
import com.example.demo.dbAccess.UserRepo;
import com.example.demo.dbAccess.VehicleRepo;

@Controller
public class kaskoController {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	VehicleRepo vehicleRepo;
	
	@Autowired
	KaskoPolicyRepo kaskoPolicyRepo;
	
	
	@RequestMapping("kasko")
	public String kasko() {
		return "kasko";
	}
	
	@RequestMapping("kaskoPol")
	public String kaskoPol(@RequestParam String TCKN, @RequestParam String plateNo, Model model) {
		int basePrim=0, netPrim=0;		
		
		User user = userRepo.findByTCKN(TCKN);
		Vehicle vehicle = vehicleRepo.findByPlateNo(plateNo);
		
		if(vehicle == null) return "kasko";
		
		else {
			model.addAttribute("user", user);
			model.addAttribute("vehicle", vehicle);
			
			switch(vehicle.getVehicleGrade()){
			case "Otomobil":
				basePrim=1500;
				break;
			case "Kamyonet":
				basePrim=2100;
				break;
			case "Otobüs":
				basePrim=4900;
				break;
			case "Kamyon":
				basePrim=3300;
				break;	
			}
			
			netPrim= (int) ((120000*0.01) + basePrim);
			
			KaskoPolicy kaskoPolicy = kaskoPolicyRepo.findByPlateNo(plateNo);
			
			
			kaskoPolicy.setPlateNo(plateNo);			
			kaskoPolicy.setTCKN(TCKN);
			kaskoPolicy.setUserID(user.getID());
			kaskoPolicy.setPrim(netPrim);
			
			kaskoPolicyRepo.save(kaskoPolicy);			
			
			model.addAttribute("prim", netPrim);			
			
			return "kaskoPol";			
	
		}
	}
}
