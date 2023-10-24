package com.foodexpress.superadmin.modules.promotion.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import lombok.Getter;

/**
 * @author yeji
 * 프로모션 entity
 */
@Getter
@Entity
public class Promotion extends CommonEntity {

    // 프로모션 명
    private String promotionName;

    // 프로모션 코드
    private String promotionCode;

    // 프로모션 진행 여부
    private boolean isOpen;

    // 프로모션 시작 기간
    private LocalDateTime startedAt;

    // 프로모션 종료 기간
    private LocalDateTime finishedAt;
}
