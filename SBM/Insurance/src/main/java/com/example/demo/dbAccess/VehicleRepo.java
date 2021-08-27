package com.example.demo.dbAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, String> {

}
