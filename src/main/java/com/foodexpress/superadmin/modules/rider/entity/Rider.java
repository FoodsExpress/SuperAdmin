package com.foodexpress.superadmin.modules.rider.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import lombok.Getter;

/**
 * @author yeji
 * 라이더 entity
 */
@Getter
@Entity
public class Rider extends CommonEntity {

    // 라이더 명
    private String riderName;

    // 업체 명
    private String partnerName;

    // 라이더 유형
    private RiderType riderType;

}
