package com.game.businesshouse.pojo;

import java.util.List;

public class User {
	
	public String uid;
	
	public int amount;
	
	public int boardposition;
	
	public List<Hotel> hotels;
	
	public List<Treasure> treasures;
	
	public List<Jail> jails;
	
	
	public User(String uid) {
		
		this.uid = uid;
		amount =1000;
		boardposition = 0;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBoardposition() {
		return boardposition;
	}

	public void setBoardposition(int boardposition) {
		this.boardposition = boardposition;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public List<Jail> getJails() {
		return jails;
	}

	public void setJails(List<Jail> jails) {
		this.jails = jails;
	}
	
	
	

}
