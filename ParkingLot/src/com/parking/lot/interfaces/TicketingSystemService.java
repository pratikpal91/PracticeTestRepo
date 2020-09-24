package com.parking.lot.interfaces;

import com.parking.lot.pojos.ParkingSpot;
import com.parking.lot.pojos.Ticket;

public interface TicketingSystemService{
	
	public Ticket generateTicket(ParkingSpot spot);

}
