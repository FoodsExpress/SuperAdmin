package com.foodexpress.superadmin.modules.event.form;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class EventForm {

    // 이벤트 아이디
    private Long eventId;
    // 이벤트 명
    private String eventName;
    // 이벤트 코드
    private String eventCode;
    // 이벤트 진행 여부
    private boolean isOpen;
    // 이벤트 시작 기간
    private LocalDateTime startDateTime;
    // 이벤트 종료 기간
    private LocalDateTime endDateTime;
    // 이벤트 적용 기간
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
