package com.foodexpress.superadmin.modules.coupon.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
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

}
