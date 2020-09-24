package com.parking.lot.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.parking.lot.enums.ParkingSpotStatus;
import com.parking.lot.interfaces.ParkingLotAllocationService;
import com.parking.lot.pojos.ParkingLot;
import com.parking.lot.pojos.ParkingSpot;
import com.parking.lot.pojos.Vehical;

public class ParkingLotAllocationServiceImpl implements ParkingLotAllocationService{

	@Override
	public ParkingLot createParkingLot(int size) {	
	    		
		return (size > 0) ? new ParkingLot(size) : null ;		
	}

	@Override
	public ParkingSpot getAvailableParkingSpot(ParkingLot parkingLot) {
		if(parkingLot != null && !parkingLot.isFull())
		{
			List<ParkingSpot> spots = parkingLot.getParkingSpots().stream().filter(spot -> (spot.getStatus().compareTo(ParkingSpotStatus.AVAILABLE))==0).collect(Collectors.toList());
			spots.sort(Comparator.comparing(ParkingSpot :: getSpotNumber));
			return spots.get(0);
		}
		return null;
	}
	
	@Override
	public List<ParkingSpot> getReservedParkingSpots(ParkingLot parkingLot) {
		if(parkingLot != null && !parkingLot.isFull())
		{
			List<ParkingSpot> spots = parkingLot.getParkingSpots().stream().filter(spot -> (spot.getStatus().compareTo(ParkingSpotStatus.RESERVED))==0).collect(Collectors.toList());
			return spots;
		}
		return new ArrayList<>();
	}
	

	@Override
	public ParkingSpot ReserveSpot(ParkingLot parkingLot, Vehical vehical) {
		
		ParkingSpot spot = getAvailableParkingSpot(parkingLot);		
		spot.setStatus(ParkingSpotStatus.RESERVED);
		spot.setVehical(vehical);
		parkingLot.setAvailableSpots(parkingLot.getAvailableSpots() > 0 ? parkingLot.getAvailableSpots() -1 : 0);
		parkingLot.setFull(parkingLot.getAvailableSpots() == 0 ? Boolean.TRUE : Boolean.FALSE);
		return spot;
		
	}
	
	public boolean hasFreeSpot(ParkingLot parkingLot)
	{
		if(parkingLot != null && !parkingLot.isFull())
			return Boolean.TRUE;
		
		return Boolean.FALSE;
	}

	@Override
	public boolean FreeASpot(ParkingLot parkingLot, int spotNumber) {
		
        if(parkingLot != null)
        {
        	ParkingSpot parkingSpot = parkingLot.getParkingSpots().stream().filter(spot -> spot.getSpotNumber() == spotNumber).findFirst().get();
        	parkingSpot.setStatus(ParkingSpotStatus.AVAILABLE);
        	parkingSpot.setVehical(null);
        	
        	parkingLot.setAvailableSpots(parkingLot.getAvailableSpots() +1);
        	parkingLot.setFull(Boolean.FALSE);
        	return true;
        }
		return false;
	}
	
	

}
