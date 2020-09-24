package com.parking.lot.pojos;

import com.parking.lot.enums.ParkingSpotStatus;

public class ParkingSpot {
	
	public int spotNumber;
	
	public ParkingSpotStatus status;
	
	public Vehical vehical;
	
	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}

	public ParkingSpotStatus getStatus() {
		return status;
	}

	public void setStatus(ParkingSpotStatus status) {
		this.status = status;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

}
