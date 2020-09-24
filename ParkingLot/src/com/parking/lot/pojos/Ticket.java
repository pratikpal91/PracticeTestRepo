package com.parking.lot.pojos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Ticket {
	
	public String ticketId;
	
	public String creationTime;
	
	public int spot ;
	
	public String registrationNumber;
	
	public String color;
	
	public Ticket() {
		this.ticketId = UUID.randomUUID().toString();
		SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YY HH:MM:SS");
		this.creationTime = formatter.format(new Date());
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public int getSpot() {
		return spot;
	}

	public void setSpot(int spot) {
		this.spot = spot;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
