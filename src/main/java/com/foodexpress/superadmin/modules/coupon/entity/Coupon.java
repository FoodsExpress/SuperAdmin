package com.foodexpress.superadmin.modules.coupon.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import com.foodexpress.superadmin.modules.coupon.enums.CouponType;
import com.foodexpress.superadmin.modules.coupon.enums.DetailTargetGroup;
import com.foodexpress.superadmin.modules.coupon.enums.TargetGroup;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
@Entity
public class Coupon extends CommonEntity {

    // 쿠폰 이름
    private String couponName;
    // 쿠폰 코드
    private String couponCode;
    // 쿠폰 종료 일자
    private LocalDateTime finishedAt;
    // 쿠폰 유형
    private CouponType couponType;
    // 쿠폰 시작 날짜
    private LocalDateTime startDate;
    // 쿠폰 종료 날짜
    private LocalDateTime endDate;
    // 쿠폰 대상자
    private TargetGroup couponTarget;
    // 쿠폰 상세 대상자
    private DetailTargetGroup couponDetailTarget;
    // 쿠폰 제한 여부
    private boolean isLimit;
    // 쿠폰 제한 갯수
    private int limitCount;
}
