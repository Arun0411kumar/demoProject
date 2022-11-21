package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Vehicle;
import com.demo.repository.VehicleDao;
import com.demo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleDao vehicleDao;

	@Override
	public void add(Vehicle vehicle) {
		vehicleDao.save(vehicle);
	}
}
