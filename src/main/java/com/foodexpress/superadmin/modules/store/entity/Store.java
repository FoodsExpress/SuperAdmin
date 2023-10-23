package com.foodexpress.superadmin.modules.store.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;

@Entity
public class Store extends CommonEntity {

    // 상점 명
    private String storeName;

    // 상점 코드
    private String storeGrade;

    // 상점 폐지
    private boolean isOpen;

}
