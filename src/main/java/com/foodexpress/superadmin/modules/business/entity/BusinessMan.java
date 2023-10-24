package com.foodexpress.superadmin.modules.business.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import com.foodexpress.superadmin.modules.store.entity.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Getter;

/**
 * @author yeji
 * 사업자 정보 entity
 */
@Getter
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
    private LocalDateTime finishedAt;

    @OneToMany(mappedBy = "businessMan")
    private Set<Store> stores;

}
