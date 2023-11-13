package com.foodexpress.superadmin.modules.banner.entity;

import com.foodexpress.superadmin.modules.banner.enums.ProgressStatus;
import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class BannerClient extends CommonEntity {

    // 고객사 명
    private String clientName;
    // 요청 내용
    private String content;
    // 고객사 이메일 주소
    private String emailAddress;
    // 고객사 전화번호
    private String phoneNumber;
    // 진행 상황
    private ProgressStatus status;
}
