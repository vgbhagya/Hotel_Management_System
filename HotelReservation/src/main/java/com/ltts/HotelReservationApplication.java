package com.ltts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltts.Entity.HotelDetails;
import com.ltts.Entity.HotelFeedback;
import com.ltts.Entity.HotelOwner;
import com.ltts.Entity.Payment;
import com.ltts.Entity.User;
import com.ltts.repository.HotelDetailsRepository;
import com.ltts.repository.HotelFeedbackRepository;
import com.ltts.repository.HotelOwerRepository;
import com.ltts.repository.PaymentRepository;
import com.ltts.repository.UserRepository;

@SpringBootApplication
public class HotelReservationApplication {

	static ConfigurableApplicationContext cont = null;
	
	public static void main(String[] args) {
		HotelReservationApplication.cont = SpringApplication.run(HotelReservationApplication.class, args);
		
	}

	public static void insertCard(Payment card) {
		// TODO Auto-generated method stub
		PaymentRepository pr = cont.getBean(PaymentRepository.class);
		pr.save(card);
	}

	public static void insertHotelDetails(HotelOwner ho) {
		// TODO Auto-generated method stub
		HotelOwerRepository hor = cont.getBean(HotelOwerRepository.class);
		hor.save(ho);
	}

	public static void updateRoom(HotelDetails hd) {
		// TODO Auto-generated method stub
		HotelDetailsRepository hdr = cont.getBean(HotelDetailsRepository.class);
		hdr.save(hd);
	}

	public static void updateFeedback(HotelFeedback hf) {
		// TODO Auto-generated method stub
		HotelFeedbackRepository hfr = cont.getBean(HotelFeedbackRepository.class);
		hfr.save(hf);		
	}

}
