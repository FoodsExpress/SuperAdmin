package com.foodexpress.superadmin.modules.coupon.repository;

import com.foodexpress.superadmin.modules.coupon.entity.Coupon;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Optional<Coupon> findByCouponName(String couponName);
}
