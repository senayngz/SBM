package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.classes.KaskoPolicy;
import com.example.demo.classes.RiskInfo;
import com.example.demo.classes.TrafPolicy;
import com.example.demo.classes.User;
import com.example.demo.classes.Vehicle;
import com.example.demo.dbAccess.KaskoPolicyRepo;
import com.example.demo.dbAccess.RiskInfoRepo;
import com.example.demo.dbAccess.TrafPolicyRepo;
import com.example.demo.dbAccess.UserRepo;
import com.example.demo.dbAccess.VehicleRepo;
import com.example.demo.forms.RegisterForm;

@Controller
public class InfoActivityController {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	VehicleRepo vehicleRepo;
	
	@Autowired
	RiskInfoRepo riskRepo;
	
	@Autowired
	KaskoPolicyRepo kaskoRepo;
	
	@Autowired
	TrafPolicyRepo trafRepo;
	
	@RequestMapping("signUp")
	public String signUp(Model model) {
		model.addAttribute("register", new RegisterForm());
		return "signUp";
	}
	
	@RequestMapping("enroll")
	public String enroll(@Valid @ModelAttribute("register") RegisterForm register, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "signUp";
		}		
		
		
		if(userRepo.findByTCKN(register.getTCKN()) != null) {
			model.addAttribute("message", "Bu TC kimlik numarasına sahip kullanıcı sistemde kayıtlı!");
			return "signUp";
		}else if(vehicleRepo.findByPlateNo(register.getPlateNo()) != null ) {
			model.addAttribute("message", "Bu araç plakası başka bir kullanıcının üstüne kayıtlı!");
			return "signUp";
		}
		
		User user = new User();
		Vehicle vehicle = new Vehicle();
		RiskInfo riskInfo = new RiskInfo();
		
		vehicle.setBrand(register.getBrand());
		vehicle.setChassisNo(register.getChassisNo());
		vehicle.setDisabled(register.getDisabled());
		vehicle.setEngineNo(register.getEngineNo());
		vehicle.setIntendedUse(register.getIntendedUse());
		vehicle.setVehicleGrade(register.getVehicleGrade());
		vehicle.setProvinceNo(register.getProvinceNo());
		vehicle.setPlateNo(register.getPlateNo());
		vehicle.setModel(register.getModel());
		
		
		user.setFullName(register.getFullName());
		user.setPhoneNo(register.getPhoneNo());
		user.setPlateNo(register.getPlateNo());
		user.setTCKN(register.getTCKN());
		
		riskInfo.setPlateNo(register.getPlateNo());
		riskInfo.setScaleNo(register.getScaleNo());
			
		vehicleRepo.save(vehicle);		
		riskRepo.save(riskInfo);		
		userRepo.save(user);		
		
		return "home";
	}
	
	@RequestMapping("personalInfo")
	public String personalInfo(Model model) {
		return "signInForInfo";
	}
	
	@RequestMapping("information")
	public String information(@RequestParam String TCKN, Model model) {
		
		if(userRepo.findByTCKN(TCKN) == null) {
			
			model.addAttribute("message", "TC kimlik numarasını boş bırakmayınız ve doğruluğundan emin olunuz!");
			return "signInForInfo";
		}
		
		User user = userRepo.findByTCKN(TCKN);
		Vehicle vehicle = vehicleRepo.findByPlateNo(user.getPlateNo());
		RiskInfo riskInfo = riskRepo.findByPlateNo(user.getPlateNo());
		
		
	
		RegisterForm register = new RegisterForm();
		
		register.setBrand(vehicle.getBrand());
		register.setChassisNo(vehicle.getChassisNo());
		register.setDisabled(vehicle.getDisabled());
		register.setEngineNo(vehicle.getEngineNo());
		register.setFullName(user.getFullName());
		register.setIntendedUse(vehicle.getIntendedUse());
		register.setModel(vehicle.getModel());
		register.setPhoneNo(user.getPhoneNo());
		register.setPlateNo(vehicle.getPlateNo());
		register.setProvinceNo(vehicle.getProvinceNo());
		register.setScaleNo(riskInfo.getScaleNo());
		register.setTCKN(user.getTCKN());
		register.setVehicleGrade(vehicle.getVehicleGrade());		
		
				
		model.addAttribute("register", register);
		
		return "information";		
			
					
	}
	
	
	@RequestMapping("update")
	public String update(@Valid @ModelAttribute("register") RegisterForm register, BindingResult bindingResult, Model model) {
		
		
		User user = userRepo.findByTCKN(register.getTCKN());
		Vehicle vehicle = vehicleRepo.findByPlateNo(register.getPlateNo());
		RiskInfo riskInfo = riskRepo.findByPlateNo(register.getPlateNo());
		
		user.setFullName(register.getFullName());
		user.setPhoneNo(register.getPhoneNo());
		user.setTCKN(register.getTCKN());
		user.setPlateNo(register.getPlateNo());
		
		vehicle.setBrand(register.getBrand());
		vehicle.setChassisNo(register.getChassisNo());
		vehicle.setDisabled(register.getDisabled());
		vehicle.setEngineNo(register.getEngineNo());
		vehicle.setIntendedUse(register.getIntendedUse());
		vehicle.setVehicleGrade(register.getVehicleGrade());
		vehicle.setProvinceNo(register.getProvinceNo());
		vehicle.setPlateNo(register.getPlateNo());
		
		riskInfo.setPlateNo(register.getPlateNo());
		riskInfo.setScaleNo(register.getScaleNo());
			
			
		vehicleRepo.save(vehicle);		
		
		riskRepo.save(riskInfo);
		
		userRepo.save(user);
				
		model.addAttribute("register", register);
		return "information";		
	}
	
	
	@RequestMapping("delete")
	public String delete(@RequestParam String TCKN) {
		
		User user = userRepo.findByTCKN(TCKN);
		Vehicle vehicle= vehicleRepo.findByPlateNo(user.getPlateNo());
		RiskInfo riskInfo = riskRepo.findByPlateNo(user.getPlateNo());
		
		//policies
		KaskoPolicy kaskoPol = kaskoRepo.findByPlateNo(user.getPlateNo());
		TrafPolicy trafPol = trafRepo.findByPlateNo(user.getPlateNo());
		
		if(kaskoPol !=null) kaskoRepo.delete(kaskoPol);
		
		if(trafPol != null) trafRepo.delete(trafPol);
		
		userRepo.delete(user);
		riskRepo.delete(riskInfo);
		vehicleRepo.delete(vehicle);
		
		return "redirect:/";
	}
}
