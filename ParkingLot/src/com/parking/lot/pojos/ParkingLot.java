package com.parking.lot.pojos;

import java.util.ArrayList;
import java.util.List;

import com.parking.lot.enums.ParkingSpotStatus;

public class ParkingLot {
	
	public List<ParkingSpot> parkingSpots;
	
	public int size;
	
	public int availableSpots;
	
	public boolean isFull;
	
	public ParkingLot(int size) {
		if (size > 0) {
			this.size = size;
			this.availableSpots = size;
			this.isFull = Boolean.FALSE;
			this.setParkingSpots(createParkingSpots(size));			
		}
	}	
	
	private List<ParkingSpot> createParkingSpots(int size) {
		
		List<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>(size);
		int counter =1;
		while(size!=0)
		{
			ParkingSpot spot = new ParkingSpot();
			spot.setSpotNumber(counter);
			spot.setStatus(ParkingSpotStatus.AVAILABLE);
			parkingSpots.add(spot);
			counter++;				
		}
		return parkingSpots;		
	}


	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAvailableSpots() {
		return availableSpots;
	}
	public void setAvailableSpots(int availableSpots) {
		this.availableSpots = availableSpots;
	}
	public boolean isFull() {
		return isFull;
	}
	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}	

}
