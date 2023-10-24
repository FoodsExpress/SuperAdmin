package com.foodexpress.superadmin.modules.store.entity;

import com.foodexpress.superadmin.modules.business.entity.BusinessMan;
import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.Getter;

/**
 * @author yeji
 * 상점 정보 entity
 */
@Getter
@Entity
public class Store extends CommonEntity {

    // 상점 명
    private String storeName;

    // 상점 코드
    private String storeGrade;

    // 상점 폐지
    private boolean isOpen;

    // 상점 폐점
    private LocalDateTime finishedAt;

    @ManyToOne
    @JoinColumn(name = "business_man_id")
    private BusinessMan businessMan;
}
