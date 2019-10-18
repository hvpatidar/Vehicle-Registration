package com.org.Acko.Vehicle.Model;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="VehicleRegistration")
public class Vehicle {
	@Id
	
	@GeneratedValue
	int vehicleID;
	
	//@Column(name="vehiclename")
	String vehicleName;
	
	//@Column(name="vehiclespecification")
	String vehicleSpecification;
	
	//@Column(name="vehiclemodel")
	String vehicleModel;
	
	//@Column(name="vehicleprice")
	float vehiclePrice;
	
	
	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", vehicleName=" + vehicleName + ", vehicleSpecification="
				+ vehicleSpecification + ", vehicleModel=" + vehicleModel + ", vehiclePrice=" + vehiclePrice
				+ ", getVehicleID()=" + getVehicleID() + ", getVehicleName()=" + getVehicleName()
				+ ", getVehicleSpecification()=" + getVehicleSpecification() + ", getVehicleModel()="
				+ getVehicleModel() + ", getVehiclePrice()=" + getVehiclePrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Vehicle() {
		
	}
	public Vehicle(int vehicleID, String vehicleName, String vehicleSpecification, String vehicleModel,
			float vehiclePrice) {
		super();
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
		this.vehicleSpecification = vehicleSpecification;
		this.vehicleModel = vehicleModel;
		this.vehiclePrice = vehiclePrice;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleSpecification() {
		return vehicleSpecification;
	}

	public void setVehicleSpecification(String vehicleSpecification) {
		this.vehicleSpecification = vehicleSpecification;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public float getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(float vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	
}
