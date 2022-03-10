package com.ltts.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class HotelOwner {

	@Id
	int hotelId;
	String hotelOwnerUserName;
	String hotelOwnerUserId;
	String hotelName;
	String hotelCity;
	
	public String getHotelOwnerUserName() {
		return hotelOwnerUserName;
	}
	public void setHotelOwnerUserName(String hotelOwnerUserName) {
		this.hotelOwnerUserName = hotelOwnerUserName;
	}
	public String getHotelOwnerUserId() {
		return hotelOwnerUserId;
	}
	public void setHotelOwnerUserId(String hotelOwnerUserId) {
		this.hotelOwnerUserId = hotelOwnerUserId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	
	@Override
	public String toString() {
		return "Hotel Owner " + this.getHotelOwnerUserName() + ", " + this.getHotelName() + ", " + this.getHotelCity() + "]";
	}
	
}
