package com.foodexpress.superadmin.modules.banner.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import com.foodexpress.superadmin.modules.coupon.enums.DetailTargetGroup;
import com.foodexpress.superadmin.modules.coupon.enums.TargetGroup;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Banner extends CommonEntity {

    // 배너 명
    private String bannerName;
    // 배너 위치
    private String bannerLocation;
    // 고객사
    private String clientName;
    // 공개 여부
    private boolean isOpen;
    // 배너 대상자
    private TargetGroup couponTarget;
    // 배너 상세 대상자
    private DetailTargetGroup couponDetailTarget;

}
