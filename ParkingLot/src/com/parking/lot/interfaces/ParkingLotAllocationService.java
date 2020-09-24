package com.parking.lot.interfaces;

import java.util.List;

import com.parking.lot.pojos.ParkingLot;
import com.parking.lot.pojos.ParkingSpot;
import com.parking.lot.pojos.Vehical;

public interface ParkingLotAllocationService {
	
	public ParkingLot createParkingLot(int size);
	
	public ParkingSpot getAvailableParkingSpot(ParkingLot parkingLot);
	
	public ParkingSpot ReserveSpot(ParkingLot parkingLot, Vehical vehical);	
	
	public boolean hasFreeSpot(ParkingLot parkingLot);
	
	public boolean FreeASpot(ParkingLot parkingLot, int spotNumber);
	
	public List<ParkingSpot> getReservedParkingSpots(ParkingLot parkingLot);

}
