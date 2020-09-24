package com.parking.lot.service.impl;

import java.util.List;

import com.parking.lot.interfaces.ParkingLotAllocationService;
import com.parking.lot.interfaces.ParkingLotSearchService;
import com.parking.lot.pojos.ParkingDetails;
import com.parking.lot.pojos.ParkingLot;
import com.parking.lot.pojos.ParkingSpot;

public class ParkingLotSearchServiceImpl implements ParkingLotSearchService{

	@Override
	public List<ParkingDetails> getCarWithColor(ParkingLot lot, String Color) {
		
	    ParkingLotAllocationService allocation = new ParkingLotAllocationServiceImpl();
	    
	    List<ParkingSpot> spots = allocation.getReservedParkingSpots(lot);
		
		return null;
	}

}
