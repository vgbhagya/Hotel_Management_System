package com.ltts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.Entity.Booking;

public interface BookingRepository extends CrudRepository <Booking, String> {

}
