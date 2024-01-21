package com.foodexpress.superadmin.modules.coupon.dto;

import static org.springframework.beans.BeanUtils.copyProperties;

import com.foodexpress.superadmin.modules.coupon.entity.Coupon;
import com.foodexpress.superadmin.modules.coupon.enums.DetailTargetGroup;
import com.foodexpress.superadmin.modules.coupon.enums.TargetGroup;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CouponDto {

    private Long couponId;
    // 쿠폰 이름
    private String couponName;
    // 쿠폰 코드
    private String couponCode;
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

    public static CouponDto from(Coupon coupon) {
        CouponDto couponDto = new CouponDto();
        copyProperties(couponDto, coupon);
        return couponDto;
    }
}
