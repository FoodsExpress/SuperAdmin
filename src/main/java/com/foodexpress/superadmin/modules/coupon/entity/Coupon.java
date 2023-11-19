package com.foodexpress.superadmin.modules.coupon.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import com.foodexpress.superadmin.modules.coupon.enums.DetailTargetGroup;
import com.foodexpress.superadmin.modules.coupon.enums.DiscountPolicy;
import com.foodexpress.superadmin.modules.coupon.enums.TargetGroup;
import com.foodexpress.superadmin.modules.event.entity.Event;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
@Entity
public class Coupon extends CommonEntity {

    // 쿠폰 이름
    private String couponName;
    // 쿠폰 코드
    private String couponCode;
    // 할인 정책 (퍼센트, 원)
    @Enumerated(EnumType.STRING)
    private DiscountPolicy discountPolicy;
    // 쿠폰 시작 날짜
    private LocalDateTime startDate;
    // 쿠폰 종료 날짜
    private LocalDateTime endDate;
    // 쿠폰 대상자
    @Enumerated(EnumType.STRING)
    private TargetGroup couponTarget;
    // 쿠폰 상세 대상자
    @Enumerated(EnumType.STRING)
    private DetailTargetGroup couponDetailTarget;
    // 쿠폰 제한 여부
    private boolean isLimit;
    // 쿠폰 제한 갯수
    private int limitCount;
    //
    @OneToOne(mappedBy = "coupon")
    private Event event;
}
