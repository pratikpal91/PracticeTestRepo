package com.parking.lot.service.impl;

import com.parking.lot.interfaces.ParkingLotAllocationService;
import com.parking.lot.interfaces.TicketingSystemService;
import com.parking.lot.pojos.ParkingLot;
import com.parking.lot.pojos.ParkingSpot;
import com.parking.lot.pojos.Ticket;
import com.parking.lot.pojos.Vehical;

public class ParkingManager {
	
	ParkingLotAllocationService allocation;
	
	public ParkingManager() {
		this.allocation = new ParkingLotAllocationServiceImpl();
	}
	
	
	public ParkingLot createParkingLot(int size) {
		return (size > 0) ? allocation.createParkingLot(size) : null;
	}
	
	
	
	public Ticket parkVehical(ParkingLot lot, Vehical vehical)
	{	
		
		ParkingSpot spot = allocation.ReserveSpot(lot, vehical);
		
		if (spot != null) {

			TicketingSystemService ticketing = new TicketingSystemServiceImpl();

			return ticketing.generateTicket(spot);
		}
		return null;
	}
	
	
	
	public boolean returnTicket(ParkingLot lot, Ticket ticket)
	{
		if (lot != null && ticket != null) {
			allocation.FreeASpot(lot, ticket.getSpot());
			ticket = null;
			return true;
		}
		
		return false;
	}	

}
