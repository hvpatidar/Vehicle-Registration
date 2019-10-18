package com.org.Acko.Vehicle.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Acko.Vehicle.Model.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
	List<Vehicle> findAllByOrderByVehicleNameAsc();

}
