package com.foodexpress.superadmin.modules.business.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class BusinessMan extends CommonEntity {


    // 사업자 명
    private String businessName;

    // 대표자 명
    private String presentationName;

    // 전화번호
    private String phoneNumber;

    // 사업자 코드
    private String businessGrade;

    // 사업자 등록증
    private String filePath;

    // 사업자 폐지 유무
    private boolean isOpen;

    // 사업자 폐지일
    private LocalDateTime closeDateTime;

}
