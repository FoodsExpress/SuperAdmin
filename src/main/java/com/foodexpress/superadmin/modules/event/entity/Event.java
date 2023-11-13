package com.foodexpress.superadmin.modules.event.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import lombok.Getter;

/**
 * 이벤트 entity
 *
 * @author yeji
 */
@Getter
@Entity
public class Event extends CommonEntity {

    // 이벤트 명
    private String eventName;
    // 이벤트 코드
    private String eventCode;
    // 이벤트 진행 여부
    private boolean isOpen;
    // 이벤트 시작 기간
    private LocalDateTime startedAt;
    // 이벤트 종료 기간
    private LocalDateTime finishedAt;
    // 이번트 적용 시간
    private String eventDuration;
    // 이벤트 이미지 1
    private String eventImageLink1;
    // 이벤트 이미지 2
    private String eventImageLink2;
    // 이벤트 이미지 3
    private String eventImageLink3;
    // 이벤트 주소
    private String eventLink;
}
