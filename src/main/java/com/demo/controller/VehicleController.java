package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Vehicle;
import com.demo.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/")
	public String display(@RequestBody Vehicle vehicle) { 
		vehicleService.add(vehicle);
		return "arun";
    }  
}