package com.ltts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.Entity.Payment;

public interface PaymentRepository extends CrudRepository <Payment, Integer> {

}
