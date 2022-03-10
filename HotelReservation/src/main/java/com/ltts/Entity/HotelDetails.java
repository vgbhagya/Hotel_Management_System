package com.ltts.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotelinfo")
public class HotelDetails {

	
	@Id
	int numberOfRooms;
	int TwoSharingRooms;
	int SingleRoom;
	int hotelId;
	String hotelAddress;
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public int getTwoSharingRooms() {
		return TwoSharingRooms;
	}
	public void setTwoSharingRooms(int twoSharingRooms) {
		TwoSharingRooms = twoSharingRooms;
	}
	public int getSingleRoom() {
		return SingleRoom;
	}
	public void setSingleRoom(int singleRoom) {
		SingleRoom = singleRoom;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	
}
