package com.parking.lot.interfaces;

import java.util.List;

import com.parking.lot.pojos.ParkingDetails;
import com.parking.lot.pojos.ParkingLot;

public interface ParkingLotSearchService {
	
	List<ParkingDetails> getCarWithColor(ParkingLot lot , String Color);
	
}
