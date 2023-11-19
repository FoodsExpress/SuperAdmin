package com.foodexpress.superadmin.modules.coupon.form;

import com.foodexpress.superadmin.modules.coupon.enums.DetailTargetGroup;
import com.foodexpress.superadmin.modules.coupon.enums.DiscountPolicy;
import com.foodexpress.superadmin.modules.coupon.enums.TargetGroup;
import com.foodexpress.superadmin.modules.event.form.EventForm;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CouponForm {

    private Long couponId;
    // 쿠폰 이름
    @NotNull
    @Column(unique = true)
    private String couponName;
    // 쿠폰 코드
    @NotNull
    private String couponCode;
    // 쿠폰 시작 날짜
    private LocalDateTime startDate;
    // 쿠폰 종료 날짜
    private LocalDateTime endDate;
    // 쿠폰 할인 정책
    @NotNull
    private DiscountPolicy discountPolicy;
    // 할인 적용 값
    @NotNull
    private int discount;
    // 쿠폰 대상자
    private TargetGroup couponTarget;
    // 쿠폰 상세 대상자
    private DetailTargetGroup couponDetailTarget;
    // 쿠폰 제한 여부
    private boolean isLimit;
    // 쿠폰 제한 갯수
    private int limitCount;
    // 이벤트 등록 여부
    private boolean isActiveEvent;
    // 이벤트 폼
    private EventForm eventForm;
}
