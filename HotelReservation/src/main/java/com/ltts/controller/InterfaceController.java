package com.ltts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ltts.HotelReservationApplication;
import com.ltts.Entity.HotelDetails;
import com.ltts.Entity.HotelFeedback;
import com.ltts.Entity.HotelOwner;
import com.ltts.Entity.Payment;
import com.ltts.repository.AdminRepository;
import com.ltts.repository.UserRepository;

@Controller
public class InterfaceController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping("/addCard")
	public String addCard() {
		return "cardDetails";
	}
	
	@RequestMapping("/hotelDetails")
	public String hotelDetails() {
		return "hotelDetails";
	}
	
	@RequestMapping("/RoomDetails")
	public String RoomDetails() {
		return "RoomDetails";
	}
	
	@RequestMapping("/uhome")
	public String uhome() {
		return "userProfile";
	}
	
	@RequestMapping("/hhome")
	public String hhome() {
		return "home";
	}
	
	@RequestMapping("/ahome")
	public String ahome() {
		return "adminProfile";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "home";
	}
	
	@RequestMapping("/feedback")
	public String feedback() {
		return "feedback";
	}
	
	@RequestMapping("/book")
	public String book() {
		return "Book";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String memberInsert(HttpServletRequest session) {
		
		
		System.out.println(session.getParameter("address"));
		System.out.println(session.getParameter("mobNo"));
		System.out.println(session.getParameter("mailId"));
		System.out.println(session.getParameter("Uname"));
		
		return "userProfile";
	}
	
	@RequestMapping(value = "tryToLogin", method = RequestMethod.POST)
	public String tryToLogin(HttpServletRequest session) {
		
		if(AdminRepository.findUser(session.getParameter("uName"), session.getParameter("pass"))) {
			return "adminProfile";
		}
		else {
			if(UserRepository.findUser(session.getParameter("uName"),session.getParameter("pass")))
			return "userProfile";
		}
		return "failure";
	}
	
	@RequestMapping(value = "insertCardDetails", method = RequestMethod.POST)
	public String insertCardDetails(HttpServletRequest session) {
		
		Payment card = new Payment();
		
		System.out.println(session.getParameter("cvv"));
		card.setCvv(Integer.parseInt(session.getParameter("cvv")));
		card.setCardNumber(session.getParameter("cardNumber"));
		
		System.out.println(card.toString());
		
		HotelReservationApplication.insertCard(card);
		
		return "";
	}
	
	@RequestMapping(value = "insertHotel", method = RequestMethod.POST)
	public String insertHotel(HttpServletRequest session) {
		
		HotelOwner ho = new HotelOwner();
		
		ho.setHotelId(Integer.parseInt(session.getParameter("hotelID")));
		ho.setHotelOwnerUserName(session.getParameter("ownerName"));
		ho.setHotelOwnerUserId(session.getParameter("mailId"));
		ho.setHotelName(session.getParameter("hotelName"));
		ho.setHotelName(session.getParameter("city"));
		
		HotelReservationApplication.insertHotelDetails(ho);
		
		return "RoomDetails";
	}
	
	@RequestMapping(value = "updateRooms", method = RequestMethod.POST)
	public String updateRooms(HttpServletRequest session) {
		
		HotelDetails hd = new HotelDetails();
		
		hd.setHotelId(Integer.parseInt(session.getParameter("hotelId")));
		hd.setNumberOfRooms(Integer.parseInt(session.getParameter("noRooms")));
		hd.setSingleRoom(Integer.parseInt(session.getParameter("singleRooms")));
		hd.setTwoSharingRooms(Integer.parseInt(session.getParameter("sharingRooms")));
		hd.setHotelAddress(session.getParameter("address"));
		
		HotelReservationApplication.updateRoom(hd);
		
		return "adminProfile";
	}
	
	@RequestMapping(value = "provideFeedback", method = RequestMethod.POST)
	public String provideFeedback(HttpServletRequest session) {
		
		HotelFeedback hf = new HotelFeedback();
		
		hf.setService(Integer.parseInt(session.getParameter("service")));
		hf.setRoomRating(Integer.parseInt(session.getParameter("roomRate")));
		hf.setOverallRating(Integer.parseInt(session.getParameter("overall")));
		hf.setDescription(session.getParameter("description"));
		
		HotelReservationApplication.updateFeedback(hf);
		
		return "userProfile";
	}

}
