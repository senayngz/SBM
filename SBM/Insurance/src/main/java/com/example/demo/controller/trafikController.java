package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.classes.RiskInfo;
import com.example.demo.classes.TrafPolicy;
import com.example.demo.classes.User;
import com.example.demo.classes.Vehicle;
import com.example.demo.dbAccess.RiskInfoRepo;
import com.example.demo.dbAccess.TrafPolicyRepo;
import com.example.demo.dbAccess.UserRepo;
import com.example.demo.dbAccess.VehicleRepo;

@Controller
public class trafikController {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	VehicleRepo vehicleRepo;
	
	@Autowired
	RiskInfoRepo riskRepo;
	
	@Autowired
	TrafPolicyRepo trafPolicyRepo;
	
	@RequestMapping("trafikSig")
	public String trafikSig() {
		return "trafikSig";
	}
	
	@RequestMapping("trafikSigPol")
	public String trafikSigPol(@RequestParam String TCKN, @RequestParam String plateNo, Model model) {
		int basePrim=0, netPrim=0;
		
		User user = userRepo.findByTCKN(TCKN);
		RiskInfo riskInfo = riskRepo.findByPlateNo(plateNo);
		Vehicle vehicle = vehicleRepo.findByPlateNo(plateNo);
		
		if(vehicle == null || riskInfo == null) return "trafikSig";
		
		else {
			model.addAttribute("user", user);
			model.addAttribute("riskInfo", riskInfo);
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
			

			TrafPolicy trafPolicy = trafPolicyRepo.findByPlateNo(plateNo);
			
			trafPolicy.setPlateNo(plateNo);
			trafPolicy.setTCKN(TCKN);
			trafPolicy.setUserID(user.getID());
			trafPolicy.setPrim(netPrim);
			
			trafPolicyRepo.save(trafPolicy);			
			
			
			model.addAttribute("prim", netPrim);
			return "trafikSigPol";				
		}					
	}
}
