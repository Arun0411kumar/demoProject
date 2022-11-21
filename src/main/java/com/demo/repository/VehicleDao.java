package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Integer> {

}
