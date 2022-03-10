package com.ltts.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class HotelFeedback {

	
	@Id
	int service;
	int roomRating;
	int OverallRating;
	String description;
	int hotelId;
	
	
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	public int getRoomRating() {
		return roomRating;
	}
	public void setRoomRating(int roomRating) {
		this.roomRating = roomRating;
	}
	public int getOverallRating() {
		return OverallRating;
	}
	public void setOverallRating(int overallRating) {
		OverallRating = overallRating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
