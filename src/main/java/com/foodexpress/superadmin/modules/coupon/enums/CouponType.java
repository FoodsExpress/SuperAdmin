package com.foodexpress.superadmin.modules.coupon.enums;

/**
 * 쿠폰 유형을 정의하는 enum
 *
 * @author yeji
 */
public enum CouponType {

    BIRTHDAY_COUPON(DiscountPolicy.PERCENT, 10),
    NEW_COUPON(DiscountPolicy.WON, 10000),
    ;

    private final DiscountPolicy discountPolicy;

    private final int discount;

    CouponType(DiscountPolicy discountPolicy, int discount) {
        this.discountPolicy = discountPolicy;
        this.discount = discount;
    }
}
