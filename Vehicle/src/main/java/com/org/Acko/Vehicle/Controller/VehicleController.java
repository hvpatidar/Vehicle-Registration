package com.org.Acko.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.Acko.Vehicle.Model.Vehicle;
import com.org.Acko.Vehicle.Service.VehicleService;


@RestController
public class VehicleController {
	@Autowired
	VehicleService service;

	@PostMapping("/vehicle")
	public ResponseEntity addVehicle(@RequestBody Vehicle vehicle) {
		service.addVehicle(vehicle);
		return new ResponseEntity(HttpStatus.CREATED);
	}



	@GetMapping("/vehicle") 
	public ResponseEntity<List> getAllVehicle(){
		List<Vehicle> vehicleList=service.getAllVehicle(); 
		return new	ResponseEntity(vehicleList,HttpStatus.OK); }




}
