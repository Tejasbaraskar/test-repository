package com.zensar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
