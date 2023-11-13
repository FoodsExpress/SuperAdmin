package com.foodexpress.superadmin.modules.business.entity;

import com.foodexpress.superadmin.modules.business.dto.RequestBusinessDto;
import com.foodexpress.superadmin.modules.common.CommonEntity;
import com.foodexpress.superadmin.modules.store.entity.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author yeji
 * 사업자 정보 entity
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BusinessMan extends CommonEntity {

    // 사업자 명
    private String businessName;

    // 대표자 명
    private String presentationName;

    // 전화번호
    private String phoneNumber;

    // 사업자 코드
    private String businessGrade;

    // 사업자 등록증 경로
    private String filePath;

    // 사업자 폐지 유무
    private boolean isOpen;

    // 사업자 폐지일
    private LocalDateTime finishedAt;

    @OneToMany(mappedBy = "businessMan")
    private Set<Store> stores;

    public BusinessMan(RequestBusinessDto requestBusinessDto) {
        this.businessName = requestBusinessDto.getBusinessName();
        this.presentationName = requestBusinessDto.getPresentationName();
        this.phoneNumber = requestBusinessDto.getPhoneNumber();
        this.filePath = requestBusinessDto.getFilePath();
        this.isOpen = requestBusinessDto.isOpen();
    }

    public static BusinessMan from(RequestBusinessDto requestBusinessDto) {
        return new BusinessMan(requestBusinessDto);
    }
}
