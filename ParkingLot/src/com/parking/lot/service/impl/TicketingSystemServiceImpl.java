package com.parking.lot.service.impl;

import com.parking.lot.interfaces.TicketingSystemService;
import com.parking.lot.pojos.ParkingSpot;
import com.parking.lot.pojos.Ticket;

public class TicketingSystemServiceImpl implements TicketingSystemService{

	@Override
	public Ticket generateTicket(ParkingSpot spot) {
		if(spot != null && spot.getVehical() != null)
		{
			Ticket ticket = new Ticket();
			ticket.setColor(spot.getVehical().getColor());
			ticket.setRegistrationNumber(spot.getVehical().getRegistrationNumber());
			ticket.setSpot(spot.getSpotNumber());
			return ticket;			
		}
		return null;
	}


}
