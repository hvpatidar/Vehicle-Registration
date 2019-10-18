package com.org.Acko.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.Acko.Vehicle.Model.Vehicle;

import com.org.Acko.Vehicle.Repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	VehicleRepository repository;

	public void addVehicle(Vehicle vehicle) {
		Vehicle vehicle2 = repository.save(vehicle);

	}



	public List<Vehicle> getAllVehicle() { // TODO Auto-generated method stub
		return repository.findAllByOrderByVehicleNameAsc(); 
		
	}

		




	}
