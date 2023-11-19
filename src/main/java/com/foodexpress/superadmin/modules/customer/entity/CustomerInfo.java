package com.foodexpress.superadmin.modules.customer.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import lombok.Getter;

/**
 * @author yeji
 * 고객문의 entity
 */
@Getter
@Entity
public class CustomerInfo extends CommonEntity {

    // 사용자 아이디
    private Long userId;

    // 내용
    private String content;

    // 파일 위치
    private String filePath;

    // 고객 문의 해결 여부
    private boolean isOpen;

    // 문의 글 공개 여부
    private boolean isPrivate;
}
