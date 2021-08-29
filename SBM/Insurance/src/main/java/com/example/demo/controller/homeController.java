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
public class homeController {
	
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	VehicleRepo vehicleRepo;
	
	@Autowired
	RiskInfoRepo riskRepo;
	
	public int basePrim=0, netPrim=0;
	
	
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("kasko")
	public String kasko() {
		return "kasko";
	}
	
	@RequestMapping("trafikSig")
	public String trafikSig() {
		return "trafikSig";
	}
	
	@RequestMapping("trafikSigPol")
	public String trafikSigPol(@RequestParam String TCKN, @RequestParam String plateNo, Model model) {
		
		
		User user = userRepo.findByTCKN(TCKN);
		RiskInfo riskInfo = riskRepo.getById(plateNo);
		Vehicle vehicle = vehicleRepo.getById(plateNo);
		
		model.addAttribute("user", user);
		model.addAttribute("riskInfo", riskInfo);
		model.addAttribute("vehicle", vehicle);
		
		basePrim(vehicle.getVehicleGrade());
		
		switch(riskInfo.getScaleNo()) {
		case 1:
			netPrim= (basePrim * 160)/100;
			break;
		case 2:
			netPrim= (basePrim * 140)/100;
			break;
		case 3:
			netPrim= (basePrim * 120)/100;
			break;
		case 4:
			netPrim= basePrim;
			break;
		case 5:
			netPrim= (basePrim * 90)/100;
			break;
		case 6:
			netPrim= (basePrim * 85)/100;
			break;
		case 7:
			netPrim= (basePrim * 80)/100;
			break;
		}
		
		model.addAttribute("prim", netPrim);
		
		
		return "trafikSigPol";
	}
	
	@RequestMapping("kaskoPol")
	public String kaskoPol(@RequestParam String TCKN, @RequestParam String plateNo, Model model) {
		
		User user = userRepo.findByTCKN(TCKN);
		Vehicle vehicle = vehicleRepo.getById(plateNo);
		
		model.addAttribute("user", user);
		model.addAttribute("vehicle", vehicle);
		
		basePrim(vehicle.getVehicleGrade());
		
		netPrim= (int) ((120000*0.01) + basePrim);
		
		model.addAttribute("prim", netPrim);
		
		return "kaskoPol";
	}
	
	public void basePrim(String vehicleGrade) {
		
		switch(vehicleGrade){
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
	}
	
	
	
	

}
